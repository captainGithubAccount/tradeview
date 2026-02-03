package com.smartfile.model.old.shownotificy;

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

import com.smartfile.model.old.opdj.nt.SmartfileNtCancelFgService;
import com.smartfile.model.R;
import com.smartfile.model.old.FirebaseUtils;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.change.SmartfileChangeUtils;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;
import com.smartfile.model.old.use.SmartfileUsageDaysTracker;


public class SmartfileNtSender {
    private static long dayleTime = 4700L;

    public SmartfileNtSender() {
    }

    public static boolean showSceneNtOrg9hz(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartfileChangeUtils.NoticeType noticeType, SmartfileNotiTimesHelper.Event event) {

        switch (event) {
            case APP_INSTALL_UNINSTALL:
                // 应用安装事件
                SmartfileNotiTimesHelper.Decision installResult = SmartfileNotiTimesHelper.handleAppInstall();
                showNotify(installResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("应用安装", installResult);
                break;

            case POWER_CHARGE:
                // 4. 测试各种事件
                // 充电事件（电量50%）
                SmartfileNotiTimesHelper.Decision chargeResult = SmartfileNotiTimesHelper.handlePowerCharge(50);
                showNotify(chargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("充电事件", chargeResult);
                break;

            case POWER_DISCHARGE:
                // 充电事件（电量50%）
                SmartfileNotiTimesHelper.Decision dischargeResult = SmartfileNotiTimesHelper.handlePowerDischarge(100);
                showNotify(dischargeResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("断电事件", dischargeResult);
                break;

            case ALARM:
                // 定时闹钟（未清理3天）
                int noCleanDays = SmartfileUsageDaysTracker.getUnusedDays();
                SmartfileNotiTimesHelper.Decision alarmResult = SmartfileNotiTimesHelper.handleAlarm(noCleanDays);
                showNotify(alarmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("定时闹钟", alarmResult);
                break;

            case JOB_POLLING:

                SmartfileNotiTimesHelper.Decision jobResult = SmartfileNotiTimesHelper.handleJobPolling();
                showNotify(jobResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("job", jobResult);
                break;

            case FCM_PUSH:
                // FCM推送事件
                SmartfileNotiTimesHelper.Decision fcmResult = SmartfileNotiTimesHelper.handleFcmPush();
                showNotify(fcmResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("FCM推送", fcmResult);
                break;
            case UNLOCK_SCREEN:
                // 解锁屏事件
                SmartfileNotiTimesHelper.Decision unlockResult = SmartfileNotiTimesHelper.handleUnlockScreen();
                showNotify(unlockResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("解锁屏", unlockResult);
                break;
            case SCREEN_ON_OFF:
                // 屏幕打开关闭事件（仅唤醒前台）
                SmartfileNotiTimesHelper.Decision screenResult = SmartfileNotiTimesHelper.handleForegroundOnly();
                showNotify(screenResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("屏幕事件", screenResult);
                break;

//            case HOME_CLICK:

            case HEARTBEAT:
                // 屏幕打开关闭事件（仅唤醒前台）
                SmartfileNotiTimesHelper.Decision heartResult = SmartfileNotiTimesHelper.handleForegroundOnly();
                showNotify(heartResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("HEARTBEAT", heartResult);
                break;

            case ACCOUNT_SYNC:
                // 账户事件（仅唤醒前台）
                SmartfileNotiTimesHelper.Decision acountResult = SmartfileNotiTimesHelper.handleForegroundOnly();
                showNotify(acountResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("账户事件", acountResult);
                break;
            case WORK_MANAGER:
                // worker事件（仅唤醒前台）
                SmartfileNotiTimesHelper.Decision workerResult = SmartfileNotiTimesHelper.handleForegroundOnly();
                showNotify(workerResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("worker事件", workerResult);
                break;

            case HOME_CLICK:
                // worker事件（仅唤醒前台）
                SmartfileNotiTimesHelper.Decision homeClickResult = SmartfileNotiTimesHelper.handleForegroundOnly();
                showNotify(homeClickResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                printResult("home点击事件", homeClickResult);
                break;


            default:
                // worker事件（仅唤醒前台）
                SmartfileNotiTimesHelper.Decision defaultResult = SmartfileNotiTimesHelper.handleDefault();
                showNotify(defaultResult, notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
                Log.i("TAG-->>Noti", "事件名: " + event.name());
                printResult(event.name(), defaultResult);
                break;

        }

        return true;
    }



    private static void showNotify(SmartfileNotiTimesHelper.Decision decision, int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartfileChangeUtils.NoticeType noticeType){
//        if(decision.allow){
        if(true){
            if(decision.level == SmartfileNotiTimesHelper.Level.HIGH){
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, true);
            }else if(decision.level == SmartfileNotiTimesHelper.Level.NORMAL){
                showSceneNtOrg9hzWithEvent(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, false);
            }

        }

    }
    private static boolean showSceneNtOrg9hzWithEvent(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartfileChangeUtils.NoticeType noticeType, boolean isHighNotify) {
        if (!isIgnoreLastPushTime) {
            SmartfileManager.saveLastPushTime();
        }
        Context context = SmartfileManager.mContext;
        assert context != null;
        NotificationManager mManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        cancelNotificationId(notifyId);
        String channelId = "Sound_ChannelId_Smartfile" + SmartfileManager.code;
        String channelName = "Sound_ChannelName_Smartfile" + SmartfileManager.code;
        if (isSilent) {
            channelId = "SilentChannelId_Smartfile" + SmartfileManager.code;
            channelName = "SilentChannelName_Smartfile" + SmartfileManager.code;
        }

        int smallIcon = R.drawable.smartfile_logo;
        Intent intent2 = new Intent(SmartfileManager.mContext, SmartfileNtCancelFgService.class);
        intent2.setPackage(SmartfileManager.mContext.getPackageName());
        intent2.putExtra("notificationId", notifyId);
        PendingIntent cancelPendingIntent = PendingIntent.getService(SmartfileManager.mContext, 8652 + SmartfileManager.code, intent2, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
            channel.setLockscreenVisibility(1);
            if (isSilent) {
                channel.setDescription("SilentSmartfile");
                channel.enableLights(false);
                channel.enableVibration(false);
                channel.setSound((Uri) null, (AudioAttributes) null);
                channel.setLightColor(0);
                channel.setVibrationPattern(new long[0]);
            } else {
                channel.setDescription("SilentSmartfile2");
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

        builder.setContentText(context.getString(R.string.smartfile_app_name))
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
        SmartfileManager.handler.postDelayed(new Runnable() {
            @SuppressLint("MissingPermission")
            @Override
            public void run() {
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(SmartfileManager.mContext);
                notificationManager.notify(notifyId, builder.build());
                SmartfileChangeUtils.INSTANCE.setLastNoticeType(noticeType);
                Log.e("aaa", "showScenePushShare: 开始展示 通知 --  本次 -- " + SmartfileChangeUtils.INSTANCE.getLastNoticeType());
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SmartfileManager.mContext);
//                Log.e("xxx", "----------doSendNotify---------- ");
//                SmartfileNtSender.doCycle(notificationManager, notifyId, builder.build());
            }
        }, 1200L);
        try {
            SmartfileManager.setCount();
        } catch (Exception var318) {
            Exception e = var318;
            e.printStackTrace();
        }

        return true;
    }

    private static void printResult(String eventName, SmartfileNotiTimesHelper.Decision result) {
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
        SmartfileNotiTimesHelper.printStats();
    }


    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) SmartfileManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
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
            NotificationManager mManager = (NotificationManager) SmartfileManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            mManager.cancelAll();
        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }
    }


    private static void doCycle(NotificationManagerCompat notificationManager, int id, Notification notification) {
        SmartfileManager.handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isSendOk = SmartfileNtSender.doCycleSend(notificationManager, id, notification);
                if (isSendOk) {
                    SmartfileManager.handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            boolean isSendOk = SmartfileNtSender.doCycleSend(notificationManager, id, notification);
                        }
                    }, SmartfileNtSender.dayleTime);
                }
            }
        }, dayleTime);
    }


    @SuppressLint({"MissingPermission"})
    private static boolean doCycleSend(NotificationManagerCompat notificationManager, int id, Notification notification) {
        Log.e("xxx", "----------doCycleSend---------- ");
        if (!SmartfileManager.INSTANCE.isForeground() && !SmartfileManager.INSTANCE.hasCreatingActivity()) {
            boolean isNotificationEnabled = SmartfileManager.isNotificationEnabled();
            boolean screenOn = SmartfileManager.isScreenOn() && SmartfileManager.isScreenLockOpen();
            if (isNotificationEnabled && screenOn) {
                try {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_count", "", SmartfileManager.mContext);
                    notificationManager.notify(id, notification);
                } catch (Exception var95) {
                    Exception e = var95;
                    e.printStackTrace();
                }
                return true;
            } else {
                if (SmartfileManager.isDebug) {
                    Log.e("xxx", "----------doCycleSend---------- !isNotificationEnabled||!screenOn");
                }
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SmartfileManager.mContext);
                return false;
            }
        } else {
            if (SmartfileManager.isDebug) {
                Log.e("xxx", "----------doCycleSend---------- has resume Activity");
            }
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_show_error", "", SmartfileManager.mContext);
            return false;
        }
    }
}

