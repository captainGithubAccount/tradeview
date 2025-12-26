package com.smartfile.model

import android.content.Context
import android.util.Log
import androidx.annotation.Keep
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.smartfile.model.SmartFileManager.finish_coldtime
import java.util.Calendar

/**
 * 通知管理工具类
 * 负责处理通知展示逻辑和次数限制控制
 */

object FcmNotificationManager {

    // 常量定义
    private const val TAG = "NotificationManager"
    private  var FINISH_HIGH_MILLIS = 60 * 60 * 1000L  // 60分钟毫秒数
    private const val HIGH_NOTIFICATION_KEY = "high_notification_count"
    private const val LAST_NOTIFICATION_TIME_KEY = "last_notification_time"
    private const val LAST_RESET_DATE_KEY = "last_reset_date"

    private lateinit var prefs: android.content.SharedPreferences
    private var maxHighNotifications: Int = 3  // 默认每天最多3次高优先级通知

    /**
     * 初始化工具类
     * @param context Android上下文
     * @param maxHigh 每天最大高优先级通知次数，默认3次
     *
     */
    fun init(context: Context, maxHigh: Int = 3, finish_coldtime: Int = 60) {
        prefs = context.getSharedPreferences("notification_manager", Context.MODE_PRIVATE)
        maxHighNotifications = maxHigh

        Log.e("NotificationManager", "high通知类型冷却时间，fb配置为： " +finish_coldtime);
        FINISH_HIGH_MILLIS = finish_coldtime * 60 * 1000L;
        resetCountIfNeeded()
        Log.e(TAG, "NotificationManager initialized with maxHighNotifications=$maxHigh")
    }

    fun setMaxHigh(maxHigh: Int = 3){
        maxHighNotifications = maxHigh
    }

    /**
     * 检查并触发通知
     * @param lastSendTime 从后台获取的上次发送时间（毫秒时间戳），如果为0或-1表示未获取到
     */
    fun checkAndTriggerNotification(
        lastSendTime: Long,
        showHighNotification: () -> Unit = {},
        showLowNotification: () -> Unit = {}
    ) {
        if (!FcmNotificationManager::prefs.isInitialized) {
            Log.e(TAG, "NotificationManager not initialized. Call init() first.")
            return
        }

        Log.e(TAG, "---1")

        val high_coldtime = FirebaseRemoteConfig.getInstance().getLong(finish_coldtime).toInt()
        FINISH_HIGH_MILLIS = high_coldtime * 60 * 1000L

        val currentTime = System.currentTimeMillis()
        val lastLocalNotificationTime = prefs.getLong(LAST_NOTIFICATION_TIME_KEY, 0L)

        Log.e(TAG, "检查通知: 当前时间=$currentTime, 后台时间=$lastSendTime, 本地时间=$lastLocalNotificationTime")

        Log.e(TAG, "---2")

        // 判断逻辑
        when {
            // 情况1: 没有获取到后台时间，使用本地时间判断
            lastSendTime <= 0 -> {
                Log.e("NotificationManager", "情况1: 没有获取到后台时间，使用本地时间判断 ");
                checkLocalNotification(lastLocalNotificationTime, currentTime, showHighNotification, showLowNotification)

            }
            // 情况2: 获取到了后台时间
            else -> {
                Log.e("NotificationManager", "情况2: 获取到了后台时间 ");
                checkWithBackendTime(lastSendTime, lastLocalNotificationTime, currentTime, showHighNotification, showLowNotification)
            }
        }

        Log.e(TAG, "---3")


        printStatus()
    }



    /**
     * 检查本地通知逻辑（未获取到后台时间时使用）
     */
    private fun checkLocalNotification(
        lastLocalTime: Long,
        currentTime: Long,
        showHighNotification: () -> Unit,
        showLowNotification: () -> Unit
    ) {
        val timeDiff = currentTime - lastLocalTime
        Log.e(TAG, "--差是${timeDiff/1000} --最大是-- ${FINISH_HIGH_MILLIS/1000} ")

        // 第一次发送通知，没有本地记录，展示high通知
        if (timeDiff >= FINISH_HIGH_MILLIS) {
            // 本地时间超过半小时，展示high通知
            Log.e(TAG, "本地时间超过半小时，展示high通知，时间差=${timeDiff / 1000}秒")
            checkHighNotificationCount(
                onCanShowHigh = showHighNotification,
                onCanShowLow = showLowNotification
            )
        } else {
            // 本地时间小于半小时，展示low通知
            Log.e(TAG, "本地时间小于半小时，展示low通知，时间差=${timeDiff / 1000}秒")
            showLowNotification()
        }


//        if (lastLocalTime == 0L) {
//            // 第一次发送通知，没有本地记录，展示high通知
//            Log.e(TAG, "第一次发送通知，展示high通知")
//            checkHighNotificationCount(
//                onCanShowHigh = showHighNotification,
//                onCanShowLow = showLowNotification
//            )
//        } else
    }

