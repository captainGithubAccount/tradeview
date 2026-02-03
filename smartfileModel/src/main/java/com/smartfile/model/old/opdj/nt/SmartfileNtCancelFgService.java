package com.smartfile.model.old.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.use.SmartfileActionConstant;

public class SmartfileNtCancelFgService extends Service {

    public SmartfileNtCancelFgService() {
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
        SmartfileNtUtils.cancelNotificationId(notificationId);
        SmartfileManager.INSTANCE.startNotifyService(false, SmartfileActionConstant.everytime_show_notify);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
