package com.location.notimodel.utils;


import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.location.notimodel.BlueTenOrgManager;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class BlueTenUUIDUtils {
    public static final String INSTALLATION_ID_KEY = "installation.id";
    private static BlueTenUUIDUtils instance = new BlueTenUUIDUtils();
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private volatile String deviceId;


    public static BlueTenUUIDUtils getInstance() {
        return instance;
    }

    private BlueTenUUIDUtils() {
    }

    @Nullable
    public synchronized String getDeviceId() {
        if (!TextUtils.isEmpty(this.deviceId)) {
            return this.deviceId;
        } else {
            this.deviceId = BlueTenSPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (BlueTenOrgManager.isDebug) {
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
            String uuid = BlueTenSPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                BlueTenSPUtils.putString("installation.id", uuid);
            }

            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }

        return var34;
    }
}
