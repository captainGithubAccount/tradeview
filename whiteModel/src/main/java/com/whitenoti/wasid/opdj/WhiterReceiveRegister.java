package com.whitenoti.wasid.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.shownotificy.WhiterNtTransfer;
import com.whitenoti.wasid.utils.WhiterSPUtils;

public class WhiterReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public WhiterReceiveRegister() {
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
                assert WhiterManager.mContext != null;
                WhiterManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert WhiterManager.mContext != null;
                WhiterManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            WhiterManager.mContext.registerReceiver(new WhiterStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                WhiterManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                WhiterManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        WhiterReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        WhiterReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        WhiterNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        WhiterNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        WhiterNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        WhiterNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        WhiterSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        WhiterNtTransfer.onPowerConnected();
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        WhiterSPUtils.remove("s_start_charge");
                        WhiterNtTransfer.onPowerDisConnected();
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
                        WhiterManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                WhiterNtTransfer.onHomeKeyPressEvent(isRecent);
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

