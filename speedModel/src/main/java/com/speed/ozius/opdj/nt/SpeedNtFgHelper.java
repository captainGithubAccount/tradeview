package com.speed.ozius.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.speed.ozius.SpeedManager;
import com.speed.ozius.R;
import com.speed.ozius.change.SpeedChangeUtils;

public class SpeedNtFgHelper {

    public SpeedNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", SpeedChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(SpeedManager.mContext, 711, intent, SpeedChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(SpeedManager.mContext, 712, intent1, SpeedChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(SpeedManager.mContext, 713, intent2, SpeedChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(SpeedManager.mContext, 714, intent3, SpeedChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

