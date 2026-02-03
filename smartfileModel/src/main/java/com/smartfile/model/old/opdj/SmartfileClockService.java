package com.smartfile.model.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.smartfile.model.old.opdj.nt.SmartfileNtFgService;
import com.smartfile.model.old.opdj.nt.SmartfileNtUtils;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.shownotificy.SmartfileNtTransfer;
import com.smartfile.model.old.use.SmartfileActionConstant;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;

public class SmartfileClockService extends Service {

    public SmartfileClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        SmartfileNtTransfer.onTimeTickUpEvent(SmartfileNotiTimesHelper.Event.ALARM);
        SmartfileClockManager.startAlarm(this.getApplication());
        SmartfileManager.INSTANCE.startTwoService();
        if (!SmartfileNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SmartfileNtUtils.isOngoingServiceRunning(SmartfileNtFgService.class)) {
                    SmartfileManager.INSTANCE.startNotifyService(false, SmartfileActionConstant.clock);
                }
            } else if (SmartfileNtUtils.isNotificationEnabled() && !SmartfileNtUtils.isOngoingServiceRunning(SmartfileNtFgService.class)) {
                SmartfileManager.INSTANCE.startNotifyService(false, SmartfileActionConstant.clock);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
