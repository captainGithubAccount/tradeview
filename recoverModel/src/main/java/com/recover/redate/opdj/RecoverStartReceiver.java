package com.recover.redate.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.recover.redate.RecoverOrgManager;

public class RecoverStartReceiver extends BroadcastReceiver {
    public RecoverStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (RecoverOrgManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
