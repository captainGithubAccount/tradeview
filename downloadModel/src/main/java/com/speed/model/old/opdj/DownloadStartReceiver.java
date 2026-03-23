package com.download.model.old.opdj;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.download.model.old.DownloadManager;

public class DownloadStartReceiver extends BroadcastReceiver {
    public DownloadStartReceiver() {
    }
    public void onReceive(Context context, Intent intent) {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "------BootCompletedReceiver-->onReceive ------");
        }
    }
}
