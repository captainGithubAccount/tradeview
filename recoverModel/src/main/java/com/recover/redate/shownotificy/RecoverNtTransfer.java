package com.recover.redate.shownotificy;

import android.util.Log;

import com.recover.redate.RecoverManager;
import com.recover.redate.change.RecoverChangeUtils;

public class RecoverNtTransfer {

    public RecoverNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, true, false, RecoverChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + RecoverManager.isScreenLockOpen() + ",isScreenOn=" + RecoverManager.isScreenOn());
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, true, false, RecoverChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + RecoverManager.isScreenLockOpen() + ",isScreenOn=" + RecoverManager.isScreenOn());
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, true, false, RecoverChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, false, RecoverChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, false, RecoverChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, false, RecoverChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, false, RecoverChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, true, RecoverChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (RecoverManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, true, RecoverChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        RecoverNtSendTryer.tryShowLocalNotifi(false, false, false, false, RecoverChangeUtils.NoticeType.CLEAN);
    }
}

