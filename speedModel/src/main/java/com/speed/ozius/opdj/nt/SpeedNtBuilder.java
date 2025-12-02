package com.speed.ozius.opdj.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.RemoteViews;

import com.speed.ozius.SpeedManager;
import com.speed.ozius.R;
import com.speed.ozius.change.SpeedChangeUtils;
import com.speed.ozius.shownotificy.SpeedNtSendTryer;
import com.speed.ozius.utils.SpeedFormatterSize;
import com.speed.ozius.utils.SpeedSPUtils;

import java.util.Random;

public class SpeedNtBuilder {

    public SpeedNtBuilder() {
    }

    public static SpeedNtInfo buildNotifiData(int index) {
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
                targetId = SpeedNtSendTryer.getPushNotifyId(1);
                notifyId = SpeedNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_clean_big);
                remoteViewsMini = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_clean_small);
                remoteViewsMid = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                SpeedChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = SpeedFormatterSize.formatFileSize(SpeedManager.mContext, randomNumber);
                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(SpeedManager.mContext, 210011, intent, SpeedChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = SpeedNtSendTryer.getPushNotifyId(2);
                notifyId = SpeedNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_process_big);
                remoteViewsMini = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_process_small);
                remoteViewsMid = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_process_small);

                remoteViewsBig.setTextViewText(R.id.content, SpeedChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, SpeedChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, SpeedChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(SpeedManager.mContext, 210012, intent2, SpeedChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = SpeedManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = SpeedNtSendTryer.getPushNotifyId(3);
                notifyId = SpeedNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = SpeedSPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_battery_small);
                remoteViewsMid = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, SpeedChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, SpeedChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, SpeedChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(SpeedManager.mContext, 210013, intent3, SpeedChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = SpeedNtSendTryer.getPushNotifyId(4);
                notifyId = SpeedNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_device_big);
                remoteViewsMini = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_device_small);

                remoteViewsMid = new RemoteViews(SpeedManager.mContext.getPackageName(), R.layout.speed_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(SpeedManager.mainProcessName, SpeedChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(SpeedChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(SpeedManager.mContext, 210014, intent4, SpeedChangeUtils.INSTANCE.getNotifyFlag());
        }

        SpeedNtInfo mNotifiData = new SpeedNtInfo();
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
