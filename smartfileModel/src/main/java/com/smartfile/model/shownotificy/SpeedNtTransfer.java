package com.smartfile.model.shownotificy;

import android.util.Log;

import com.smartfile.model.SpeedManager;
import com.smartfile.model.change.SpeedChangeUtils;

public class SpeedNtTransfer {

    public SpeedNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, true, false, SpeedChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SpeedManager.isScreenLockOpen() + ",isScreenOn=" + SpeedManager.isScreenOn());
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, true, false, SpeedChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SpeedManager.isScreenLockOpen() + ",isScreenOn=" + SpeedManager.isScreenOn());
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, true, false, SpeedChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, true, SpeedChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, true, SpeedChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        SpeedNtSendTryer.tryShowLocalNotifi(false, false, false, false, SpeedChangeUtils.NoticeType.CLEAN);
    }
}

