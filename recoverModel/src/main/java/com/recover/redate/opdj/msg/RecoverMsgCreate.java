package com.recover.redate.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.recover.redate.RecoverOrgManager;
import com.recover.redate.utils.RecoverUUIDUtils;

public class RecoverMsgCreate {

    public RecoverMsgCreate() {
    }

    public static RecoverMsgInfo buildTokenParams(String token) {
        RecoverMsgInfo result = new RecoverMsgInfo();
        result.token = token;
        result.deviceId = RecoverUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = RecoverOrgManager.mContext.getPackageName();
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
            PackageInfo pi = RecoverOrgManager.mContext.getPackageManager().getPackageInfo(RecoverOrgManager.mContext.getPackageName(), 0);
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
