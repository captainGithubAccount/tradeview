package com.download.model.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.download.model.old.DownloadManager;
import com.download.model.old.shownotificy.DownloadNtTransfer;
import com.download.model.old.use.DownloadNotiTimesHelper;
import com.download.model.old.utils.DownloadSPUtils;

public class DownloadReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public DownloadReceiveRegister() {
    }

    public static void startMonitor() {
        if (isMonitored) {
        } else {
            isMonitored = true;
            IntentFilter manualFilter = new IntentFilter();
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            manualFilter.addAction("android.intent.action.SCREEN_ON");
            manualFilter.addAction("android.intent.action.SCREEN_OFF");
            manualFilter.addAction("android.intent.action.USER_PRESENT");
            manualFilter.addAction("android.intent.action.BATTERY_CHANGED");
            manualFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED"); // 充电
            manualFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED"); // 充电断开
            if (VERSION.SDK_INT >= 33) {
                assert DownloadManager.mContext != null;
                DownloadManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert DownloadManager.mContext != null;
                DownloadManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            DownloadManager.mContext.registerReceiver(new DownloadStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                DownloadManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                DownloadManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
            }
        }
    }

    static class ManualActionReceiver extends BroadcastReceiver {
        ManualActionReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {

            } else {
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        DownloadReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        DownloadReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 20){
                            DownloadNtTransfer.onBatteryChangeEvent(DownloadNotiTimesHelper.Event.BATTERY_LOW);
                        }else{
                            DownloadNtTransfer.onBatteryChangeEvent(DownloadNotiTimesHelper.Event.NONE);
                        }

                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        DownloadNtTransfer.onScreenOnEvent(DownloadNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        DownloadNtTransfer.onScreenLockOnEvent(DownloadNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        DownloadNtTransfer.onScreenOffEvent(DownloadNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        DownloadSPUtils.putLong("s_start_charge", System.currentTimeMillis());


                        DownloadReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        DownloadReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 75){
                            DownloadNtTransfer.onPowerConnected(DownloadNotiTimesHelper.Event.POWER_CHARGE);
                        }else{
                            DownloadNtTransfer.onPowerConnected(DownloadNotiTimesHelper.Event.NONE);
                        }


                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        DownloadSPUtils.remove("s_start_charge");

                        DownloadReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        DownloadReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent > 95){
                            DownloadNtTransfer.onPowerDisConnected(DownloadNotiTimesHelper.Event.POWER_DISCHARGE);
                        }else{
                            DownloadNtTransfer.onPowerDisConnected(DownloadNotiTimesHelper.Event.NONE);
                        }


                    }
                } catch (Exception var29) {
                    Exception e = var29;
                    e.printStackTrace();
                }
            }
        }
    }

    static class HomeActionReceiver extends BroadcastReceiver {
        HomeActionReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    String reason = intent.getStringExtra("reason");
                    if (reason != null) {
                        boolean isRecent = reason.contains("recent");
                        DownloadManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                DownloadNtTransfer.onHomeKeyPressEvent(isRecent, DownloadNotiTimesHelper.Event.HOME_CLICK);
                            } catch (Exception var2) {
                                Exception e = var2;
                                e.printStackTrace();
                            }

                        }, 800L);
                    }
                } catch (Exception var20) {
                    Exception e = var20;
                    e.printStackTrace();
                }
            }

        }
    }
}

