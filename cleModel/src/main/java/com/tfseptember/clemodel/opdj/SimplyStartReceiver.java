package com.tfseptember.clemodel.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.tfseptember.clemodel.SimplyManager;

public class SimplyStartReceiver extends BroadcastReceiver {
    public SimplyStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SimplyManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
