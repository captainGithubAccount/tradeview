package com.tfseptember.clemodel.orgyy.nt;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;

import com.tfseptember.clemodel.BlueTenOrgManager;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class BlueTenNtCountUtil {

    public BlueTenNtCountUtil() {
    }

    public static boolean setCount() {
        return setCount(1, BlueTenOrgManager.mContext);
    }

    public static boolean setCount(int count, Context context) {
        if (count >= 0 && context != null) {
            if (isTranssion() && setTransssionBadge(count, context)) {
                return true;
            } else {
                return setDefaultBadge(count, context);
            }
        } else {
            return false;
        }
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER == null ? "" : Build.MANUFACTURER.trim();
    }

    public static boolean isTranssion() {
        String manufacturer = getManufacturer().toLowerCase();
        return manufacturer.contains("infinix") || manufacturer.contains("tecno") || manufacturer.contains("itel");
    }


    private static void setXiaomiBadge(int count, Notification notification) {
        try {
            Field field = notification.getClass().getDeclaredField("extraNotification");
            Object extraNotification = field.get(notification);
            Method method = extraNotification.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE);
            method.invoke(extraNotification, count);
        } catch (Exception var21) {
            Exception e = var21;
            e.printStackTrace();
        }

    }

    private static boolean setHuaweiBadge(int count, Context context) {

        try {
            String launchClassName = getLauncherClassName(context);
            if (TextUtils.isEmpty(launchClassName)) {
                return false;
            } else {
                Bundle bundle = new Bundle();
                bundle.putString("package", context.getPackageName());
                bundle.putString("class", launchClassName);
                bundle.putInt("badgenumber", count);
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
                return true;
            }
        } catch (Exception var20) {
            Exception e = var20;
            e.printStackTrace();
            return false;
        }
    }


    private static boolean setDefaultBadge(int count, Context context) {
        try {
            String launcherClassName = getLauncherClassName(context);
            if (TextUtils.isEmpty(launcherClassName)) {
                return false;
            } else {
                Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                intent.putExtra("badge_count", count);
                intent.putExtra("badge_count_package_name", context.getPackageName());
                intent.putExtra("badge_count_class_name", launcherClassName);
                context.sendBroadcast(intent);
                return true;
            }
        } catch (Exception var18) {
            Exception e = var18;
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    private static boolean setOPPOBadge(int count, Context context) {
        try {
            Bundle extras = new Bundle();
            extras.putInt("app_badge_count", count);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", String.valueOf(count), extras);
            return true;
        } catch (Exception var20) {
            Exception e = var20;
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    private static boolean setOPPOBadge2(int count, Context context) {
        try {
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("number", count);
            intent.putExtra("upgradeNumber", count);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> receivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (receivers != null && receivers.size() > 0) {
                context.sendBroadcast(intent);
            } else {
                Bundle extras = new Bundle();
                extras.putInt("app_badge_count", count);
                context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, extras);
            }

            return true;
        } catch (Exception var20) {
            Exception e = var20;
            e.printStackTrace();
            return false;
        }
    }

    /**
     * @deprecated
     */
    @Deprecated
    @SuppressLint({"WrongConstant"})
    private static boolean setVivoBadge(int count, Context context) {
        try {
            String launcherClassName = getLauncherClassName(context);
            if (TextUtils.isEmpty(launcherClassName)) {
                return false;
            } else {
                Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra("className", launcherClassName);
                intent.putExtra("notificationNum", count);
                if (VERSION.SDK_INT >= 26) {
                    intent.addFlags(16777216);
                }
                context.sendBroadcast(intent);
                return true;
            }
        } catch (Exception var25) {
            Exception e = var25;
            e.printStackTrace();
            return false;
        }
    }

    private static boolean setZukBadge(int count, Context context) {
        try {
            Bundle extra = new Bundle();
            ArrayList<String> ids = new ArrayList();
            extra.putStringArrayList("app_shortcut_custom_id", ids);
            extra.putInt("app_badge_count", count);
            Uri contentUri = Uri.parse("content://com.android.badge/badge");
            Bundle bundle = context.getContentResolver().call(contentUri, "setAppBadgeCount", (String) null, extra);
            return bundle != null;
        } catch (Exception var23) {
            Exception e = var23;
            e.printStackTrace();
            return false;
        }
    }

    private static boolean setHTCBadge(int count, Context context) {
        try {
            ComponentName launcherComponentName = getLauncherComponentName(context);
            if (launcherComponentName == null) {
                return false;
            } else {
                Intent intent1 = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
                intent1.putExtra("com.htc.launcher.extra.COMPONENT", launcherComponentName.flattenToShortString());
                intent1.putExtra("com.htc.launcher.extra.COUNT", count);
                context.sendBroadcast(intent1);
                Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                intent2.putExtra("packagename", launcherComponentName.getPackageName());
                intent2.putExtra("count", count);
                context.sendBroadcast(intent2);
                return true;
            }
        } catch (Exception var21) {
            Exception e = var21;
            e.printStackTrace();
            return false;
        }
    }

    private boolean setSonyBadge(int count, Context context) {
        String launcherClassName = getLauncherClassName(context);
        if (TextUtils.isEmpty(launcherClassName)) {
            return false;
        } else {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", count);
                contentValues.put("package_name", context.getPackageName());
                contentValues.put("activity_name", launcherClassName);
                SonyAsyncQueryHandler asyncQueryHandler = new SonyAsyncQueryHandler(context.getContentResolver());
                asyncQueryHandler.startInsert(0, (Object) null, Uri.parse("content://com.sonymobile.home.resourceprovider/badge"), contentValues);
                return true;
            } catch (Exception var44) {
                try {
                    Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", count > 0);
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", launcherClassName);
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(count));
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
                    context.sendBroadcast(intent);
                    return true;
                } catch (Exception var43) {
                    Exception e1 = var43;
                    e1.printStackTrace();
                    return false;
                }
            }
        }
    }


    private static String getLauncherClassName(Context context) {
        ComponentName launchComponent = getLauncherComponentName(context);
        return launchComponent == null ? "" : launchComponent.getClassName();
    }

    private static ComponentName getLauncherComponentName(Context context) {
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        return launchIntent != null ? launchIntent.getComponent() : null;
    }

    public static void clearBadges(Context context) {
    }


    private static boolean setTransssionBadge(int count, Context context) {
        Bundle extrabundle = new Bundle();
        try {
            extrabundle.putString("package", context.getPackageName());
            extrabundle.putString("class", getLauncherClassName(context));
            extrabundle.putInt("badgenumber", count);
            String currentLauncher = getCurrentLauncher(context);
            if (currentLauncher == null || currentLauncher.length() == 0) {
                return false;
            }
            if (currentLauncher.contains("com.transsion.XOSLauncher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.XOSLauncher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }

            if (currentLauncher.contains("com.transsion.hilauncher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.hilauncher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }

            if (currentLauncher.contains("com.transsion.itel.launcher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.itel.launcher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }

            if (currentLauncher.contains("com.transsion.hilauncher.upgrade")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.hilauncher.upgrade.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }

            if (currentLauncher.contains("com.transsion.XOSLauncher.upgrade")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.XOSLauncher.upgrade.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }

            if (currentLauncher.contains("com.transsion.walauncher")) {
                context.getContentResolver().call(Uri.parse("content://com.transsion.walauncher.unreadprovider"), "change_badge", (String) null, extrabundle);
                return true;
            }
        } catch (Exception var43) {
            Exception e = var43;
            e.printStackTrace();
        }
        return false;
    }

    private static String getCurrentLauncher(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfo = context.getPackageManager().resolveActivity(intent, 65536);
        return resolveInfo == null ? null : resolveInfo.activityInfo.packageName;
    }

    class SonyAsyncQueryHandler extends AsyncQueryHandler {
        SonyAsyncQueryHandler(ContentResolver cr) {
            super(cr);
        }
    }
}

