package com.smartfile.model.opdj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.shownotificy.SmartFileNtTransfer;
import com.smartfile.model.utils.SmartFileSPUtils;

public class SmartFileReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public SmartFileReceiveRegister() {
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
                assert SmartFileManager.mContext != null;
                SmartFileManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SmartFileManager.mContext != null;
                SmartFileManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            SmartFileManager.mContext.registerReceiver(new SmartFileStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                SmartFileManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                SmartFileManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        SmartFileReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SmartFileReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        SmartFileNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SmartFileNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SmartFileNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SmartFileNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SmartFileSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                        SmartFileNtTransfer.onPowerConnected();
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SmartFileSPUtils.remove("s_start_charge");
                        SmartFileNtTransfer.onPowerDisConnected();
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
                        SmartFileManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SmartFileNtTransfer.onHomeKeyPressEvent(isRecent);
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

