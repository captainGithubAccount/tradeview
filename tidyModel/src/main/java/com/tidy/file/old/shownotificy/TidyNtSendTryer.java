package com.tidy.file.old.shownotificy;


import android.util.Log;

import com.tidy.file.old.TidyManager;
import com.tidy.file.old.FirebaseUtils;
import com.tidy.file.old.change.TidyChangeUtils;
import com.tidy.file.old.opdj.nt.TidyNtBuilder;
import com.tidy.file.old.opdj.nt.TidyNtInfo;
import com.tidy.file.old.use.TidyNotiTimesHelper;

import java.util.Random;

public class TidyNtSendTryer {

    public TidyNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, TidyChangeUtils.NoticeType noticeType, TidyNotiTimesHelper.Event event) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", TidyManager.mContext);
        if (!TidyManager.INSTANCE.isForeground() && !TidyManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = TidyManager.isScreenOn() && TidyManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", TidyManager.mContext);
            } else {
                boolean isNotificationEnabled = TidyManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + TidyNtTimeUtil.isCoolTime());
                if (!TidyNtTimeUtil.isCoolTime()) {
                    TidyNtInfo dateBean;
                    if (isNotificationEnabled) {
                        TidyChangeUtils.NoticeType currentNoticeType = TidyChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == TidyChangeUtils.NoticeType.FCM) {
                            if (TidyChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = TidyChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = TidyChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (TidyChangeUtils.INSTANCE.getLastNoticeType() == TidyChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = TidyChangeUtils.NoticeType.CLEAN;
                                } else if (TidyChangeUtils.INSTANCE.getLastNoticeType() == TidyChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = TidyChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = TidyChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = TidyChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (TidyChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == TidyChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = TidyChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = TidyChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = TidyNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = TidyNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = TidyNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = TidyNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        TidyManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType, event);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", TidyManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", TidyManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", TidyManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + TidyManager.code;
        } else if (id == 2) {
            return '퀁' + TidyManager.code;
        } else {
            if (id == 3) {
                return '퀂' + TidyManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + TidyManager.code;
                } else {
                    return '퀃' + TidyManager.code;
                }
            }
        }
    }
}
