package com.tfseptember.clemodel.shownotificy;

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

import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.FirebaseCatchjzgUtils;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.change.SimplyChangeUtils;
import com.tfseptember.clemodel.opdj.nt.SimplyNtCancelFgService;

public class SimplyNtSender {
    private static long dayleTime = 4700L;

    public SimplyNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SimplyChangeUtils.NoticeType noticeType) {
        if (!isIgnoreLastPushTime) {
            SimplyHouseworkrOrgManager.saveLastPushTime();
        }
        Context context = SimplyHouseworkrOrgManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Simply" + SimplyHouseworkrOrgManager.code;
        String channelName = "Sound_ChannelName_Simply" + SimplyHouseworkrOrgManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Simply" + SimplyHouseworkrOrgManager.code;
            channelName = "SilentChannelName_Simply" + SimplyHouseworkrOrgManager.code;
        }

        int smallIcon = R.mipmap.simply_logo;
        Intent intent2 = new Intent(SimplyHouseworkrOrgManager.mContext, SimplyNtCancelFgService.class);
        intent2.setPackage(SimplyHouseworkrOrgManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(SimplyHouseworkrOrgManager.mContext, 8652 + SimplyHouseworkrOrgManager.code, intent2, SimplyChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentSimply");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentSimply2");
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

        builder.setContentText("Simply").setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL).setNumber(3).setPriority(1).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon);
        if (isSilent) {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        SimplyHouseworkrOrgManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(SimplyHouseworkrOrgManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                SimplyChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + SimplyChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SimplyHouseworkrOrgManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                SimplyNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            SimplyHouseworkrOrgManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) SimplyHouseworkrOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) SimplyHouseworkrOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        SimplyHouseworkrOrgManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = SimplyNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    SimplyHouseworkrOrgManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = SimplyNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, SimplyNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!SimplyHouseworkrOrgManager.INSTANCE.isForeground() && !SimplyHouseworkrOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = SimplyHouseworkrOrgManager.isNotificationEnabled();
            boolean screenOn = SimplyHouseworkrOrgManager.isScreenOn() && SimplyHouseworkrOrgManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SimplyHouseworkrOrgManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (SimplyHouseworkrOrgManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SimplyHouseworkrOrgManager.mContext);
                return false;
            }
        } else {
            if (SimplyHouseworkrOrgManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SimplyHouseworkrOrgManager.mContext);
            return false;
        }
    }
}

