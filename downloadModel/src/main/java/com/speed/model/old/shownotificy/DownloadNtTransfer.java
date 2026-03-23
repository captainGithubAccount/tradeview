package com.download.model.old.shownotificy;

import android.util.Log;

import com.download.model.old.DownloadManager;
import com.download.model.old.change.DownloadChangeUtils;
import com.download.model.old.use.DownloadNotiTimesHelper;

public class DownloadNtTransfer {

    public DownloadNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask, DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, true, false, DownloadChangeUtils.NoticeType.CLEAN, event);
    }

    public static void onScreenOnEvent(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + DownloadManager.isScreenLockOpen() + ",isScreenOn=" + DownloadManager.isScreenOn());
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, true, false, DownloadChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenLockOnEvent(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + DownloadManager.isScreenLockOpen() + ",isScreenOn=" + DownloadManager.isScreenOn());
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, true, false, DownloadChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onScreenOffEvent(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, false, DownloadChangeUtils.NoticeType.PROCESS, event);
    }

    public static void onBatteryChangeEvent(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, false, DownloadChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerConnected(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, false, DownloadChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onPowerDisConnected(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, false, DownloadChangeUtils.NoticeType.BATTERY, event);
    }

    public static void onTimeTickUpEvent(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, true, DownloadChangeUtils.NoticeType.PROCESS, event);
    }


    public static void onFcmEvent(DownloadNotiTimesHelper.Event event) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, true, DownloadChangeUtils.NoticeType.FCM, event);
    }

    public static void onInstallApp(DownloadNotiTimesHelper.Event event) {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        DownloadNtSendTryer.tryShowLocalNotifi(false, false, false, false, DownloadChangeUtils.NoticeType.CLEAN, event);
    }
}

