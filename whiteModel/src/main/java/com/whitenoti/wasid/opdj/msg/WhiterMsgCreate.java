package com.whitenoti.wasid.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.utils.WhiterUUIDUtils;

public class WhiterMsgCreate {

    public WhiterMsgCreate() {
    }

    public static WhiterMsgInfo buildTokenParams(String token) {
        WhiterMsgInfo result = new WhiterMsgInfo();
        result.token = token;
        result.deviceId = WhiterUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = WhiterManager.mContext.getPackageName();
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
            PackageInfo pi = WhiterManager.mContext.getPackageManager().getPackageInfo(WhiterManager.mContext.getPackageName(), 0);
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
