package com.tidy.file.old.use;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.tidy.file.BuildConfig;
import com.tidy.file.newest.use.EasyLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

import java.util.Calendar;

/**
 * 通知频次管理器 - Java静态方法版本（无前台参数）
 * 所有方法都是静态的，无需创建对象
 */
public class EasyNotiTimesHelper {

    // 通知级别枚举
    public enum Level {
        HIGH, NORMAL
    }

    // 事件类型枚举
    public enum Event {
        NONE,
        APP_INSTALL_UNINSTALL,  // 应用安装/卸载
        POWER_CHARGE,           // 充电 + <75
        POWER_DISCHARGE,        // 断电 + >90
        BATTERY_LOW,            // 电量<20%
        ALARM,                  // 定时闹钟
        JOB_POLLING,            // Job轮询
        FCM_PUSH,               // FCM推送
        UNLOCK_SCREEN,          // 解锁屏
        SCREEN_ON_OFF,          // 屏幕打开关闭
        HOME_CLICK,             // Home键点击
        HEARTBEAT,              // 心跳起搏
        ACCOUNT_SYNC,           // 账号同步
        WORK_MANAGER ,           // WorkManager
        EVERY_TIME_SHOW_NOTIFY,
        LAUNCH_APP
    }

    // 决策结果类
    public static class Decision {
        public boolean allow = false;
        public Level level = Level.NORMAL;
        public boolean shouldWakeScreen = false;
        public boolean shouldWakeForeground = false;

        public Decision() {}

        public Decision(boolean allow, Level level, boolean shouldWakeScreen, boolean shouldWakeForeground) {
            this.allow = allow;
            this.level = level;
            this.shouldWakeScreen = shouldWakeScreen;
            this.shouldWakeForeground = shouldWakeForeground;
        }

        @Override
        public String toString() {
            return "Decision{" +
                    "allow=" + allow +
                    ", level=" + level +
                    ", shouldWakeScreen=" + shouldWakeScreen +
                    ", shouldWakeForeground=" + shouldWakeForeground +
                    '}';
        }
    }

    private static final String TAG = "TAG-->>Controll";
    private static final String PREFS_NAME = "notify_freq_static";

    // 固定key定义 - 使用固定key而不是每日动态key
    private static final String KEY_TODAY_DATE = "today_date";
    private static final String KEY_TODAY_HIGH_COUNT = "today_high_count";
    private static final String KEY_FIRST_UNLOCK_TODAY = "first_unlock_today";
    private static final String KEY_CHARGE_HIGH_TODAY = "charge_high_today";
    private static final String KEY_DISCHARGE_HIGH_TODAY = "discharge_high_today";
    private static final String KEY_BATTERY_LOW_HIGH_TODAY = "battery_low_high_today";
    private static final String KEY_LAST_HIGH_TIME = "last_high_time";
    private static final String KEY_LAST_NORMAL_TIME = "last_normal_time";
    private static final String KEY_LAST_FCM_HIGH = "last_fcm_high";

    // 配置参数
    private static long highCoolDownMs = 60 * 60 * 1000L;     // 1小时
    private static long normalCoolDownMs = 30 * 60 * 1000L;   // 30分钟
    private static int maxDailyHigh = 5;                      // 每日High上限

    private static SharedPreferences prefs = null;
    private static boolean debugMode = BuildConfig.DEBUG;

    /**
     * 初始化（必须在应用启动时调用一次）
     */
    public static void init(Context context) {
        updateConfig();
        if (prefs == null) {
            prefs = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            resetDailyIfNeeded();
            logD("通知频次管理器初始化完成");
            logD("配置: High冷却=" + (highCoolDownMs/60000) + "分钟, Normal冷却=" + (normalCoolDownMs/60000) + "分钟, 每日High上限=" + maxDailyHigh);
        }
    }

    /**
     * 设置调试模式
     */
    public static void setDebugMode(boolean enabled) {
        debugMode = enabled;
        logD("调试模式: " + enabled);
    }

    // ==================== 核心决策方法 ====================

    /**
     * 处理应用安装/卸载事件
     */
    public static Decision handleAppInstall() {
        logD("处理应用安装/卸载事件");
        updateConfig();

        int highCount = getTodayHighCount();
        Level level = highCount < maxDailyHigh ? Level.HIGH : Level.NORMAL;

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }

    /**
     * 处理充电事件
     */
    public static Decision handlePowerCharge(int battery) {
        logD("处理充电事件, 电量: " + battery);
        updateConfig();

        // 电量低于75%才触发
        if (battery >= 75) {
            logD("电量" + battery + "% >= 75%，不触发");
            return new Decision();
        }

        boolean highSentToday = prefs.getBoolean(KEY_CHARGE_HIGH_TODAY, false);
        int highCount = getTodayHighCount();
        Level level = (!highSentToday && highCount < maxDailyHigh) ? Level.HIGH : Level.NORMAL;

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                prefs.edit().putBoolean(KEY_CHARGE_HIGH_TODAY, true).apply();
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }

