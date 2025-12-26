package com.smartfile.model.shownotificy;


import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.smartfile.NoticeTypeRandomizer;
import com.smartfile.model.CleanTimeManager;
import com.smartfile.model.FcmNotificationManager;
import com.smartfile.model.SmartFileManager;
import com.smartfile.model.FirebaseUtils;
import com.smartfile.model.change.DeviceTokenRequest;
import com.smartfile.model.change.ServerTimeResponse;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.change.SmartFileMsgApi;
import com.smartfile.model.opdj.msg.SmartFileRetrofitUtils;
import com.smartfile.model.opdj.nt.SmartFileNtBuilder;
import com.smartfile.model.opdj.nt.SmartFileNtInfo;

import java.util.Random;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SmartFileNtSendTryer {

    public SmartFileNtSendTryer() {
    }

    static long serverLastTime = 0;
    public static void tryShowLocalNotifi(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, SmartFileChangeUtils.NoticeType noticeType) {
        SharedPreferences prefs = SmartFileManager.mContext.getSharedPreferences("token", MODE_PRIVATE);
        String token = prefs.getString("token", "");


        DeviceTokenRequest request = new DeviceTokenRequest();
        request.setToken(token);
        serverLastTime = 0;


        // 方式1：不带请求参数
        ((SmartFileMsgApi) SmartFileRetrofitUtils.create(SmartFileMsgApi.class))
                .getLastNotifyTime(request)
                .enqueue(new Callback<ServerTimeResponse>() {
                    @Override
                    public void onResponse(Call<ServerTimeResponse> call, Response<ServerTimeResponse> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            ServerTimeResponse timeResponse = response.body();
                            int code = timeResponse.getCode();
                            String message = timeResponse.getMsg();
                            try {
                                // 处理返回的数据
                                Log.d("ServerTime", "code: " + code + ", time: " + serverLastTime);

                                if (timeResponse.getData() != null) {
                                    long currentTime = timeResponse.getData().getCurrentTime();
                                    long lastedHighNotifyTime = timeResponse.getData().getLastedHighNotifyTime();
                                    serverLastTime = lastedHighNotifyTime;

                                    // 处理失败情况
                                    tryShowLocalNotifiImpl(isRecentTask, isHomeKey, isScreenOpen, isFCM, noticeType);
                                }
                            }catch (Exception e){
                                serverLastTime = 0;

                                // 处理失败情况
                                tryShowLocalNotifiImpl(isRecentTask, isHomeKey, isScreenOpen, isFCM, noticeType);
                                e.printStackTrace();
                            }



                        }else{
                            serverLastTime = 0;
                            // 处理失败情况
                            tryShowLocalNotifiImpl(isRecentTask, isHomeKey, isScreenOpen, isFCM, noticeType);

                        }
                    }

                    @Override
                    public void onFailure(Call<ServerTimeResponse> call, Throwable t) {
                        serverLastTime = 0;
                        // 处理失败情况
                        tryShowLocalNotifiImpl(isRecentTask, isHomeKey, isScreenOpen, isFCM, noticeType);

                    }
                });
    }

    //最终的发送通知的地方
    public static void tryShowLocalNotifiImpl(boolean isRecentTask, boolean isHomeKey, boolean isScreenOpen, boolean isFCM, SmartFileChangeUtils.NoticeType noticeType) {
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

                    Random random2 = new Random();
                    int randomValue = random2.nextInt(100); // 生成0-99的随机数
                    Log.d("xxx", "randomValue:  "+String.valueOf(randomValue));
                    int type_a = (int) FirebaseRemoteConfig.getInstance().getLong(SmartFileManager.Type_A);
                    Log.d("xxx", "type_a:  "+String.valueOf(type_a));
                    if (isNotificationEnabled) {
                        if(randomValue < type_a){//走清理通知

                            SmartFileChangeUtils.NoticeType currentNoticeType = SmartFileChangeUtils.NoticeType.PROCESS;


                            if (noticeType == SmartFileChangeUtils.NoticeType.FCM) {
                                CleanTimeManager.INSTANCE.checkAndExecuteCleanup(new Function0<Unit>() {
                                    //五分钟内
                                    @Override
                                    public Unit invoke() {
                                        CleanTimeManager.INSTANCE.recordCleanupTime();
                                        if(SmartFileChangeUtils.INSTANCE.getLastNoticeType() != null) {
                                            Log.d("CleanupManager", "fcm五分钟内：上次类型--" + SmartFileChangeUtils.INSTANCE.getLastNoticeType().name());
                                        }
                                        if(SmartFileChangeUtils.INSTANCE.getLastNoticeType() != null){
                                            SmartFileChangeUtils.NoticeType currentNoticeType = NoticeTypeRandomizer.getRandomNoticeType();
                                        }else{
                                            SmartFileChangeUtils.NoticeType currentNoticeType = NoticeTypeRandomizer.getRandomNoticeTypeNoLimit();
                                        }

                                        next(currentNoticeType);
                                        Log.d("CleanupManager", "fcm五分钟内：这次类型--" + currentNoticeType.name());
                                        return null;
                                    }
                                }, new Function0<Unit>() {
                                    //五分钟外
                                    @Override
                                    public Unit invoke() {
                                        if(SmartFileChangeUtils.INSTANCE.getLastNoticeType() != null){
                                            Log.d("CleanupManager", "fcm五分钟外：上次类型--" + SmartFileChangeUtils.INSTANCE.getLastNoticeType().name());
                                        }
                                        SmartFileChangeUtils.NoticeType currentNoticeType = NoticeTypeRandomizer.getRandomNoticeTypeNoLimit();
                                        next(currentNoticeType);
                                        Log.d("CleanupManager", "fcm五分钟外：这次类型--" + currentNoticeType.name());
                                        return null;
                                    }
                                });

                            } else {
                                CleanTimeManager.INSTANCE.checkAndExecuteCleanup(new Function0<Unit>() {
                                    //五分钟内
                                    @Override
                                    public Unit invoke() {
                                        if(SmartFileChangeUtils.INSTANCE.getLastNoticeType() != null) {
                                            Log.d("CleanupManager", "local五分钟内：上次类型--" + SmartFileChangeUtils.INSTANCE.getLastNoticeType().name());
                                        }

                                        CleanTimeManager.INSTANCE.recordCleanupTime();
                                        if(SmartFileChangeUtils.INSTANCE.getLastNoticeType() != null){
                                            SmartFileChangeUtils.NoticeType currentNoticeType = NoticeTypeRandomizer.getRandomNoticeType();
                                        }else{
                                            SmartFileChangeUtils.NoticeType currentNoticeType = NoticeTypeRandomizer.getRandomNoticeTypeNoLimit();
                                        }

                                        next(currentNoticeType);
                                        Log.d("CleanupManager", "local五分钟内：这次类型--" + currentNoticeType.name());
                                        return null;
                                    }
                                }, new Function0<Unit>() {
                                    //五分钟外
                                    @Override
                                    public Unit invoke() {
                                        if(SmartFileChangeUtils.INSTANCE.getLastNoticeType() != null) {
                                            Log.d("CleanupManager", "local五分钟外：上次类型--" + SmartFileChangeUtils.INSTANCE.getLastNoticeType().name());
                                        }
                                        SmartFileChangeUtils.NoticeType currentNoticeType = NoticeTypeRandomizer.getRandomNoticeTypeNoLimit();
                                        next(currentNoticeType);
                                        Log.d("CleanupManager", "local五分钟外：这次类型--" + currentNoticeType.name());
                                        return null;
                                    }
                                });
                            }
                            Log.d("NotificationManager", "通知类型： " +noticeType.name());

                        }else{//走新奖励通知
                            Log.d("xxx", "reward noti");
                            SmartFileNtInfo dateBean = SmartFileNtBuilder.buildNotifiData(4, false);
                            SmartFileManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, SmartFileChangeUtils.NoticeType.REWARD, false);
                        }


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


    public static void next(SmartFileChangeUtils.NoticeType currentNoticeType){
        SmartFileChangeUtils.NoticeType finalCurrentNoticeType = currentNoticeType;
        FcmNotificationManager.INSTANCE.checkAndTriggerNotification(serverLastTime, new Function0<Unit>() {
            @Override
            public Unit invoke() {
                SmartFileNtInfo dateBean;
                switch (finalCurrentNoticeType.name()) {
                    case "CLEAN":
                        dateBean = SmartFileNtBuilder.buildNotifiData(0, true);
                        break;
                    case "PROCESS":
                        dateBean = SmartFileNtBuilder.buildNotifiData(1, true);
                        break;
                    case "BATTERY":
                        dateBean = SmartFileNtBuilder.buildNotifiData(2, true);
                        break;
                    default:
                        dateBean = SmartFileNtBuilder.buildNotifiData(0, true);
                        break;
                }
                Log.e("aaa", "tryShowLocalNotifi: -- 通知 type = " + dateBean.getTypedName());
                SmartFileManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), false, false, finalCurrentNoticeType, true);
                return null;
            }
        }, new Function0<Unit>() {
            @Override
            public Unit invoke() {
                SmartFileNtInfo dateBean;
                switch (finalCurrentNoticeType.name()) {
                    case "CLEAN":
                        dateBean = SmartFileNtBuilder.buildNotifiData(0, false);
                        break;
                    case "PROCESS":
                        dateBean = SmartFileNtBuilder.buildNotifiData(1, false);
                        break;
                    case "BATTERY":
                        dateBean = SmartFileNtBuilder.buildNotifiData(2, false);
                        break;
                    default:
                        dateBean = SmartFileNtBuilder.buildNotifiData(0, false);
                        break;
                }

                SmartFileManager.showSceneNotify(dateBean.getNotId(), dateBean.getPendingIntent(), dateBean.getRemoteBig(), dateBean.getRemoteMid(), dateBean.getRemoteSmall(), true, false, finalCurrentNoticeType, false);
                return null;
            }
        });
    }


    //为了预防以后要改回来，就只需要修改这个方法即可，避免多处修改

    public static int getPushNotifyId(int id, boolean ishigh) {
        if(id == 4){//礼物通知，单独展示
            return '퀃' + SmartFileManager.code;//1027
        }
        if(ishigh){
            return SmartFileNtSendTryer.getHighPushNotifyId(id);
        }else{
            return SmartFileNtSendTryer.getLowPushNotifyId(id);
        }

    }
    public static int getHighPushNotifyId(int id) {
        //为了实现覆盖效果所以使用同一个通知id
        return '퀀' + SmartFileManager.code;//1024
        /*if (id == 1) {
            return '퀀' + SmartFileManager.code;//1024
        } else if (id == 2) {
            return '퀁' + SmartFileManager.code;//1025
        } else {
            if (id == 3) {
                return '퀂' + SmartFileManager.code;//1026
            } else {
                if (id == 4) {
                    return '퀃' + SmartFileManager.code;//1027
                }else if(id == 5){
                    return '퀃' + SmartFileManager.code + 1 ;

                }else {
                    return '퀃' + SmartFileManager.code;
                }
            }
        }*/
    }

    public static int getLowPushNotifyId(int id) {
        //为了实现覆盖效果所以使用同一个通知id
        return '퀁' + SmartFileManager.code;//1025
    }
}
