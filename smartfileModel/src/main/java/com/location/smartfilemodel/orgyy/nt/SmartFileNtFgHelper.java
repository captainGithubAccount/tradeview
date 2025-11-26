package com.location.smartfilemodel.orgyy.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.R;
import com.location.smartfilemodel.change.SmartFileChangeUtils;

public class SmartFileNtFgHelper {

    public SmartFileNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(SmartFileOrgManager.mContext.getPackageName(), R.layout.smartfile_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(SmartFileOrgManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        PendingIntent cleanIntent = PendingIntent.getActivity(SmartFileOrgManager.mContext, 711, intent, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(SmartFileOrgManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(SmartFileOrgManager.mContext, 712, intent1, SmartFileChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(SmartFileOrgManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(SmartFileOrgManager.mContext, 713, intent2, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(SmartFileOrgManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(SmartFileOrgManager.mContext, 714, intent3, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