    /**
     * 处理断电事件
     */
    public static Decision handlePowerDischarge(int battery) {
        logD("处理断电事件, 电量: " + battery);
        updateConfig();

        // 电量高于95%才触发
        if (battery <= 95) {
            logD("电量" + battery + "% <= 95%，不触发");
            return new Decision();
        }

        boolean highSentToday = prefs.getBoolean(KEY_DISCHARGE_HIGH_TODAY, false);
        int highCount = getTodayHighCount();
        Level level = (!highSentToday && highCount < maxDailyHigh) ? Level.HIGH : Level.NORMAL;

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                prefs.edit().putBoolean(KEY_DISCHARGE_HIGH_TODAY, true).apply();
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }

    /**
     * 处理低电量事件
     */
    public static Decision handleBatteryLow() {
        logD("处理低电量事件");
        updateConfig();

        boolean highSentToday = prefs.getBoolean(KEY_BATTERY_LOW_HIGH_TODAY, false);
        int highCount = getTodayHighCount();
        Level level = (!highSentToday && highCount < maxDailyHigh) ? Level.HIGH : Level.NORMAL;

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                prefs.edit().putBoolean(KEY_BATTERY_LOW_HIGH_TODAY, true).apply();
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }


    /**
     * 处理定时闹钟事件
     */
    public static Decision handleAlarm(int noCleanDays) {
        logD("处理定时闹钟事件, 未清理天数: " + noCleanDays);
        updateConfig();

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        boolean firstUnlockToday = prefs.getBoolean(KEY_FIRST_UNLOCK_TODAY, false);

        Level level = Level.NORMAL;

        if (firstUnlockToday && noCleanDays >= 2) {
            if (getTodayHighCount() < maxDailyHigh) {
                long lastHighTime = prefs.getLong(KEY_LAST_HIGH_TIME, 0);
                if (System.currentTimeMillis() - lastHighTime >= highCoolDownMs) {
                    level = Level.HIGH;
                }
            }
            prefs.edit().putBoolean(KEY_FIRST_UNLOCK_TODAY, true).apply();
        }

        // 17-24点额外判断
        if (hour >= 17 && hour < 24) {
            if (getTodayHighCount() < maxDailyHigh) {
                long lastHighTime = prefs.getLong(KEY_LAST_HIGH_TIME, 0);
                if (System.currentTimeMillis() - lastHighTime >= highCoolDownMs) {
                    level = Level.HIGH;
                }
            }
        }

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }

    public static Decision handleDefault() {
        logD("处理默认事件" );
        updateConfig();
        if (checkCooldown(Level.NORMAL)) {
            return new Decision(true, Level.NORMAL, true, false);
        }
        return new Decision();
    }

    /**
     * 处理Job轮询事件
     */
    public static Decision handleJobPolling() {
        logD("处理Job轮询事件");
        updateConfig();

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        Level level = Level.NORMAL;

        if ((hour >= 12 && hour <= 16) || (hour >= 18 && hour <= 22)) {
            if (getTodayHighCount() < maxDailyHigh) {
                long lastHighTime = prefs.getLong(KEY_LAST_HIGH_TIME, 0);
                if (System.currentTimeMillis() - lastHighTime >= highCoolDownMs) {
                    level = Level.HIGH;
                }
            }
        }

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }

    /**
     * 处理FCM推送事件
     */
    public static Decision handleFcmPush() {
        logD("处理FCM推送事件");
        updateConfig();

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        long lastFCMHighTime = prefs.getLong(KEY_LAST_FCM_HIGH, 0);

        Level level = ((hour == 8 || System.currentTimeMillis() - lastFCMHighTime >= 12 * 60 * 60 * 1000L) &&
                getTodayHighCount() < maxDailyHigh) ? Level.HIGH : Level.NORMAL;

        if (checkCooldown(level)) {
            if (level == Level.HIGH) {
                prefs.edit().putLong(KEY_LAST_FCM_HIGH, System.currentTimeMillis()).apply();
                incrementHighCount();
            }
            return new Decision(true, level, level == Level.HIGH, false);
        }
        return new Decision();
    }

    /**
     * 处理解锁屏事件
     */
    public static Decision handleUnlockScreen() {
        logD("处理解锁屏事件");
        updateConfig();
        return new Decision(false, Level.NORMAL, false, true);
    }

    /**
     * 处理仅唤醒前台的事件
     */
    public static Decision handleForegroundOnly() {
        logD("处理仅唤醒前台事件");
        updateConfig();
        return new Decision(false, Level.NORMAL, false, true);
    }

    // ==================== 配置和管理方法 ====================

    /**
     * 更新配置参数
     */
    public static void updateConfig() {
        int highCount = (int) FirebaseRemoteConfig.getInstance().getLong(EasyLocalInit.highCount);
        int highCoolTime = (int) FirebaseRemoteConfig.getInstance().getLong(EasyLocalInit.highCoolTime);
        int lowCoolTime = (int) FirebaseRemoteConfig.getInstance().getLong(EasyLocalInit.lowCoolTime);
        highCoolDownMs = highCoolTime * 60 * 1000L;
        normalCoolDownMs = lowCoolTime * 60 * 1000L;
        maxDailyHigh = highCount;
        logD("更新配置: High冷却=" + highCoolTime + "分钟, Normal冷却=" + lowCoolTime + "分钟, 每日High上限=" + maxDailyHigh);
    }

