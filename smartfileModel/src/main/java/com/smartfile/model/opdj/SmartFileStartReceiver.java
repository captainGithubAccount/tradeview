package com.smartfile.model.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.smartfile.model.SmartFileManager;

public class SmartFileStartReceiver extends BroadcastReceiver {
    public SmartFileStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SmartFileManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
