package com.tidy.file.newest;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tidy.file.newest.use.EasyLocalInit;

/**
 * 强化版指挥部：
 * 修改点：移除启动门槛，实现“触发即刷新”逻辑，确保通知栏图标实时可见。
 */


//@Keep
public class EasySmartFileController {
    private static final String TAG = "ALIVE_TEST";
    private static EasySmartFileController instance;
    private Notification cachedNotification;

    // 依然保留状态位，仅用于日志监控，不再用于拦截启动指令
    private static boolean isServiceRunning = false;

    public static synchronized EasySmartFileController getInstance() {
        if (instance == null) instance = new EasySmartFileController();
        return instance;
    }

    /**
     * 统一点火入口：每次触发都会尝试刷新服务状态
     */
    public void fire(Context context) {

        try {
            Log.e("xxx", "fire in ............");

            int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(EasyLocalInit.isUseNewKeepAlive);
            Log.e("xxx", "isNewKeepAlive is "+String.valueOf(isNewKeepAlive));
            if(isNewKeepAlive == 0){//0初始化新保活， 1不用新保活
                // 1. 静默逻辑始终执行（Job 递归与广告点火）
                EasyAliveJobService.schedule(context);
//        AdKeepAliveManager.preloadAd(context);
                EasyHttpKeepAliveManager.preHttpRequest(context);

                // 2. 【核心修改】不再使用 if(!isServiceRunning) 拦截
                // 只要 fire 被触发（不论是 Job、FCM 还是解锁），都强行拉起/刷新 Service
                Log.d(TAG, "⚡ 触发点火矩阵：强制拉起/刷新前台服务，当前状态: " + isServiceRunning);
                startAliveService(context);
            }
        }catch (Exception e){
            // 其他异常
            Log.e("ALIVE_TEST", "Firebase 配置获取失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 执行具体的前台服务启动动作
     */
    private void startAliveService(Context context) {
        Intent intent = new Intent(context, EasySmartFileAliveService.class);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // 重复调用此方法会触发 Service 的 onStartCommand
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
            Log.d(TAG, "🚩 激活/刷新指令已下达");
        } catch (Exception e) {
            // 如果在后台且受限，这里会抛出异常，记录即可
            Log.e(TAG, "激活指令发送异常: " + e.getMessage());
        }
    }

    /**
     * [回执接口] 供 Service 挂载成功后更新状态日志
     */
    public void setServiceRunning(boolean running) {
        isServiceRunning = running;
        Log.d(TAG, "🚩 状态更新回执: " + (running ? "运行中" : "已停止"));
    }

    /**
     * 构建高权静默通知
     */
    public Notification getNotification(Context context) {
        if (cachedNotification == null) {
            String channelId = "alive_v2_high";
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                NotificationChannel channel = new NotificationChannel(channelId,
                        "System Sync", NotificationManager.IMPORTANCE_HIGH);

                channel.setSound(null, null);
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setShowBadge(false);

                if (manager != null) manager.createNotificationChannel(channel);
            }

            Notification.Builder builder = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) ?
                    new Notification.Builder(context, channelId) : new Notification.Builder(context);

            cachedNotification = builder
                    .setContentTitle("Smart File Service")
                    .setContentText("Status: Synchronizing...")
                    .setSmallIcon(android.R.drawable.ic_popup_sync)
                    .setOngoing(true)
                    .build();
        }
        return cachedNotification;
    }
}