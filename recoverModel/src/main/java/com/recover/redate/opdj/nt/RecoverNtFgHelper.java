package com.recover.redate.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.recover.redate.RecoverManager;
import com.recover.redate.R;
import com.recover.redate.change.RecoverChangeUtils;

public class RecoverNtFgHelper {

    public RecoverNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(RecoverManager.mContext.getPackageName(), R.layout.recover_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(RecoverManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        intent.putExtra("cleanSize", RecoverChangeUtils.INSTANCE.getCurrentRandomClean());
        PendingIntent cleanIntent = PendingIntent.getActivity(RecoverManager.mContext, 711, intent, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(RecoverManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "process");
        PendingIntent processIntent = PendingIntent.getActivity(RecoverManager.mContext, 712, intent1, RecoverChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.processLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(RecoverManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "battery");
        PendingIntent batteryIntent = PendingIntent.getActivity(RecoverManager.mContext, 713, intent2, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.batteryLayout, batteryIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(RecoverManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "device");
        PendingIntent deviceIntent = PendingIntent.getActivity(RecoverManager.mContext, 714, intent3, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.deviceLayout, deviceIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

