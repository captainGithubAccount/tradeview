package com.smartfile.model.old.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.R;
import com.smartfile.model.old.change.SmartfileChangeUtils;

public class SmartfileNtFgHelper {

    public SmartfileNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", SmartfileChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(SmartfileManager.mContext, 711, intent, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(SmartfileManager.mContext, 712, intent1, SmartfileChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(SmartfileManager.mContext, 713, intent2, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(SmartfileManager.mContext, 714, intent3, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

