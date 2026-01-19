package com.tidy.file.old.shownotificy;

import android.util.Log;

import com.tidy.file.old.EasyManager;
import com.tidy.file.old.change.EasyChangeUtils;
import com.tidy.file.old.use.EasyNotiTimesHelper;

public class EasyNtTransfer {

    public EasyNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask, EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, true, false, EasyChangeUtils.NoticeType.CLEAN, event);
    }

    public static void onScreenOnEvent(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + EasyManager.isScreenLockOpen() + ",isScreenOn=" + EasyManager.isScreenOn());
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, true, false, EasyChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenLockOnEvent(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + EasyManager.isScreenLockOpen() + ",isScreenOn=" + EasyManager.isScreenOn());
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, true, false, EasyChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenOffEvent(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onBatteryChangeEvent(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerConnected(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerDisConnected(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onTimeTickUpEvent(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, true, EasyChangeUtils.NoticeType.PROCESS, event);
    }


    public static void onFcmEvent(EasyNotiTimesHelper.Event event) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, true, EasyChangeUtils.NoticeType.FCM, event);
    }

    public static void onInstallApp(EasyNotiTimesHelper.Event event) {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.CLEAN, event);
    }
}

