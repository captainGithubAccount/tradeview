package com.gator.file.old.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.gator.file.old.GatorManager;
import com.gator.file.old.use.GatorActionConstant;

public class GatorNtCancelFgService extends Service {

    public GatorNtCancelFgService() {
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
        GatorNtUtils.cancelNotificationId(notificationId);
        GatorManager.INSTANCE.startNotifyService(false, GatorActionConstant.everytime_show_notify);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
