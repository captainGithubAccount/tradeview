package com.easy.model.old.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.easy.model.old.EasyManager;
import com.easy.model.R;
import com.easy.model.old.utils.EasyUUIDUtils;

public class EasyMsgCreate {

    public EasyMsgCreate() {
    }

    public static EasyMsgInfo buildTokenParams(String token) {
        EasyMsgInfo result = new EasyMsgInfo();
        result.token = token;
        result.deviceId = EasyUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = EasyManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = EasyManager.mContext.getResources().getString(R.string.easy_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = EasyManager.mContext.getPackageManager().getPackageInfo(EasyManager.mContext.getPackageName(), 0);
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
