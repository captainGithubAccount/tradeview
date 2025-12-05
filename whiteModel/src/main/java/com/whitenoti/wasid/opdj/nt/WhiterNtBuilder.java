package com.whitenoti.wasid.opdj.nt;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.RemoteViews;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.R;
import com.whitenoti.wasid.change.WhiterChangeUtils;
import com.whitenoti.wasid.shownotificy.WhiterNtSendTryer;
import com.whitenoti.wasid.utils.WhiterFormatterSize;
import com.whitenoti.wasid.utils.WhiterSPUtils;

import java.util.Random;

public class WhiterNtBuilder {

    public WhiterNtBuilder() {
    }

    public static WhiterNtInfo buildNotifiData(int index) {
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
                targetId = WhiterNtSendTryer.getPushNotifyId(1);
                notifyId = WhiterNtSendTryer.getPushNotifyId(1);
                remoteViewsBig = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_clean_big);
                remoteViewsMini = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_clean_small);
                remoteViewsMid = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_clean_small);

                Random random = new Random();
                int min = 200;
                int max = 600;
                // 生成 200-600 之间的随机数（包括 200 和 600）
                int number = random.nextInt(max - min + 1) + min;
                WhiterChangeUtils.INSTANCE.setCurrentRandomClean(number);
                long randomNumber = (number) * 1024 * 1024;
                String result = WhiterFormatterSize.formatFileSize(WhiterManager.mContext, randomNumber);
//                remoteViewsBig.setTextViewText(R.id.tvSize, result + " garbage,");
//                remoteViewsMini.setTextViewText(R.id.tvSize, result + " garbage,");
//                remoteViewsMid.setTextViewText(R.id.tvSize, result + " garbage,");


                Intent intent = new Intent();

                intent.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "clean");
                intent.putExtra("cleanSize", number);

                pendingIntent = PendingIntent.getActivity(WhiterManager.mContext, 210011, intent, WhiterChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 1:
                targetId = WhiterNtSendTryer.getPushNotifyId(2);
                notifyId = WhiterNtSendTryer.getPushNotifyId(2);

                typeName = "process";
                remoteViewsBig = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_process_big);
                remoteViewsMini = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_process_small);
                remoteViewsMid = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_process_small);

                remoteViewsBig.setTextViewText(R.id.content, WhiterChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMid.setTextViewText(R.id.content, WhiterChangeUtils.INSTANCE.getProcressContent());
                remoteViewsMini.setTextViewText(R.id.content, WhiterChangeUtils.INSTANCE.getProcressContent());


                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));

                intent2.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "process");
                pendingIntent = PendingIntent.getActivity(WhiterManager.mContext, 210012, intent2, WhiterChangeUtils.INSTANCE.getNotifyFlag());
                break;
            case 2:
                typeName = "battery";
                IntentFilter batterFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

                Intent batterIntent = WhiterManager.mContext.registerReceiver((BroadcastReceiver) null, batterFilter);
                int level = batterIntent.getIntExtra("level", 0);
                int status = batterIntent.getIntExtra("status", -1);

                targetId = WhiterNtSendTryer.getPushNotifyId(3);
                notifyId = WhiterNtSendTryer.getPushNotifyId(3);

                remoteViewsBig = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_battery_big);
                remoteViewsBig.setTextViewText(R.id.tvPower, level + "%");
                if (status != 2 && status != 5) {
                    remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                } else {
                    long startChargeTime = WhiterSPUtils.getLong("s_start_charge", -1L);
                    if (startChargeTime > 0L) {
                        long chargeTime = System.currentTimeMillis() - startChargeTime;
                        remoteViewsBig.setTextViewText(R.id.changeDua, formatTime(chargeTime));
                    } else {
                        remoteViewsBig.setTextViewText(R.id.changeDua, "unknow");
                    }
                }

                remoteViewsMini = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_battery_small);
                remoteViewsMid = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_battery_small);

                remoteViewsBig.setTextViewText(R.id.content, WhiterChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMid.setTextViewText(R.id.content, WhiterChangeUtils.INSTANCE.getBatteryContent());
                remoteViewsMini.setTextViewText(R.id.content, WhiterChangeUtils.INSTANCE.getBatteryContent());

                Intent intent3 = new Intent();

                intent3.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent3.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "battery");

                pendingIntent = PendingIntent.getActivity(WhiterManager.mContext, 210013, intent3, WhiterChangeUtils.INSTANCE.getNotifyFlag());

                break;
            case 3:

                targetId = WhiterNtSendTryer.getPushNotifyId(4);
                notifyId = WhiterNtSendTryer.getPushNotifyId(4);
                typeName = "device";

                remoteViewsBig = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_device_big);
                remoteViewsMini = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_device_small);

                remoteViewsMid = new RemoteViews(WhiterManager.mContext.getPackageName(), R.layout.whiter_device_small);
                Intent intent4 = new Intent();

                intent4.setComponent(new ComponentName(WhiterManager.mainProcessName, WhiterChangeUtils.INSTANCE.getLaunchActivityPath()));
                intent4.putExtra(WhiterChangeUtils.INSTANCE.getNoti_click_str(), "device");
                pendingIntent = PendingIntent.getActivity(WhiterManager.mContext, 210014, intent4, WhiterChangeUtils.INSTANCE.getNotifyFlag());
        }

        WhiterNtInfo mNotifiData = new WhiterNtInfo();
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
