package com.easy.model.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.easy.model.old.EasyManager;
import com.easy.model.old.opdj.nt.EasyNtFgService;
import com.easy.model.old.shownotificy.EasyNtTransfer;
import com.easy.model.old.opdj.nt.EasyNtUtils;
import com.easy.model.old.use.EasyActionConstant;
import com.easy.model.old.use.EasyNotiTimesHelper;

public class EasyClockService extends Service {

    public EasyClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        EasyNtTransfer.onTimeTickUpEvent(EasyNotiTimesHelper.Event.ALARM);
        EasyClockManager.startAlarm(this.getApplication());
        EasyManager.INSTANCE.startTwoService();
        if (!EasyNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!EasyNtUtils.isOngoingServiceRunning(EasyNtFgService.class)) {
                    EasyManager.INSTANCE.startNotifyService(false, EasyActionConstant.clock);
                }
            } else if (EasyNtUtils.isNotificationEnabled() && !EasyNtUtils.isOngoingServiceRunning(EasyNtFgService.class)) {
                EasyManager.INSTANCE.startNotifyService(false, EasyActionConstant.clock);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
