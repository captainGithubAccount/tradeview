package com.tfseptember.clemodel.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.FirebaseOfficeManager;
import com.tfseptember.clemodel.change.HotelHousejChangeUtils;
import com.tfseptember.clemodel.utils.SimplyFloorSPUtils;

public class SimplyAddressNtTimeUtil {

    public SimplyAddressNtTimeUtil() {
    }

    public static boolean isCoolTime() {
        boolean isCoolTime = System.currentTimeMillis() - SimplyHouseworkrOrgManager.getLastShowPushTime() <= getCoolTome();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome() {
        if (SimplyHouseworkrOrgManager.isDebug) {
            FirebaseOfficeManager.getNoticSellpTime();
            return 10000L;
        } else {
            FirebaseOfficeManager.getNoticSellpTime();
            long coolTime = SimplyFloorSPUtils.getLong(HotelHousejChangeUtils.INSTANCE.getCoolTimeStar(), 0L);
            if (coolTime <= 0L) {
                coolTime = 660000L;
            }
            return coolTime;
        }
    }


    public static boolean isCoolTime2() {
        boolean isCoolTime = System.currentTimeMillis() - SimplyHouseworkrOrgManager.getLastShowPushTime() <= getCoolTome2();
        Log.i("xxx", "isCoolTime--------result=$isCoolTime");
        return isCoolTime;
    }

    private static long getCoolTome2() {
        if (SimplyHouseworkrOrgManager.isDebug) {
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
