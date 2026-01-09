package com.easy.model.old.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.easy.model.old.EasyManager;

public class EasyStartReceiver extends BroadcastReceiver {
    public EasyStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (EasyManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
