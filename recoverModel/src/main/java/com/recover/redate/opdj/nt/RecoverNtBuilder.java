package com.recover.redate.opdj.nt;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.widget.RemoteViews;

import com.recover.model.R;
import com.recover.redate.RecoverOrgManager;
import com.recover.redate.change.RecoverChangeUtils;
import com.recover.redate.shownotificy.RecoverNtSendTryer;

public class RecoverNtBuilder {

    public RecoverNtBuilder() {
    }

    public static RecoverNtInfo buildNotifiData(int index) {
        String typeName = "";
        int targetId = 0;
        int notifyId = 0;

        RemoteViews remoteViewsBig = null;
        RemoteViews remoteViewsMini = null;
        RemoteViews remoteViewsMid = null;
        PendingIntent pendingIntent = null;
        switch (index) {
            case 0:
                typeName = "photo";
                targetId = RecoverNtSendTryer.getPushNotifyId(1);
                notifyId = RecoverNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_photo_big);
                remoteViewsMini = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_photo_small);
                remoteViewsMid = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_photo_small);
                Intent intent = new Intent();

                intent.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "photo");

                pendingIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 210011, intent, RecoverChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = RecoverNtSendTryer.getPushNotifyId(2);
                notifyId = RecoverNtSendTryer.getPushNotifyId(2);

                typeName = "video";
                remoteViewsBig = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_video_big);

                remoteViewsMini = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_video_small);

                remoteViewsMid = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_video_small);

                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "video");
                pendingIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 210012, intent2, RecoverChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                targetId = RecoverNtSendTryer.getPushNotifyId(4);
                notifyId = RecoverNtSendTryer.getPushNotifyId(4);
                typeName = "file";

                remoteViewsBig = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_file_big);
                remoteViewsMini = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_file_small);

                remoteViewsMid = new RemoteViews(RecoverOrgManager.mContext.getPackageName(), R.layout.recover_file_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(RecoverOrgManager.mainProcessName, RecoverChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(RecoverChangeUtils.INSTANCE.getNoti_click_str(), "file");
                pendingIntent = PendingIntent.getActivity(RecoverOrgManager.mContext, 210014, intent4, RecoverChangeUtils.INSTANCE.getNotifyFlag());
        }

        RecoverNtInfo mNotifiData = new RecoverNtInfo();
        mNotifiData.setTargetId(targetId);
        mNotifiData.setNotId(notifyId);
        mNotifiData.setTypedName(typeName);
        mNotifiData.setRemoteBig(remoteViewsBig);
        mNotifiData.setRemoteSmall(remoteViewsMini);
        mNotifiData.setRemoteMid(remoteViewsMid);
        mNotifiData.setPendingIntent(pendingIntent);
        return mNotifiData;
    }

    public static String formatTime(long millis) {
        long hours;
        if (millis < 60000L) {
            hours = millis / 1000L;
            return hours + "s";
        } else {
            long minutes;
            if (millis < 3600000L) {
                hours = millis / 60000L;
                minutes = millis % 60000L / 1000L;
                return hours + "min " + minutes + "s";
            } else {
                hours = millis / 3600000L;
                minutes = millis % 3600000L / 60000L;
                return hours + "h " + minutes + "min";
            }
        }
    }
}
