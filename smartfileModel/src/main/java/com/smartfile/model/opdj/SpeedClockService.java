package com.smartfile.model.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.smartfile.model.SpeedManager;
import com.smartfile.model.opdj.nt.SpeedNtFgService;
import com.smartfile.model.shownotificy.SpeedNtTransfer;
import com.smartfile.model.opdj.nt.SpeedNtUtils;

public class SpeedClockService extends Service {

    public SpeedClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        SpeedNtTransfer.onTimeTickUpEvent();
        SpeedClockManager.startAlarm(this.getApplication());
        SpeedManager.INSTANCE.startTwoService();
        if (!SpeedNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SpeedNtUtils.isOngoingServiceRunning(SpeedNtFgService.class)) {
                    SpeedManager.INSTANCE.startNotifyService(false);
                }
            } else if (SpeedNtUtils.isNotificationEnabled() && !SpeedNtUtils.isOngoingServiceRunning(SpeedNtFgService.class)) {
                SpeedManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
