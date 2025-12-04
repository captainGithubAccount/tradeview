package com.recover.redate.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.recover.redate.RecoverManager;
import com.recover.redate.shownotificy.RecoverNtTransfer;
import com.recover.redate.utils.RecoverSPUtils;

public class RecoverReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public RecoverReceiveRegister() {
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
                assert RecoverManager.mContext != null;
                RecoverManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert RecoverManager.mContext != null;
                RecoverManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            RecoverManager.mContext.registerReceiver(new RecoverStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                RecoverManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                RecoverManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        RecoverReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        RecoverReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        RecoverNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        RecoverNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        RecoverNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        RecoverNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        RecoverSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        RecoverNtTransfer.onPowerConnected();
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        RecoverSPUtils.remove("s_start_charge");
                        RecoverNtTransfer.onPowerDisConnected();
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
                        RecoverManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                RecoverNtTransfer.onHomeKeyPressEvent(isRecent);
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

