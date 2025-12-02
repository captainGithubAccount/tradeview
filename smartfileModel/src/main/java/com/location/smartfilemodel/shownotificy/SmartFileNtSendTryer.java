package com.location.smartfilemodel.shownotificy;


import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.FirebaseUtils;
import com.location.smartfilemodel.orgyy.nt.SmartFileNtBuilder;
import com.location.smartfilemodel.orgyy.nt.SmartFileNtInfo;

import java.util.Random;

public class SmartFileNtSendTryer {

    public SmartFileNtSendTryer() {
    }

    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM) {
        Log.e("xxx", "----------tryShowLocalPush---------- isRecentTask=" + isRecentTask + ", isHomeKey=" + isHomeKey + ", isScreenOpen=" + isScreenOpen + ", isFCM=" + isFCM);
        FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_count", "", SmartFileOrgManager.mContext);
        Log.e("xxx", "----------tryShowLocalPush---------- SmartFileOrgManager.INSTANCE.isForeground()=" + SmartFileOrgManager.INSTANCE.isForeground() + ", SmartFileOrgManager.INSTANCE.hasCreatingActivity()=" + SmartFileOrgManager.INSTANCE.hasCreatingActivity());
        if (!SmartFileOrgManager.INSTANCE.isForeground() && !SmartFileOrgManager.INSTANCE.hasCreatingActivity()) {
            boolean screenOn = SmartFileOrgManager.isScreenOn() && SmartFileOrgManager.isScreenLockOpen();
            if (!screenOn) {
                Log.e("xxx", "-------- screenOn=" + screenOn);
                FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_screenOn", "", SmartFileOrgManager.mContext);
            } else {
                boolean isNotificationEnabled = SmartFileOrgManager.isNotificationEnabled();
                Log.e("xxx", "-------- isNotificationEnabled=" + isNotificationEnabled);
                Log.e("xxx", "-------- isCoolTime=" + SmartFileNtTimeUtil.isCoolTime());
                if (!SmartFileNtTimeUtil.isCoolTime()) {
                    SmartFileNtInfo dateBean;
                    Random random = new Random();
                    int randomValue = random.nextInt(100); // 生成0-99的随机数
                    Log.d("xxx", "randomValue:  "+String.valueOf(randomValue));
                    int type_a = (int)FirebaseRemoteConfig.getInstance().getLong(SmartFileOrgManager.Type_A);
                    Log.d("xxx", "type_a:  "+String.valueOf(type_a));
                    if (!isHomeKey && !isScreenOpen && !isRecentTask) {
                        if (!isNotificationEnabled){
                            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SmartFileOrgManager.mContext);
                        }

                        if (isFCM && isNotificationEnabled) {
                            if(randomValue < type_a){//走清理通知
                                Log.d("xxx", "clean noti");
                                dateBean = SmartFileNtBuilder.buildNotifiData((new Random()).nextInt(4));
                                SmartFileOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);


                            }else{//走新奖励通知
                                Log.d("xxx", "reward noti");
                                dateBean = SmartFileNtBuilder.buildNotifiData(4);
                                SmartFileOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                            }
                        }else{
                            Log.d("xxx", "unuse noti");
                        }
                    } else {
                        if (isNotificationEnabled) {
                            if(randomValue < type_a){//走清理通知
                                Log.d("xxx", "clean noti2");
                                dateBean = SmartFileNtBuilder.buildNotifiData((new Random()).nextInt(4));
                                SmartFileOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);

                            }else{//走新奖励通知
                                Log.d("xxx", "reward noti2");
                                dateBean = SmartFileNtBuilder.buildNotifiData(4);
                                SmartFileOrgManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false);
                            }


                        }else {
                            Log.d("xxx", "unuse noti2");
                            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_no_Permission", "", SmartFileOrgManager.mContext);
                        }
                    }

                } else {
                    FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_isCoolTime", "", SmartFileOrgManager.mContext);
                }
            }
        } else {
            Log.e("xxx", "----------tryShowLocalPush---------- has resume Activity");
            FirebaseUtils.INSTANCE.setAnalyticsEvent("noti_touch_has_resume_Activity", "", SmartFileOrgManager.mContext);
        }
    }

    public static int getPushNotifyId(int id) {
        if (id == 1) {
            return '퀀' + SmartFileOrgManager.code;//1024
        } else if (id == 2) {
            return '퀁' + SmartFileOrgManager.code;//1025
        } else {
            if (id == 3) {
                return '퀂' + SmartFileOrgManager.code;//1026
            } else {
                if (id == 4) {
                    return '퀃' + SmartFileOrgManager.code;//1027
                }else if(id == 5){
                    return '퀃' + SmartFileOrgManager.code + 1 ;

                }else {
                    return '퀃' + SmartFileOrgManager.code;
                }
            }
        }
    }
}
