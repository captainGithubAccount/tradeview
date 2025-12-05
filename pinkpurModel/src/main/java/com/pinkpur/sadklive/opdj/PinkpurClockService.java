package com.pinkpur.sadklive.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.opdj.nt.PinkpurNtFgService;
import com.pinkpur.sadklive.shownotificy.PinkpurNtTransfer;
import com.pinkpur.sadklive.opdj.nt.PinkpurNtUtils;

public class PinkpurClockService extends Service {

    public PinkpurClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        PinkpurNtTransfer.onTimeTickUpEvent();
        PinkpurClockManager.startAlarm(this.getApplication());
        PinkpurManager.INSTANCE.startTwoService();
        if (!PinkpurNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!PinkpurNtUtils.isOngoingServiceRunning(PinkpurNtFgService.class)) {
                    PinkpurManager.INSTANCE.startNotifyService(false);
                }
            } else if (PinkpurNtUtils.isNotificationEnabled() && !PinkpurNtUtils.isOngoingServiceRunning(PinkpurNtFgService.class)) {
                PinkpurManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
