package com.tidy.file.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.tidy.file.old.TidyManager;
import com.tidy.file.old.opdj.nt.TidyNtFgService;
import com.tidy.file.old.shownotificy.TidyNtTransfer;
import com.tidy.file.old.opdj.nt.TidyNtUtils;
import com.tidy.file.old.use.TidyActionConstant;
import com.tidy.file.old.use.TidyNotiTimesHelper;

public class TidyClockService extends Service {

    public TidyClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        TidyNtTransfer.onTimeTickUpEvent(TidyNotiTimesHelper.Event.ALARM);
        TidyClockManager.startAlarm(this.getApplication());
        TidyManager.INSTANCE.startTwoService();
        if (!TidyNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!TidyNtUtils.isOngoingServiceRunning(TidyNtFgService.class)) {
                    TidyManager.INSTANCE.startNotifyService(false, TidyActionConstant.clock);
                }
            } else if (TidyNtUtils.isNotificationEnabled() && !TidyNtUtils.isOngoingServiceRunning(TidyNtFgService.class)) {
                TidyManager.INSTANCE.startNotifyService(false, TidyActionConstant.clock);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
