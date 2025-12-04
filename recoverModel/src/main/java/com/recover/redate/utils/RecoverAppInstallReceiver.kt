package com.recover.redate.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import com.recover.redate.shownotificy.RecoverNtTransfer

class RecoverAppInstallReceiver : BroadcastReceiver() {

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
                RecoverNtTransfer.onInstallApp()
            }

            Intent.ACTION_PACKAGE_REMOVED -> {
                val packageName = intent.data?.encodedSchemeSpecificPart
                // 处理卸载事件
                RecoverNtTransfer.onInstallApp()
            }

            Intent.ACTION_PACKAGE_REPLACED -> {
                val packageName = intent.data?.encodedSchemeSpecificPart
                // 处理应用更新
                RecoverNtTransfer.onInstallApp()
            }
        }
    }
}
