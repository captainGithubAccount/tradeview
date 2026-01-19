package com.tidy.file.old.opdj.nt;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.tidy.file.old.EasyManager;
import com.tidy.file.R;
import com.tidy.file.old.shownotificy.EasyNtTransfer;
import com.tidy.file.old.use.EasyNotiTimesHelper;

import java.util.Iterator;
import java.util.Objects;

public class EasyNtFgService extends Service {
    static boolean isLiving;
    static boolean isShowing;
    static String CHANNEL_ID1 = "8431246";
    static String CHANNEL_NAME1 = "ongoing1651681";
    static int Notification_ID1 = 9745125;

    static String from = "action_from";//clock  job  launchapp  everytime_show_notify(每次通知展示的时候)



    public EasyNtFgService() {
    }

    public static boolean getIsShowing() {
        return isShowing;
    }

    public static void startNotifyService(boolean isFromActivity, String from) {
        try {
            Context context = EasyManager.mContext;
            Intent intent = new Intent(context, EasyNtFgService.class);
            intent.putExtra(EasyNtFgService.from, from);
            intent.setPackage(context.getPackageName());
            if (VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception var19) {
            Exception e = var19;
            e.printStackTrace();
        }

    }


    public void onCreate() {
        isLiving = true;
        isShowing = false;
        super.onCreate();
        if (EasyManager.isDebug) {
            Log.e("xxx", "ForegroundNotifyService onCreate");
        }
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
//                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }

            if (EasyManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground Ok");
            }

            isShowing = true;
            if (!com.tidy.file.old.opdj.nt.EasyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var83) {
            Exception e = var83;
            isShowing = false;
            if (EasyManager.isDebug) {
                Log.e("xxx", "ForegroundNotifyService startForeground error,e=" + e.getMessage());
            }
        }
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        String from_action = intent.getStringExtra(from);
        isLiving = true;
        try {
            if (VERSION.SDK_INT >= 29) {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE);
//                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1), ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                this.startForeground(Notification_ID1, createOngoingNotification(CHANNEL_NAME1));
            }

            isShowing = true;
            if (!com.tidy.file.old.opdj.nt.EasyNtUtils.isNotificationEnabled()) {
                isShowing = false;
            }
        } catch (Exception var71) {
            isShowing = false;
        }
        if(Objects.equals(from_action, "clock")){
            EasyNtTransfer.onTimeTickUpEvent(EasyNotiTimesHelper.Event.ALARM);
        }else if(Objects.equals(from_action, "job")){
            EasyNtTransfer.onTimeTickUpEvent(EasyNotiTimesHelper.Event.JOB_POLLING );
        }else if(Objects.equals(from_action, "everytime_show_notify")){
            EasyNtTransfer.onTimeTickUpEvent(EasyNotiTimesHelper.Event.EVERY_TIME_SHOW_NOTIFY );

        }else if(Objects.equals(from_action, "launchapp")){
            EasyNtTransfer.onTimeTickUpEvent(EasyNotiTimesHelper.Event.LAUNCH_APP );

        }
        return Service.START_STICKY;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        isLiving = false;
        isShowing = false;
        super.onDestroy();
    }

    private boolean isServiceRunningInForeground(Context context, Class serviceClass) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        Iterator var55 = manager.getRunningServices(Integer.MAX_VALUE).iterator();

        ActivityManager.RunningServiceInfo runningService;
        do {
            if (!var55.hasNext()) {
                return false;
            }

            runningService = (ActivityManager.RunningServiceInfo) var55.next();
        } while (!serviceClass.getName().equals(runningService.service.getClassName()) || !runningService.foreground);

        return true;
    }

    public static Notification createOngoingNotification(String channelName) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "ForegroundNotifyService createOngoingNotification ");
        }
        NotificationManager manager = (NotificationManager) EasyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID1, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.enableLights(false);
            channel.enableVibration(false);
            channel.setSound((Uri) null, (AudioAttributes) null);
            channel.setLockscreenVisibility(-1);
            channel.setLightColor(0);
            channel.setVibrationPattern(new long[]{0L});
            manager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(EasyManager.mContext, CHANNEL_ID1);
        RemoteViews remoteView = com.tidy.file.old.opdj.nt.EasyNtFgHelper.ongoingRemoteView();
        RemoteViews remoteViewBig = com.tidy.file.old.opdj.nt.EasyNtFgHelper.ongoingRemoteViewBig();
        if (VERSION.SDK_INT >= 31) {
            builder.setCustomContentView(remoteView);
            builder.setContent(remoteView);
            builder.setCustomBigContentView(remoteViewBig);
        } else {
            builder.setContent(remoteViewBig);
            builder.setCustomContentView(remoteViewBig);
            builder.setCustomBigContentView(remoteViewBig);
        }
        Notification notification = builder
                .setWhen(System.currentTimeMillis())
                .setOnlyAlertOnce(true)
                .setStyle(new NotificationCompat.DecoratedCustomViewStyle()) // 添加这一行
                .setSmallIcon(R.drawable.easy_logo)
                .setShowWhen(true)
                .setOngoing(true)
                .setSound((Uri) null)
                /*.setNumber(5)*/
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setVibrate(new long[]{0L})
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                .setSound((Uri) null, AudioManager.STREAM_NOTIFICATION)
                .setLights(0, 0, 0)
                .build();
        notification.flags = 32;
        return notification;
    }
}
