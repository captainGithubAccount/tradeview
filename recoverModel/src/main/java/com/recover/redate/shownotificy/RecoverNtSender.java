package com.recover.redate.shownotificy;

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

import com.recover.model.R;
import com.recover.redate.FirebaseUtils;
import com.recover.redate.RecoverOrgManager;
import com.recover.redate.change.RecoverChangeUtils;
import com.recover.redate.opdj.nt.RecoverNtCancelFgService;

public class RecoverNtSender {
    private static long dayleTime = 4700L;

    public RecoverNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, RecoverChangeUtils.NoticeType noticeType) {
        if (!isIgnoreLastPushTime) {
            RecoverOrgManager.saveLastPushTime();
        }
        Context context = RecoverOrgManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Recover" + RecoverOrgManager.code;
        String channelName = "Sound_ChannelName_Recover" + RecoverOrgManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Recover" + RecoverOrgManager.code;
            channelName = "SilentChannelName_Recover" + RecoverOrgManager.code;
        }

        int smallIcon = R.mipmap.recover_logo;
        Intent intent2 = new Intent(RecoverOrgManager.mContext, RecoverNtCancelFgService.class);
        intent2.setPackage(RecoverOrgManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(RecoverOrgManager.mContext, 8652 + RecoverOrgManager.code, intent2, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentRecover");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentRecover2");
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

        builder.setContentText("Recover").setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL).setNumber(3).setPriority(1).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon);
        if (isSilent) {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        RecoverOrgManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(RecoverOrgManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                RecoverChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + RecoverChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", RecoverOrgManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                RecoverNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            RecoverOrgManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) RecoverOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) RecoverOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        RecoverOrgManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = RecoverNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    RecoverOrgManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = RecoverNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, RecoverNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!RecoverOrgManager.INSTANCE.isForeground() && !RecoverOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = RecoverOrgManager.isNotificationEnabled();
            boolean screenOn = RecoverOrgManager.isScreenOn() && RecoverOrgManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", RecoverOrgManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (RecoverOrgManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", RecoverOrgManager.mContext);
                return false;
            }
        } else {
            if (RecoverOrgManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", RecoverOrgManager.mContext);
            return false;
        }
    }
}

