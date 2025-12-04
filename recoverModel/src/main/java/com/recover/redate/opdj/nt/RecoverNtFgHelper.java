package com.recover.redate.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.recover.model.R;
import com.recover.redate.RecoverOrgManager;
import com.recover.redate.change.RecoverChangeUtils;

public class RecoverNtFgHelper {

    public RecoverNtFgHelper() {
    }

    public static RemoteViews ongoingRemoteView() {
        RemoteViews remoteViews = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_ntfg);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "photo");
        PendingIntent cleanIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 711, intent, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.photoLayout, cleanIntent);
        Intent intent1 = new Intent();
        intent1.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));

        intent1.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "video");
        PendingIntent processIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 712, intent1, RecoverChangeUtils.INSTANCE.getNotifyFlag());

        remoteViews.setOnClickPendingIntent(R.id.videoLayout, processIntent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent2.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "file");
        PendingIntent batteryIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 713, intent2, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.fileLayout, batteryIntent);

        /*remoteViews.setOnClickPendingIntent(R.id.cleanLayout, processIntent);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent3.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "clean");
        PendingIntent clean2Intent = PendingIntent.getActivity(RecoverOrgManager.mContext, 714, intent3, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.cleanLayout, clean2Intent);


        remoteViews.setOnClickPendingIntent(R.id.dupliLayout, processIntent);
        Intent intent4 = new Intent();
        intent4.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent4.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "dulpi");
        PendingIntent dulpiIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 715, intent4, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.dupliLayout, dulpiIntent);*/


        remoteViews.setOnClickPendingIntent(R.id.compressLayout, processIntent);
        Intent intent5 = new Intent();
        intent5.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
        intent5.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "compress");
        PendingIntent compressIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 716, intent5, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        remoteViews.setOnClickPendingIntent(R.id.compressLayout, compressIntent);
        return remoteViews;
    }

    public static RemoteViews ongoingRemoteViewBig() {
        return ongoingRemoteView();
    }
}

