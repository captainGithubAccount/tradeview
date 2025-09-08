package com.location.notimodel.orgyy.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.location.notimodel.BlueTenOrgManager;

public class BlueTenNtCancelFgService extends Service {

    public BlueTenNtCancelFgService() {
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
        BlueTenNtUtils.cancelNotificationId(notificationId);
        BlueTenOrgManager.INSTANCE.startNotifyService(false);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
