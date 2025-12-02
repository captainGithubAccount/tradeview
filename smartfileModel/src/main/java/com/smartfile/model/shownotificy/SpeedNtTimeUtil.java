package com.smartfile.model.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.smartfile.model.SpeedManager;
import com.smartfile.model.SpeedFirebaseCloudManager;
import com.smartfile.model.change.SpeedChangeUtils;
import com.smartfile.model.utils.SpeedSPUtils;

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
