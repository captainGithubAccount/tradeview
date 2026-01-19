package com.tidy.file.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.tidy.file.old.TidyManager;
import com.tidy.file.old.shownotificy.TidyNtTransfer;
import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.tidy.file.old.utils.TidySPUtils;

public class TidyReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public TidyReceiveRegister() {
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
                assert TidyManager.mContext != null;
                TidyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert TidyManager.mContext != null;
                TidyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            TidyManager.mContext.registerReceiver(new TidyStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                TidyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                TidyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        TidyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        TidyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 20){
                            TidyNtTransfer.onBatteryChangeEvent(TidyNotiTimesHelper.Event.BATTERY_LOW);
                        }else{
                            TidyNtTransfer.onBatteryChangeEvent(TidyNotiTimesHelper.Event.NONE);
                        }

                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        TidyNtTransfer.onScreenOnEvent(TidyNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        TidyNtTransfer.onScreenLockOnEvent(TidyNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        TidyNtTransfer.onScreenOffEvent(TidyNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        TidySPUtils.putLong("s_start_charge", System.currentTimeMillis());


                        TidyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        TidyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 75){
                            TidyNtTransfer.onPowerConnected(TidyNotiTimesHelper.Event.POWER_CHARGE);
                        }else{
                            TidyNtTransfer.onPowerConnected(TidyNotiTimesHelper.Event.NONE);
                        }


                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        TidySPUtils.remove("s_start_charge");

                        TidyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        TidyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent > 95){
                            TidyNtTransfer.onPowerDisConnected(TidyNotiTimesHelper.Event.POWER_DISCHARGE);
                        }else{
                            TidyNtTransfer.onPowerDisConnected(TidyNotiTimesHelper.Event.NONE);
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
                        TidyManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                TidyNtTransfer.onHomeKeyPressEvent(isRecent, TidyNotiTimesHelper.Event.HOME_CLICK);
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

