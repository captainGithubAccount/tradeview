package com.tfseptember.clemodel.orgyy;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.orgyy.nt.SimplyHouseworkNtFgService;
import com.tfseptember.clemodel.shownotificy.SimplyLoudqNtTransfer;
import com.tfseptember.clemodel.orgyy.nt.SimplyCauseNtUtils;

public class SimplyCatchjClockService extends Service {

    public SimplyCatchjClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        SimplyLoudqNtTransfer.onTimeTickUpEvent();
        SimplySingerClockManager.startAlarm(this.getApplication());
        SimplyHouseworkrOrgManager.INSTANCE.startTwoService();
        if (!SimplyHouseworkNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!SimplyCauseNtUtils.isOngoingServiceRunning(SimplyHouseworkNtFgService.class)) {
                    SimplyHouseworkrOrgManager.INSTANCE.startNotifyService(false);
                }
            } else if (SimplyCauseNtUtils.isNotificationEnabled() && !SimplyCauseNtUtils.isOngoingServiceRunning(SimplyHouseworkNtFgService.class)) {
                SimplyHouseworkrOrgManager.INSTANCE.startNotifyService(false);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
