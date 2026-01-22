package com.speed.model.old.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.speed.model.old.SpeedManager;

public class SpeedStartReceiver extends BroadcastReceiver {
    public SpeedStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
