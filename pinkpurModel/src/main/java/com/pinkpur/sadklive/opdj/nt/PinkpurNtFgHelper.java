package com.pinkpur.sadklive.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.R;
import com.pinkpur.sadklive.change.PinkpurChangeUtils;

public class PinkpurNtFgHelper {

    public PinkpurNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(PinkpurManager.mContext.getPackageName(), R.layout.pinkpur_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(PinkpurManager.mainProcessName, PinkpurChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(PinkpurChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", PinkpurChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(PinkpurManager.mContext, 711, intent, PinkpurChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(PinkpurManager.mainProcessName, PinkpurChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(PinkpurChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(PinkpurManager.mContext, 712, intent1, PinkpurChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(PinkpurManager.mainProcessName, PinkpurChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(PinkpurChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(PinkpurManager.mContext, 713, intent2, PinkpurChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(PinkpurManager.mainProcessName, PinkpurChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(PinkpurChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(PinkpurManager.mContext, 714, intent3, PinkpurChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

