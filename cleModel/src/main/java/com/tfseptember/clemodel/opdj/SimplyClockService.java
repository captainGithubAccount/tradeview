package com.tfseptember.clemodel.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.tfseptember.clemodel.SimplyManager;
import com.tfseptember.clemodel.opdj.nt.SimplyNtFgService;
import com.tfseptember.clemodel.shownotificy.SimplyNtTransfer;
import com.tfseptember.clemodel.opdj.nt.SimplyNtUtils;

public class SimplyClockService extends Service {

    public SimplyClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        SimplyNtTransfer.onTimeTickUpEvent();
        SimplyClockManager.startAlarm(this.getApplication());
        SimplyManager.INSTANCE.startTwoService();
        if (!SimplyNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SimplyNtUtils.isOngoingServiceRunning(SimplyNtFgService.class)) {
                    SimplyManager.INSTANCE.startNotifyService(false);
                }
            } else if (SimplyNtUtils.isNotificationEnabled() && !SimplyNtUtils.isOngoingServiceRunning(SimplyNtFgService.class)) {
                SimplyManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
