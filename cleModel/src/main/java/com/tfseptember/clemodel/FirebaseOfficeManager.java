package com.tfseptember.clemodel;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.tfseptember.clemodel.change.HotelHousejChangeUtils;
import com.tfseptember.clemodel.utils.SimplyFloorSPUtils;

/**
 * @author Admin
 */
public class FirebaseOfficeManager {
    private static boolean isInited = false;
    private static boolean isFetchSuccessful = false;


    public static void initCloud() {
        if (isInited) {
            return;
        }
        isInited = true;

        initRemoteConfigSettings();
        scheduleUpdateConfig();
    }

    private static void initRemoteConfigSettings() {
        FirebaseRemoteConfigSettings firebaseRemoteConfig = new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(0).build();
        FirebaseRemoteConfig.getInstance().setConfigSettingsAsync(firebaseRemoteConfig);
        FirebaseRemoteConfig.getInstance().ensureInitialized().continueWith(task -> null);
    }

    /**
     * 循环拉取firebase配置
     */
    private static void scheduleUpdateConfig() { //每30分钟刷新一次。
        new Thread(() -> {
            while (true) {
                FirebaseRemoteConfig.getInstance().fetchAndActivate().addOnCompleteListener(task -> {
                    if (!isFetchSuccessful && task.isSuccessful()) {
                        isFetchSuccessful = true;
                        try {
                            String notify_sleep_time = getString(HotelHousejChangeUtils.INSTANCE.getCoolTimeStar(), "");
                            if (SimplyHouseworkrOrgManager.isDebug){
                                Log.e("aaa", "云端配置: 冷却时间："  + notify_sleep_time);
                            }
                            if (!TextUtils.isEmpty(notify_sleep_time)) {
                                var sleep_time = Long.parseLong(notify_sleep_time);
                                SimplyFloorSPUtils.putLong(HotelHousejChangeUtils.INSTANCE.getCoolTimeStar(), sleep_time);
                            }

                        } catch (NumberFormatException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                try {
                    Thread.sleep(30L * 1000 * 60);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    /**
     * 云控是否激活
     */
    boolean isActivate() {
        return isFetchSuccessful;
    }

    /**
     * 云控获取Long
     */
    long getLong(String key) {
        return FirebaseRemoteConfig.getInstance().getLong(key);
    }

    /**
     * 云控获取Boolean
     */
    boolean getBoolean(String key) {
        return FirebaseRemoteConfig.getInstance().getBoolean(key);
    }

    /**
     * 云控获取Double
     */
    double getDouble(String key) {
        return FirebaseRemoteConfig.getInstance().getDouble(key);
    }

    /**
     * 云控获取string
     */
    public static String getString(String key, String defaultValue) {
        String cloudValue = FirebaseRemoteConfig.getInstance().getString(key);
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING == cloudValue && defaultValue != null) {
            return defaultValue;
        }
        return cloudValue;
    }

    public static void getNoticSellpTime() {
        String notify_sleep_time = getString(HotelHousejChangeUtils.INSTANCE.getCoolTimeStar(), "");
        if (!TextUtils.isEmpty(notify_sleep_time)) {
            var sleep_time = Long.parseLong(notify_sleep_time);
            SimplyFloorSPUtils.putLong(HotelHousejChangeUtils.INSTANCE.getCoolTimeStar(), sleep_time);
        }
    }
}
