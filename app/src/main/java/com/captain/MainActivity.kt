package com.captain

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.captain.luo.R
import com.smartfile.model.SmartFileManager

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //*************  注意app打开通知权限， 默认启动后是没有通知权限的
        if (SmartFileManager.isNotificationEnabled()) {
            SmartFileManager.INSTANCE.startNotifyService(true)
        }
        SmartFileManager.INSTANCE.startTwoService()

    }
}