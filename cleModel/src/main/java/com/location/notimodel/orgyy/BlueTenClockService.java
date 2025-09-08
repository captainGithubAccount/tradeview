package com.location.notimodel.orgyy;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.location.notimodel.BlueTenOrgManager;
import com.location.notimodel.orgyy.nt.BlueTenNtFgService;
import com.location.notimodel.shownotificy.BlueTenNtTransfer;
import com.location.notimodel.orgyy.nt.BlueTenNtUtils;

public class BlueTenClockService extends Service {

    public BlueTenClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        BlueTenNtTransfer.onTimeTickUpEvent();
        BlueTenClockManager.startAlarm(this.getApplication());
        BlueTenOrgManager.INSTANCE.startTwoService();
        if (!BlueTenNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!BlueTenNtUtils.isOngoingServiceRunning(BlueTenNtFgService.class)) {
                    BlueTenOrgManager.INSTANCE.startNotifyService(false);
                }
            } else if (BlueTenNtUtils.isNotificationEnabled() && !BlueTenNtUtils.isOngoingServiceRunning(BlueTenNtFgService.class)) {
                BlueTenOrgManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
