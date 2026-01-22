package com.captain

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.captain.luo.R
import com.speed.model.newest.use.SpeedLocalInit


class MainActivity: AppCompatActivity() {

    fun sendNotify(context: Context) {

        // 1. 定义通知渠道 ID (Android 8.0+ 必须)
        val CHANNEL_ID = "test_channel_id"


        // 2. 创建通知渠道
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID, "测试通知", NotificationManager.IMPORTANCE_DEFAULT
            )
            val manager: NotificationManager? = context.getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(channel)
        }


        // 3. 构建并发送通知
        val builder = NotificationCompat.Builder(context, CHANNEL_ID) // 设置小图标：这是适配的关键，必须是透明背景的单色图
            .setSmallIcon(R.drawable.ic_stat_name) // png图标，透明背景单色
            .setContentTitle("图标适配测试")
            .setContentText("如果你看到的是白块，说明图标没做透明处理") // 设置颜色（会影响小图标在下拉栏的底色或文字颜色）
            .setColor(0x000000) // 红色
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)

        val notificationManager = NotificationManagerCompat.from(context)


        notificationManager.notify(1, builder.build())
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        sendNotify(this)


        SpeedLocalInit.startService(this)
//        SpeedNotiTimesHelper.todayToHome(true);

        //*************  注意app打开通知权限， 默认启动后是没有通知权限的
//        if (SmartFileManager.isNotificationEnabled()) {
//            SmartFileManager.INSTANCE.startNotifyService(true)
//        }
//        SmartFileManager.INSTANCE.startTwoService()







        //        SmartFileNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
//        val prefs = SmartFileManager.mContext!!.getSharedPreferences("token", MODE_PRIVATE)
//        val token = prefs.getString("token", "")
//        Log.e("TAG-->>token", token.toString())








//        ======================================================================================
//        ======================================================================================


        /*val request = DeviceTokenRequest()
        request.token = token
        request*/

        // 方式1：不带请求参数
        /*(SmartFileRetrofitUtils.create<SmartFileMsgApi>(SmartFileMsgApi::class.java) as SmartFileMsgApi).getLastNotifyTime(request)
            .enqueue(object: Callback<ServerTimeResponse?> {
                override fun onResponse(
                    call: Call<ServerTimeResponse?>, response: Response<ServerTimeResponse?>
                ) {
                    var serverLastTime = 0L
                    if(response.isSuccessful && response.body() != null) {
                        val timeResponse = response.body()
                        val code = timeResponse!!.code
                        val message = timeResponse!!.msg
                    } else {
                        Log.d("T", "error")
                    }
                }

                override fun onFailure(call: Call<ServerTimeResponse?>, t: Throwable) { // 处理失败情况
                    t.printStackTrace()
                }
            })*/


        findViewById<Button>(R.id.test).setOnClickListener {
//            CleanTimeManager.checkAndExecuteCleanup({
//                Log.d("TAG-->>", "a")
//                CleanTimeManager.recordCleanupTime()
//            },{
//                Log.d("TAG-->>", "b")
//            })

//            GlobalScope.launch {
//                delay(5000L)
//                SpeedNotiTimesHelper.testNoti(true)
//            }

        }

        findViewById<Button>(R.id.test2).setOnClickListener {
//            CleanTimeManager.checkAndExecuteCleanup({
//                Log.d("TAG-->>", "a")
//                CleanTimeManager.recordCleanupTime()
//            },{
//                Log.d("TAG-->>", "b")
//            })
//            GlobalScope.launch {
//                delay(5000L)
//                SmartFileNtTransfer.testNoti(false)
//            }


        }

    }
}