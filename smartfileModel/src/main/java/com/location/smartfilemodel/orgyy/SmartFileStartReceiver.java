package com.location.smartfilemodel.orgyy;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.location.smartfilemodel.SmartFileOrgManager;

public class SmartFileStartReceiver extends BroadcastReceiver {
    public SmartFileStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SmartFileOrgManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
