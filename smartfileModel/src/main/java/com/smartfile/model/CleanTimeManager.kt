package com.smartfile.model

import android.content.Context
import android.util.Log
import androidx.annotation.Keep
import com.google.firebase.remoteconfig.FirebaseRemoteConfig

/**
 * 清理功能管理工具类
 * 负责处理清理功能的时间间隔控制和概率逻辑
 */

object CleanTimeManager {
    var appinstanceid = ""

    private const val TAG = "CleanupManager"
    private var FIVE_MINUTES_MILLIS = 5 * 60 * 1000L  // 5分钟毫秒数
    private const val LAST_CLEANUP_TIME_KEY = "last_cleanup_time"

    private lateinit var prefs: android.content.SharedPreferences

    /**
     * 初始化清理管理器
     * @param context Android上下文
     * @param cleanupAction 清理功能回调（可选）
     * @param otherFeatureAction 其他功能回调（可选）
     */
    fun init(
        context: Context,
    ) {
        Log.d(TAG, "CleanupManager initialized")
        prefs = context.getSharedPreferences("cleanup_manager", Context.MODE_PRIVATE)
        resetCleanupRecord()
        printStatus()
    }




    /**
     * 检查并执行清理功能
     * 逻辑：
     * 1. 如果从未执行过清理，直接执行清理
     * 2. 如果距离上次清理超过5分钟，执行清理
     * 3. 如果5分钟内，有1/5概率执行其他功能，否则不执行任何操作
     *
     * @param forceCleanup 是否强制执行清理（忽略时间间隔）
     */

    fun checkAndExecuteCleanup(executeCleanup: ()->Unit = {}, otherFunBlock: ()->Unit ) {
        if (!CleanTimeManager::prefs.isInitialized) {
            Log.e(TAG, "CleanupManager not initialized. Call init() first.")
            return
        }

        Log.e(TAG, "checkAndExecuteCleanup")

        var firebaseValue = FirebaseRemoteConfig.getInstance().getLong(SmartFileManager.finish_coldtime)
        val finish_coldtime: Int = firebaseValue.toInt()
        Log.d(TAG, finish_coldtime.toString())
        FIVE_MINUTES_MILLIS = finish_coldtime * 60 * 1000L


        val lastCleanupTime = prefs.getLong(LAST_CLEANUP_TIME_KEY, 0L)
        val currentTime = System.currentTimeMillis()

        Log.d(TAG, "检查清理: 上次清理时间=$lastCleanupTime, 当前时间=$currentTime")

        if (lastCleanupTime == 0L) {
            // 从未执行过清理，直接执行
            Log.d(TAG, "首次执行清理功能")
            executeCleanup()
            return
        }

        val timeDiff = currentTime - lastCleanupTime

        if (timeDiff >= FIVE_MINUTES_MILLIS) {
            // 强制清理或超过5分钟，执行清理
            executeCleanup()
        } else {
            otherFunBlock.invoke()
        }
        printStatus()
    }



    /**
     * 记录清理完成时间, 清理完成调用
     */
    fun recordCleanupTime() {
        val currentTime = System.currentTimeMillis()
        prefs.edit().putLong(LAST_CLEANUP_TIME_KEY, currentTime).apply()
        Log.d(TAG, "记录清理完成时间: $currentTime")
    }

//    =========================

    /**
     * 重置清理记录（用于测试或重置状态）
     */
    private fun resetCleanupRecord() {
        prefs.edit().remove(LAST_CLEANUP_TIME_KEY).apply()
        Log.i(TAG, "清理记录已重置")
    }

    /**
     * 获取上次清理时间
     */
    private fun getLastCleanupTime(): Long {
        return prefs.getLong(LAST_CLEANUP_TIME_KEY, 0L)
    }

    /**
     * 获取距离上次清理的时间差（毫秒）
     */
    private fun getTimeSinceLastCleanup(): Long {
        val lastTime = getLastCleanupTime()
        return if (lastTime == 0L) {
            0L
        } else {
            System.currentTimeMillis() - lastTime
        }
    }






//    =========================   test   ===============================


    /**
     * 打印当前状态
     */
    private fun printStatus() {
        val lastTime = getLastCleanupTime()
        val timeSince = getTimeSinceLastCleanup()
        val minutesSince = timeSince / (60 * 1000)

        // 计算差值并转换为秒
        val diffInSeconds = (timeSince) / 1000

        val status = """
            CleanupManager 状态:
            上次清理时间: ${if (lastTime == 0L) "从未清理" else lastTime}
            距离上次清理: ${minutesSince}分钟
            距离上次清理: ${diffInSeconds}秒钟
            是否应该清理: ${shouldCleanup()}
            是否已初始化: ${CleanTimeManager::prefs.isInitialized}
        """.trimIndent()

        Log.d(TAG, status)
    }

    /**
     * 检查是否应该执行清理
     * @return true如果距离上次清理超过5分钟或从未清理过
     */
    private fun shouldCleanup(): Boolean {
        val lastTime = getLastCleanupTime()
        return if (lastTime == 0L) {
            true  // 从未清理过
        } else {
            (System.currentTimeMillis() - lastTime) >= FIVE_MINUTES_MILLIS
        }
    }
}