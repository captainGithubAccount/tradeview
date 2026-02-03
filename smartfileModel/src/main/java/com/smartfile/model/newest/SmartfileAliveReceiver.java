package com.smartfile.model.newest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.smartfile.model.newest.use.SmartfileLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/**
 * 监听系统事件（开机、解锁、包替换）
 * 作用：在应用处于死亡状态时，利用系统广播进行“冷启动”点火
 */
public class SmartfileAliveReceiver extends BroadcastReceiver {
    private static final String TAG = "ALIVE_TEST";

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(SmartfileLocalInit.isUseNewKeepAlive);
            Log.d("xxx", "isNewKeepAlive is "+String.valueOf(isNewKeepAlive));
            if(isNewKeepAlive == 0) {//0初始化新保活， 1不用新保活
                // 1. 构建启动服务的 Intent
                Intent serviceIntent = new Intent(context, SmartfileSmartFileAliveService.class);

                try {
                    // 2. 根据版本选择点火方式
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        // Android 8.0+ 必须以快速启动方式拉起，并在 Service 内 5 秒内挂起通知
                        context.startForegroundService(serviceIntent);
                    } else {
                        context.startService(serviceIntent);
                    }
                    Log.d(TAG, "点火成功：已尝试拉起 SmartFileAliveService");
                } catch (Exception e) {
                    // 3. 针对 Android 14 后台启动限制的保护
                    Log.e(TAG, "点火失败：后台启动受限，错误原因: " + e.getMessage());
                    // 如果报错，说明用户可能没给“自启动”或“忽略电池优化”权限
                }

                String action = intent.getAction();
                Log.d(TAG, "AliveReceiver 收到系统信号: " + action);
            }
        }catch (Exception e){
            Log.e("ALIVE_TEST", "Firebase 配置获取失败2: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
