package com.gator.file.old.shownotificy;


import android.util.Log;

import com.gator.file.old.opdj.nt.GatorNtBuilder;
import com.gator.file.old.opdj.nt.GatorNtInfo;
import com.gator.file.old.GatorManager;
import com.gator.file.old.FirebaseUtils;
import com.gator.file.old.change.GatorChangeUtils;
import com.gator.file.old.use.GatorNotiTimesHelper;

import java.util.Random;

public class GatorNtSendTryer {

    public GatorNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, GatorChangeUtils.NoticeType noticeType, GatorNotiTimesHelper.Event event) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", GatorManager.mContext);
        if (!GatorManager.INSTANCE.isForeground() && !GatorManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = GatorManager.isScreenOn() && GatorManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", GatorManager.mContext);
            } else {
                boolean isNotificationEnabled = GatorManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + GatorNtTimeUtil.isCoolTime());
                if (!GatorNtTimeUtil.isCoolTime()) {
                    GatorNtInfo dateBean;
                    if (isNotificationEnabled) {
                        GatorChangeUtils.NoticeType currentNoticeType = GatorChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == GatorChangeUtils.NoticeType.FCM) {
                            if (GatorChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = GatorChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = GatorChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (GatorChangeUtils.INSTANCE.getLastNoticeType() == GatorChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = GatorChangeUtils.NoticeType.CLEAN;
                                } else if (GatorChangeUtils.INSTANCE.getLastNoticeType() == GatorChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = GatorChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = GatorChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = GatorChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (GatorChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == GatorChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = GatorChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = GatorChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = GatorNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = GatorNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = GatorNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = GatorNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        GatorManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType, event);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", GatorManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", GatorManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", GatorManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + GatorManager.code;
        } else if (id == 2) {
            return '퀁' + GatorManager.code;
        } else {
            if (id == 3) {
                return '퀂' + GatorManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + GatorManager.code;
                } else {
                    return '퀃' + GatorManager.code;
                }
            }
        }
    }
}
