package com.smartfile.model.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.R;
import com.smartfile.model.change.SmartFileChangeUtils;

public class SmartFileNtFgHelper {

    public SmartFileNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", SmartFileChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(SmartFileManager.mContext, 711, intent, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(SmartFileManager.mContext, 712, intent1, SmartFileChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(SmartFileManager.mContext, 713, intent2, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(SmartFileManager.mContext, 714, intent3, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

