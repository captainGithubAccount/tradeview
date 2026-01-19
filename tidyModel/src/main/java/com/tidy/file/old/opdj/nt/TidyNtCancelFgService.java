package com.tidy.file.old.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.tidy.file.old.TidyManager;
import com.tidy.file.old.use.TidyActionConstant;

public class TidyNtCancelFgService extends Service {

    public TidyNtCancelFgService() {
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
        TidyNtUtils.cancelNotificationId(notificationId);
        TidyManager.INSTANCE.startNotifyService(false, TidyActionConstant.everytime_show_notify);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
