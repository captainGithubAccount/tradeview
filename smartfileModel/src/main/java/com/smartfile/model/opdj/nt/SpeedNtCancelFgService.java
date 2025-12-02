package com.smartfile.model.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.smartfile.model.SpeedManager;

public class SpeedNtCancelFgService extends Service {

    public SpeedNtCancelFgService() {
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
        SpeedNtUtils.cancelNotificationId(notificationId);
        SpeedManager.INSTANCE.startNotifyService(false);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
