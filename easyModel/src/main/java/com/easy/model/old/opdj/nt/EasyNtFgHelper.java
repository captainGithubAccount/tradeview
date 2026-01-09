package com.easy.model.old.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.easy.model.old.EasyManager;
import com.easy.model.R;
import com.easy.model.old.change.EasyChangeUtils;

public class EasyNtFgHelper {

    public EasyNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", EasyChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(EasyManager.mContext, 711, intent, EasyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(EasyManager.mContext, 712, intent1, EasyChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(EasyManager.mContext, 713, intent2, EasyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(EasyManager.mContext, 714, intent3, EasyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

