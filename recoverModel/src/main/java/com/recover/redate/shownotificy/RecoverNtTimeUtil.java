package com.recover.redate.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.recover.redate.RecoverManager;
import com.recover.redate.FirebaseManager;
import com.recover.redate.change.RecoverChangeUtils;
import com.recover.redate.utils.RecoverSPUtils;

public class RecoverNtTimeUtil {

    public RecoverNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - RecoverManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (RecoverManager.isDebug) {
            FirebaseManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseManager.getNoticSellpTime();
            long coolTime = RecoverSPUtils.getLong(RecoverChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - RecoverManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (RecoverManager.isDebug) {
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
