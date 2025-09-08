package com.tfseptember.clemodel.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.FirebaseCloudManager;
import com.tfseptember.clemodel.change.BlueTenChangeUtils;
import com.tfseptember.clemodel.utils.BlueTenSPUtils;

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
