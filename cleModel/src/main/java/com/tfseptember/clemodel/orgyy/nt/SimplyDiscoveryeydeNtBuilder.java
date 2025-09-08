package com.tfseptember.clemodel.orgyy.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.change.HotelHousejChangeUtils;
import com.tfseptember.clemodel.shownotificy.SimplyDiscoveryeydNtSendTryer;
import com.tfseptember.clemodel.utils.SimplyFloorSPUtils;

public class SimplyDiscoveryeydeNtBuilder {

    public SimplyDiscoveryeydeNtBuilder() {
    }

    public static SimplyOfficeqvqhcNtInfo buildNotifiData(int index) {
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
                targetId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(1);
                notifyId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_clean_big);
                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_clean_small);
                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_clean_small);
                Intent intent = new Intent();

                intent.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "clean");

                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210011, intent, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(2);
                notifyId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_process_big);

                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_process_small);

                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_process_small);

                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210012, intent2, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = SimplyHouseworkrOrgManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(3);
                notifyId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = SimplyFloorSPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_battery_small);
                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_battery_small);

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210013, intent3, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(4);
                notifyId = SimplyDiscoveryeydNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_device_big);
                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_device_small);

                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, HotelHousejChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(HotelHousejChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210014, intent4, HotelHousejChangeUtils.INSTANCE.getNotifyFlag());
        }

        SimplyOfficeqvqhcNtInfo mNotifiData = new SimplyOfficeqvqhcNtInfo();
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
