package com.location.notimodel.shownotificy;


import android.util.Log;

import com.location.notimodel.BlueTenOrgManager;
import com.location.notimodel.FirebaseEventUtils;
import com.location.notimodel.orgyy.nt.BlueTenNtBuilder;
import com.location.notimodel.orgyy.nt.BlueTenNtInfo;

import java.util.Random;

public class BlueTenNtSendTryer {

    public BlueTenNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", BlueTenOrgManager.mContext);
        if (!BlueTenOrgManager.INSTANCE.isForeground() && !BlueTenOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = BlueTenOrgManager.isScreenOn() && BlueTenOrgManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", BlueTenOrgManager.mContext);
            } else {
                boolean isNotificationEnabled = BlueTenOrgManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + BlueTenNtTimeUtil.isCoolTime());
                if (!BlueTenNtTimeUtil.isCoolTime()) {
                    BlueTenNtInfo dateBean;
                    if (!isHomeKey && !isScreenOpen && !isRecentTask) {
                        if (!isNotificationEnabled){
                            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", BlueTenOrgManager.mContext);
                        }
                        if (isFCM && isNotificationEnabled) {
                            dateBean = BlueTenNtBuilder.buildNotifiData((new Random()).nextInt(4));
                            BlueTenOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                        }
                    } else {
                        if (isNotificationEnabled) {
                            dateBean = BlueTenNtBuilder.buildNotifiData((new Random()).nextInt(4));
                            BlueTenOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                        }else {
                            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", BlueTenOrgManager.mContext);
                        }
                    }

                } else {
                    FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", BlueTenOrgManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", BlueTenOrgManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + BlueTenOrgManager.code;
        } else if (id == 2) {
            return '퀁' + BlueTenOrgManager.code;
        } else {
            if (id == 3) {
                return '퀂' + BlueTenOrgManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + BlueTenOrgManager.code;
                } else {
                    return '퀃' + BlueTenOrgManager.code;
                }
            }
        }
    }
}