    /**
     * 获取今日已发送的High通知次数
     */
    public static int getTodayHighCount() {
        return prefs.getInt(KEY_TODAY_HIGH_COUNT, 0);
    }

    /**
     * 打印所有统计信息
     */
    public static void printStats() {
        logI("====== 通知统计信息 ======");
        logI("今日日期: " + today());
        logI("今日High通知次数: " + getTodayHighCount() + "/" + maxDailyHigh);
        logI("首次解锁标记: " + prefs.getBoolean(KEY_FIRST_UNLOCK_TODAY, false));
        logI("充电High已发: " + prefs.getBoolean(KEY_CHARGE_HIGH_TODAY, false));
        logI("断电High已发: " + prefs.getBoolean(KEY_DISCHARGE_HIGH_TODAY, false));
        logI("低电量High已发: " + prefs.getBoolean(KEY_BATTERY_LOW_HIGH_TODAY, false));
        logI("最后High通知时间: " + formatTime(prefs.getLong(KEY_LAST_HIGH_TIME, 0)));
        logI("最后FCM High时间: " + formatTime(prefs.getLong(KEY_LAST_FCM_HIGH, 0)));
        logI("最后Normal通知时间: " + formatTime(prefs.getLong(KEY_LAST_NORMAL_TIME, 0)));
        logI("当前时间: " + formatTime(System.currentTimeMillis()));
        logI("=========================");
    }

    /**
     * 重置所有数据（用于测试）
     */
    public static void reset() {
        logD("重置所有数据");
        prefs.edit().clear().apply();
    }

    /**
     * 模拟一天结束，重置计数器
     */
    public static void simulateDayEnd() {
        logD("模拟一天结束，重置计数器");
        resetDailyIfNeeded();
    }

    // ==================== 私有辅助方法 ====================

    private static boolean checkCooldown(Level level) {
        String lastTimeKey;
        long cooldown;

        switch (level) {
            case HIGH:
                lastTimeKey = KEY_LAST_HIGH_TIME;
                cooldown = highCoolDownMs;
                break;
            case NORMAL:
                lastTimeKey = KEY_LAST_NORMAL_TIME;
                cooldown = normalCoolDownMs;
                break;
            default:
                return false;
        }

        long lastTime = prefs.getLong(lastTimeKey, 0);
        long elapsed = System.currentTimeMillis() - lastTime;
        boolean isReady = elapsed >= cooldown;

        if (isReady) {
            if (level == Level.NORMAL) {
                prefs.edit().putLong(KEY_LAST_NORMAL_TIME, System.currentTimeMillis()).apply();
            }else{
                prefs.edit().putLong(KEY_LAST_HIGH_TIME, System.currentTimeMillis()).apply();
            }
        }


        logD("冷却检查: level=" + level +
                ", 上次时间=" + formatTime(lastTime) +
                ", 当前时间=" + formatTime(System.currentTimeMillis()) +
                ", 已过去" + (elapsed/1000) + "秒, 需要" + (cooldown/1000) + "秒, 是否就绪: " + isReady);

        return isReady;
    }

    private static void incrementHighCount() {
        int current = getTodayHighCount();
        prefs.edit().putInt(KEY_TODAY_HIGH_COUNT, current + 1).apply();
        logD("增加High计数: " + current + " -> " + (current + 1));
    }

    /**
     * 新的一天重置当天数据
     */
    private static void resetDailyIfNeeded() {
        String todayStr = today();
        String storedDate = prefs.getString(KEY_TODAY_DATE, "");

        if (!storedDate.equals(todayStr)) {
            logD("新的一天，重置当天数据");

            SharedPreferences.Editor editor = prefs.edit();

            // 保存今天的日期
            editor.putString(KEY_TODAY_DATE, todayStr);

            // 重置当天的计数器
            editor.putInt(KEY_TODAY_HIGH_COUNT, 0);
            editor.putBoolean(KEY_FIRST_UNLOCK_TODAY, false);
            editor.putBoolean(KEY_CHARGE_HIGH_TODAY, false);
            editor.putBoolean(KEY_DISCHARGE_HIGH_TODAY, false);
            editor.putBoolean(KEY_BATTERY_LOW_HIGH_TODAY, false);

            editor.apply();
        }
    }

    /**
     * 获取当前日期字符串
     */
    private static String today() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 格式化时间戳
     */
    private static String formatTime(long timestamp) {
        if (timestamp == 0) return "从未";
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(timestamp);
        return String.format("%02d:%02d:%02d",
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                cal.get(Calendar.SECOND));
    }

    private static void logD(String message) {
        if (debugMode) {
            Log.d(TAG, message);
        }
    }

    private static void logI(String message) {
        Log.i(TAG, message);
    }
}