package com.tidy.file.old.use;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;

import androidx.annotation.Keep;

import com.tidy.file.old.TidyManager;


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
public class TidyStartOngoingNotifyHelper {

    private static final String TAG = "ALIVE_TEST";
    TidyNotificationHelper notificationHelper;
    Notification notification;

    public TidyStartOngoingNotifyHelper(Context context) {
        notificationHelper = TidyNotificationHelper.getInstance(context);
        notification = notificationHelper.createOngoingNotification();

    }

    public  void oncreate(Context context, Service service){

        TidyNotificationHelper.setServiceLiving(true);
        TidyNotificationHelper.setNotificationShowing(false);
        startForegroundNotification(service);
    }

    public void onDestroy(){
        if (TidyManager.isDebug) {
            Log.d(TAG, "onDestroy");
        }

        TidyNotificationHelper.setServiceLiving(false);
        TidyNotificationHelper.setNotificationShowing(false);

    }

    public int onStartCommand(Service service) {
        if (TidyManager.isDebug) {
            Log.d(TAG, "onStartCommand");
        }

        TidyNotificationHelper.setServiceLiving(true);
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
                service.startForeground(TidyNotificationHelper.NOTIFICATION_ID1, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
//                        ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE); //报错：startForegroundService() not allowed due to mAllowStartForeground false: service com.finaltest.cover/com.newalive.model.SmartFileAliveService
            } else {
                service.startForeground(TidyNotificationHelper.NOTIFICATION_ID1, notification);
            }

            TidyNotificationHelper.setNotificationShowing(notificationHelper.isNotificationEnabled());

            if (TidyManager.isDebug) {
                Log.d(TAG, "Foreground notification started successfully");
            }

        } catch (Exception e) {
            TidyNotificationHelper.setNotificationShowing(false);

            if (TidyManager.isDebug) {
                Log.e(TAG, "Failed to start foreground notification: " + e.getMessage());
            }
        }
    }
}
