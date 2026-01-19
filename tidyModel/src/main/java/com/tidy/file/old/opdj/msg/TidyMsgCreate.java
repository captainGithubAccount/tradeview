package com.tidy.file.old.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.tidy.file.old.TidyManager;
import com.tidy.file.R;
import com.tidy.file.old.utils.TidyUUIDUtils;

public class TidyMsgCreate {

    public TidyMsgCreate() {
    }

    public static TidyMsgInfo buildTokenParams(String token) {
        TidyMsgInfo result = new TidyMsgInfo();
        result.token = token;
        result.deviceId = TidyUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = TidyManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = TidyManager.mContext.getResources().getString(R.string.easy_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = TidyManager.mContext.getPackageManager().getPackageInfo(TidyManager.mContext.getPackageName(), 0);
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
