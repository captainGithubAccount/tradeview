package com.smartfile.model;

import static com.smartfile.model.SmartFileManager.dayily_max_notify_times;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 每日通知计数器
 * 功能：每天自动重置，管理通知发送次数
 */
public class DailyNotificationCounter {

    private static DailyNotificationCounter instance;
    private final SharedPreferences preferences;
    private final SimpleDateFormat dateFormat;

    // SharedPreferences 键
    private static final String PREF_NAME = "daily_notification_counter";
    private static final String KEY_LAST_DATE = "last_date";
    private static final String KEY_COUNT = "count";

    // 最大次数配置（从Firebase获取）
    private int maxPerDay = 1000; // 默认值

    private DailyNotificationCounter(Context context) {
        this.preferences = context.getApplicationContext()
                .getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        this.dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    public static DailyNotificationCounter getInstance(Context context) {
        if (instance == null) {
            synchronized (DailyNotificationCounter.class) {
                if (instance == null) {
                    instance = new DailyNotificationCounter(context);
                }
            }
        }
        return instance;
    }

    /**
     * 初始化最大次数（通常在应用启动时从Firebase获取后调用）
     * @param maxPerDay 每天最大次数
     */
    public void initMaxPerDay(int maxPerDay) {
        if (maxPerDay > 0) {
            this.maxPerDay = maxPerDay;
        }
        Log.e("TAG-->>daily","最大次数：" +maxPerDay);
    }

    /**
     * 检查是否可以发送通知
     * @return true 如果可以发送
     */
    public boolean canSendNotification() {
        int max_notify_times = (int) FirebaseRemoteConfig.getInstance().getLong(dayily_max_notify_times);
        initMaxPerDay(max_notify_times);
        checkAndReset();
        return getTodayCount() < maxPerDay;
    }

    /**
     * 记录发送了一次通知
     * @return true 如果发送成功（未超过限制）
     */
    public void recordNotificationSent() {
        int todayCount = getTodayCount();
        Log.d("TAG-->>daily","之前：" +todayCount);
        preferences.edit().putInt(KEY_COUNT, todayCount + 1).apply();
        Log.d("TAG-->>daily","之后：" +preferences.getInt(KEY_COUNT, 0));
        Log.d("TAG-->>daily","剩余次数：" +getRemainingCount());
    }

    /**
     * 获取今日已发送次数
     */
    public int getTodayCount() {
        checkAndReset();
        return preferences.getInt(KEY_COUNT, 0);
    }

    /**
     * 获取每日最大次数
     */
    public int getMaxPerDay() {
        return maxPerDay;
    }

    /**
     * 获取今日剩余次数
     */
    public int getRemainingCount() {
        checkAndReset();
        return Math.max(0, maxPerDay - getTodayCount());
    }

    /**
     * 手动重置计数器（用于测试）
     */
    public void resetCounter() {
        String today = getTodayDate();
        preferences.edit()
                .putString(KEY_LAST_DATE, today)
                .putInt(KEY_COUNT, 0)
                .apply();
    }

    /**
     * 获取今日日期字符串
     */
    private String getTodayDate() {
        return dateFormat.format(new Date());
    }

    /**
     * 检查并重置（如果是新的一天）
     */
    private void checkAndReset() {
        String today = getTodayDate();
        String lastDate = preferences.getString(KEY_LAST_DATE, "");

        if (!today.equals(lastDate)) {
            resetCounter();
        }
    }
}