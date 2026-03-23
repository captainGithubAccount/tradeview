package com.download.model.old.opdj.nt;


import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.download.model.R;
import com.download.model.old.utils.DownloadFormatterSize;
import com.download.model.old.DownloadManager;
import com.download.model.old.change.DownloadChangeUtils;
import com.download.model.old.shownotificy.DownloadNtSendTryer;

import java.util.Random;

public class DownloadNtBuilder {

    public DownloadNtBuilder() {
    }

    public static DownloadNtInfo buildNotifiData(int index) {
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
                targetId = DownloadNtSendTryer.getPushNotifyId(1);
                notifyId = DownloadNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_clean_big);
                remoteViewsMini = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_clean_small);
                remoteViewsMid = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                DownloadChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = DownloadFormatterSize.formatFileSize(DownloadManager.mContext, randomNumber);
                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(DownloadManager.mContext, 210011, intent, DownloadChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = DownloadNtSendTryer.getPushNotifyId(2);
                notifyId = DownloadNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_process_big);
                remoteViewsMini = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_process_small);
                remoteViewsMid = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_process_small);

                remoteViewsBig.setTextViewText(R.id.content, DownloadChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, DownloadChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, DownloadChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(DownloadManager.mContext, 210012, intent2, DownloadChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = DownloadManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = DownloadNtSendTryer.getPushNotifyId(3);
                notifyId = DownloadNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_battery_big);

                Random random3 = new Random();
                int randomNumber3 = random3.nextInt(31) + 20;

                Random random4 = new Random();
                int randomNumber4 = random4.nextInt(31);

                remoteViewsBig.setTextViewText(R.id.tvPower, randomNumber4 + "%");
//                if (status != 2 && status != 5) {
//                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
//                } else {
//                    long startChargeTime = DownloadSPUtils.getLong("s_start_charge", -1L);
//                    if (startChargeTime > 0L) {
//                        long chargeTime = System.currentTimeMillis() - startChargeTime;
//                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
//                    } else {
//                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
//                    }
//                }

                remoteViewsBig.setTextViewText(R.id.changeDua, String.valueOf(randomNumber3));

                remoteViewsMini = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_battery_small);
                remoteViewsMid = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, DownloadChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, DownloadChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, DownloadChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(DownloadManager.mContext, 210013, intent3, DownloadChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = DownloadNtSendTryer.getPushNotifyId(4);
                notifyId = DownloadNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_device_big);
                remoteViewsMini = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_device_small);

                remoteViewsMid = new RemoteViews(DownloadManager.mContext.getPackageName(), R.layout.download_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(DownloadManager.mainProcessName, DownloadChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(DownloadChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(DownloadManager.mContext, 210014, intent4, DownloadChangeUtils.INSTANCE.getNotifyFlag());
        }

        DownloadNtInfo mNotifiData = new DownloadNtInfo();
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
