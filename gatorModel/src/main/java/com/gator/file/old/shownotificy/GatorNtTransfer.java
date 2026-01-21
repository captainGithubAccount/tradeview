package com.gator.file.old.shownotificy;

import android.util.Log;

import com.gator.file.old.GatorManager;
import com.gator.file.old.change.GatorChangeUtils;
import com.gator.file.old.use.GatorNotiTimesHelper;

public class GatorNtTransfer {

    public GatorNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask, GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, true, false, GatorChangeUtils.NoticeType.CLEAN, event);
    }

    public static void onScreenOnEvent(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + GatorManager.isScreenLockOpen() + ",isScreenOn=" + GatorManager.isScreenOn());
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, true, false, GatorChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenLockOnEvent(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + GatorManager.isScreenLockOpen() + ",isScreenOn=" + GatorManager.isScreenOn());
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, true, false, GatorChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenOffEvent(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, false, GatorChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onBatteryChangeEvent(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, false, GatorChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerConnected(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, false, GatorChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerDisConnected(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, false, GatorChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onTimeTickUpEvent(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, true, GatorChangeUtils.NoticeType.PROCESS, event);
    }


    public static void onFcmEvent(GatorNotiTimesHelper.Event event) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, true, GatorChangeUtils.NoticeType.FCM, event);
    }

    public static void onInstallApp(GatorNotiTimesHelper.Event event) {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        GatorNtSendTryer.tryShowLocalNotifi(false, false, false, false, GatorChangeUtils.NoticeType.CLEAN, event);
    }
}

