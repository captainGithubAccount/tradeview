package com.download.model.old.shownotificy;


import android.util.Log;

import com.download.model.old.opdj.nt.DownloadNtBuilder;
import com.download.model.old.opdj.nt.DownloadNtInfo;
import com.download.model.old.DownloadManager;
import com.download.model.old.FirebaseUtils;
import com.download.model.old.change.DownloadChangeUtils;
import com.download.model.old.use.DownloadNotiTimesHelper;

import java.util.Random;

public class DownloadNtSendTryer {

    public DownloadNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, DownloadChangeUtils.NoticeType noticeType, DownloadNotiTimesHelper.Event event) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", DownloadManager.mContext);
        if (!DownloadManager.INSTANCE.isForeground() && !DownloadManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = DownloadManager.isScreenOn() && DownloadManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", DownloadManager.mContext);
            } else {
                boolean isNotificationEnabled = DownloadManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + DownloadNtTimeUtil.isCoolTime());
                if (!DownloadNtTimeUtil.isCoolTime()) {
                    DownloadNtInfo dateBean;
                    if (isNotificationEnabled) {
                        DownloadChangeUtils.NoticeType currentNoticeType = DownloadChangeUtils.NoticeType.PROCESS;
                        Random random = new Random();
                        int result = random.nextInt(2); // 生成 0 或 1
                        if (noticeType == DownloadChangeUtils.NoticeType.FCM) {
                            if (DownloadChangeUtils.INSTANCE.getLastNoticeType() == null) {
                                // 上次为 null 本次随机  Process  or Clean
                                if (result == 0) {
                                    currentNoticeType = DownloadChangeUtils.NoticeType.PROCESS;
                                } else {
                                    currentNoticeType = DownloadChangeUtils.NoticeType.CLEAN;
                                }
                            } else {
                                if (DownloadChangeUtils.INSTANCE.getLastNoticeType() == DownloadChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = DownloadChangeUtils.NoticeType.CLEAN;
                                } else if (DownloadChangeUtils.INSTANCE.getLastNoticeType() == DownloadChangeUtils.NoticeType.CLEAN) {
                                    currentNoticeType = DownloadChangeUtils.NoticeType.PROCESS;
                                } else {
                                    if (result == 0) {
                                        currentNoticeType = DownloadChangeUtils.NoticeType.PROCESS;
                                    } else {
                                        currentNoticeType = DownloadChangeUtils.NoticeType.CLEAN;
                                    }
                                }
                            }
                        } else {
                            if (DownloadChangeUtils.INSTANCE.getLastNoticeType() == noticeType) {
                                if (noticeType == DownloadChangeUtils.NoticeType.PROCESS) {
                                    currentNoticeType = DownloadChangeUtils.NoticeType.CLEAN;
                                } else {
                                    currentNoticeType = DownloadChangeUtils.NoticeType.PROCESS;
                                }
                            } else {
                                currentNoticeType = noticeType;
                            }
                        }
                        switch (currentNoticeType.name()) {
                            case "CLEAN":
                                dateBean = DownloadNtBuilder.buildNotifiData(0);
                                break;
                            case "PROCESS":
                                dateBean = DownloadNtBuilder.buildNotifiData(1);
                                break;
                            case "BATTERY":
                                dateBean = DownloadNtBuilder.buildNotifiData(2);
                                break;
                            default:
                                dateBean = DownloadNtBuilder.buildNotifiData(0);
                                break;
                        }
                        Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                        DownloadManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, currentNoticeType, event);
                    }else {
                        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", DownloadManager.mContext);
                    }
                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", DownloadManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", DownloadManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + DownloadManager.code;
        } else if (id == 2) {
            return '퀁' + DownloadManager.code;
        } else {
            if (id == 3) {
                return '퀂' + DownloadManager.code;
            } else {
                if (id == 4) {
                    return '퀃' + DownloadManager.code;
                } else {
                    return '퀃' + DownloadManager.code;
                }
            }
        }
    }
}
