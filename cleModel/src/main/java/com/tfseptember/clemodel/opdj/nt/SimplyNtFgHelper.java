package com.tfseptember.clemodel.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.change.SimplyChangeUtils;

public class SimplyNtFgHelper {

    public SimplyNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", SimplyChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 711, intent, SimplyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 712, intent1, SimplyChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 713, intent2, SimplyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 714, intent3, SimplyChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

