package com.tidy.file.old.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.tidy.file.old.TidyManager;
import com.tidy.file.R;
import com.tidy.file.old.change.TidyChangeUtils;

public class TidyNtFgHelper {

    public TidyNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(TidyManager.mContext.getPackageName(), R.layout.tidy_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(TidyManager.mainProcessName, TidyChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(TidyChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", TidyChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(TidyManager.mContext, 711, intent, TidyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(TidyManager.mainProcessName, TidyChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(TidyChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(TidyManager.mContext, 712, intent1, TidyChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(TidyManager.mainProcessName, TidyChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(TidyChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(TidyManager.mContext, 713, intent2, TidyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(TidyManager.mainProcessName, TidyChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(TidyChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(TidyManager.mContext, 714, intent3, TidyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

