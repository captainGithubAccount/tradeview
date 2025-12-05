package com.whitenoti.wasid.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.whitenoti.wasid.WhiterManager;

public class WhiterStartReceiver extends BroadcastReceiver {
    public WhiterStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (WhiterManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
