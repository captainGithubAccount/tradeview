package com.location.notimodel.orgyy.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.location.notimodel.BlueTenOrgManager;
import com.location.notimodel.R;
import com.location.notimodel.change.BlueTenChangeUtils;
import com.location.notimodel.shownotificy.BlueTenNtSendTryer;
import com.location.notimodel.utils.BlueTenSPUtils;

public class BlueTenNtBuilder {

    public BlueTenNtBuilder() {
    }

    public static BlueTenNtInfo buildNotifiData(int index) {
        String typeName = "";
        int targetId = 0;
        int notifyId = 0;

        RemoteViews remoteViewsBig = null;
        RemoteViews remoteViewsMini = null;
        RemoteViews remoteViewsMid = null;
        PendingIntent pendingIntent = null;
        switch (index) {
            case 0:
                typeName = "clean";
                targetId = BlueTenNtSendTryer.getPushNotifyId(1);
                notifyId = BlueTenNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_clean_big);
                remoteViewsMini = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_clean_small);
                remoteViewsMid = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_clean_small);
                Intent intent = new Intent();

                intent.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "clean");

                pendingIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 210011, intent, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = BlueTenNtSendTryer.getPushNotifyId(2);
                notifyId = BlueTenNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_process_big);

                remoteViewsMini = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_process_small);

                remoteViewsMid = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_process_small);

                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 210012, intent2, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = BlueTenOrgManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = BlueTenNtSendTryer.getPushNotifyId(3);
                notifyId = BlueTenNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = BlueTenSPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_battery_small);
                remoteViewsMid = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_battery_small);

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 210013, intent3, BlueTenChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = BlueTenNtSendTryer.getPushNotifyId(4);
                notifyId = BlueTenNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_device_big);
                remoteViewsMini = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_device_small);

                remoteViewsMid = new RemoteViews(BlueTenOrgManager.mContext.getPackageName(), R.layout.blueten_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(BlueTenOrgManager.mainProcessName, BlueTenChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(BlueTenChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(BlueTenOrgManager.mContext, 210014, intent4, BlueTenChangeUtils.INSTANCE.getNotifyFlag());
        }

        BlueTenNtInfo mNotifiData = new BlueTenNtInfo();
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
