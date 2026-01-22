package com.speed.model.old.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.speed.model.old.SpeedManager;
import com.speed.model.R;
import com.speed.model.old.utils.SpeedUUIDUtils;

public class SpeedMsgCreate {

    public SpeedMsgCreate() {
    }

    public static SpeedMsgInfo buildTokenParams(String token) {
        SpeedMsgInfo result = new SpeedMsgInfo();
        result.token = token;
        result.deviceId = SpeedUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = SpeedManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = SpeedManager.mContext.getResources().getString(R.string.speed_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = SpeedManager.mContext.getPackageManager().getPackageInfo(SpeedManager.mContext.getPackageName(), 0);
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
