package com.whitenoti.wasid.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.opdj.nt.WhiterNtFgService;
import com.whitenoti.wasid.shownotificy.WhiterNtTransfer;
import com.whitenoti.wasid.opdj.nt.WhiterNtUtils;

public class WhiterClockService extends Service {

    public WhiterClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        WhiterNtTransfer.onTimeTickUpEvent();
        WhiterClockManager.startAlarm(this.getApplication());
        WhiterManager.INSTANCE.startTwoService();
        if (!WhiterNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!WhiterNtUtils.isOngoingServiceRunning(WhiterNtFgService.class)) {
                    WhiterManager.INSTANCE.startNotifyService(false);
                }
            } else if (WhiterNtUtils.isNotificationEnabled() && !WhiterNtUtils.isOngoingServiceRunning(WhiterNtFgService.class)) {
                WhiterManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
