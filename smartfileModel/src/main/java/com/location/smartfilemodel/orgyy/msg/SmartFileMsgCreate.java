package com.location.smartfilemodel.orgyy.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.location.smartfilemodel.R;
import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.utils.SmartFileUUIDUtils;

public class SmartFileMsgCreate {

    public SmartFileMsgCreate() {
    }

    public static SmartFileMsgInfo buildTokenParams(String token) {
        SmartFileMsgInfo result = new SmartFileMsgInfo();
        result.token = token;
        result.deviceId = SmartFileUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = SmartFileOrgManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = SmartFileOrgManager.mContext.getResources().getString(R.string.smartfile_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = SmartFileOrgManager.mContext.getPackageManager().getPackageInfo(SmartFileOrgManager.mContext.getPackageName(), 0);
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
