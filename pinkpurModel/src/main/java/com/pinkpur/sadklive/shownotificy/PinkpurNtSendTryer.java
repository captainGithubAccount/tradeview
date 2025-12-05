package com.pinkpur.sadklive.shownotificy;


import android.util.Log;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.FirebaseUtils;
import com.pinkpur.sadklive.change.PinkpurChangeUtils;
import com.pinkpur.sadklive.opdj.nt.PinkpurNtBuilder;
import com.pinkpur.sadklive.opdj.nt.PinkpurNtInfo;

import java.util.Random;

public class PinkpurNtSendTryer {

    public PinkpurNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, PinkpurChangeUtils.NoticeType noticeType) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", PinkpurManager.mContext);
        if (!PinkpurManager.INSTANCE.isForeground() && !PinkpurManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = PinkpurManager.isScreenOn() && PinkpurManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", PinkpurManager.mContext);
            } else {
                boolean isNotificationEnabled = PinkpurManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + PinkpurNtTimeUtil.isCoolTime());
                if (!PinkpurNtTimeUtil.isCoolTime()) {
                    PinkpurNtInfo dateBean;
                    if (isNotificationEnabled) {
                        PinkpurChangeUtils.NoticeType currentNoticeType = PinkpurChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == PinkpurChangeUtils.NoticeType.FCM) {
                            if (PinkpurChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = PinkpurChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = PinkpurChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (PinkpurChangeUtils.INSTANCE.getLastNoticeType() == PinkpurChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = PinkpurChangeUtils.NoticeType.CLEAN;
                                } else if (PinkpurChangeUtils.INSTANCE.getLastNoticeType() == PinkpurChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = PinkpurChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = PinkpurChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = PinkpurChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (PinkpurChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == PinkpurChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = PinkpurChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = PinkpurChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = PinkpurNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = PinkpurNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = PinkpurNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = PinkpurNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        PinkpurManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", PinkpurManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", PinkpurManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", PinkpurManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + PinkpurManager.code;
        } else if (id == 2) {
            return '퀁' + PinkpurManager.code;
        } else {
            if (id == 3) {
                return '퀂' + PinkpurManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + PinkpurManager.code;
                } else {
                    return '퀃' + PinkpurManager.code;
                }
            }
        }
    }
}
