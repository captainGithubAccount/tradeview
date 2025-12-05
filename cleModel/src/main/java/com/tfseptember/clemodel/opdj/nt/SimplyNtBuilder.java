package com.tfseptember.clemodel.opdj.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;
import com.tfseptember.clemodel.change.SimplyChangeUtils;
import com.tfseptember.clemodel.shownotificy.SimplyNtSendTryer;
import com.tfseptember.clemodel.utils.SimplyFormatterSize;
import com.tfseptember.clemodel.utils.SimplySPUtils;

import java.util.Random;

public class SimplyNtBuilder {

    public SimplyNtBuilder() {
    }

    public static SimplyNtInfo buildNotifiData(int index) {
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
                targetId = SimplyNtSendTryer.getPushNotifyId(1);
                notifyId = SimplyNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_clean_big);
                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_clean_small);
                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                SimplyChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = SimplyFormatterSize.formatFileSize(SimplyHouseworkrOrgManager.mContext, randomNumber);
//                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
//                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
//                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210011, intent, SimplyChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = SimplyNtSendTryer.getPushNotifyId(2);
                notifyId = SimplyNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_process_big);
                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_process_small);
                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_process_small);

                remoteViewsBig.setTextViewText(R.id.content, SimplyChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, SimplyChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, SimplyChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210012, intent2, SimplyChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = SimplyHouseworkrOrgManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = SimplyNtSendTryer.getPushNotifyId(3);
                notifyId = SimplyNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = SimplySPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_battery_small);
                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, SimplyChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, SimplyChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, SimplyChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210013, intent3, SimplyChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = SimplyNtSendTryer.getPushNotifyId(4);
                notifyId = SimplyNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_device_big);
                remoteViewsMini = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_device_small);

                remoteViewsMid = new RemoteViews(SimplyHouseworkrOrgManager.mContext.getPackageName(), R.layout.simply_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(SimplyHouseworkrOrgManager.mainProcessName, SimplyChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(SimplyChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(SimplyHouseworkrOrgManager.mContext, 210014, intent4, SimplyChangeUtils.INSTANCE.getNotifyFlag());
        }

        SimplyNtInfo mNotifiData = new SimplyNtInfo();
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
