package com.location.notimodel.change

import android.app.PendingIntent
import android.os.Build

object BlueTenChangeUtils {
    // todo 修改内容
    // 通知点击
    var noti_click_str = "blueTenClickStr"

    var coolTimeStar = "notify_sleep_time"

    // 启动页路径
    var launchActivityPath = "com.deep.blueten.compores.start.ApplemdrActivity"

    // FCM 路径
    var FCM_URL: String = "https://prod-fcm-api.orcleanphone.com/"

//    com.orange.blue.compores

    fun getNotifyFlag(): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.FLAG_MUTABLE
        } else {
            PendingIntent.FLAG_UPDATE_CURRENT
        }
    }
}