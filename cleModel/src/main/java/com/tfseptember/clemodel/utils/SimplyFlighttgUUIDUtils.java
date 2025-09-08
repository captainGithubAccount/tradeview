package com.tfseptember.clemodel.utils;


import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;

import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public class SimplyFlighttgUUIDUtils {
    public static final String INSTALLATION_ID_KEY = "installation.id";
    private static SimplyFlighttgUUIDUtils instance = new SimplyFlighttgUUIDUtils();
    private final ReentrantLock installationIdLock = new ReentrantLock();
    private volatile String deviceId;


    public static SimplyFlighttgUUIDUtils getInstance() {
        return instance;
    }

    private SimplyFlighttgUUIDUtils() {
    }

    @Nullable
    public synchronized String getDeviceId() {
        if (!TextUtils.isEmpty(this.deviceId)) {
            return this.deviceId;
        } else {
            this.deviceId = SimplyFloorSPUtils.getString("installation.id", "");
            if (this.deviceId == null || this.deviceId.isEmpty()) {
                this.deviceId = this.createInstallationUUID();
            }
            if (SimplyHouseworkrOrgManager.isDebug) {
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
            String uuid = SimplyFloorSPUtils.getString("installation.id", "");
            if (uuid == null || uuid.isEmpty()) {
                uuid = "R" + UUID.randomUUID().toString();
                SimplyFloorSPUtils.putString("installation.id", uuid);
            }

            var34 = uuid;
        } finally {
            this.installationIdLock.unlock();
        }

        return var34;
    }
}
