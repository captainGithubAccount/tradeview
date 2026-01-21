package com.gator.file.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.gator.file.old.opdj.nt.GatorNtFgService;
import com.gator.file.old.opdj.nt.GatorNtUtils;
import com.gator.file.old.GatorManager;
import com.gator.file.old.shownotificy.GatorNtTransfer;
import com.gator.file.old.use.GatorActionConstant;
import com.gator.file.old.use.GatorNotiTimesHelper;

public class GatorClockService extends Service {

    public GatorClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        GatorNtTransfer.onTimeTickUpEvent(GatorNotiTimesHelper.Event.ALARM);
        GatorClockManager.startAlarm(this.getApplication());
        GatorManager.INSTANCE.startTwoService();
        if (!GatorNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!GatorNtUtils.isOngoingServiceRunning(GatorNtFgService.class)) {
                    GatorManager.INSTANCE.startNotifyService(false, GatorActionConstant.clock);
                }
            } else if (GatorNtUtils.isNotificationEnabled() && !GatorNtUtils.isOngoingServiceRunning(GatorNtFgService.class)) {
                GatorManager.INSTANCE.startNotifyService(false, GatorActionConstant.clock);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
