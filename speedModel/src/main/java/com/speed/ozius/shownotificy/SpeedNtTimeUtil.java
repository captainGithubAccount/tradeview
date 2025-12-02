package com.speed.ozius.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.speed.ozius.SpeedManager;
import com.speed.ozius.SpeedFirebaseCloudManager;
import com.speed.ozius.change.SpeedChangeUtils;
import com.speed.ozius.utils.SpeedSPUtils;

public class SpeedNtTimeUtil {

    public SpeedNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - SpeedManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (SpeedManager.isDebug) {
            SpeedFirebaseCloudManager.getNoticSellpTime();
            return 10000L;
        } else {
            SpeedFirebaseCloudManager.getNoticSellpTime();
            long coolTime = SpeedSPUtils.getLong(SpeedChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - SpeedManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (SpeedManager.isDebug) {
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
