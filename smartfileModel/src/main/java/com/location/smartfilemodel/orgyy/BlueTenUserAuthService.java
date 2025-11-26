package com.location.smartfilemodel.orgyy;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class SmartFileUserAuthService extends Service {
    private SmartFileUserAuth mAuthenticatorjb100;

    public SmartFileUserAuthService() {
    }

    public void onCreate() {
        super.onCreate();
        Log.i("xxx", "AuthService onCreate");
        this.mAuthenticatorjb100 = new SmartFileUserAuth(this);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("xxx", "onStartCommand onCreate");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        Log.i("xxx", "AuthService onBind");
        return this.mAuthenticatorjb100.getIBinder();
    }
}

