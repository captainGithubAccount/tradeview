package com.tfseptember.clemodel;

import com.tfseptember.clemodel.utils.BlueTenSPUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

public class BlueTenUserTimer {

    public BlueTenUserTimer() {
    }

    public static void firstIn() {
        if (!BlueTenSPUtils.getBoolean("firstin_app_start", false)) {
            BlueTenSPUtils.putBoolean("firstin_app_start", true);
            BlueTenSPUtils.putLong("firstin_app_start_time", System.currentTimeMillis());
        }

    }

    public static long getFirstInTime() {
        return BlueTenSPUtils.getLong("firstin_app_start_time", 0L);
    }

    public static int getFirstInDurTime() {
        long firstInstallTime = getFirstInTime();
        long currTime = System.currentTimeMillis();
        BigDecimal bigDecimal1 = new BigDecimal(currTime - firstInstallTime);
        BigDecimal bigDecimal2 = new BigDecimal("86400000");
        return bigDecimal1.divide(bigDecimal2, 2, RoundingMode.DOWN).intValue();
    }


    public static final boolean isSameDay(long $this$isSameDay, long dest) {
        Date srcDate = new Date($this$isSameDay);
        Date destDate = new Date(dest);
        Calendar var10000 = Calendar.getInstance();
        Calendar nowCalendar = var10000;
        nowCalendar.setTime(srcDate);
        var10000 = Calendar.getInstance();
        Calendar dateCalendar = var10000;
        dateCalendar.setTime(destDate);
        return nowCalendar.get(1) == dateCalendar.get(1) && nowCalendar.get(2) == dateCalendar.get(2) && nowCalendar.get(5) == dateCalendar.get(5);
    }
}
