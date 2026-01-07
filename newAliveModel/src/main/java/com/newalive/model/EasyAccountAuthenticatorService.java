package com.newalive.model;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class EasyAccountAuthenticatorService extends Service {
    private EasyAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        super.onCreate();
        mAuthenticator = new EasyAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}