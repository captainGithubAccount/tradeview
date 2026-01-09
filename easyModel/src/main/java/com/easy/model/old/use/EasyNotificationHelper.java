package com.easy.model.old.use;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.easy.model.old.EasyManager;
import com.easy.model.R;
import com.easy.model.old.opdj.nt.EasyNtFgHelper;
import com.easy.model.old.opdj.nt.EasyNtUtils;
import com.easy.model.old.shownotificy.EasyNtTransfer;

@Keep
public class EasyNotificationHelper {
    private static final String TAG = "EasyNotificationHelper";
    
    // 通知相关常量
    public static final String CHANNEL_ID1 = "8431246";
    public static final String CHANNEL_NAME1 = "ongoing1651681";
    public static final int NOTIFICATION_ID1 = 9745125;
    
    // 状态标记
    private static boolean isServiceLiving = false;
    private static boolean isNotificationShowing = false;
    
    private final Context context;
    private static EasyNotificationHelper instance;
    
    private EasyNotificationHelper(Context context) {
        this.context = context.getApplicationContext();
    }
    
    public static synchronized EasyNotificationHelper getInstance(Context context) {
        if (instance == null) {
            instance = new EasyNotificationHelper(context);
        }
        return instance;
    }
    
    // Getters and setters for state
    public static boolean isNotificationShowing() {
        return isNotificationShowing;
    }
    
    public static boolean isServiceLiving() {
        return isServiceLiving;
    }
    
    public static void setServiceLiving(boolean living) {
        isServiceLiving = living;
    }
    
    public static void setNotificationShowing(boolean showing) {
        isNotificationShowing = showing;
    }
    
    /**
     * 检查通知是否启用
     */
    public boolean isNotificationEnabled() {
        return EasyNtUtils.isNotificationEnabled();
    }
    
    /**
     * 创建通知渠道
     */
    public void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                if (manager == null) return;
                
                NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, CHANNEL_NAME1, 
                        NotificationManager.IMPORTANCE_DEFAULT);
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound(null, (AudioAttributes) null);
                channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[]{0L});
                
                manager.createNotificationChannel(channel);
                
                if (EasyManager.isDebug) {
                    Log.d(TAG, "Notification channel created successfully");
                }
            } catch (Exception e) {
                if (EasyManager.isDebug) {
                    Log.e(TAG, "Failed to create notification channel: " + e.getMessage());
                }
            }
        }
    }
    
    /**
     * 创建前台服务通知
     */
    @Nullable
    public Notification createOngoingNotification() {
        try {
            // 确保通知渠道已创建
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                createNotificationChannel();
            }
            
            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            if (manager == null) {
                if (EasyManager.isDebug) {
                    Log.e(TAG, "NotificationManager is null");
                }
                return null;
            }
            
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID1);
            
            // 创建远程视图
            RemoteViews remoteView = EasyNtFgHelper.ongoingRemoteView();
            RemoteViews remoteViewBig = EasyNtFgHelper.ongoingRemoteViewBig();
            
            // 设置不同API级别的视图
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                builder.setCustomContentView(remoteView);
                builder.setContent(remoteView);
                builder.setCustomBigContentView(remoteViewBig);
            } else {
                builder.setContent(remoteViewBig);
                builder.setCustomContentView(remoteViewBig);
                builder.setCustomBigContentView(remoteViewBig);
            }
            
            // 构建通知
            Notification notification = builder
                    .setWhen(System.currentTimeMillis())
                    .setOnlyAlertOnce(true)
                    .setSmallIcon(R.mipmap.easy_logo)
                    .setShowWhen(true)
                    .setOngoing(true)
                    .setSound(null)
                    .setNumber(5)
                    .setVibrate(new long[]{0L})
                    .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                    .setSound(null, AudioManager.STREAM_NOTIFICATION)
                    .setLights(0, 0, 0)
                    .build();
            
            notification.flags |= Notification.FLAG_ONGOING_EVENT;
            
            return notification;
            
        } catch (Exception e) {
            if (EasyManager.isDebug) {
                Log.e(TAG, "Failed to create ongoing notification: " + e.getMessage());
            }
            return null;
        }
    }
    
    /**
     * 检查服务是否在前台运行
     */
    public boolean isServiceRunningInForeground(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (manager == null) return false;
        
        try {
            for (ActivityManager.RunningServiceInfo runningService : 
                    manager.getRunningServices(Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(runningService.service.getClassName()) 
                        && runningService.foreground) {
                    return true;
                }
            }
        } catch (Exception e) {
            if (EasyManager.isDebug) {
                Log.e(TAG, "Error checking if service is running in foreground: " + e.getMessage());
            }
        }
        
        return false;
    }
    
    /**
     * 发送时间事件
     */
    public void sendTimeTickEvent() {
        EasyNtTransfer.onTimeTickUpEvent();
    }
}
