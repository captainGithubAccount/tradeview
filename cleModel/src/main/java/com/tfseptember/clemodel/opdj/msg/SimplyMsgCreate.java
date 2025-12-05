package com.tfseptember.clemodel.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.tfseptember.clemodel.SimplyManager;
import com.tfseptember.clemodel.utils.SimplyUUIDUtils;

public class SimplyMsgCreate {

    public SimplyMsgCreate() {
    }

    public static SimplyMsgInfo buildTokenParams(String token) {
        SimplyMsgInfo result = new SimplyMsgInfo();
        result.token = token;
        result.deviceId = SimplyUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = SimplyManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = "Ave Cleaner";
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = SimplyManager.mContext.getPackageManager().getPackageInfo(SimplyManager.mContext.getPackageName(), 0);
            version = pi.versionName;
        } catch (Exception var74) {
            Exception e = var74;
            e.printStackTrace();
        }

        if (TextUtils.isEmpty(version)) {
            return "unknown";
        } else {
            return version;
        }
    }
}
