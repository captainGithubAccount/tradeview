package com.whitenoti.wasid.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.R;
import com.whitenoti.wasid.change.WhiterChangeUtils;

public class WhiterNtFgHelper {

    public WhiterNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", WhiterChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(WhiterManager.mContext, 711, intent, WhiterChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(WhiterManager.mContext, 712, intent1, WhiterChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(WhiterManager.mContext, 713, intent2, WhiterChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(WhiterManager.mContext, 714, intent3, WhiterChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

