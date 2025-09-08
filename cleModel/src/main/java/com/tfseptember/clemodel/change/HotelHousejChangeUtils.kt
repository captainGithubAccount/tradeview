package com.tfseptember.clemodel.change

import android.app.PendingIntent
import android.os.Build

object HotelHousejChangeUtils {
    // todo 修改内容
    // 通知点击
    var noti_click_str = "simplyClickStr"

    var coolTimeStar = "simply1_notify_sleep_time"

    // 启动页路径
    var launchActivityPath = "com.akjb.clear.eighteen.ui.FirstActivity"

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
