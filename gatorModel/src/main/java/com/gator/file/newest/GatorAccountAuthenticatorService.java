package com.gator.file.newest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class GatorAccountAuthenticatorService extends Service {
    private GatorAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        super.onCreate();
        mAuthenticator = new GatorAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
