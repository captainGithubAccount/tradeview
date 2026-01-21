package com.gator.file.old.opdj;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class GatorUserAuthService extends Service {
    private GatorUserAuth mAuthenticatorjb100;

    public GatorUserAuthService() {
    }

    public void onCreate() {
        super.onCreate();
        Log.i("xxx", "AuthService onCreate");
        this.mAuthenticatorjb100 = new GatorUserAuth(this);
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

