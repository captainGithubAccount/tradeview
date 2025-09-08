package com.location.notimodel.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.location.notimodel.BlueTenOrgManager;
import com.location.notimodel.FirebaseCloudManager;
import com.location.notimodel.change.BlueTenChangeUtils;
import com.location.notimodel.utils.BlueTenSPUtils;

public class BlueTenNtTimeUtil {

    public BlueTenNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - BlueTenOrgManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (BlueTenOrgManager.isDebug) {
            FirebaseCloudManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseCloudManager.getNoticSellpTime();
            long coolTime = BlueTenSPUtils.getLong(BlueTenChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - BlueTenOrgManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (BlueTenOrgManager.isDebug) {
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
