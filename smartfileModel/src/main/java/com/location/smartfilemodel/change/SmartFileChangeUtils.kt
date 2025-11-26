package com.location.smartfilemodel.change

import android.app.PendingIntent
import android.os.Build

object SmartFileChangeUtils {
    // todo 修改内容
    // 通知点击
    var noti_click_str = "smartFileClickStr"

    var coolTimeStar = "smartfile_notify_sleep_time"

    // 启动页路径
    var launchActivityPath = "com.finaltest.clean.ui22_page.splash.FlightfoxActivity"

    // FCM 路径
    var FCM_URL: String = "https://www.smartcleanphone.com/"

//    com.orange.blue.compores

    fun getNotifyFlag(): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.FLAG_MUTABLE
        } else {
            PendingIntent.FLAG_UPDATE_CURRENT
        }
    }
}