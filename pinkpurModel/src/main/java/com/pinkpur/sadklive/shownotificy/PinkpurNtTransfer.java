package com.pinkpur.sadklive.shownotificy;

import android.util.Log;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.change.PinkpurChangeUtils;

public class PinkpurNtTransfer {

    public PinkpurNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, true, false, PinkpurChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + PinkpurManager.isScreenLockOpen() + ",isScreenOn=" + PinkpurManager.isScreenOn());
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, true, false, PinkpurChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + PinkpurManager.isScreenLockOpen() + ",isScreenOn=" + PinkpurManager.isScreenOn());
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, true, false, PinkpurChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, false, PinkpurChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, false, PinkpurChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, false, PinkpurChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, false, PinkpurChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, true, PinkpurChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, true, PinkpurChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        PinkpurNtSendTryer.tryShowLocalNotifi(false, false, false, false, PinkpurChangeUtils.NoticeType.CLEAN);
    }
}

