package com.tidy.file.old.shownotificy;

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

import com.tidy.file.R;
import com.tidy.file.old.FirebaseUtils;
import com.tidy.file.old.TidyManager;
import com.tidy.file.old.change.TidyChangeUtils;
import com.tidy.file.old.opdj.nt.TidyNtCancelFgService;
import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.tidy.file.old.use.TidyUsageDaysTracker;


public class TidyNtSender {
    private static long dayleTime = 4700L;

    public TidyNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType, TidyNotiTimesHelper.Event event) {

        switch (event) {
            case APP_INSTALL_UNINSTALL:
                // 应用安装事件
                TidyNotiTimesHelper.Decision installResult = TidyNotiTimesHelper.handleAppInstall();
                showNotify(installResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("应用安装", installResult);
                break;

            case POWER_CHARGE:
                // 4. 测试各种事件
                // 充电事件（电量50%）
                TidyNotiTimesHelper.Decision chargeResult = TidyNotiTimesHelper.handlePowerCharge(50);
                showNotify(chargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("充电事件", chargeResult);
                break;

            case POWER_DISCHARGE:
                // 充电事件（电量50%）
                TidyNotiTimesHelper.Decision dischargeResult = TidyNotiTimesHelper.handlePowerDischarge(100);
                showNotify(dischargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("断电事件", dischargeResult);
                break;

            case ALARM:
                // 定时闹钟（未清理3天）
                int noCleanDays = TidyUsageDaysTracker.getUnusedDays();
                TidyNotiTimesHelper.Decision alarmResult = TidyNotiTimesHelper.handleAlarm(noCleanDays);
                showNotify(alarmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("定时闹钟", alarmResult);
                break;

            case JOB_POLLING:

                TidyNotiTimesHelper.Decision jobResult = TidyNotiTimesHelper.handleJobPolling();
                showNotify(jobResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("job", jobResult);
                break;

            case FCM_PUSH:
                // FCM推送事件
                TidyNotiTimesHelper.Decision fcmResult = TidyNotiTimesHelper.handleFcmPush();
                showNotify(fcmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("FCM推送", fcmResult);
                break;
            case UNLOCK_SCREEN:
                // 解锁屏事件
                TidyNotiTimesHelper.Decision unlockResult = TidyNotiTimesHelper.handleUnlockScreen();
                showNotify(unlockResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("解锁屏", unlockResult);
                break;
            case SCREEN_ON_OFF:
                // 屏幕打开关闭事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision screenResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(screenResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("屏幕事件", screenResult);
                break;

//            case HOME_CLICK:

            case HEARTBEAT:
                // 屏幕打开关闭事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision heartResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(heartResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("HEARTBEAT", heartResult);
                break;

            case ACCOUNT_SYNC:
                // 账户事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision acountResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(acountResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("账户事件", acountResult);
                break;
            case WORK_MANAGER:
                // worker事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision workerResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(workerResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("worker事件", workerResult);
                break;

            case HOME_CLICK:
                // worker事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision homeClickResult = TidyNotiTimesHelper.handleForegroundOnly();
                showNotify(homeClickResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("home点击事件", homeClickResult);
                break;


            default:
                // worker事件（仅唤醒前台）
                TidyNotiTimesHelper.Decision defaultResult = TidyNotiTimesHelper.handleDefault();
                showNotify(defaultResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                Log.i("TAG-->>Noti", "事件名: " + event.name());
                printResult(event.name(), defaultResult);
                break;

        }

        return true;
    }



    private static void showNotify(TidyNotiTimesHelper.Decision decision, int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType){
        if(decision.allow){
            if(decision.level == TidyNotiTimesHelper.Level.HIGH){
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, true);
            }else if(decision.level == TidyNotiTimesHelper.Level.NORMAL){
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, false);
            }

        }

    }
    private static boolean showSceneNtOrg9hzWithEvent(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, TidyChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        if (!isIgnoreLastPushTime) {
            TidyManager.saveLastPushTime();
        }
        Context context = TidyManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Easy" + TidyManager.code;
        String channelName = "Sound_ChannelName_Easy" + TidyManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Easy" + TidyManager.code;
            channelName = "SilentChannelName_Easy" + TidyManager.code;
        }

        int smallIcon = R.drawable.tidy_logo;
        Intent intent2 = new Intent(TidyManager.mContext, TidyNtCancelFgService.class);
        intent2.setPackage(TidyManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(TidyManager.mContext, 8652 + TidyManager.code, intent2, TidyChangeUtils.INSTANCE.getNotifyFlag());
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
        TidyManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(TidyManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                TidyChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + TidyChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", TidyManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                TidyNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            TidyManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }

    private static void printResult(String eventName, TidyNotiTimesHelper.Decision result) {
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
        TidyNotiTimesHelper.printStats();
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) TidyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) TidyManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        TidyManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = TidyNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    TidyManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = TidyNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, TidyNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!TidyManager.INSTANCE.isForeground() && !TidyManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = TidyManager.isNotificationEnabled();
            boolean screenOn = TidyManager.isScreenOn() && TidyManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", TidyManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (TidyManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", TidyManager.mContext);
                return false;
            }
        } else {
            if (TidyManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", TidyManager.mContext);
            return false;
        }
    }
}

