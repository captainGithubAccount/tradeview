package com.location.notimodel.orgyy;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.location.notimodel.BlueTenOrgManager;

public class BlueTenStartReceiver extends BroadcastReceiver {
    public BlueTenStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (BlueTenOrgManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
