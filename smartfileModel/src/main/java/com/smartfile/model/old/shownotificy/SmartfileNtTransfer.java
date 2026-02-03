package com.smartfile.model.old.shownotificy;

import android.util.Log;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.change.SmartfileChangeUtils;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;

public class SmartfileNtTransfer {

    public SmartfileNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask, SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, true, false, SmartfileChangeUtils.NoticeType.CLEAN, event);
    }

    public static void onScreenOnEvent(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SmartfileManager.isScreenLockOpen() + ",isScreenOn=" + SmartfileManager.isScreenOn());
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, true, false, SmartfileChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenLockOnEvent(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SmartfileManager.isScreenLockOpen() + ",isScreenOn=" + SmartfileManager.isScreenOn());
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, true, false, SmartfileChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenOffEvent(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartfileChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onBatteryChangeEvent(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartfileChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerConnected(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartfileChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerDisConnected(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartfileChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onTimeTickUpEvent(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, true, SmartfileChangeUtils.NoticeType.PROCESS, event);
    }


    public static void onFcmEvent(SmartfileNotiTimesHelper.Event event) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, true, SmartfileChangeUtils.NoticeType.FCM, event);
    }

    public static void onInstallApp(SmartfileNotiTimesHelper.Event event) {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        SmartfileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartfileChangeUtils.NoticeType.CLEAN, event);
    }
}

