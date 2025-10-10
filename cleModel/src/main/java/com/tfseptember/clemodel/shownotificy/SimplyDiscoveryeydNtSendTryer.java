package com.tfseptember.clemodel.shownotificy;


import android.util.Log;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.FirebaseCatchjzgUtils;
import com.tfseptember.clemodel.orgyy.nt.SimplyDiscoveryeydeNtBuilder;
import com.tfseptember.clemodel.orgyy.nt.SimplyOfficeqvqhcNtInfo;

import java.util.Random;

public class SimplyDiscoveryeydNtSendTryer {

    public SimplyDiscoveryeydNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SimplyHouseworkrOrgManager.mContext);
        if (!SimplyHouseworkrOrgManager.INSTANCE.isForeground() && !SimplyHouseworkrOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SimplyHouseworkrOrgManager.isScreenOn() && SimplyHouseworkrOrgManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SimplyHouseworkrOrgManager.mContext);
            } else {
                boolean isNotificationEnabled = SimplyHouseworkrOrgManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SimplyAddressNtTimeUtil.isCoolTime());
                if (!SimplyAddressNtTimeUtil.isCoolTime()) {
                    SimplyOfficeqvqhcNtInfo dateBean;
                    if (!isHomeKey && !isScreenOpen && !isRecentTask) {
                        if (!isNotificationEnabled){
                            FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SimplyHouseworkrOrgManager.mContext);
                        }
                        if (isFCM && isNotificationEnabled) {
                            dateBean = SimplyDiscoveryeydeNtBuilder.buildNotifiData((new Random()).nextInt(4));
                            SimplyHouseworkrOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                        }
                    } else {
                        if (isNotificationEnabled) {
                            dateBean = SimplyDiscoveryeydeNtBuilder.buildNotifiData((new Random()).nextInt(4));
                            SimplyHouseworkrOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                        }else {
                            FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SimplyHouseworkrOrgManager.mContext);
                        }
                    }

                } else {
                    FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SimplyHouseworkrOrgManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SimplyHouseworkrOrgManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SimplyHouseworkrOrgManager.code;
        } else if (id == 2) {
            return '퀁' + SimplyHouseworkrOrgManager.code;
        } else {
            if (id == 3) {
                return '퀂' + SimplyHouseworkrOrgManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + SimplyHouseworkrOrgManager.code;
                } else {
                    return '퀃' + SimplyHouseworkrOrgManager.code;
                }
            }
        }
    }
}
