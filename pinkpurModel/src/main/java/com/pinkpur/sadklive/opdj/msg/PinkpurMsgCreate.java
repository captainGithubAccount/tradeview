package com.pinkpur.sadklive.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.utils.PinkpurUUIDUtils;

public class PinkpurMsgCreate {

    public PinkpurMsgCreate() {
    }

    public static PinkpurMsgInfo buildTokenParams(String token) {
        PinkpurMsgInfo result = new PinkpurMsgInfo();
        result.token = token;
        result.deviceId = PinkpurUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = PinkpurManager.mContext.getPackageName();
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
            PackageInfo pi = PinkpurManager.mContext.getPackageManager().getPackageInfo(PinkpurManager.mContext.getPackageName(), 0);
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
