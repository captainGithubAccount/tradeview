package com.tfseptember.clemodel.orgyy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.shownotificy.SimplyLoudqNtTransfer;
import com.tfseptember.clemodel.utils.SimplyFloorSPUtils;

public class SimplyFlightReceiveRegister {
    public static boolean isMonitored = false;
    public static int batteryLevel = 0;
    public static int batteryScale = 0;

    public SimplyFlightReceiveRegister() {
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
            if (VERSION.SDK_INT >= 33) {
                assert SimplyHouseworkrOrgManager.mContext != null;
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter, Context.RECEIVER_EXPORTED);
            } else {
                assert SimplyHouseworkrOrgManager.mContext != null;
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new ManualActionReceiver(), manualFilter);
            }

            IntentFilter filter = new IntentFilter();
            SimplyHouseworkrOrgManager.mContext.registerReceiver(new SimplyLoudStartReceiver(), filter);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            intentFilter.setPriority(1000);
            if (VERSION.SDK_INT >= 33) {
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter, Context.RECEIVER_EXPORTED);
            } else {
                SimplyHouseworkrOrgManager.mContext.registerReceiver(new HomeActionReceiver(), intentFilter);
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
                        SimplyFlightReceiveRegister.batteryLevel = intent.getIntExtra("level", 0);
                        SimplyFlightReceiveRegister.batteryScale = intent.getIntExtra("scale", 0);
                        SimplyLoudqNtTransfer.onBatteryChangeEvent();
                    }
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        SimplyLoudqNtTransfer.onScreenOnEvent();
                    } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                        SimplyLoudqNtTransfer.onScreenLockOnEvent();
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        SimplyLoudqNtTransfer.onScreenOffEvent();
                    } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                        SimplyFloorSPUtils.putLong("s_start_charge", System.currentTimeMillis());
                    } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                        SimplyFloorSPUtils.remove("s_start_charge");
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
                        SimplyHouseworkrOrgManager.INSTANCE.getHandler().postDelayed(() -> {
                            try {
                                SimplyLoudqNtTransfer.onHomeKeyPressEvent(isRecent);
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

