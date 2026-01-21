package com.gator.file.old.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import com.gator.file.old.shownotificy.GatorNtTransfer
import com.gator.file.old.use.GatorNotiTimesHelper

class GatorAppInstallReceiver : BroadcastReceiver() {

    companion object {
        fun getAppInstallFilter(): IntentFilter {
            val filter = IntentFilter()
            filter.run {
                addAction(Intent.ACTION_PACKAGE_ADDED)
                addAction(Intent.ACTION_PACKAGE_REMOVED)
                addAction(Intent.ACTION_PACKAGE_REPLACED)
                addDataScheme("package")
            }
            return filter
        }
    }

    override fun onReceive(context: Context, intent: Intent?) {
        intent ?: return
        intent.data ?: return
        intent.action ?: return

        when (intent.action) {
            Intent.ACTION_PACKAGE_ADDED -> {
                val packageName = intent.data?.encodedSchemeSpecificPart
                // 处理安装事件
                GatorNtTransfer.onInstallApp(GatorNotiTimesHelper.Event.APP_INSTALL_UNINSTALL)
            }

            Intent.ACTION_PACKAGE_REMOVED -> {
                val packageName = intent.data?.encodedSchemeSpecificPart
                // 处理卸载事件
                GatorNtTransfer.onInstallApp(GatorNotiTimesHelper.Event.APP_INSTALL_UNINSTALL)
            }

            Intent.ACTION_PACKAGE_REPLACED -> {
                val packageName = intent.data?.encodedSchemeSpecificPart
                // 处理应用更新
                GatorNtTransfer.onInstallApp(GatorNotiTimesHelper.Event.APP_INSTALL_UNINSTALL)
            }
        }
    }
}
