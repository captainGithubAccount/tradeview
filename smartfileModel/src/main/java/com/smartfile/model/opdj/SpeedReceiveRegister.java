package com.smartfile.model.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.smartfile.model.SpeedManager;
import com.smartfile.model.shownotificy.SpeedNtTransfer;
import com.smartfile.model.utils.SpeedSPUtils;

public class SpeedReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public SpeedReceiveRegister() {
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
                assert SpeedManager.mContext != null;
                SpeedManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SpeedManager.mContext != null;
                SpeedManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            SpeedManager.mContext.registerReceiver(new SpeedStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                SpeedManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                SpeedManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        SpeedReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SpeedReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        SpeedNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SpeedNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SpeedNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SpeedNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SpeedSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        SpeedNtTransfer.onPowerConnected();
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SpeedSPUtils.remove("s_start_charge");
                        SpeedNtTransfer.onPowerDisConnected();
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
                        SpeedManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SpeedNtTransfer.onHomeKeyPressEvent(isRecent);
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

