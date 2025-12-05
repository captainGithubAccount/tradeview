package com.pinkpur.sadklive.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.FirebaseManager;
import com.pinkpur.sadklive.change.PinkpurChangeUtils;
import com.pinkpur.sadklive.utils.PinkpurSPUtils;

public class PinkpurNtTimeUtil {

    public PinkpurNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - PinkpurManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (PinkpurManager.isDebug) {
            FirebaseManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseManager.getNoticSellpTime();
            long coolTime = PinkpurSPUtils.getLong(PinkpurChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - PinkpurManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (PinkpurManager.isDebug) {
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
