package com.speed.model.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.speed.model.old.opdj.nt.SpeedNtFgService;
import com.speed.model.old.opdj.nt.SpeedNtUtils;
import com.speed.model.old.SpeedManager;
import com.speed.model.old.shownotificy.SpeedNtTransfer;
import com.speed.model.old.use.SpeedActionConstant;
import com.speed.model.old.use.SpeedNotiTimesHelper;

public class SpeedClockService extends Service {

    public SpeedClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        SpeedNtTransfer.onTimeTickUpEvent(SpeedNotiTimesHelper.Event.ALARM);
        SpeedClockManager.startAlarm(this.getApplication());
        SpeedManager.INSTANCE.startTwoService();
        if (!SpeedNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SpeedNtUtils.isOngoingServiceRunning(SpeedNtFgService.class)) {
                    SpeedManager.INSTANCE.startNotifyService(false, SpeedActionConstant.clock);
                }
            } else if (SpeedNtUtils.isNotificationEnabled() && !SpeedNtUtils.isOngoingServiceRunning(SpeedNtFgService.class)) {
                SpeedManager.INSTANCE.startNotifyService(false, SpeedActionConstant.clock);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
