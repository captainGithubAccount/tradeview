package com.recover.redate.utils;


import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.recover.redate.RecoverOrgManager;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class RecoverUUIDUtils {
    public static final String INSTALLATION_ID_KEY = "installation.id";
    private static RecoverUUIDUtils instance = new RecoverUUIDUtils();
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private volatile String deviceId;


    public static RecoverUUIDUtils getInstance() {
        return instance;
    }

    private RecoverUUIDUtils() {
    }

    @Nullable
    public synchronized String getDeviceId() {
        if (!TextUtils.isEmpty(this.deviceId)) {
            return this.deviceId;
        } else {
            this.deviceId = RecoverSPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (RecoverOrgManager.isDebug) {
                Log.e("xxx", "getDeviceId deviceId:" + this.deviceId);
            }
            return this.deviceId;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private String createInstallationUUID() {
        this.installationIdLock.lock();
        String var34;
        try {
            String uuid = RecoverSPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                RecoverSPUtils.putString("installation.id", uuid);
            }

            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }

        return var34;
    }
}
