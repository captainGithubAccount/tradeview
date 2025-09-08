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

import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.FirebaseEventUtils;
import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.change.BlueTenChangeUtils;
import com.tfseptember.clemodel.orgyy.nt.BlueTenNtCancelFgService;

public class BlueTenNtSender {
    private static long dayleTime = 4700L;

    public BlueTenNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime) {
        if (!isIgnoreLastPushTime) {
            BlueTenOrgManager.saveLastPushTime();
        }
        Context context = BlueTenOrgManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_BlueTen" + BlueTenOrgManager.code;
        String channelName = "Sound_ChannelName_BlueTen" + BlueTenOrgManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_BlueTen" + BlueTenOrgManager.code;
            channelName = "SilentChannelName_BlueTen" + BlueTenOrgManager.code;
        }

        int smallIcon = R.mipmap.blueten_logo;
        Intent intent2 = new Intent(BlueTenOrgManager.mContext, BlueTenNtCancelFgService.class);
        intent2.setPackage(BlueTenOrgManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(BlueTenOrgManager.mContext, 8652 + BlueTenOrgManager.code, intent2, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentBlueTen");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentBlueTen2");
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

        builder.setContentText("BlueTen").setAutoCancel(true).setGroupSummary(false).setGroup(String.valueOf(System.currentTimeMillis())).setContentIntent(pendingIntent).setDeleteIntent(cancelPendingIntent).setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL).setNumber(3).setPriority(1).setVisibility(NotificationCompat.VISIBILITY_PUBLIC).setSmallIcon(smallIcon);
        if (isSilent) {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
            builder.setSound((Uri) null);
        } else {
            builder.setVibrate(new long[0]);
            builder.setLights(0, 0, 0);
        }
        builder.setCategory("call");
        BlueTenOrgManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(BlueTenOrgManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                Log.e("xxx", "----------doSendNotify---------- ");
                BlueTenNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            BlueTenOrgManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) BlueTenOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) BlueTenOrgManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        BlueTenOrgManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = BlueTenNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    BlueTenOrgManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = BlueTenNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, BlueTenNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!BlueTenOrgManager.INSTANCE.isForeground() && !BlueTenOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = BlueTenOrgManager.isNotificationEnabled();
            boolean screenOn = BlueTenOrgManager.isScreenOn() && BlueTenOrgManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", BlueTenOrgManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (BlueTenOrgManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", BlueTenOrgManager.mContext);
                return false;
            }
        } else {
            if (BlueTenOrgManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", BlueTenOrgManager.mContext);
            return false;
        }
    }
}

