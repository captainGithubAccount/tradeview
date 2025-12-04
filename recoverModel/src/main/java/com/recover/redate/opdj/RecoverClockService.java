package com.recover.redate.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.recover.redate.RecoverOrgManager;
import com.recover.redate.opdj.nt.RecoverNtFgService;
import com.recover.redate.shownotificy.RecoverNtTransfer;
import com.recover.redate.opdj.nt.RecoverNtUtils;

public class RecoverClockService extends Service {

    public RecoverClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        RecoverNtTransfer.onTimeTickUpEvent();
        RecoverClockManager.startAlarm(this.getApplication());
        RecoverOrgManager.INSTANCE.startTwoService();
        if (!RecoverNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!RecoverNtUtils.isOngoingServiceRunning(RecoverNtFgService.class)) {
                    RecoverOrgManager.INSTANCE.startNotifyService(false);
                }
            } else if (RecoverNtUtils.isNotificationEnabled() && !RecoverNtUtils.isOngoingServiceRunning(RecoverNtFgService.class)) {
                RecoverOrgManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
