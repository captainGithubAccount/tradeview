package com.whitenoti.wasid.opdj.nt;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.service.notification.StatusBarNotification;

import com.whitenoti.wasid.WhiterManager;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public class WhiterNtUtils {

    public WhiterNtUtils() {
    }

    public static boolean isNotificationEnabled() {
        boolean isEnable = true;
        if (VERSION.SDK_INT >= 26) {
            if (isEnableV26(WhiterManager.mContext)) {
                isEnable = true;
            } else {
                isEnable = false;
            }
        }

        return isEnable;
    }

    private static boolean isEnableV26(Context context) {
        try {
            Object var10000 = context.getSystemService(Context.NOTIFICATION_SERVICE);
            if (var10000 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            } else {
                NotificationManager notificationManager = (NotificationManager) var10000;
                Method sServiceField = notificationManager.getClass().getDeclaredMethod("getService");
                Intrinsics.checkNotNullExpressionValue(sServiceField, "sServiceField");
                sServiceField.setAccessible(true);
                Object sService = sServiceField.invoke(notificationManager);
                ApplicationInfo appInfo = context.getApplicationInfo();
                Context var10 = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(var10, "context.applicationContext");
                String pkg = var10.getPackageName();
                int uid = appInfo.uid;
                Method method = sService.getClass().getDeclaredMethod("areNotificationsEnabledForPackage", String.class, Integer.TYPE);
                Intrinsics.checkNotNullExpressionValue(method, "method");
                method.setAccessible(true);
                var10000 = method.invoke(sService, pkg, uid);
                if (var10000 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                } else {
                    return (Boolean) var10000;
                }
            }
        } catch (Exception var28) {
            Exception var9 = var28;
            var9.printStackTrace();
            return false;
        }
    }

    public static void cancelNotificationId(int notificationId) {
        try {
            NotificationManager mManager = (NotificationManager) WhiterManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            if (notificationId < 0) {
                mManager.cancelAll();
                return;
            }
            mManager.cancel(notificationId);
        } catch (Exception var28) {
            Exception e = var28;
            e.printStackTrace();
        }

    }

    public static boolean hasNotify(int nId) {
        boolean result = false;
        try {
            NotificationManager mManager = (NotificationManager) WhiterManager.mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            if (VERSION.SDK_INT >= 23) {
                StatusBarNotification[] var39 = mManager.getActiveNotifications();
                int var40 = var39.length;

                for (int var41 = 0; var41 < var40; ++var41) {
                    StatusBarNotification activeNotification = var39[var41];
                    if (activeNotification.getId() == nId) {
                        result = true;
                    }
                }
            }
            return result;
        } catch (Exception var43) {
            Exception e = var43;
            e.printStackTrace();
            return result;
        }
    }

    public static boolean isOngoingServiceRunning(Class serviceClass) {
        ActivityManager manager = (ActivityManager) WhiterManager.mContext.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> runningServices = manager.getRunningServices(Integer.MAX_VALUE);
        Iterator var64 = runningServices.iterator();

        ActivityManager.RunningServiceInfo runningService;
        do {
            if (!var64.hasNext()) {
                return false;
            }
            runningService = (ActivityManager.RunningServiceInfo) var64.next();
        } while (!serviceClass.getClass().getName().equals(runningService.getClass().getName()) || !runningService.foreground);
        return true;
    }
}
