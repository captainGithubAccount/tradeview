package com.recover.redate.shownotificy;


import android.util.Log;

import com.recover.redate.RecoverOrgManager;
import com.recover.redate.FirebaseUtils;
import com.recover.redate.change.RecoverChangeUtils;
import com.recover.redate.opdj.nt.RecoverNtBuilder;
import com.recover.redate.opdj.nt.RecoverNtInfo;

import java.util.Random;

public class RecoverNtSendTryer {

    public RecoverNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, RecoverChangeUtils.NoticeType noticeType) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", RecoverOrgManager.mContext);
        if (!RecoverOrgManager.INSTANCE.isForeground() && !RecoverOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = RecoverOrgManager.isScreenOn() && RecoverOrgManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", RecoverOrgManager.mContext);
            } else {
                boolean isNotificationEnabled = RecoverOrgManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + RecoverNtTimeUtil.isCoolTime());
                if (!RecoverNtTimeUtil.isCoolTime()) {
                    RecoverNtInfo dateBean;
                    if (isNotificationEnabled) {
                        RecoverChangeUtils.NoticeType currentNoticeType = RecoverChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == RecoverChangeUtils.NoticeType.FCM) {
                            if (RecoverChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = RecoverChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = RecoverChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (RecoverChangeUtils.INSTANCE.getLastNoticeType() == RecoverChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = RecoverChangeUtils.NoticeType.CLEAN;
                                } else if (RecoverChangeUtils.INSTANCE.getLastNoticeType() == RecoverChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = RecoverChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = RecoverChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = RecoverChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (RecoverChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == RecoverChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = RecoverChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = RecoverChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = RecoverNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = RecoverNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = RecoverNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = RecoverNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        RecoverOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", RecoverOrgManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", RecoverOrgManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", RecoverOrgManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + RecoverOrgManager.code;
        } else if (id == 2) {
            return '퀁' + RecoverOrgManager.code;
        } else {
            if (id == 3) {
                return '퀂' + RecoverOrgManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + RecoverOrgManager.code;
                } else {
                    return '퀃' + RecoverOrgManager.code;
                }
            }
        }
    }
}
