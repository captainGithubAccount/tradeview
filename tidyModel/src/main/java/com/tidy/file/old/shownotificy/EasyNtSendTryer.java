package com.tidy.file.old.shownotificy;


import android.util.Log;

import com.tidy.file.old.EasyManager;
import com.tidy.file.old.EasyFirebaseUtils;
import com.tidy.file.old.change.EasyChangeUtils;
import com.tidy.file.old.opdj.nt.EasyNtBuilder;
import com.tidy.file.old.opdj.nt.EasyNtInfo;
import com.tidy.file.old.use.EasyNotiTimesHelper;

import java.util.Random;

public class EasyNtSendTryer {

    public EasyNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, EasyChangeUtils.NoticeType noticeType, EasyNotiTimesHelper.Event event) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        EasyFirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", EasyManager.mContext);
        if (!EasyManager.INSTANCE.isForeground() && !EasyManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = EasyManager.isScreenOn() && EasyManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                EasyFirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", EasyManager.mContext);
            } else {
                boolean isNotificationEnabled = EasyManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + EasyNtTimeUtil.isCoolTime());
                if (!EasyNtTimeUtil.isCoolTime()) {
                    EasyNtInfo dateBean;
                    if (isNotificationEnabled) {
                        EasyChangeUtils.NoticeType currentNoticeType = EasyChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == EasyChangeUtils.NoticeType.FCM) {
                            if (EasyChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = EasyChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = EasyChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (EasyChangeUtils.INSTANCE.getLastNoticeType() == EasyChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = EasyChangeUtils.NoticeType.CLEAN;
                                } else if (EasyChangeUtils.INSTANCE.getLastNoticeType() == EasyChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = EasyChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = EasyChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = EasyChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (EasyChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == EasyChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = EasyChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = EasyChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = EasyNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = EasyNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = EasyNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = EasyNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        EasyManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType, event);
                    }else {
                        EasyFirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", EasyManager.mContext);
                    }
                } else {
                    EasyFirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", EasyManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            EasyFirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", EasyManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + EasyManager.code;
        } else if (id == 2) {
            return '퀁' + EasyManager.code;
        } else {
            if (id == 3) {
                return '퀂' + EasyManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + EasyManager.code;
                } else {
                    return '퀃' + EasyManager.code;
                }
            }
        }
    }
}
