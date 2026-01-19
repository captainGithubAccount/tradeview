package com.tidy.file.old.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.tidy.file.old.TidyManager;

public class TidyStartReceiver extends BroadcastReceiver {
    public TidyStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (TidyManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
