package com.tfseptember.clemodel.shownotificy;

import android.util.Log;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;

public class SimplyLoudqNtTransfer {

    public SimplyLoudqNtTransfer() {
    }


    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
    }

    public static void onScreenOnEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SimplyHouseworkrOrgManager.isScreenLockOpen() + ",isScreenOn=" + SimplyHouseworkrOrgManager.isScreenOn());
        }
    }

    public static void onScreenLockOnEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SimplyHouseworkrOrgManager.isScreenLockOpen() + ",isScreenOn=" + SimplyHouseworkrOrgManager.isScreenOn());
        }
        SimplyDiscoveryeydNtSendTryer.tryShowLocalNotifi(false, false, true, false);
    }

    public static void onScreenOffEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SimplyDiscoveryeydNtSendTryer.tryShowLocalNotifi(false, false, false, false);
    }

    public static void onBatteryChangeEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SimplyDiscoveryeydNtSendTryer.tryShowLocalNotifi(false, false, false, false);
    }

    public static void onTimeTickUpEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SimplyDiscoveryeydNtSendTryer.tryShowLocalNotifi(false, false, false, true);
    }


    public static void onFcmEvent() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SimplyDiscoveryeydNtSendTryer.tryShowLocalNotifi(false, false, false, true);
    }

}

