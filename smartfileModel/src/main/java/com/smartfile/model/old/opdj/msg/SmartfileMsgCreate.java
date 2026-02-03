package com.smartfile.model.old.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.R;
import com.smartfile.model.old.utils.SmartfileUUIDUtils;

public class SmartfileMsgCreate {

    public SmartfileMsgCreate() {
    }

    public static SmartfileMsgInfo buildTokenParams(String token) {
        SmartfileMsgInfo result = new SmartfileMsgInfo();
        result.token = token;
        result.deviceId = SmartfileUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = SmartfileManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = SmartfileManager.mContext.getResources().getString(R.string.smartfile_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = SmartfileManager.mContext.getPackageManager().getPackageInfo(SmartfileManager.mContext.getPackageName(), 0);
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
