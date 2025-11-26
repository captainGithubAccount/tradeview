package com.location.smartfilemodel.shownotificy;

import android.util.Log;

import com.location.smartfilemodel.SmartFileOrgManager;

public class SmartFileNtTransfer {

    public SmartFileNtTransfer() {
    }


    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
    }

    public static void onScreenOnEvent() {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SmartFileOrgManager.isScreenLockOpen() + ",isScreenOn=" + SmartFileOrgManager.isScreenOn());
        }
    }

    public static void onScreenLockOnEvent() {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SmartFileOrgManager.isScreenLockOpen() + ",isScreenOn=" + SmartFileOrgManager.isScreenOn());
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, true, false);
    }

    public static void onScreenOffEvent() {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false);
    }

    public static void onBatteryChangeEvent() {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false);
    }

    public static void onTimeTickUpEvent() {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, true);
    }


    public static void onFcmEvent() {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, true);
    }

}

