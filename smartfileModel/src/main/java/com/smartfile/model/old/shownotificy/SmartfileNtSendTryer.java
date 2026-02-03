package com.smartfile.model.old.shownotificy;


import android.util.Log;

import com.smartfile.model.old.FirebaseUtils;
import com.smartfile.model.old.opdj.nt.SmartfileNtBuilder;
import com.smartfile.model.old.opdj.nt.SmartfileNtInfo;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.change.SmartfileChangeUtils;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;

import java.util.Random;

public class SmartfileNtSendTryer {

    public SmartfileNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, SmartfileChangeUtils.NoticeType noticeType, SmartfileNotiTimesHelper.Event event) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SmartfileManager.mContext);
        if (!SmartfileManager.INSTANCE.isForeground() && !SmartfileManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SmartfileManager.isScreenOn() && SmartfileManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SmartfileManager.mContext);
            } else {
                boolean isNotificationEnabled = SmartfileManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SmartfileNtTimeUtil.isCoolTime());
                if (!SmartfileNtTimeUtil.isCoolTime()) {
                    SmartfileNtInfo dateBean;
                    if (isNotificationEnabled) {
                        SmartfileChangeUtils.NoticeType currentNoticeType = SmartfileChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == SmartfileChangeUtils.NoticeType.FCM) {
                            if (SmartfileChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = SmartfileChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = SmartfileChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (SmartfileChangeUtils.INSTANCE.getLastNoticeType() == SmartfileChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SmartfileChangeUtils.NoticeType.CLEAN;
                                } else if (SmartfileChangeUtils.INSTANCE.getLastNoticeType() == SmartfileChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = SmartfileChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = SmartfileChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = SmartfileChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (SmartfileChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == SmartfileChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SmartfileChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = SmartfileChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = SmartfileNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = SmartfileNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = SmartfileNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = SmartfileNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        SmartfileManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType, event);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SmartfileManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SmartfileManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SmartfileManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SmartfileManager.code;
        } else if (id == 2) {
            return '퀁' + SmartfileManager.code;
        } else {
            if (id == 3) {
                return '퀂' + SmartfileManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + SmartfileManager.code;
                } else {
                    return '퀃' + SmartfileManager.code;
                }
            }
        }
    }
}
