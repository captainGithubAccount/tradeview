package com.smartfile.model.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.smartfile.model.FirebaseUtils;
import com.smartfile.model.SmartFileManager;
import com.smartfile.model.opdj.nt.SmartFileNtFgService;
import com.smartfile.model.shownotificy.SmartFileNtTransfer;
import com.smartfile.model.opdj.nt.SmartFileNtUtils;

public class SmartFileClockService extends Service {

    public SmartFileClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        FirebaseUtils.INSTANCE.setAnalyticsEvent("local_alarm_sent", "", SmartFileManager.mContext);
        SmartFileNtTransfer.onTimeTickUpEvent();
        SmartFileClockManager.startAlarm(this.getApplication());
        SmartFileManager.INSTANCE.startTwoService();
        if (!SmartFileNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SmartFileNtUtils.isOngoingServiceRunning(SmartFileNtFgService.class)) {
                    SmartFileManager.INSTANCE.startNotifyService(false);
                }
            } else if (SmartFileNtUtils.isNotificationEnabled() && !SmartFileNtUtils.isOngoingServiceRunning(SmartFileNtFgService.class)) {
                SmartFileManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
