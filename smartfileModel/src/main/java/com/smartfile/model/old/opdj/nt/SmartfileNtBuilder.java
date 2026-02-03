package com.smartfile.model.old.opdj.nt;


import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.smartfile.model.R;
import com.smartfile.model.old.utils.SmartfileFormatterSize;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.change.SmartfileChangeUtils;
import com.smartfile.model.old.shownotificy.SmartfileNtSendTryer;

import java.util.Random;

public class SmartfileNtBuilder {

    public SmartfileNtBuilder() {
    }

    public static SmartfileNtInfo buildNotifiData(int index) {
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
                targetId = SmartfileNtSendTryer.getPushNotifyId(1);
                notifyId = SmartfileNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_clean_big);
                remoteViewsMini = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_clean_small);
                remoteViewsMid = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                SmartfileChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = SmartfileFormatterSize.formatFileSize(SmartfileManager.mContext, randomNumber);
                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(SmartfileManager.mContext, 210011, intent, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = SmartfileNtSendTryer.getPushNotifyId(2);
                notifyId = SmartfileNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_process_big);
                remoteViewsMini = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_process_small);
                remoteViewsMid = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_process_small);

                remoteViewsBig.setTextViewText(R.id.content, SmartfileChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, SmartfileChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, SmartfileChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(SmartfileManager.mContext, 210012, intent2, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = SmartfileManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = SmartfileNtSendTryer.getPushNotifyId(3);
                notifyId = SmartfileNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_battery_big);

                Random random3 = new Random();
                int randomNumber3 = random3.nextInt(31) + 20;

                Random random4 = new Random();
                int randomNumber4 = random4.nextInt(31);

                remoteViewsBig.setTextViewText(R.id.tvPower, randomNumber4 + "%");
//                if (status != 2 && status != 5) {
//                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
//                } else {
//                    long startChargeTime = SmartfileSPUtils.getLong("s_start_charge", -1L);
//                    if (startChargeTime > 0L) {
//                        long chargeTime = System.currentTimeMillis() - startChargeTime;
//                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
//                    } else {
//                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
//                    }
//                }

                remoteViewsBig.setTextViewText(R.id.changeDua, String.valueOf(randomNumber3));

                remoteViewsMini = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_battery_small);
                remoteViewsMid = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, SmartfileChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, SmartfileChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, SmartfileChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(SmartfileManager.mContext, 210013, intent3, SmartfileChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = SmartfileNtSendTryer.getPushNotifyId(4);
                notifyId = SmartfileNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_device_big);
                remoteViewsMini = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_device_small);

                remoteViewsMid = new RemoteViews(SmartfileManager.mContext.getPackageName(), R.layout.smartfile_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(SmartfileManager.mainProcessName, SmartfileChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(SmartfileChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(SmartfileManager.mContext, 210014, intent4, SmartfileChangeUtils.INSTANCE.getNotifyFlag());
        }

        SmartfileNtInfo mNotifiData = new SmartfileNtInfo();
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
