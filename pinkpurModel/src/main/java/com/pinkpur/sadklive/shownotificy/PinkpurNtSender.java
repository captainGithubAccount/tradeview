package com.pinkpur.sadklive.shownotificy;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.RemoteViews;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.pinkpur.sadklive.R;
import com.pinkpur.sadklive.FirebaseUtils;
import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.change.PinkpurChangeUtils;
import com.pinkpur.sadklive.opdj.nt.PinkpurNtCancelFgService;

public class PinkpurNtSender {
    private static long dayleTime = 4700L;

    public PinkpurNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, PinkpurChangeUtils.NoticeType noticeType) {
        if (!isIgnoreLastPushTime) {
            PinkpurManager.saveLastPushTime();
        }
        Context context = PinkpurManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Pinkpur" + PinkpurManager.code;
        String channelName = "Sound_ChannelName_Pinkpur" + PinkpurManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Pinkpur" + PinkpurManager.code;
            channelName = "SilentChannelName_Pinkpur" + PinkpurManager.code;
        }

        int smallIcon = R.mipmap.pinkpur_logo;
        Intent intent2 = new Intent(PinkpurManager.mContext, PinkpurNtCancelFgService.class);
        intent2.setPackage(PinkpurManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(PinkpurManager.mContext, 8652 + PinkpurManager.code, intent2, PinkpurChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentPinkpur");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentPinkpur2");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            }

            mManager.createNotificationChannel(channel);
        }
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

        builder.setContentText("Pinkpur").setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL).setNumber(3).setPriority(1).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon);
        if (isSilent) {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        PinkpurManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(PinkpurManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                PinkpurChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + PinkpurChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", PinkpurManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                PinkpurNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            PinkpurManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) PinkpurManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) PinkpurManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        PinkpurManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = PinkpurNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    PinkpurManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = PinkpurNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, PinkpurNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!PinkpurManager.INSTANCE.isForeground() && !PinkpurManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = PinkpurManager.isNotificationEnabled();
            boolean screenOn = PinkpurManager.isScreenOn() && PinkpurManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", PinkpurManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (PinkpurManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", PinkpurManager.mContext);
                return false;
            }
        } else {
            if (PinkpurManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", PinkpurManager.mContext);
            return false;
        }
    }
}

