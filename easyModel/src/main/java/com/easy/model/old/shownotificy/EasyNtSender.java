package com.easy.model.old.shownotificy;

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

import com.easy.model.R;
import com.easy.model.old.FirebaseUtils;
import com.easy.model.old.EasyManager;
import com.easy.model.old.change.EasyChangeUtils;
import com.easy.model.old.opdj.nt.EasyNtCancelFgService;


public class EasyNtSender {
    private static long dayleTime = 4700L;

    public EasyNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, EasyChangeUtils.NoticeType noticeType) {
        if (!isIgnoreLastPushTime) {
            EasyManager.saveLastPushTime();
        }
        Context context = EasyManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Easy" + EasyManager.code;
        String channelName = "Sound_ChannelName_Easy" + EasyManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Easy" + EasyManager.code;
            channelName = "SilentChannelName_Easy" + EasyManager.code;
        }

        int smallIcon = R.drawable.easy_logo;
        Intent intent2 = new Intent(EasyManager.mContext, EasyNtCancelFgService.class);
        intent2.setPackage(EasyManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(EasyManager.mContext, 8652 + EasyManager.code, intent2, EasyChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentEasy");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentEasy2");
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

        builder.setContentText(context.getString(R.string.easy_app_name))
                .setAutoCancel(true)
                .setGroupSummary(false)
                .setGroup(String.valueOf(System.currentTimeMillis()))
                .setContentIntent(pendingIntent)
                .setDeleteIntent(cancelPendingIntent)
                .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)
                /*.setNumber(3)*/
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                .setSmallIcon(smallIcon)
                .setStyle(new NotificationCompat.DecoratedCustomViewStyle()); // 添加这一行
//                .setColor(Color.TRANSPARENT); // 红色


        if (isSilent) {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        EasyManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(EasyManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                EasyChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + EasyChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", EasyManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                EasyNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            EasyManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) EasyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) EasyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        EasyManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = EasyNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    EasyManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = EasyNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, EasyNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!EasyManager.INSTANCE.isForeground() && !EasyManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = EasyManager.isNotificationEnabled();
            boolean screenOn = EasyManager.isScreenOn() && EasyManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", EasyManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (EasyManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", EasyManager.mContext);
                return false;
            }
        } else {
            if (EasyManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", EasyManager.mContext);
            return false;
        }
    }
}

