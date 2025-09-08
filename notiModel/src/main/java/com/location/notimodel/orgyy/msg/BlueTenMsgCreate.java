package com.location.notimodel.orgyy.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.location.notimodel.BlueTenOrgManager;
import com.location.notimodel.utils.BlueTenUUIDUtils;

public class BlueTenMsgCreate {

    public BlueTenMsgCreate() {
    }

    public static BlueTenMsgInfo buildTokenParams(String token) {
        BlueTenMsgInfo result = new BlueTenMsgInfo();
        result.token = token;
        result.deviceId = BlueTenUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = BlueTenOrgManager.mContext.getPackageName();
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
            PackageInfo pi = BlueTenOrgManager.mContext.getPackageManager().getPackageInfo(BlueTenOrgManager.mContext.getPackageName(), 0);
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
