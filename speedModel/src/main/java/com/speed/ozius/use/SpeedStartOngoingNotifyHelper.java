package com.speed.ozius.use;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;

import androidx.annotation.Keep;

import com.speed.ozius.SpeedManager;


/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @version 1.0.0
 * Created by 2026年-01月
 * @autor lwj
 */

@Keep
public class SpeedStartOngoingNotifyHelper {

    private static final String TAG = "ALIVE_TEST";
    SpeedNotificationHelper notificationHelper;
    Notification notification;

    public SpeedStartOngoingNotifyHelper(Context context) {
        notificationHelper = SpeedNotificationHelper.getInstance(context);
        notification = notificationHelper.createOngoingNotification();

    }

    public  void oncreate(Context context, Service service){

        SpeedNotificationHelper.setServiceLiving(true);
        SpeedNotificationHelper.setNotificationShowing(false);
        startForegroundNotification(service);
    }

    public void onDestroy(){
        if (SpeedManager.isDebug) {
            Log.d(TAG, "onDestroy");
        }

        SpeedNotificationHelper.setServiceLiving(false);
        SpeedNotificationHelper.setNotificationShowing(false);

    }

    public int onStartCommand(Service service) {
        if (SpeedManager.isDebug) {
            Log.d(TAG, "onStartCommand");
        }

        SpeedNotificationHelper.setServiceLiving(true);
        startForegroundNotification(service);

        // 发送时间事件
        notificationHelper.sendTimeTickEvent();

        return Service.START_STICKY;
    }


//    ===================================
//    ===================================
//    ===================================


    /**
     * 启动前台通知
     */
    private void startForegroundNotification(Service service) {
        try {

            if (notification == null) {
                throw new IllegalStateException("Failed to create notification");
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                service.startForeground(SpeedNotificationHelper.NOTIFICATION_ID1, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
//                        ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE); //报错：startForegroundService() not allowed due to mAllowStartForeground false: service com.finaltest.cover/com.newalive.model.SmartFileAliveService
            } else {
                service.startForeground(SpeedNotificationHelper.NOTIFICATION_ID1, notification);
            }

            SpeedNotificationHelper.setNotificationShowing(notificationHelper.isNotificationEnabled());

            if (SpeedManager.isDebug) {
                Log.d(TAG, "Foreground notification started successfully");
            }

        } catch (Exception e) {
            SpeedNotificationHelper.setNotificationShowing(false);

            if (SpeedManager.isDebug) {
                Log.e(TAG, "Failed to start foreground notification: " + e.getMessage());
            }
        }
    }
}