package com.recover.redate.change

import android.app.PendingIntent
import android.os.Build

object RecoverChangeUtils {
    // todo 修改内容
    // 通知点击
    var noti_click_str = "recovernostui"

    var coolTimeStar = "recover_sleep_time"

    // 启动页路径
    var launchActivityPath = "com.ymhd.offline.recoverease.ui.page.SplashActivity"

    // FCM 路径
    var FCM_URL: String = "https://bluecleantt-api.heartwavetracker.com/"

//    com.orange.blue.compores

    fun getNotifyFlag(): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.FLAG_MUTABLE
        } else {
            PendingIntent.FLAG_UPDATE_CURRENT
        }
    }
}