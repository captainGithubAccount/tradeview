package com.speed.ozius.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.speed.ozius.SpeedManager;
import com.speed.ozius.opdj.nt.SpeedNtFgService;
import com.speed.ozius.shownotificy.SpeedNtTransfer;
import com.speed.ozius.opdj.nt.SpeedNtUtils;

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
