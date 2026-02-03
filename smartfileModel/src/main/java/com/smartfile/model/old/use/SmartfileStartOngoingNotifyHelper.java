package com.smartfile.model.old.use;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;

import androidx.annotation.Keep;

import com.smartfile.model.old.SmartfileManager;


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
public class SmartfileStartOngoingNotifyHelper {

    private static final String TAG = "ALIVE_TEST";
    SmartfileNotificationHelper notificationHelper;
    Notification notification;

    public SmartfileStartOngoingNotifyHelper(Context context) {
        notificationHelper = SmartfileNotificationHelper.getInstance(context);
        notification = notificationHelper.createOngoingNotification();

    }

    public  void oncreate(Context context, Service service){

        SmartfileNotificationHelper.setServiceLiving(true);
        SmartfileNotificationHelper.setNotificationShowing(false);
        startForegroundNotification(service);
    }

    public void onDestroy(){
        if (SmartfileManager.isDebug) {
            Log.d(TAG, "onDestroy");
        }

        SmartfileNotificationHelper.setServiceLiving(false);
        SmartfileNotificationHelper.setNotificationShowing(false);

    }

    public int onStartCommand(Service service) {
        if (SmartfileManager.isDebug) {
            Log.d(TAG, "onStartCommand");
        }

        SmartfileNotificationHelper.setServiceLiving(true);
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
                service.startForeground(SmartfileNotificationHelper.NOTIFICATION_ID1, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
//                        ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE); //报错：startForegroundService() not allowed due to mAllowStartForeground false: service com.finaltest.cover/com.newalive.model.SmartFileAliveService
            } else {
                service.startForeground(SmartfileNotificationHelper.NOTIFICATION_ID1, notification);
            }

            SmartfileNotificationHelper.setNotificationShowing(notificationHelper.isNotificationEnabled());

            if (SmartfileManager.isDebug) {
                Log.d(TAG, "Foreground notification started successfully");
            }

        } catch (Exception e) {
            SmartfileNotificationHelper.setNotificationShowing(false);

            if (SmartfileManager.isDebug) {
                Log.e(TAG, "Failed to start foreground notification: " + e.getMessage());
            }
        }
    }
}
