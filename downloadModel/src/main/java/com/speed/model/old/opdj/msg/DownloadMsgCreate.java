package com.download.model.old.opdj.msg;


import android.content.pm.PackageInfo;
import android.text.TextUtils;

import com.download.model.old.DownloadManager;
import com.download.model.R;
import com.download.model.old.utils.DownloadUUIDUtils;

public class DownloadMsgCreate {

    public DownloadMsgCreate() {
    }

    public static DownloadMsgInfo buildTokenParams(String token) {
        DownloadMsgInfo result = new DownloadMsgInfo();
        result.token = token;
        result.deviceId = DownloadUUIDUtils.getInstance().getDeviceId();
        if (result.deviceId == null) {
            result.deviceId = "";
        }
        result.platform = "android";
        result.appVersion = geAppVersion();
        result.channel = "unknown";
        result.apiLevel = "unknown";
        result.sdkInt = "0";
        result.debug = "false";
        result.packageName = DownloadManager.mContext.getPackageName();
        result.netType = "unknown";
        result.model = "unknown";
        result.brand = "unknown";
        result.country = "unknown";
        result.mcc = 1;
        result.isVpn = false;
        result.appName = DownloadManager.mContext.getResources().getString(R.string.download_app_name);
        return result;
    }

    public static String geAppVersion() {
        String version = "unknown";
        try {
            PackageInfo pi = DownloadManager.mContext.getPackageManager().getPackageInfo(DownloadManager.mContext.getPackageName(), 0);
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
