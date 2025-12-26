package com.captain

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.captain.luo.R
import com.smartfile.model.SmartFileManager
import com.smartfile.model.shownotificy.SmartFileNtTransfer
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //*************  注意app打开通知权限， 默认启动后是没有通知权限的
        if (SmartFileManager.isNotificationEnabled()) {
            SmartFileManager.INSTANCE.startNotifyService(true)
        }
        SmartFileManager.INSTANCE.startTwoService()


        //        SmartFileNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
        val prefs = SmartFileManager.mContext!!.getSharedPreferences("token", MODE_PRIVATE)
        val token = prefs.getString("token", "")
        Log.e("TAG-->>token", token.toString())


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

            GlobalScope.launch {
                delay(5000L)
                SmartFileNtTransfer.testNoti(true)
            }

        }

        findViewById<Button>(R.id.test2).setOnClickListener {
//            CleanTimeManager.checkAndExecuteCleanup({
//                Log.d("TAG-->>", "a")
//                CleanTimeManager.recordCleanupTime()
//            },{
//                Log.d("TAG-->>", "b")
//            })
            GlobalScope.launch {
                delay(5000L)
                SmartFileNtTransfer.testNoti(false)
            }


        }

    }
}