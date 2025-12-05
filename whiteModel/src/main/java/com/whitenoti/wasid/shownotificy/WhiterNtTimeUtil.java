package com.whitenoti.wasid.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.WhiterFirebaseCloudManager;
import com.whitenoti.wasid.change.WhiterChangeUtils;
import com.whitenoti.wasid.utils.WhiterSPUtils;

public class WhiterNtTimeUtil {

    public WhiterNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - WhiterManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (WhiterManager.isDebug) {
            WhiterFirebaseCloudManager.getNoticSellpTime();
            return 10000L;
        } else {
            WhiterFirebaseCloudManager.getNoticSellpTime();
            long coolTime = WhiterSPUtils.getLong(WhiterChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - WhiterManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (WhiterManager.isDebug) {
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
