package com.tfseptember.clemodel.orgyy.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.change.HotelHousejChangeUtils;

public class SimplyLoudspeakergNtFgHelper {

    public SimplyLoudspeakergNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        PendingIntent cleanIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 711, intent, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 712, intent1, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 713, intent2, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 714, intent3, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

