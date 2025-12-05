package com.whitenoti.wasid.utils;


import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.whitenoti.wasid.WhiterManager;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class WhiterUUIDUtils {
    public static final String INSTALLATION_ID_KEY = "installation.id";
    private static WhiterUUIDUtils instance = new WhiterUUIDUtils();
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private volatile String deviceId;


    public static WhiterUUIDUtils getInstance() {
        return instance;
    }

    private WhiterUUIDUtils() {
    }

    @Nullable
    public synchronized String getDeviceId() {
        if (!TextUtils.isEmpty(this.deviceId)) {
            return this.deviceId;
        } else {
            this.deviceId = WhiterSPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (WhiterManager.isDebug) {
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
            String uuid = WhiterSPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                WhiterSPUtils.putString("installation.id", uuid);
            }

            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }

        return var34;
    }
}
