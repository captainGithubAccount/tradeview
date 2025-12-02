package com.speed.ozius.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.speed.ozius.SpeedManager;

public class SpeedStartReceiver extends BroadcastReceiver {
    public SpeedStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SpeedManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
