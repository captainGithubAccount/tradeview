package com.location.smartfilemodel.shownotificy;


import android.util.Log;

import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.FirebaseEventUtils;
import com.location.smartfilemodel.orgyy.nt.SmartFileNtBuilder;
import com.location.smartfilemodel.orgyy.nt.SmartFileNtInfo;

import java.util.Random;

public class SmartFileNtSendTryer {

    public SmartFileNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SmartFileOrgManager.mContext);
        if (!SmartFileOrgManager.INSTANCE.isForeground() && !SmartFileOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SmartFileOrgManager.isScreenOn() && SmartFileOrgManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SmartFileOrgManager.mContext);
            } else {
                boolean isNotificationEnabled = SmartFileOrgManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SmartFileNtTimeUtil.isCoolTime());
                if (!SmartFileNtTimeUtil.isCoolTime()) {
                    SmartFileNtInfo dateBean;
                    if (!isHomeKey && !isScreenOpen && !isRecentTask) {
                        if (!isNotificationEnabled){
                            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SmartFileOrgManager.mContext);
                        }
                        if (isFCM && isNotificationEnabled) {
                            dateBean = SmartFileNtBuilder.buildNotifiData((new Random()).nextInt(4));
                            SmartFileOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                        }
                    } else {
                        if (isNotificationEnabled) {
                            dateBean = SmartFileNtBuilder.buildNotifiData((new Random()).nextInt(4));
                            SmartFileOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                        }else {
                            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SmartFileOrgManager.mContext);
                        }
                    }

                } else {
                    FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SmartFileOrgManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SmartFileOrgManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SmartFileOrgManager.code;
        } else if (id == 2) {
            return '퀁' + SmartFileOrgManager.code;
        } else {
            if (id == 3) {
                return '퀂' + SmartFileOrgManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + SmartFileOrgManager.code;
                } else {
                    return '퀃' + SmartFileOrgManager.code;
                }
            }
        }
    }
}
