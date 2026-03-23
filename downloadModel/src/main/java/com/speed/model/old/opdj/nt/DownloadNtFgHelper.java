package com.download.model.old.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.download.model.old.DownloadManager;
import com.download.model.R;
import com.download.model.old.change.DownloadChangeUtils;

public class DownloadNtFgHelper {

    public DownloadNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", DownloadChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(DownloadManager.mContext, 711, intent, DownloadChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(DownloadManager.mContext, 712, intent1, DownloadChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(DownloadManager.mContext, 713, intent2, DownloadChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(DownloadManager.mContext, 714, intent3, DownloadChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

