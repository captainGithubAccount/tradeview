package com.download.model.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.download.model.old.opdj.nt.DownloadNtFgService;
import com.download.model.old.opdj.nt.DownloadNtUtils;
import com.download.model.old.DownloadManager;
import com.download.model.old.shownotificy.DownloadNtTransfer;
import com.download.model.old.use.DownloadActionConstant;
import com.download.model.old.use.DownloadNotiTimesHelper;

public class DownloadClockService extends Service {

    public DownloadClockService() {
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        DownloadNtTransfer.onTimeTickUpEvent(DownloadNotiTimesHelper.Event.ALARM);
        DownloadClockManager.startAlarm(this.getApplication());
        DownloadManager.INSTANCE.startTwoService();
        if (!DownloadNtFgService.getIsShowing()) {
            if (VERSION.SDK_INT >= 33) {
                if (!DownloadNtUtils.isOngoingServiceRunning(DownloadNtFgService.class)) {
                    DownloadManager.INSTANCE.startNotifyService(false, DownloadActionConstant.clock);
                }
            } else if (DownloadNtUtils.isNotificationEnabled() && !DownloadNtUtils.isOngoingServiceRunning(DownloadNtFgService.class)) {
                DownloadManager.INSTANCE.startNotifyService(false, DownloadActionConstant.clock);
            }
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }
}
