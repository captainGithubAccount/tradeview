package com.tfseptember.clemodel.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;

public class SimplyNtCancelFgService extends Service {

    public SimplyNtCancelFgService() {
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        int notificationId = 1;
        if (intent == null) {
            notificationId = -1;
        } else {
            notificationId = intent.getIntExtra("notificationId", -1);
        }
        SimplyNtUtils.cancelNotificationId(notificationId);
        SimplyHouseworkrOrgManager.INSTANCE.startNotifyService(false);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
