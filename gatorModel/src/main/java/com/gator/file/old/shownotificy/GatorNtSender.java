package com.gator.file.old.shownotificy;

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

import com.gator.file.old.opdj.nt.GatorNtCancelFgService;
import com.gator.file.R;
import com.gator.file.old.FirebaseUtils;
import com.gator.file.old.GatorManager;
import com.gator.file.old.change.GatorChangeUtils;
import com.gator.file.old.use.GatorNotiTimesHelper;
import com.gator.file.old.use.GatorUsageDaysTracker;


public class GatorNtSender {
    private static long dayleTime = 4700L;

    public GatorNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, GatorChangeUtils.NoticeType noticeType, GatorNotiTimesHelper.Event event) {

        switch (event) {
            case APP_INSTALL_UNINSTALL:
                // 应用安装事件
                GatorNotiTimesHelper.Decision installResult = GatorNotiTimesHelper.handleAppInstall();
                showNotify(installResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("应用安装", installResult);
                break;

            case POWER_CHARGE:
                // 4. 测试各种事件
                // 充电事件（电量50%）
                GatorNotiTimesHelper.Decision chargeResult = GatorNotiTimesHelper.handlePowerCharge(50);
                showNotify(chargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("充电事件", chargeResult);
                break;

            case POWER_DISCHARGE:
                // 充电事件（电量50%）
                GatorNotiTimesHelper.Decision dischargeResult = GatorNotiTimesHelper.handlePowerDischarge(100);
                showNotify(dischargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("断电事件", dischargeResult);
                break;

            case ALARM:
                // 定时闹钟（未清理3天）
                int noCleanDays = GatorUsageDaysTracker.getUnusedDays();
                GatorNotiTimesHelper.Decision alarmResult = GatorNotiTimesHelper.handleAlarm(noCleanDays);
                showNotify(alarmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("定时闹钟", alarmResult);
                break;

            case JOB_POLLING:

                GatorNotiTimesHelper.Decision jobResult = GatorNotiTimesHelper.handleJobPolling();
                showNotify(jobResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("job", jobResult);
                break;

            case FCM_PUSH:
                // FCM推送事件
                GatorNotiTimesHelper.Decision fcmResult = GatorNotiTimesHelper.handleFcmPush();
                showNotify(fcmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("FCM推送", fcmResult);
                break;
            case UNLOCK_SCREEN:
                // 解锁屏事件
                GatorNotiTimesHelper.Decision unlockResult = GatorNotiTimesHelper.handleUnlockScreen();
                showNotify(unlockResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("解锁屏", unlockResult);
                break;
            case SCREEN_ON_OFF:
                // 屏幕打开关闭事件（仅唤醒前台）
                GatorNotiTimesHelper.Decision screenResult = GatorNotiTimesHelper.handleForegroundOnly();
                showNotify(screenResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("屏幕事件", screenResult);
                break;

//            case HOME_CLICK:

            case HEARTBEAT:
                // 屏幕打开关闭事件（仅唤醒前台）
                GatorNotiTimesHelper.Decision heartResult = GatorNotiTimesHelper.handleForegroundOnly();
                showNotify(heartResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("HEARTBEAT", heartResult);
                break;

            case ACCOUNT_SYNC:
                // 账户事件（仅唤醒前台）
                GatorNotiTimesHelper.Decision acountResult = GatorNotiTimesHelper.handleForegroundOnly();
                showNotify(acountResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("账户事件", acountResult);
                break;
            case WORK_MANAGER:
                // worker事件（仅唤醒前台）
                GatorNotiTimesHelper.Decision workerResult = GatorNotiTimesHelper.handleForegroundOnly();
                showNotify(workerResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("worker事件", workerResult);
                break;

            case HOME_CLICK:
                // worker事件（仅唤醒前台）
                GatorNotiTimesHelper.Decision homeClickResult = GatorNotiTimesHelper.handleForegroundOnly();
                showNotify(homeClickResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("home点击事件", homeClickResult);
                break;


            default:
                // worker事件（仅唤醒前台）
                GatorNotiTimesHelper.Decision defaultResult = GatorNotiTimesHelper.handleDefault();
                showNotify(defaultResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                Log.i("TAG-->>Noti", "事件名: " + event.name());
                printResult(event.name(), defaultResult);
                break;

        }

        return true;
    }



    private static void showNotify(GatorNotiTimesHelper.Decision decision, int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, GatorChangeUtils.NoticeType noticeType){
        if(decision.allow){
            if(decision.level == GatorNotiTimesHelper.Level.HIGH){
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, true);
            }else if(decision.level == GatorNotiTimesHelper.Level.NORMAL){
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, false);
            }

        }

    }
    private static boolean showSceneNtOrg9hzWithEvent(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, GatorChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        if (!isIgnoreLastPushTime) {
            GatorManager.saveLastPushTime();
        }
        Context context = GatorManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Gator" + GatorManager.code;
        String channelName = "Sound_ChannelName_Gator" + GatorManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Gator" + GatorManager.code;
            channelName = "SilentChannelName_Gator" + GatorManager.code;
        }

        int smallIcon = R.drawable.gator_logo;
        Intent intent2 = new Intent(GatorManager.mContext, GatorNtCancelFgService.class);
        intent2.setPackage(GatorManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(GatorManager.mContext, 8652 + GatorManager.code, intent2, GatorChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentGator");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentGator2");
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

        builder.setContentText(context.getString(R.string.gator_app_name))
                .setAutoCancel(true)
                .setGroupSummary(false)
                .setGroup(String.valueOf(System.currentTimeMillis()))
                .setContentIntent(pendingIntent)
                .setDeleteIntent(cancelPendingIntent)
                .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL);
                /*.setNumber(3)*/

        if(isHighNotify){
            builder.setPriority(NotificationCompat.PRIORITY_HIGH);
        }else{
            builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        }

        builder.setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
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
        GatorManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(GatorManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                GatorChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + GatorChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", GatorManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                GatorNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            GatorManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }

    private static void printResult(String eventName, GatorNotiTimesHelper.Decision result) {
        Log.i("TAG-->>Noti", "事件: " + eventName);
        Log.i("TAG-->>Noti", "允许发送: " + result.allow);
        Log.i("TAG-->>Noti", "通知级别: " + result.level);
        Log.i("TAG-->>Noti", "唤醒屏幕: " + result.shouldWakeScreen);
        Log.i("TAG-->>Noti", "唤醒前台: " + result.shouldWakeForeground);

        if (result.allow) {
            Log.i("TAG-->>Noti", "✅ 可以发送" + result.level + "级别通知");
        } else if (result.shouldWakeForeground) {
            Log.i("TAG-->>Noti", "🔄 仅唤醒前台服务");
        } else {
            Log.i("TAG-->>Noti", "❌ 不允许发送通知");
        }
        Log.i("TAG-->>Noti", "");

        // 3. 打印当前统计信息
        GatorNotiTimesHelper.printStats();
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) GatorManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) GatorManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        GatorManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = GatorNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    GatorManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = GatorNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, GatorNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!GatorManager.INSTANCE.isForeground() && !GatorManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = GatorManager.isNotificationEnabled();
            boolean screenOn = GatorManager.isScreenOn() && GatorManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", GatorManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (GatorManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", GatorManager.mContext);
                return false;
            }
        } else {
            if (GatorManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", GatorManager.mContext);
            return false;
        }
    }
}

