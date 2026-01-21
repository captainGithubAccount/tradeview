package com.gator.file.old.opdj.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.gator.file.old.utils.GatorFormatterSize;
import com.gator.file.old.GatorManager;
import com.gator.file.R;
import com.gator.file.old.change.GatorChangeUtils;
import com.gator.file.old.shownotificy.GatorNtSendTryer;

import java.util.Random;

public class GatorNtBuilder {

    public GatorNtBuilder() {
    }

    public static GatorNtInfo buildNotifiData(int index) {
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
                targetId = GatorNtSendTryer.getPushNotifyId(1);
                notifyId = GatorNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_clean_big);
                remoteViewsMini = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_clean_small);
                remoteViewsMid = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                GatorChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = GatorFormatterSize.formatFileSize(GatorManager.mContext, randomNumber);
//                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
//                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
//                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(GatorManager.mContext, 210011, intent, GatorChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = GatorNtSendTryer.getPushNotifyId(2);
                notifyId = GatorNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_process_big);
                remoteViewsMini = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_process_small);
                remoteViewsMid = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_process_small);

                remoteViewsBig.setTextViewText(R.id.content, GatorChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, GatorChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, GatorChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(GatorManager.mContext, 210012, intent2, GatorChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = GatorManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = GatorNtSendTryer.getPushNotifyId(3);
                notifyId = GatorNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_battery_big);

                Random random3 = new Random();
                int randomNumber3 = random3.nextInt(31) + 20;

                Random random4 = new Random();
                int randomNumber4 = random4.nextInt(31);

                remoteViewsBig.setTextViewText(R.id.tvPower, randomNumber4 + "%");
//                if (status != 2 && status != 5) {
//                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
//                } else {
//                    long startChargeTime = GatorSPUtils.getLong("s_start_charge", -1L);
//                    if (startChargeTime > 0L) {
//                        long chargeTime = System.currentTimeMillis() - startChargeTime;
//                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
//                    } else {
//                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
//                    }
//                }

                remoteViewsBig.setTextViewText(R.id.changeDua, String.valueOf(randomNumber3));

                remoteViewsMini = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_battery_small);
                remoteViewsMid = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, GatorChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, GatorChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, GatorChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(GatorManager.mContext, 210013, intent3, GatorChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = GatorNtSendTryer.getPushNotifyId(4);
                notifyId = GatorNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_device_big);
                remoteViewsMini = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_device_small);

                remoteViewsMid = new RemoteViews(GatorManager.mContext.getPackageName(), R.layout.gator_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(GatorManager.mainProcessName, GatorChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(GatorChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(GatorManager.mContext, 210014, intent4, GatorChangeUtils.INSTANCE.getNotifyFlag());
        }

        GatorNtInfo mNotifiData = new GatorNtInfo();
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
