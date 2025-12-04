package com.captain

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.captain.luo.R
import com.recover.redate.RecoverOrgManager

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //*************  注意app打开通知权限， 默认启动后是没有通知权限的
        if (RecoverOrgManager.isNotificationEnabled()) {
            RecoverOrgManager.INSTANCE.startNotifyService(true)
        }
        RecoverOrgManager.INSTANCE.startTwoService()

    }
}