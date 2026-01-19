package com.tidy.file.old.utils;


import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.tidy.file.old.EasyManager;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class EasyUUIDUtils {
    public static final String INSTALLATION_ID_KEY = "installation.id";
    private static EasyUUIDUtils instance = new EasyUUIDUtils();
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private volatile String deviceId;


    public static EasyUUIDUtils getInstance() {
        return instance;
    }

    private EasyUUIDUtils() {
    }

    @Nullable
    public synchronized String getDeviceId() {
        if (!TextUtils.isEmpty(this.deviceId)) {
            return this.deviceId;
        } else {
            this.deviceId = EasySPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (EasyManager.isDebug) {
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
            String uuid = EasySPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                EasySPUtils.putString("installation.id", uuid);
            }

            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }

        return var34;
    }
}
