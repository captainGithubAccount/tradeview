package com.tidy.file.old.shownotificy;

import android.util.Log;

import com.tidy.file.old.TidyManager;
import com.tidy.file.old.change.TidyChangeUtils;
import com.tidy.file.old.use.TidyNotiTimesHelper;

public class TidyNtTransfer {

    public TidyNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask, TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, true, false, TidyChangeUtils.NoticeType.CLEAN, event);
    }

    public static void onScreenOnEvent(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + TidyManager.isScreenLockOpen() + ",isScreenOn=" + TidyManager.isScreenOn());
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, true, false, TidyChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenLockOnEvent(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + TidyManager.isScreenLockOpen() + ",isScreenOn=" + TidyManager.isScreenOn());
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, true, false, TidyChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenOffEvent(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, false, TidyChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onBatteryChangeEvent(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, false, TidyChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerConnected(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, false, TidyChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerDisConnected(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, false, TidyChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onTimeTickUpEvent(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, true, TidyChangeUtils.NoticeType.PROCESS, event);
    }


    public static void onFcmEvent(TidyNotiTimesHelper.Event event) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, true, TidyChangeUtils.NoticeType.FCM, event);
    }

    public static void onInstallApp(TidyNotiTimesHelper.Event event) {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        TidyNtSendTryer.tryShowLocalNotifi(false, false, false, false, TidyChangeUtils.NoticeType.CLEAN, event);
    }
}

