package com.tfseptember.clemodel.orgyy.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.utils.SimplyFlighttgUUIDUtils;

public class SimplySingerhtMsgCreate {

    public SimplySingerhtMsgCreate() {
    }

    public static SimplyCatchjzMsgInfo buildTokenParams(String token) {
        SimplyCatchjzMsgInfo result = new SimplyCatchjzMsgInfo();
        result.token = token;
        result.deviceId = SimplyFlighttgUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = SimplyHouseworkrOrgManager.mContext.getPackageName();
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
            PackageInfo pi = SimplyHouseworkrOrgManager.mContext.getPackageManager().getPackageInfo(SimplyHouseworkrOrgManager.mContext.getPackageName(), 0);
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
