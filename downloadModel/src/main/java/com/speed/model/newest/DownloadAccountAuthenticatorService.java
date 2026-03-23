package com.download.model.newest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DownloadAccountAuthenticatorService extends Service {
    private DownloadAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        super.onCreate();
        mAuthenticator = new DownloadAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
