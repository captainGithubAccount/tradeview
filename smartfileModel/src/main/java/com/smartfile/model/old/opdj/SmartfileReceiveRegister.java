package com.smartfile.model.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.shownotificy.SmartfileNtTransfer;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;
import com.smartfile.model.old.utils.SmartfileSPUtils;

public class SmartfileReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public SmartfileReceiveRegister() {
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
                assert SmartfileManager.mContext != null;
                SmartfileManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SmartfileManager.mContext != null;
                SmartfileManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            SmartfileManager.mContext.registerReceiver(new SmartfileStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                SmartfileManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                SmartfileManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        SmartfileReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SmartfileReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 20){
                            SmartfileNtTransfer.onBatteryChangeEvent(SmartfileNotiTimesHelper.Event.BATTERY_LOW);
                        }else{
                            SmartfileNtTransfer.onBatteryChangeEvent(SmartfileNotiTimesHelper.Event.NONE);
                        }

                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SmartfileNtTransfer.onScreenOnEvent(SmartfileNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SmartfileNtTransfer.onScreenLockOnEvent(SmartfileNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SmartfileNtTransfer.onScreenOffEvent(SmartfileNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SmartfileSPUtils.putLong("s_start_charge", System.currentTimeMillis());


                        SmartfileReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SmartfileReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 75){
                            SmartfileNtTransfer.onPowerConnected(SmartfileNotiTimesHelper.Event.POWER_CHARGE);
                        }else{
                            SmartfileNtTransfer.onPowerConnected(SmartfileNotiTimesHelper.Event.NONE);
                        }


                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SmartfileSPUtils.remove("s_start_charge");

                        SmartfileReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SmartfileReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent > 95){
                            SmartfileNtTransfer.onPowerDisConnected(SmartfileNotiTimesHelper.Event.POWER_DISCHARGE);
                        }else{
                            SmartfileNtTransfer.onPowerDisConnected(SmartfileNotiTimesHelper.Event.NONE);
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
                        SmartfileManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SmartfileNtTransfer.onHomeKeyPressEvent(isRecent, SmartfileNotiTimesHelper.Event.HOME_CLICK);
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

