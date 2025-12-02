package com.smartfile.model.opdj.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.R;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.shownotificy.SmartFileNtSendTryer;
import com.smartfile.model.utils.SmartFileFormatterSize;
import com.smartfile.model.utils.SmartFileSPUtils;

import java.util.Random;

public class SmartFileNtBuilder {

    public SmartFileNtBuilder() {
    }

    public static SmartFileNtInfo buildNotifiData(int index) {
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
                targetId = SmartFileNtSendTryer.getPushNotifyId(1);
                notifyId = SmartFileNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_clean_big);
                remoteViewsMini = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_clean_small);
                remoteViewsMid = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                SmartFileChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = SmartFileFormatterSize.formatFileSize(SmartFileManager.mContext, randomNumber);
                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(SmartFileManager.mContext, 210011, intent, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = SmartFileNtSendTryer.getPushNotifyId(2);
                notifyId = SmartFileNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_process_big);
                remoteViewsMini = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_process_small);
                remoteViewsMid = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_process_small);

                remoteViewsBig.setTextViewText(R.id.content, SmartFileChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, SmartFileChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, SmartFileChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(SmartFileManager.mContext, 210012, intent2, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = SmartFileManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = SmartFileNtSendTryer.getPushNotifyId(3);
                notifyId = SmartFileNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = SmartFileSPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_battery_small);
                remoteViewsMid = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, SmartFileChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, SmartFileChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, SmartFileChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(SmartFileManager.mContext, 210013, intent3, SmartFileChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = SmartFileNtSendTryer.getPushNotifyId(4);
                notifyId = SmartFileNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_device_big);
                remoteViewsMini = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_device_small);

                remoteViewsMid = new RemoteViews(SmartFileManager.mContext.getPackageName(), R.layout.smartfile_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(SmartFileManager.mainProcessName, SmartFileChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(SmartFileChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(SmartFileManager.mContext, 210014, intent4, SmartFileChangeUtils.INSTANCE.getNotifyFlag());
        }

        SmartFileNtInfo mNotifiData = new SmartFileNtInfo();
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
