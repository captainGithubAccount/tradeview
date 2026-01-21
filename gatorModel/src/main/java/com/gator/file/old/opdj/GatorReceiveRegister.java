package com.gator.file.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.gator.file.old.GatorManager;
import com.gator.file.old.shownotificy.GatorNtTransfer;
import com.gator.file.old.use.GatorNotiTimesHelper;
import com.gator.file.old.utils.GatorSPUtils;

public class GatorReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public GatorReceiveRegister() {
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
                assert GatorManager.mContext != null;
                GatorManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert GatorManager.mContext != null;
                GatorManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            GatorManager.mContext.registerReceiver(new GatorStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                GatorManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                GatorManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        GatorReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        GatorReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 20){
                            GatorNtTransfer.onBatteryChangeEvent(GatorNotiTimesHelper.Event.BATTERY_LOW);
                        }else{
                            GatorNtTransfer.onBatteryChangeEvent(GatorNotiTimesHelper.Event.NONE);
                        }

                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        GatorNtTransfer.onScreenOnEvent(GatorNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        GatorNtTransfer.onScreenLockOnEvent(GatorNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        GatorNtTransfer.onScreenOffEvent(GatorNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        GatorSPUtils.putLong("s_start_charge", System.currentTimeMillis());


                        GatorReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        GatorReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 75){
                            GatorNtTransfer.onPowerConnected(GatorNotiTimesHelper.Event.POWER_CHARGE);
                        }else{
                            GatorNtTransfer.onPowerConnected(GatorNotiTimesHelper.Event.NONE);
                        }


                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        GatorSPUtils.remove("s_start_charge");

                        GatorReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        GatorReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent > 95){
                            GatorNtTransfer.onPowerDisConnected(GatorNotiTimesHelper.Event.POWER_DISCHARGE);
                        }else{
                            GatorNtTransfer.onPowerDisConnected(GatorNotiTimesHelper.Event.NONE);
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
                        GatorManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                GatorNtTransfer.onHomeKeyPressEvent(isRecent, GatorNotiTimesHelper.Event.HOME_CLICK);
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

