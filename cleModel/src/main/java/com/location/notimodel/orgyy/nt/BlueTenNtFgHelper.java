package com.location.notimodel.orgyy.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.location.notimodel.BlueTenOrgManager;
import com.location.notimodel.R;
import com.location.notimodel.change.BlueTenChangeUtils;

public class BlueTenNtFgHelper {

    public BlueTenNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        PendingIntent cleanIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 711, intent, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 712, intent1, BlueTenChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 713, intent2, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 714, intent3, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

