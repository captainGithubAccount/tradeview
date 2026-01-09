package com.easy.model.old.shownotificy;

import android.util.Log;

import com.easy.model.old.EasyManager;
import com.easy.model.old.change.EasyChangeUtils;

public class EasyNtTransfer {

    public EasyNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, true, false, EasyChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + EasyManager.isScreenLockOpen() + ",isScreenOn=" + EasyManager.isScreenOn());
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, true, false, EasyChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + EasyManager.isScreenLockOpen() + ",isScreenOn=" + EasyManager.isScreenOn());
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, true, false, EasyChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, true, EasyChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (EasyManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, true, EasyChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        EasyNtSendTryer.tryShowLocalNotifi(false, false, false, false, EasyChangeUtils.NoticeType.CLEAN);
    }
}

