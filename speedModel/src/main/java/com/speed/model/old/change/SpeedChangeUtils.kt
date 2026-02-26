package com.speed.model.old.change

import android.app.PendingIntent
import android.os.Build
import android.text.Html
import androidx.annotation.Keep
import java.util.Random

@Keep
object SpeedChangeUtils {
    // Home键/应用安装/应用卸载/ ,  充电/移除充电,   屏幕唤醒/用户解锁/闹钟服务
    enum class NoticeType {
        CLEAN, BATTERY, PROCESS, FCM
    }
    var lastNoticeType: NoticeType? = null

    val list = listOf(
        "Check Phone Battery Health."
    )
    val batteryContent = list.random()

    val procressSmallList = listOf(
        "<font size=\"20\">⚠</font> Severe Lag Detected!",
        "<font size=\"20\">🔴</font> Phone Slowing Down?",
        "<font size=\"20\">🚀</font> Phone Feel Slow?",
        "<font size=\"20\">💤</font> Smart Sleep Mode",
    )

    val procressBigList = listOf(
        "Optimize for better standby tonight.",
        "One-tap to release RAM and boost speed",
        "14 apps draining background. Stop them.",
        "Critical RAM usage (92%). Boost NOW.",
    )

    val batterySmallList = listOf(
        "<font size=\"20\"🔋</font> Extend Battery Life",
        "<font size=\"20\">🌡️</font> Cool Down Phone",
        "<font size=\"20\">🔥</font> Phone Overheating!",
    )

    val batteryBigList = listOf(
        "Temp is too high! Cool down immediately.",
        "Device warm? gently optimize CPU usage",
        "Stop draining apps to get +2 hours.",
    )

    val deviceSmallList = listOf(
        "<font size=\"20\"📱</font> Daily Status Check",
        "<font size=\"20\">⚠️</font> Malware Threat!",
        "<font size=\"20\">🚫</font> Security Risk Alert",
    )

    val deviceBigList = listOf(
        "Your phone is in good shape. See score.",
        "Privacy at risk. Run deep scan now.",
        "Threats detected. Tap to scan now.",
    )

    val cleanSmallList = listOf(
        "<font size=\"20\"🧹</font> Storage Almost Full",
        "<font size=\"20\">🗂️</font> 2.3GB Junk Found",
        "<font size=\"20\">✨</font> Running Out of Space?",
    )

    val cleanBigList = listOf(
        "Find and delete large files easily.",
        "Clear chat cache to free up huge space.",
        "Found new cache files. Clear them out.",
    )

    val procressSmallContent = Html.fromHtml(procressSmallList.random(), Html.FROM_HTML_MODE_LEGACY)
    val procressBigContent = procressBigList.random()


    val batterySmallContent = Html.fromHtml(batterySmallList.random(), Html.FROM_HTML_MODE_LEGACY)
    val batteryBigContent = batteryBigList.random()

    val deviceSmallContent = Html.fromHtml(deviceSmallList.random(), Html.FROM_HTML_MODE_LEGACY)
    val deviceBigContent = deviceBigList.random()

    val cleanSmallContent = Html.fromHtml(deviceSmallList.random(), Html.FROM_HTML_MODE_LEGACY)
    val cleanBigContent = deviceBigList.random()




    // todo 修改内容
    // 通知点击
    var noti_click_str = "speedaoos"

    var coolTimeStar = "speed_notify_sleep_time"

    // 启动页路径
    var launchActivityPath = "com.speed.cleanner.oahdjk.start.IslandiqwActivity"

    // FCM 路径

    var FCM_URL: String = "https://trashcleandevicetrashdeep.ghostproxyghost.com/"
    var FCM_INTERFACE_PATH: String = "com/gofile/manager/rep"

    //心跳包url
    var httpHeartUrl: String = "https://trashcleandevicetrashdeep.ghostproxyghost.com/com/gofile/manager/ping"


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
