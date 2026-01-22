package com.speed.model.old.shownotificy;

import android.util.Log;

import com.speed.model.old.SpeedManager;
import com.speed.model.old.change.SpeedChangeUtils;
import com.speed.model.old.use.SpeedNotiTimesHelper;

public class SpeedNtTransfer {

    public SpeedNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask, SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, true, false, SpeedChangeUtils.NoticeType.CLEAN, event);
    }

    public static void onScreenOnEvent(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SpeedManager.isScreenLockOpen() + ",isScreenOn=" + SpeedManager.isScreenOn());
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, true, false, SpeedChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenLockOnEvent(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SpeedManager.isScreenLockOpen() + ",isScreenOn=" + SpeedManager.isScreenOn());
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, true, false, SpeedChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenOffEvent(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onBatteryChangeEvent(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerConnected(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerDisConnected(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onTimeTickUpEvent(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, true, SpeedChangeUtils.NoticeType.PROCESS, event);
    }


    public static void onFcmEvent(SpeedNotiTimesHelper.Event event) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, true, SpeedChangeUtils.NoticeType.FCM, event);
    }

    public static void onInstallApp(SpeedNotiTimesHelper.Event event) {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.CLEAN, event);
    }
}

