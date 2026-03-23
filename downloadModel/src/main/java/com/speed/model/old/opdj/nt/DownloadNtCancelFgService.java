package com.download.model.old.opdj.nt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.download.model.old.DownloadManager;
import com.download.model.old.use.DownloadActionConstant;

public class DownloadNtCancelFgService extends Service {

    public DownloadNtCancelFgService() {
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
        DownloadNtUtils.cancelNotificationId(notificationId);
        DownloadManager.INSTANCE.startNotifyService(false, DownloadActionConstant.everytime_show_notify);
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }
}
