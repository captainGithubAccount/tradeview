package com.gator.file.old.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.gator.file.old.GatorManager;

public class GatorStartReceiver extends BroadcastReceiver {
    public GatorStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (GatorManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
