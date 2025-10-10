package com.tfseptember.clemodel.orgyy;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;

public class SimplyLoudStartReceiver extends BroadcastReceiver {
    public SimplyLoudStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (SimplyHouseworkrOrgManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
