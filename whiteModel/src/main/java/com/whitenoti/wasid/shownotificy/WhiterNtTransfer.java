package com.whitenoti.wasid.shownotificy;

import android.util.Log;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.change.WhiterChangeUtils;

public class WhiterNtTransfer {

    public WhiterNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, true, false, WhiterChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + WhiterManager.isScreenLockOpen() + ",isScreenOn=" + WhiterManager.isScreenOn());
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, true, false, WhiterChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + WhiterManager.isScreenLockOpen() + ",isScreenOn=" + WhiterManager.isScreenOn());
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, true, false, WhiterChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, false, WhiterChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, false, WhiterChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, false, WhiterChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, false, WhiterChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, true, WhiterChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, true, WhiterChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        WhiterNtSendTryer.tryShowLocalNotifi(false, false, false, false, WhiterChangeUtils.NoticeType.CLEAN);
    }
}

