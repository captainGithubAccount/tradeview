package com.speed.model.newest.use;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.speed.model.old.SpeedManager;
import com.speed.model.old.use.SpeedActionConstant;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

import java.util.HashMap;
import java.util.Map;

/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @version 1.0.0
 * Created by 2026年-01月
 * @autor lwj
 */

@Keep
public class SpeedLocalInit {

    //todo 修改
    public static String SPEED_ACCOUNT_TYPE = "com.speed.model.auth";
    public static String SPEED_AUTHORITY = "com.speed.model.provider";

//    ======================================================================================

    public static String isUseNewKeepAlive = "isUseNewKeepAlive";
    public static String highCount = "highCount";
    public static String highCoolTime = "highCoolTime";
    public static String lowCoolTime = "lowCoolTime";
    public static String heartCoolTime = "heartCoolTime";
    public static String jobCoolTime = "jobCoolTime";



    public static void initOldKeepAlive() {
        if(SpeedManager.isNotificationEnabled()) {
            SpeedManager.INSTANCE.startNotifyService(true, SpeedActionConstant.launchapp);
        }
        SpeedManager.INSTANCE.startTwoService();
    }

    private static void initFirebaseRemoteConfigJava() {
        FirebaseRemoteConfig remoteConfig = FirebaseRemoteConfig.getInstance();

        // 设置默认值
        Map<String, Object> defaultValues = new HashMap<>();
        defaultValues.put(isUseNewKeepAlive, 0);
        defaultValues.put(highCount, 0);
        defaultValues.put(highCoolTime, 0);
        defaultValues.put(lowCoolTime, 0);
        defaultValues.put(heartCoolTime, 30);
        defaultValues.put(jobCoolTime, 5);

        remoteConfig.setDefaultsAsync(defaultValues);
        remoteConfig.fetchAndActivate();
        remoteConfig.addOnConfigUpdateListener(
                new ConfigUpdateListener() {
                    @Override
                    public void onUpdate(@NonNull ConfigUpdate configUpdate) {
                        if(configUpdate.getUpdatedKeys().contains(isUseNewKeepAlive)
                            || configUpdate.getUpdatedKeys().contains(highCount)
                            || configUpdate.getUpdatedKeys().contains(highCoolTime)
                            || configUpdate.getUpdatedKeys().contains(lowCoolTime)
                            || configUpdate.getUpdatedKeys().contains(heartCoolTime)
                            || configUpdate.getUpdatedKeys().contains(jobCoolTime)
                        ) {
                            remoteConfig.activate();
                        }
                    }

                    @Override
                    public void onError(@NonNull FirebaseRemoteConfigException error) {

                    }
                }
        );
    }
    public static void initCore(Application application, String packageName, Boolean debug){
        SpeedManager.INSTANCE.initCore(application, packageName, debug);
    }

    public static void startService(Context context){
        ThreadUtils.getIoPool().execute(()->{
            // 步骤1：在IO线程检查网络
            boolean networkOk = NetworkUtils.isConnected() && NetworkUtils.isAvailable();
            // 步骤2：切换回主线程处理UI
            ThreadUtils.runOnUiThread(() -> {
                if (networkOk) {
                    initFirebaseRemoteConfigJava();
                    int isNewKeepAlive = (int) FirebaseRemoteConfig.getInstance().getLong(isUseNewKeepAlive);
                    Log.d("xxx", "isNewKeepAlive is "+String.valueOf(isNewKeepAlive));
                    if(isNewKeepAlive == 0){//0初始化新保活， 1不用新保活
                        //新保活初始化
                        SpeedSmartFileInitializer.init(context);
                        initOldKeepAlive();
                    }else{
                        //老保活初始化
                        initOldKeepAlive();
                    }
                }else{
                    initOldKeepAlive();
                }
            });
        });

    }
}
