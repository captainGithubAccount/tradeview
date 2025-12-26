package com.smartfile.model.shownotificy;

import android.util.Log;

import androidx.annotation.Keep;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.opdj.nt.SmartFileNtBuilder;
import com.smartfile.model.opdj.nt.SmartFileNtInfo;


@Keep
public class SmartFileNtTransfer {

    public static void testNoti(boolean ishigh){
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartFileChangeUtils.NoticeType.BATTERY);


        SmartFileNtInfo dateBean;
        dateBean = SmartFileNtBuilder.buildNotifiData(0, ishigh);
        SmartFileChangeUtils.NoticeType noticeType = SmartFileChangeUtils.NoticeType.CLEAN;
        SmartFileNtSender.showSceneNtNew(dateBean.getNotId(),
                dateBean.getPendingIntent(),
                dateBean.getRemoteBig(),
                dateBean.getRemoteMid(),
                dateBean.getRemoteSmall(),
                true,
                false,
                noticeType,
                ishigh);
    }

    public SmartFileNtTransfer() {
    }

    public static void onHomeKeyPressEvent(boolean isRecentTask) {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onHomeKeyPressEvent isRecentTask=" + isRecentTask);
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, true, false, SmartFileChangeUtils.NoticeType.CLEAN);
    }

    public static void onScreenOnEvent() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onScreenOnEvent, isScreenLockOpen=" + SmartFileManager.isScreenLockOpen() + ",isScreenOn=" + SmartFileManager.isScreenOn());
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, true, false, SmartFileChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenLockOnEvent() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onScreenLockOnEvent, isScreenLockOpen=" + SmartFileManager.isScreenLockOpen() + ",isScreenOn=" + SmartFileManager.isScreenOn());
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, true, false, SmartFileChangeUtils.NoticeType.PROCESS);
    }

    public static void onScreenOffEvent() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onScreenOffEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartFileChangeUtils.NoticeType.PROCESS);
    }

    public static void onBatteryChangeEvent() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onBatteryChangeEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartFileChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerConnected() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "充电ing");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartFileChangeUtils.NoticeType.BATTERY);
    }

    public static void onPowerDisConnected() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "充电断开");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartFileChangeUtils.NoticeType.BATTERY);
    }

    public static void onTimeTickUpEvent() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onTimeTickUpEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, true, SmartFileChangeUtils.NoticeType.PROCESS);
    }


    public static void onFcmEvent() {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "onFcmEvent");
        }
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, true, SmartFileChangeUtils.NoticeType.FCM);
    }

    public static void onInstallApp() {
        Log.e("xxx", "onReceive: 软件安装 --- ");
        SmartFileNtSendTryer.tryShowLocalNotifi(false, false, false, false, SmartFileChangeUtils.NoticeType.CLEAN);
    }
}

