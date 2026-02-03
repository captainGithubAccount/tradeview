package com.smartfile.model.newest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SmartfileAccountAuthenticatorService extends Service {
    private SmartfileAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        super.onCreate();
        mAuthenticator = new SmartfileAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
