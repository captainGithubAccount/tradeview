package com.tidy.file.old.opdj.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.tidy.file.old.EasyManager;
import com.tidy.file.R;
import com.tidy.file.old.change.EasyChangeUtils;
import com.tidy.file.old.shownotificy.EasyNtSendTryer;
import com.tidy.file.old.utils.EasyFormatterSize;
import com.tidy.file.old.utils.EasySPUtils;

import java.util.Random;

public class EasyNtBuilder {

    public EasyNtBuilder() {
    }

    public static EasyNtInfo buildNotifiData(int index) {
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
                targetId = EasyNtSendTryer.getPushNotifyId(1);
                notifyId = EasyNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_clean_big);
                remoteViewsMini = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_clean_small);
                remoteViewsMid = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                EasyChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = EasyFormatterSize.formatFileSize(EasyManager.mContext, randomNumber);
                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(EasyManager.mContext, 210011, intent, EasyChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = EasyNtSendTryer.getPushNotifyId(2);
                notifyId = EasyNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_process_big);
                remoteViewsMini = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_process_small);
                remoteViewsMid = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_process_small);

                remoteViewsBig.setTextViewText(R.id.content, EasyChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, EasyChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, EasyChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(EasyManager.mContext, 210012, intent2, EasyChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = EasyManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = EasyNtSendTryer.getPushNotifyId(3);
                notifyId = EasyNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = EasySPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_battery_small);
                remoteViewsMid = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, EasyChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, EasyChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, EasyChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(EasyManager.mContext, 210013, intent3, EasyChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = EasyNtSendTryer.getPushNotifyId(4);
                notifyId = EasyNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_device_big);
                remoteViewsMini = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_device_small);

                remoteViewsMid = new RemoteViews(EasyManager.mContext.getPackageName(), R.layout.easy_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(EasyManager.mainProcessName, EasyChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(EasyChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(EasyManager.mContext, 210014, intent4, EasyChangeUtils.INSTANCE.getNotifyFlag());
        }

        EasyNtInfo mNotifiData = new EasyNtInfo();
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
