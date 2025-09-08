package com.location.notimodel.orgyy;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class BlueTenUserSyncService extends Service {
    private static final Object mSyncAdapterLock = new Object();
    private static SyncAdapter mSyncAdapter = null;

    public BlueTenUserSyncService() {
    }

    public void onCreate() {
        super.onCreate();
        Log.e("xxx", "AccountSyncService onCreate");
        synchronized (mSyncAdapterLock) {
            if (mSyncAdapter == null) {
                mSyncAdapter = new SyncAdapter(this.getApplicationContext(), true);
            }
        }
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return mSyncAdapter.getSyncAdapterBinder();
    }

    class SyncAdapter extends AbstractThreadedSyncAdapter {
        public SyncAdapter(Context context, boolean autoInitialize) {
            super(context, autoInitialize);
        }

        public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient provider, SyncResult syncResult) {
        }
    }

}

