package com.smartfile.model.shownotificy;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.RemoteViews;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.smartfile.model.R;
import com.smartfile.model.FirebaseUtils;
import com.smartfile.model.SmartFileManager;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.opdj.nt.SmartFileNtBuilder;
import com.smartfile.model.opdj.nt.SmartFileNtCancelFgService;

public class SmartFileNtSender {
    private static long dayleTime = 4700L;

    public SmartFileNtSender() {
    }

    public static boolean showSceneNtNew(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartFileChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        if(isHighNotify){
            return showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, false, isIgnoreLastPushTime, noticeType, isHighNotify);
        }else{
            return showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, true, isIgnoreLastPushTime, noticeType, isHighNotify);
        }
    }
    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartFileChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        if (!isIgnoreLastPushTime) {
            SmartFileManager.saveLastPushTime();
        }
        Context context = SmartFileManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = context.getString(R.string.channelid_sound)/* + SmartFileManager.code*/;
        String channelName = context.getString(R.string.chan_name_sound) + SmartFileManager.code;
        if (isSilent) {
            channelId = context.getString(R.string.channelid_silent) /*+ SmartFileManager.code*/;
            channelName = context.getString(R.string.chan_name_silent) + SmartFileManager.code;
        }

        int smallIcon = R.mipmap.smartfile_logo;
        Intent intent2 = new Intent(SmartFileManager.mContext, SmartFileNtCancelFgService.class);
        intent2.setPackage(SmartFileManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(SmartFileManager.mContext, 8652 + SmartFileManager.code, intent2, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
//        if (VERSION.SDK_INT >= 26) {
//            NotificationChannel channel;
//            if(isHighNotify){
//                channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
//            }else{
//                channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_LOW);
//            }
//            channel.setLockscreenVisibility(1);
//            if (isSilent) {
//                channel.setDescription("SilentSmart");
//                channel.enableLights(false);
//                channel.enableVibration(false);
//                channel.setSound((Uri) null, (AudioAttributes) null);
//                channel.setLightColor(0);
//                channel.setVibrationPattern(new long[0]);
//            } else {
//                channel.setDescription("SilentSmart2");
//                channel.enableLights(false);
//                channel.enableVibration(false);
//                channel.setLightColor(0);
//                channel.setVibrationPattern(new long[0]);
//            }

//            mManager.createNotificationChannel(channel);
//        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId);
        if (VERSION.SDK_INT >= 31) {
            builder.setCustomBigContentView(remoteViewsBig);
            builder.setCustomContentView(remoteViewsMini);
            builder.setContent(remoteViewsMini);
        } else {
            builder.setCustomContentView(remoteViewsMid);
            builder.setContent(remoteViewsMid);
            builder.setCustomBigContentView(remoteViewsBig);
        }

        builder.setContentText("SmartFile").setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL).setNumber(3).setPriority(1).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon);
        //todo 可能需要回退
//        if (isSilent) {
//            builder.setVibrate(new long[0]);
//            builder.setLights(0, 0, 0);
//            builder.setSound((Uri) null);
//        } else {
//            builder.setVibrate(new long[0]);
//            builder.setLights(0, 0, 0);
//        }
        builder.setCategory("call");
        SmartFileManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(SmartFileManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                SmartFileChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + SmartFileChangeUtils.INSTANCE.getLastNoticeType());

                String notice_name = noticeType.name();

//                int cleanNotiId = SmartFileNtSendTryer.getHighPushNotifyId(1);
//                int processNotiId = SmartFileNtSendTryer.getHighPushNotifyId(2);
//                int batteryNotiId = SmartFileNtSendTryer.getHighPushNotifyId(3);
//                int deviceNotiId = SmartFileNtSendTryer.getHighPushNotifyId(4);
//                int rewardNotiId = SmartFileNtSendTryer.getHighPushNotifyId(5);
                if(notice_name.equals("CLEAN")){
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_file_show", "", SmartFileManager.mContext);
                }

                if(notice_name.equals("PROCESS")){
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_app_show", "", SmartFileManager.mContext);

                }

                if(notice_name.equals("BATTERY")){
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_photo_show", "", SmartFileManager.mContext);
                }

                if(notice_name.equals("REWARD")){
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_device_show", "", SmartFileManager.mContext);
                }


                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SmartFileManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                SmartFileNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            SmartFileManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) SmartFileManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            if (notificationId < 0) {
                mManager.cancelAll();
                return;
            }
            mManager.cancel(notificationId);
        } catch (Exception var12) {
            Exception e = var12;
            e.printStackTrace();
        }

    }

    public static void cancelAll() {
        try {
            NotificationManager mManager = (NotificationManager) SmartFileManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        SmartFileManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = SmartFileNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    SmartFileManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = SmartFileNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, SmartFileNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!SmartFileManager.INSTANCE.isForeground() && !SmartFileManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = SmartFileManager.isNotificationEnabled();
            boolean screenOn = SmartFileManager.isScreenOn() && SmartFileManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SmartFileManager.mContext);

                    int cleanNotiId = SmartFileNtSendTryer.getHighPushNotifyId(1);
                    int processNotiId = SmartFileNtSendTryer.getHighPushNotifyId(2);
                    int batteryNotiId = SmartFileNtSendTryer.getHighPushNotifyId(3);
                    int deviceNotiId = SmartFileNtSendTryer.getHighPushNotifyId(4);
                    int rewardNotiId = SmartFileNtSendTryer.getHighPushNotifyId(5);
                    if(id == cleanNotiId){
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_file_show", "", SmartFileManager.mContext);
                    }

                    if(id == processNotiId){
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_app_show", "", SmartFileManager.mContext);

                    }

                    if(id == batteryNotiId){
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_photo_show", "", SmartFileManager.mContext);
                    }

                    if(id == deviceNotiId){
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_clean_show", "", SmartFileManager.mContext);
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_device_show", "", SmartFileManager.mContext);
                    }

                    if(id == rewardNotiId){
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("notify_reward_show", "", SmartFileManager.mContext);
                    }

                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (SmartFileManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SmartFileManager.mContext);
                return false;
            }
        } else {
            if (SmartFileManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SmartFileManager.mContext);
            return false;
        }
    }
}

