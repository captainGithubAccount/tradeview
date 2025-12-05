package com.tfseptember.clemodel.shownotificy;


import android.util.Log;

import com.tfseptember.clemodel.SimplyManager;
import com.tfseptember.clemodel.FirebaseCatchjzgUtils;
import com.tfseptember.clemodel.change.SimplyChangeUtils;
import com.tfseptember.clemodel.opdj.nt.SimplyNtBuilder;
import com.tfseptember.clemodel.opdj.nt.SimplyNtInfo;

import java.util.Random;

public class SimplyNtSendTryer {

    public SimplyNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, SimplyChangeUtils.NoticeType noticeType) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SimplyManager.mContext);
        if (!SimplyManager.INSTANCE.isForeground() && !SimplyManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SimplyManager.isScreenOn() && SimplyManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SimplyManager.mContext);
            } else {
                boolean isNotificationEnabled = SimplyManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SimplyNtTimeUtil.isCoolTime());
                if (!SimplyNtTimeUtil.isCoolTime()) {
                    SimplyNtInfo dateBean;
                    if (isNotificationEnabled) {
                        SimplyChangeUtils.NoticeType currentNoticeType = SimplyChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == SimplyChangeUtils.NoticeType.FCM) {
                            if (SimplyChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = SimplyChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = SimplyChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (SimplyChangeUtils.INSTANCE.getLastNoticeType() == SimplyChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SimplyChangeUtils.NoticeType.CLEAN;
                                } else if (SimplyChangeUtils.INSTANCE.getLastNoticeType() == SimplyChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = SimplyChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = SimplyChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = SimplyChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (SimplyChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == SimplyChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SimplyChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = SimplyChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = SimplyNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = SimplyNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = SimplyNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = SimplyNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        SimplyManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType);
                    }else {
                        FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SimplyManager.mContext);
                    }
                } else {
                    FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SimplyManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseCatchjzgUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SimplyManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SimplyManager.code;
        } else if (id == 2) {
            return '퀁' + SimplyManager.code;
        } else {
            if (id == 3) {
                return '퀂' + SimplyManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + SimplyManager.code;
                } else {
                    return '퀃' + SimplyManager.code;
                }
            }
        }
    }
}
