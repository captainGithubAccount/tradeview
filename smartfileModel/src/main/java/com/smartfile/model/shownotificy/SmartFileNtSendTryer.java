package com.smartfile.model.shownotificy;


import android.util.Log;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.FirebaseUtils;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.opdj.nt.SmartFileNtBuilder;
import com.smartfile.model.opdj.nt.SmartFileNtInfo;

import java.util.Random;

public class SmartFileNtSendTryer {

    public SmartFileNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, SmartFileChangeUtils.NoticeType noticeType) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SmartFileManager.mContext);
        if (!SmartFileManager.INSTANCE.isForeground() && !SmartFileManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SmartFileManager.isScreenOn() && SmartFileManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SmartFileManager.mContext);
            } else {
                boolean isNotificationEnabled = SmartFileManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SmartFileNtTimeUtil.isCoolTime());
                if (!SmartFileNtTimeUtil.isCoolTime()) {
                    SmartFileNtInfo dateBean;
                    if (isNotificationEnabled) {
                        SmartFileChangeUtils.NoticeType currentNoticeType = SmartFileChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == SmartFileChangeUtils.NoticeType.FCM) {
                            if (SmartFileChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = SmartFileChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = SmartFileChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (SmartFileChangeUtils.INSTANCE.getLastNoticeType() == SmartFileChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SmartFileChangeUtils.NoticeType.CLEAN;
                                } else if (SmartFileChangeUtils.INSTANCE.getLastNoticeType() == SmartFileChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = SmartFileChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = SmartFileChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = SmartFileChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (SmartFileChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == SmartFileChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = SmartFileChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = SmartFileChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = SmartFileNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = SmartFileNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = SmartFileNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = SmartFileNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        SmartFileManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SmartFileManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SmartFileManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SmartFileManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SmartFileManager.code;
        } else if (id == 2) {
            return '퀁' + SmartFileManager.code;
        } else {
            if (id == 3) {
                return '퀂' + SmartFileManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + SmartFileManager.code;
                } else {
                    return '퀃' + SmartFileManager.code;
                }
            }
        }
    }
}
