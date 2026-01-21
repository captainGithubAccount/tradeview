package com.gator.file.old.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.gator.file.old.GatorManager;
import com.gator.file.R;
import com.gator.file.old.utils.GatorUUIDUtils;

public class GatorMsgCreate {

    public GatorMsgCreate() {
    }

    public static GatorMsgInfo buildTokenParams(String token) {
        GatorMsgInfo result = new GatorMsgInfo();
        result.token = token;
        result.deviceId = GatorUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = GatorManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = GatorManager.mContext.getResources().getString(R.string.gator_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = GatorManager.mContext.getPackageManager().getPackageInfo(GatorManager.mContext.getPackageName(), 0);
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
