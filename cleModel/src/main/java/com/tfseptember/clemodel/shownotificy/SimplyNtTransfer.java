package com.tfseptember.clemodel.shownotificy;

import android.util.Log;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.change.SimplyChangeUtils;

public class SimplyNtTransfer {

    public SimplyNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, true, false, SimplyChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SimplyHouseworkrOrgManager.isScreenLockOpen() + ",isScreenOn=" + SimplyHouseworkrOrgManager.isScreenOn());
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, true, false, SimplyChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SimplyHouseworkrOrgManager.isScreenLockOpen() + ",isScreenOn=" + SimplyHouseworkrOrgManager.isScreenOn());
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, true, false, SimplyChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, false, SimplyChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, false, SimplyChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, false, SimplyChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, false, SimplyChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, true, SimplyChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, true, SimplyChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        SimplyNtSendTryer.tryShowLocalNotifi(false, false, false, false, SimplyChangeUtils.NoticeType.CLEAN);
    }
}

