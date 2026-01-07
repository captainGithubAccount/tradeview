package com.speed.ozius.shownotificy;


import android.util.Log;

import com.speed.ozius.SpeedManager;
import com.speed.ozius.SpeedFirebaseEventUtils;
import com.speed.ozius.change.SpeedChangeUtils;
import com.speed.ozius.opdj.nt.SpeedNtBuilder;
import com.speed.ozius.opdj.nt.SpeedNtInfo;

import java.util.Random;

public class SpeedNtSendTryer {

    public SpeedNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, SpeedChangeUtils.NoticeType noticeType) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        SpeedFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SpeedManager.mContext);
        if (!SpeedManager.INSTANCE.isForeground() && !SpeedManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SpeedManager.isScreenOn() && SpeedManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                SpeedFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SpeedManager.mContext);
            } else {
                boolean isNotificationEnabled = SpeedManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SpeedNtTimeUtil.isCoolTime());
                if (!SpeedNtTimeUtil.isCoolTime()) {
                    SpeedNtInfo dateBean;
                    if (isNotificationEnabled) {
                        SpeedChangeUtils.NoticeType currentNoticeType = SpeedChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == SpeedChangeUtils.NoticeType.FCM) {
                            if (SpeedChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = SpeedChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = SpeedChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (SpeedChangeUtils.INSTANCE.getLastNoticeType() == SpeedChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SpeedChangeUtils.NoticeType.CLEAN;
                                } else if (SpeedChangeUtils.INSTANCE.getLastNoticeType() == SpeedChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = SpeedChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = SpeedChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = SpeedChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (SpeedChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == SpeedChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SpeedChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = SpeedChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = SpeedNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = SpeedNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = SpeedNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = SpeedNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        SpeedManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType);
                    }else {
                        SpeedFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SpeedManager.mContext);
                    }
                } else {
                    SpeedFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SpeedManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            SpeedFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SpeedManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SpeedManager.code;
        } else if (id == 2) {
            return '퀁' + SpeedManager.code;
        } else {
            if (id == 3) {
                return '퀂' + SpeedManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + SpeedManager.code;
                } else {
                    return '퀃' + SpeedManager.code;
                }
            }
        }
    }
}
