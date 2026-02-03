package com.smartfile.model.old.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.smartfile.model.old.SmartfileManager;

public class SmartfileStartReceiver extends BroadcastReceiver {
    public SmartfileStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SmartfileManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
