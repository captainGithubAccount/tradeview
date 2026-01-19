package com.tidy.file.old.change

import android.app.PendingIntent
import android.os.Build
import androidx.annotation.Keep
import java.util.Random

@Keep
object TidyChangeUtils {
    // Home键/应用安装/应用卸载/ ,  充电/移除充电,   屏幕唤醒/用户解锁/闹钟服务
    enum class NoticeType {
        CLEAN, BATTERY, PROCESS, FCM
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
        "Close background apps to boost easy.",
        "lots apps running in the background were detected.",
    )

    val procressContent = procressList.random()

    // todo 修改内容
    // 通知点击
    var noti_click_str = "easyStr"

    var coolTimeStar = "easy_noti_time"

    // 启动页路径
    var launchActivityPath = "com.cleartw.bct.MainActivity"

    // FCM 路径
    var FCM_URL: String = "https://www.smartcleanphone.com/"
    var FCM_INTERFACE_PATH: String = "com/filemanager/easy/rep"

    //心跳包url
    var httpHeartUrl: String = "https://www.smartcleanphone.com/com/filemanager/easy/ping"


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
