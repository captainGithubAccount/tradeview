package com.whitenoti.wasid.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.whitenoti.wasid.WhiterManager;

public class WhiterNtCancelFgService extends Service {

    public WhiterNtCancelFgService() {
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
        WhiterNtUtils.cancelNotificationId(notificationId);
        WhiterManager.INSTANCE.startNotifyService(false);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
