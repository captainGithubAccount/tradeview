package com.easy.model.old.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.easy.model.old.EasyManager;
import com.easy.model.old.shownotificy.EasyNtTransfer;
import com.easy.model.old.use.EasyNotiTimesHelper;
import com.easy.model.old.utils.EasySPUtils;

public class EasyReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public EasyReceiveRegister() {
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
                assert EasyManager.mContext != null;
                EasyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert EasyManager.mContext != null;
                EasyManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            EasyManager.mContext.registerReceiver(new EasyStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                EasyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                EasyManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        EasyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        EasyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 20){
                            EasyNtTransfer.onBatteryChangeEvent(EasyNotiTimesHelper.Event.BATTERY_LOW);
                        }else{
                            EasyNtTransfer.onBatteryChangeEvent(EasyNotiTimesHelper.Event.NONE);
                        }

                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        EasyNtTransfer.onScreenOnEvent(EasyNotiTimesHelper.Event.UNLOCK_SCREEN);
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        EasyNtTransfer.onScreenLockOnEvent(EasyNotiTimesHelper.Event.NONE);
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        EasyNtTransfer.onScreenOffEvent(EasyNotiTimesHelper.Event.SCREEN_ON_OFF);
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        EasySPUtils.putLong("s_start_charge", System.currentTimeMillis());


                        EasyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        EasyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent < 75){
                            EasyNtTransfer.onPowerConnected(EasyNotiTimesHelper.Event.POWER_CHARGE);
                        }else{
                            EasyNtTransfer.onPowerConnected(EasyNotiTimesHelper.Event.NONE);
                        }


                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        EasySPUtils.remove("s_start_charge");

                        EasyReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        EasyReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        int batteryPercent = batteryLevel * 100 / batteryScale;
                        if(batteryPercent > 95){
                            EasyNtTransfer.onPowerDisConnected(EasyNotiTimesHelper.Event.POWER_DISCHARGE);
                        }else{
                            EasyNtTransfer.onPowerDisConnected(EasyNotiTimesHelper.Event.NONE);
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
                        EasyManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                EasyNtTransfer.onHomeKeyPressEvent(isRecent, EasyNotiTimesHelper.Event.HOME_CLICK);
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

