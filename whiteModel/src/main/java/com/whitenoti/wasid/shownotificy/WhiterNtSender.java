package com.whitenoti.wasid.shownotificy;

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

import com.whitenoti.wasid.R;
import com.whitenoti.wasid.WhiterFirebaseEventUtils;
import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.change.WhiterChangeUtils;
import com.whitenoti.wasid.opdj.nt.WhiterNtCancelFgService;

public class WhiterNtSender {
    private static long dayleTime = 4700L;

    public WhiterNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, WhiterChangeUtils.NoticeType noticeType) {
        if (!isIgnoreLastPushTime) {
            WhiterManager.saveLastPushTime();
        }
        Context context = WhiterManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Whiter" + WhiterManager.code;
        String channelName = "Sound_ChannelName_Whiter" + WhiterManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Whiter" + WhiterManager.code;
            channelName = "SilentChannelName_Whiter" + WhiterManager.code;
        }

        int smallIcon = R.mipmap.whiter_logo;
        Intent intent2 = new Intent(WhiterManager.mContext, WhiterNtCancelFgService.class);
        intent2.setPackage(WhiterManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(WhiterManager.mContext, 8652 + WhiterManager.code, intent2, WhiterChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentWhiter");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentWhiter2");
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

        builder.setContentText("Whiter").setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL).setNumber(3).setPriority(1).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon);
        if (isSilent) {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        WhiterManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(WhiterManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                WhiterChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + WhiterChangeUtils.INSTANCE.getLastNoticeType());
                WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", WhiterManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                WhiterNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            WhiterManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) WhiterManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) WhiterManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        WhiterManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = WhiterNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    WhiterManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = WhiterNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, WhiterNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!WhiterManager.INSTANCE.isForeground() && !WhiterManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = WhiterManager.isNotificationEnabled();
            boolean screenOn = WhiterManager.isScreenOn() && WhiterManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", WhiterManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (WhiterManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", WhiterManager.mContext);
                return false;
            }
        } else {
            if (WhiterManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", WhiterManager.mContext);
            return false;
        }
    }
}

