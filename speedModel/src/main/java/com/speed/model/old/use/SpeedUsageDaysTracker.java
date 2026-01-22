package com.speed.model.old.use;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.speed.model.BuildConfig;

import java.util.Calendar;

/**
 * 用户未使用天数统计工具类
 * 简洁版：只统计用户未使用App的天数
 */
public class SpeedUsageDaysTracker {
    
    private static final String TAG = "TAG-->>UsageDays";
    private static final String PREFS_NAME = "usage_days_tracker";
    private static final String KEY_LAST_USAGE_TIME = "last_usage_time";
    
    private static SharedPreferences prefs = null;
    private static boolean debugMode = BuildConfig.DEBUG;
    
    // 私有构造，防止实例化
    private SpeedUsageDaysTracker() {}
    
    /**
     * 初始化（必须在应用启动时调用一次）
     */
    public static void init(Context context) {
        if (prefs == null) {
            prefs = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
            logD("使用天数统计器初始化完成");
        }
    }
    
    /**
     * 设置调试模式
     */
    public static void setDebugMode(boolean enabled) {
        debugMode = enabled;
        logD("调试模式: " + enabled);
    }
    
    /**
     * 记录App使用（在App启动或用户使用时调用）
     */
    public static void recordAppUsage() {
        long currentTime = System.currentTimeMillis();
        prefs.edit().putLong(KEY_LAST_USAGE_TIME, currentTime).apply();
        logD("记录App使用时间: " + formatTime(currentTime));
    }
    
    /**
     * 获取未使用天数（距离上次使用的天数）
     * @return 未使用天数，如果从未使用过返回0
     */
    public static int getUnusedDays() {
        if (!prefs.contains(KEY_LAST_USAGE_TIME)) {
            logD("从未记录过App使用");
            return 0;
        }
        
        long lastUsageTime = prefs.getLong(KEY_LAST_USAGE_TIME, 0);
        if (lastUsageTime == 0) {
            return 0;
        }
        
        return calculateDaysBetween(lastUsageTime, System.currentTimeMillis());
    }
    
    /**
     * 获取最后使用时间字符串
     */
    public static String getLastUsageTime() {
        if (!prefs.contains(KEY_LAST_USAGE_TIME)) {
            return "从未使用";
        }
        
        long lastUsageTime = prefs.getLong(KEY_LAST_USAGE_TIME, 0);
        return formatFullTime(lastUsageTime);
    }
    
    /**
     * 打印统计信息
     */
    public static void printStats() {
        logI("====== 使用天数统计 ======");
        logI("最后使用时间: " + getLastUsageTime());
        logI("未使用天数: " + getUnusedDays() + "天");
        logI("=======================");
    }
    
    /**
     * 重置所有数据（用于测试）
     */
    public static void reset() {
        logD("重置使用统计数据");
        prefs.edit().clear().apply();
    }
    
    /**
     * 模拟设置最后使用时间（用于测试）
     * @param daysAgo 多少天前
     */
    public static void simulateLastUsageDaysAgo(int daysAgo) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -daysAgo);
        long simulatedTime = cal.getTimeInMillis();
        prefs.edit().putLong(KEY_LAST_USAGE_TIME, simulatedTime).apply();
        logD("模拟设置最后使用时间: " + daysAgo + "天前 (" + formatFullTime(simulatedTime) + ")");
    }
    
    // ==================== 私有辅助方法 ====================
    
    /**
     * 计算两个时间戳之间的天数差
     */
    private static int calculateDaysBetween(long startTime, long endTime) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTimeInMillis(startTime);
        resetCalendarToMidnight(startCal);
        
        Calendar endCal = Calendar.getInstance();
        endCal.setTimeInMillis(endTime);
        resetCalendarToMidnight(endCal);
        
        long diff = endCal.getTimeInMillis() - startCal.getTimeInMillis();
        int days = (int) (diff / (24 * 60 * 60 * 1000));
        
        logD("天数计算: 从 " + formatFullTime(startTime) + " 到 " + formatFullTime(endTime) + " = " + days + "天");
        return days;
    }
    
    /**
     * 重置Calendar到当天0点
     */
    private static void resetCalendarToMidnight(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
    }
    
    /**
     * 格式化时间（仅时间部分）
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
    
    /**
     * 格式化完整时间（日期+时间）
     */
    private static String formatFullTime(long timestamp) {
        if (timestamp == 0) return "从未";
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(timestamp);
        return String.format("%04d-%02d-%02d %02d:%02d:%02d",
            cal.get(Calendar.YEAR),
            cal.get(Calendar.MONTH) + 1,
            cal.get(Calendar.DAY_OF_MONTH),
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
