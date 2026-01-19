package com.tidy.file.old.shownotificy;


import android.util.Log;

import com.tidy.file.old.utils.EasySPUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tidy.file.old.EasyManager;
import com.tidy.file.old.FirebaseManager;
import com.tidy.file.old.change.EasyChangeUtils;

public class EasyNtTimeUtil {

    public EasyNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - EasyManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (EasyManager.isDebug) {
            FirebaseManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseManager.getNoticSellpTime();
            long coolTime = EasySPUtils.getLong(EasyChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - EasyManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (EasyManager.isDebug) {
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
