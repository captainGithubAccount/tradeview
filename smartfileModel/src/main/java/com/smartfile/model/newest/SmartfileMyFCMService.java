package com.smartfile.model.newest;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.use.SmartfileFcmHelper;

/**
 * 远程点火服务：利用 FCM 高优先级通道实现穿透级唤醒
 */
public class SmartfileMyFCMService extends FirebaseMessagingService {
    private static final String TAG = "FCM_ALIVE";
    private static final String CHANNEL_ID = "alive_fire_channel";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // --- 新增：保底交互通知，防止 Android 15 后台启动拦截 ---
        try {
//            sendInteractiveNotification();
        } catch (Exception e) {
            Log.e(TAG, "保底通知发送失败: " + e.getMessage());
        }



        // 2. 尝试执行“起死回生”点火动作
        Intent intent = new Intent(this, SmartfileSmartFileAliveService.class);
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // 适配 Android 8.0+ 的前台启动规范
                startForegroundService(intent);
            } else {
                startService(intent);
            }
            Log.d(TAG, "远程点火成功：SmartFileAliveService 正在拉起");
        } catch (Exception e) {
            // 3. 针对 Android 14+ 后台启动异常的防御性处理
            Log.e(TAG, "远程点火受限: " + e.getMessage());
        }

        SmartfileManager.INSTANCE.initCore((Application) getApplicationContext(), getPackageName(), true);

        SmartfileFcmHelper.onMessageReceived(remoteMessage);

        // 1. 收到高优先级指令 (你原有的逻辑保持不变)
        Log.d(TAG, "收到远程点火指令。消息ID: " + remoteMessage.getMessageId());
    }

    /**
     * 新增私有方法：发送交互式通知
     * 作用：当静默拉活失败时，用户点击通知可获得系统“后台启动豁免权”
     */
    private void sendInteractiveNotification() {
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "点火服务", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }

        // 点击通知后启动 MainActivity，从而激活整个保活矩阵
        Intent intent = new Intent(this, SmartfileMainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // 使用 PendingIntent 获得点击后的启动权限
        PendingIntent pendingIntent = PendingIntent.getActivity(
                this, 0, intent,
                PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.stat_notify_sync)
                .setContentTitle("远程任务提醒")
                .setContentText("检测到新的下载任务，点击激活引擎")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        manager.notify(1, builder.build());
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        SmartfileFcmHelper.onNewToken(token);
        // 核心步骤：打印令牌以便在测试环境下手动点火
        Log.d("FCM_TOKEN", "New Token: " + token);
    }
}
