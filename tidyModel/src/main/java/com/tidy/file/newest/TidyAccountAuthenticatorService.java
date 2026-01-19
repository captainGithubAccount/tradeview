package com.tidy.file.newest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TidyAccountAuthenticatorService extends Service {
    private TidyAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        super.onCreate();
        mAuthenticator = new TidyAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
