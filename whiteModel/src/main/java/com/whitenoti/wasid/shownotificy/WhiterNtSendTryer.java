package com.whitenoti.wasid.shownotificy;


import android.util.Log;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.WhiterFirebaseEventUtils;
import com.whitenoti.wasid.change.WhiterChangeUtils;
import com.whitenoti.wasid.opdj.nt.WhiterNtBuilder;
import com.whitenoti.wasid.opdj.nt.WhiterNtInfo;

import java.util.Random;

public class WhiterNtSendTryer {

    public WhiterNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, WhiterChangeUtils.NoticeType noticeType) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", WhiterManager.mContext);
        if (!WhiterManager.INSTANCE.isForeground() && !WhiterManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = WhiterManager.isScreenOn() && WhiterManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", WhiterManager.mContext);
            } else {
                boolean isNotificationEnabled = WhiterManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + WhiterNtTimeUtil.isCoolTime());
                if (!WhiterNtTimeUtil.isCoolTime()) {
                    WhiterNtInfo dateBean;
                    if (isNotificationEnabled) {
                        WhiterChangeUtils.NoticeType currentNoticeType = WhiterChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == WhiterChangeUtils.NoticeType.FCM) {
                            if (WhiterChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = WhiterChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = WhiterChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (WhiterChangeUtils.INSTANCE.getLastNoticeType() == WhiterChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = WhiterChangeUtils.NoticeType.CLEAN;
                                } else if (WhiterChangeUtils.INSTANCE.getLastNoticeType() == WhiterChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = WhiterChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = WhiterChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = WhiterChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (WhiterChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == WhiterChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = WhiterChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = WhiterChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = WhiterNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = WhiterNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = WhiterNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = WhiterNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        WhiterManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType);
                    }else {
                        WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", WhiterManager.mContext);
                    }
                } else {
                    WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", WhiterManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            WhiterFirebaseEventUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", WhiterManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + WhiterManager.code;
        } else if (id == 2) {
            return '퀁' + WhiterManager.code;
        } else {
            if (id == 3) {
                return '퀂' + WhiterManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + WhiterManager.code;
                } else {
                    return '퀃' + WhiterManager.code;
                }
            }
        }
    }
}
