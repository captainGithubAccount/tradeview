package com.smartfile.model.change

import android.app.PendingIntent
import android.os.Build
import java.util.Random

object SmartFileChangeUtils {
    // Home键/应用安装/应用卸载/ ,  充电/移除充电,   屏幕唤醒/用户解锁/闹钟服务
    enum class NoticeType {
        CLEAN, BATTERY, PROCESS, FCM, REWARD
    }
    var lastNoticeType: NoticeType? = null

    val list = listOf(
        "Battery is heating up. Optimize now to protect performance.",
        "High battery heat detected. Tap to reduce it.",
        "Charge Duration，Current Power",
    )
    val batteryContent = list.random()

    val procressList = listOf(
        "You haven't boost your device in a long time.",
        "Close background apps to boost speed.",
        "lots apps running in the background were detected.",
    )

    val procressContent = procressList.random()

    // todo 修改内容
    // 通知点击
    var noti_click_str = "sfClickStr"

    var coolTimeStar = "smartfile_notify_sleep_time"

    // 启动页路径
    var launchActivityPath = "com.finaltest.clean.ui22_page.splash.FlightfoxActivity"
    var h5ActivityPath = "com.finaltest.clean.ui22_page.gift.GiftH5Activity"


    // FCM 路径
    var FCM_URL: String = "https://www.smartcleanphone.com/"

    var currentRandomClean = getRandom()

    fun getNotifyFlag(): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            PendingIntent.FLAG_MUTABLE
        } else {
            PendingIntent.FLAG_UPDATE_CURRENT
        }
    }

    fun getRandom(): Int {
        val random = Random()
        val min = 200
        val max = 600

        // 生成 200-600 之间的随机数（包括 200 和 600）
        val number = random.nextInt(max - min + 1) + min
        return number
    }

}
