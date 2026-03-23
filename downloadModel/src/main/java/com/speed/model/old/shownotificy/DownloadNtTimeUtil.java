package com.download.model.old.shownotificy;


import android.util.Log;

import com.download.model.old.utils.DownloadSPUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.download.model.old.DownloadManager;
import com.download.model.old.FirebaseManager;
import com.download.model.old.change.DownloadChangeUtils;

public class DownloadNtTimeUtil {

    public DownloadNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - DownloadManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (DownloadManager.isDebug) {
            FirebaseManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseManager.getNoticSellpTime();
            long coolTime = DownloadSPUtils.getLong(DownloadChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - DownloadManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (DownloadManager.isDebug) {
            return 10000L;
        } else {
            long coolTime = FirebaseRemoteConfig.getInstance().getLong("msg_sleep_time");
            if (coolTime <= 1000L) {
                coolTime = 9000000L;
            }
            return coolTime;
        }
    }
}
