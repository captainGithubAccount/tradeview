package com.smartfile.model.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.smartfile.model.SmartFileManager;
import com.smartfile.model.FirebaseManager;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.utils.SmartFileSPUtils;

public class SmartFileNtTimeUtil {

    public SmartFileNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - SmartFileManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (SmartFileManager.isDebug) {
            FirebaseManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseManager.getNoticSellpTime();
            long coolTime = SmartFileSPUtils.getLong(SmartFileChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - SmartFileManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (SmartFileManager.isDebug) {
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