    /**
     * 检查带后台时间的通知逻辑
     */
    private fun checkWithBackendTime(
        lastBackendTime: Long,
        lastLocalTime: Long,
        currentTime: Long,
        showHighNotification: () -> Unit,
        showLowNotification: () -> Unit
    ) {
        val timeDiffFromBackend = currentTime - lastBackendTime

        Log.e(TAG, "当前时间距离后台时间差=${timeDiffFromBackend / 1000}秒, 阈值=${FINISH_HIGH_MILLIS / 1000}秒")

        if (timeDiffFromBackend < FINISH_HIGH_MILLIS) {
            // 当前时间距离后台时间小于半小时，展示low通知
            Log.e(TAG, "距离后台时间小于半小时，展示low通知")
            showLowNotification()
        } else {
            // 当前时间距离后台时间大于半小时，判断本地时间
            val timeDiffFromLocal = currentTime - lastLocalTime

            if (timeDiffFromLocal >= FINISH_HIGH_MILLIS) {
                // 本地时间也超过半小时，展示high通知
                Log.e(TAG, "距离本地时间超过半小时，展示high通知，本地时间差=${timeDiffFromLocal / 1000}秒")
                checkHighNotificationCount(
                    onCanShowHigh = showHighNotification,
                    onCanShowLow = showLowNotification
                )
            } else {
                // 本地时间小于半小时，展示low通知
                Log.e(TAG, "距离本地时间小于半小时，展示low通知，本地时间差=${timeDiffFromLocal / 1000}秒")
                showLowNotification()
            }
        }
    }

    /**
     * 检查high通知次数限制
     * @param onCanShowHigh 可以展示high通知时的回调
     * @param onCanShowLow 超过限制时展示low通知的回调
     */
    private fun checkHighNotificationCount(onCanShowHigh: () -> Unit, onCanShowLow: () -> Unit) {
        resetCountIfNeeded()
        setMaxHighNotifications()

        val currentCount = prefs.getInt(HIGH_NOTIFICATION_KEY, 0)
        Log.e(TAG, "当前高优先级通知计数: $currentCount, 最大限制: $maxHighNotifications")

        if (currentCount < maxHighNotifications) {
            // 可以展示high通知
            onCanShowHigh.invoke()
            // 增加计数
            prefs.edit().putInt(HIGH_NOTIFICATION_KEY, currentCount + 1).apply()
            Log.e(TAG, "小于通知次数，最终发送了high通知")
            // 保存本次通知发送时间
            val currentTime = System.currentTimeMillis()
            prefs.edit().putLong(LAST_NOTIFICATION_TIME_KEY, currentTime).apply()
        } else {
            Log.e(TAG, "大于通知次数，最终发送了low通知")
            // 超过限制，展示low通知
            onCanShowLow.invoke()
        }
    }

    /**
     * 设置最大高优先级通知次数
     */
    fun setMaxHighNotifications() {
        val hightimes = FirebaseRemoteConfig.getInstance().getLong(SmartFileManager.local_hightimes).toInt()
        maxHighNotifications = hightimes
        Log.e(TAG, "设置最大高优先级通知次数: $maxHighNotifications")
    }

    /**
     * 每天重置计数
     */
    private fun resetCountIfNeeded() {
        val today = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        val lastResetDay = prefs.getInt(LAST_RESET_DATE_KEY, -1)

        if (lastResetDay != today) {
            Log.e(TAG, "新的一天，重置高优先级通知计数")
            prefs.edit().putInt(HIGH_NOTIFICATION_KEY, 0).apply()
            prefs.edit().putInt(LAST_RESET_DATE_KEY, today).apply()
        }
    }

    /**
     * 获取当前high通知计数
     */
    fun getCurrentHighNotificationCount(): Int {
        return prefs.getInt(HIGH_NOTIFICATION_KEY, 0)
    }



    /**
     * 获取上次通知时间
     */
    fun getLastNotificationTime(): Long {
        return prefs.getLong(LAST_NOTIFICATION_TIME_KEY, 0L)
    }

    /**
     * 重置所有通知数据（用于测试或用户登出）
     */
//    fun resetAllData() {
//        prefs.edit().apply {
//            putInt(HIGH_NOTIFICATION_KEY, 0)
//            putLong(LAST_NOTIFICATION_TIME_KEY, 0L)
//            putInt(LAST_RESET_DATE_KEY, -1)
//        }.apply()
//        Log.i(TAG, "所有通知数据已重置")
//    }



    /**
     * 打印当前状态
     */
    fun printStatus() {
        val status = """
            NotificationManager 状态:
            高优先级通知计数: ${getCurrentHighNotificationCount()}/$maxHighNotifications
            上次通知时间: ${getLastNotificationTime()}
            是否应该重置计数: ${Calendar.getInstance().get(Calendar.DAY_OF_YEAR) != prefs.getInt(LAST_RESET_DATE_KEY, -1)}
            是否已初始化: ${FcmNotificationManager::prefs.isInitialized}
        """.trimIndent()

        Log.e(TAG, status)
    }
}