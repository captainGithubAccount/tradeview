package com.location.notimodel.shownotificy;

import android.util.Log;

import com.location.notimodel.BlueTenOrgManager;

public class BlueTenNtTransfer {

    public BlueTenNtTransfer() {
    }


    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
    }

    public static void onScreenOnEvent() {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + BlueTenOrgManager.isScreenLockOpen() + ",isScreenOn=" + BlueTenOrgManager.isScreenOn());
        }
    }

    public static void onScreenLockOnEvent() {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + BlueTenOrgManager.isScreenLockOpen() + ",isScreenOn=" + BlueTenOrgManager.isScreenOn());
        }
        BlueTenNtSendTryer.tryShowLocalNotifi(false, false, true, false);
    }

    public static void onScreenOffEvent() {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        BlueTenNtSendTryer.tryShowLocalNotifi(false, false, false, false);
    }

    public static void onBatteryChangeEvent() {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        BlueTenNtSendTryer.tryShowLocalNotifi(false, false, false, false);
    }

    public static void onTimeTickUpEvent() {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        BlueTenNtSendTryer.tryShowLocalNotifi(false, false, false, true);
    }


    public static void onFcmEvent() {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        BlueTenNtSendTryer.tryShowLocalNotifi(false, false, false, true);
    }

}

