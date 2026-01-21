package com.gator.file.old.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.gator.file.old.GatorManager;
import com.gator.file.R;
import com.gator.file.old.change.GatorChangeUtils;

public class GatorNtFgHelper {

    public GatorNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", GatorChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(GatorManager.mContext, 711, intent, GatorChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(GatorManager.mContext, 712, intent1, GatorChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(GatorManager.mContext, 713, intent2, GatorChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(GatorManager.mContext, 714, intent3, GatorChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

