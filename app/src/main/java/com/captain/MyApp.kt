package com.captain

import android.app.Application
import com.easy.model.EasyManager
import com.easy.model.change.EasyConfig
import com.newalive.model.use.EasyLocalInit


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

//        EasyConfig.configFcmUrl("com")
//        EasyConfig.configFcmInterfacePath("https://com")
        EasyConfig.configHeartUrl("https://www.google.com")
        EasyLocalInit.initCore(
            this,
            packageName,
            true
        )
    }
}