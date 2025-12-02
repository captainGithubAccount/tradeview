package com.captain

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.captain.luo.R
import com.location.smartfilemodel.SmartFileOrgManager

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (SmartFileOrgManager.isNotificationEnabled()) {
            SmartFileOrgManager.INSTANCE.startNotifyService(true)
        }
        SmartFileOrgManager.INSTANCE.startTwoService()

    }
}