package com.location.smartfilemodel.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.FirebaseCloudManager;
import com.location.smartfilemodel.change.SmartFileChangeUtils;
import com.location.smartfilemodel.utils.SmartFileSPUtils;

public class SmartFileNtTimeUtil {

    public SmartFileNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - SmartFileOrgManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (SmartFileOrgManager.isDebug) {
            FirebaseCloudManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseCloudManager.getNoticSellpTime();
            long coolTime = SmartFileSPUtils.getLong(SmartFileChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - SmartFileOrgManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (SmartFileOrgManager.isDebug) {
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
