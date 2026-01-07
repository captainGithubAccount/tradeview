package com.captain

import android.app.Application
import com.google.firebase.FirebaseApp
import com.newalive.model.use.SmartFileInitializer
import com.speed.ozius.SpeedManager


/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @autor lwj
 * @version 1.0.0
 * Created by 2025年-12月
 */
class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()


        SpeedManager.INSTANCE.initCore(
            this,
            packageName,
            true
        )
    }
}