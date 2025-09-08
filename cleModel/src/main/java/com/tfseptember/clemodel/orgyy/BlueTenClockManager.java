package com.tfseptember.clemodel.orgyy;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.SystemClock;

import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.change.BlueTenChangeUtils;

public class BlueTenClockManager {


    public BlueTenClockManager() {
    }

    public static void startAlarm(Context context) {
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        boolean hasPermission = false;
        if (VERSION.SDK_INT >= 31) {
            hasPermission = am.canScheduleExactAlarms();
        } else {
            hasPermission = true;
        }

        PendingIntent pendingIntent = PendingIntent.getService(BlueTenOrgManager.INSTANCE.getContext(), 2023, new Intent(BlueTenOrgManager.mContext, BlueTenClockService.class), BlueTenChangeUtils.INSTANCE.getNotifyFlag());
        am.cancel(pendingIntent);
        long time = SystemClock.elapsedRealtime() + 177000L;
        if (hasPermission) {
            am.setExactAndAllowWhileIdle(AlarmManager.ELAPSED_REALTIME_WAKEUP, time, pendingIntent);
        } else {
            am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, time, pendingIntent);
        }

    }
}

