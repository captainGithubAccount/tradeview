package com.location.smartfilemodel.orgyy;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.orgyy.nt.SmartFileNtFgService;
import com.location.smartfilemodel.shownotificy.SmartFileNtTransfer;
import com.location.smartfilemodel.orgyy.nt.SmartFileNtUtils;

public class SmartFileClockService extends Service {

    public SmartFileClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        SmartFileNtTransfer.onTimeTickUpEvent();
        SmartFileClockManager.startAlarm(this.getApplication());
        SmartFileOrgManager.INSTANCE.startTwoService();
        if (!SmartFileNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SmartFileNtUtils.isOngoingServiceRunning(SmartFileNtFgService.class)) {
                    SmartFileOrgManager.INSTANCE.startNotifyService(false);
                }
            } else if (SmartFileNtUtils.isNotificationEnabled() && !SmartFileNtUtils.isOngoingServiceRunning(SmartFileNtFgService.class)) {
                SmartFileOrgManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
