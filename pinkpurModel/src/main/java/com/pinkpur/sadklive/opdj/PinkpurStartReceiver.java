package com.pinkpur.sadklive.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.pinkpur.sadklive.PinkpurManager;

public class PinkpurStartReceiver extends BroadcastReceiver {
    public PinkpurStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (PinkpurManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
