package com.smartfile.model;

import static android.content.Context.MODE_PRIVATE;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.smartfile.model.change.DeviceTokenRequest;
import com.smartfile.model.change.ServerTimeResponse;
import com.smartfile.model.change.SmartFileChangeUtils;
import com.smartfile.model.change.SmartFileMsgApi;
import com.smartfile.model.opdj.SmartFileClockManager;
import com.smartfile.model.opdj.SmartFileJober;
import com.smartfile.model.opdj.SmartFile1Service;
import com.smartfile.model.opdj.SmartFileUserUtils;
import com.smartfile.model.opdj.msg.SmartFileMsgUploader;
import com.smartfile.model.opdj.msg.SmartFileRetrofitUtils;
import com.smartfile.model.opdj.nt.SmartFileNtCountUtil;
import com.smartfile.model.opdj.nt.SmartFileNtFgService;
import com.smartfile.model.shownotificy.SmartFileNtSender;
import com.smartfile.model.opdj.nt.SmartFileNtUtils;
import com.smartfile.model.utils.SmartFileSPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.smartfile.model.opdj.SmartFileReceiveRegister;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Keep
public class SmartFileManager {
    private static final List<Activity> visibleActivities = new LinkedList<>();
    private static final List<Activity> creatingActivities = new LinkedList<>();
    private static final List<Activity> livingActivities = new LinkedList<>();
    private static WeakReference currActivity = new WeakReference((Object) null);
    public static @Nullable Context mContext;
    public static final @NotNull Handler handler = new Handler(Looper.getMainLooper());
    private static long pausedTime;
    private static boolean isPaused;
    public static final SmartFileManager INSTANCE = new SmartFileManager();
    public static String mainProcessName;
    public static String workManagerTag = "OrangeWorker3521";
    public static int code = 10214;
    public static boolean isDebug = true;


    public static String getResString(int resId) {
        return mContext.getString(resId);
    }

    public final @Nullable Context getContext() {
        return mContext;
    }

    public final @NotNull Handler getHandler() {
        return handler;
    }

    public final void startNotifyService(boolean isFromActivity) {
        if (isDebug) {
            Log.e("xxx", "AAManager startNotifyService");
        }
        if (SmartFileNtUtils.isNotificationEnabled()) {
            SmartFileNtFgService.startNotifyService(isFromActivity);
        }
    }

    public final void startTwoService() {
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        SmartFile1Service.tryStartLaunchMainService();
    }

    public final long getPausedTime() {
        return pausedTime;
    }

    public final void setPausedTime(long var1) {
        pausedTime = var1;
    }

    public final boolean isPaused() {
        return isPaused;
    }

    public final void setPaused(boolean var1) {
        isPaused = var1;
    }

    public static String getString(int stringResId) {
        return mContext.getString(stringResId);
    }

    public static boolean isScreenOn() {
        PowerManager manager = (PowerManager) INSTANCE.getContext().getSystemService(Context.POWER_SERVICE);
        return manager.isInteractive();
    }

    public static boolean isScreenLockOpen() {
        KeyguardManager nKeyguardManager = (KeyguardManager) mContext.getSystemService(Context.KEYGUARD_SERVICE);
        return !nKeyguardManager.isKeyguardLocked();
    }

    public static boolean isValidActivity(Activity activity) {
        return activity != null && !activity.isFinishing() && !activity.isDestroyed();
    }

    public void killAdActivityAndJump() {
        Log.e("xxx", "killAllActivity");
        Activity currentActivity = this.getCurrActivity();
        if (isValidActivity(currentActivity)) {
            currentActivity.finish();
        }

    }

    private void createNotificationChannels(Context context) {
        // 只有 Android 8.0 及以上才需要创建渠道
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {


            NotificationChannel sound = new NotificationChannel(
                    context.getString(R.string.channelid_sound) /*+ SmartFileManager.code*/,
                    context.getString(R.string.chan_name_sound) + SmartFileManager.code,
                    NotificationManager.IMPORTANCE_HIGH
            );
            sound.setLockscreenVisibility(1);
            sound.setDescription("SilentSmart");
            sound.enableLights(false);
            sound.enableVibration(true);//震动
            Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                    .build();

            sound.setSound(soundUri, audioAttributes);//系统默认声音
            sound.setLightColor(0);
            sound.setVibrationPattern(new long[0]);



            NotificationChannel silent = new NotificationChannel(
                    context.getString(R.string.channelid_silent) /*+ SmartFileManager.code*/,
                    context.getString(R.string.chan_name_silent) + SmartFileManager.code,
                    NotificationManager.IMPORTANCE_LOW
            );
            silent.setLockscreenVisibility(1);
            silent.setDescription("SilentSmart2");
            silent.setSound(null, null);//静音
            silent.enableLights(false);//不震动
            silent.enableVibration(false);
            silent.setLightColor(0);
            silent.setVibrationPattern(new long[0]);

            // 创建所有渠道
            NotificationManager manager = context.getSystemService(NotificationManager.class);
            manager.createNotificationChannels(Arrays.asList(
                    sound,
                    silent
            ));
        }
    }


    public final void initCore(Application application, String packageName, Boolean debug) {
        Log.i("xxx", "AAManager initCore");
        mContext = application;

        createNotificationChannels(application);

        //todo url
        String token  = SmartFileManager.mContext.getSharedPreferences("token", MODE_PRIVATE).getString("token", "");
//        Log.e("TAG-->>token", token);


        mainProcessName = packageName;
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            // 检查 Firebase 初始化
            if (FirebaseApp.getApps(application).isEmpty()) {
                Log.e("Firebase", "Firebase not initialized");
                FirebaseApp.initializeApp(application);
            }

            initFirebaseRemoteConfigJava();
            FirebaseUtils.INSTANCE.initFirebase(application);
            FirebaseManager.initCloud();


            SmartFileUserTimer.firstIn();
            SmartFileReceiveRegister.startMonitor();
            SmartFileUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SmartFileJober.buildWorkerRequest(mContext);
            SmartFileClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());



            int hightimes = (int) FirebaseRemoteConfig.getInstance().getLong(local_hightimes);
            int high_coldtime = (int) FirebaseRemoteConfig.getInstance().getLong(finish_coldtime);
            FcmNotificationManager.INSTANCE.init(application, hightimes, high_coldtime);
//            NotificationManager.INSTANCE.setMaxHighNotifications(hightimes);
            CleanTimeManager.INSTANCE.init(application);


            FirebaseInstallations.getInstance().getId()
                    .addOnCompleteListener(new OnCompleteListener<String>() {
                        @Override
                        public void onComplete(@NonNull Task<String> task) {
                            if (task.isSuccessful()) {
                                String installationId = task.getResult();
                                CleanTimeManager.INSTANCE.setAppinstanceid(installationId);
                                Log.d("Firebase", "Installation ID: " + installationId);
                            } else {
                                Log.e("Firebase", "Failed to get Installation ID", task.getException());
                            }
                        }
                    });

        }
    }

    public static String Type_A = "Type_A";
    public static String local_hightimes = "local_hightimes";
    public static String finish_coldtime = "finish_coldtime";
    public static void initFirebaseRemoteConfigJava() {
        FirebaseRemoteConfig remoteConfig = FirebaseRemoteConfig.getInstance();

        // 设置默认值
        Map<String, Object> defaultValues = new HashMap<>();
        defaultValues.put(Type_A, "");
        defaultValues.put(local_hightimes, 0);//high次数
        defaultValues.put(finish_coldtime, 0);//冷却时间

        remoteConfig.setDefaultsAsync(defaultValues);
        remoteConfig.fetchAndActivate();
        remoteConfig.addOnConfigUpdateListener(
                new ConfigUpdateListener() {
                    @Override
                    public void onUpdate(@NonNull ConfigUpdate configUpdate) {
                        if(configUpdate.getUpdatedKeys().contains("Type_A")
                                || configUpdate.getUpdatedKeys().contains("local_hightimes")
                                || configUpdate.getUpdatedKeys().contains("finish_coldtime")) {
                            remoteConfig.activate();
                        }
                    }

                    @Override
                    public void onError(@NonNull FirebaseRemoteConfigException error) {

                    }
                }
        );
    }


    public static void tryUpdateToken() {
        SmartFileMsgUploader.getInstance().tryUpdateToken(mContext);
    }

    private final void setCurrentActivity(Activity activity) {
        if (activity == null) {
            currActivity = new WeakReference((Object) null);
        } else if (currActivity.get() == null || (Activity) currActivity.get() != activity) {
            currActivity = new WeakReference(activity);
        }

    }

    public final boolean isForeground() {
        return !visibleActivities.isEmpty();
    }

    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartFileChangeUtils.NoticeType noticeType, boolean ishigh) {
        FirebaseUtils.INSTANCE.setAnalyticsEvent("local_trigger_sent","",SmartFileManager.mContext);
        SmartFileNtSender.showSceneNtNew(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, ishigh);
    }


    /*
    *//**
    *  @param lasthightime: 上次高级别通知的展示时间（网络和本地）
    * *//*
    public static void showSceneNotify(long lasthightime, int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartFileChangeUtils.NoticeType noticeType) {
//        SmartFileNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);

        SharedPreferences prefs = SmartFileManager.mContext.getSharedPreferences("token", MODE_PRIVATE);
        String token = prefs.getString("token", "");


        DeviceTokenRequest request = new DeviceTokenRequest();
        request.setToken(token);

        triggerNotification(serverLastTime, notifyId, pendingIntent, remoteViewsBig,
                remoteViewsMid, remoteViewsMini, isSilent,
                isIgnoreLastPushTime, noticeType);


        // 方式1：不带请求参数
        ((SmartFileMsgApi) SmartFileRetrofitUtils.create(SmartFileMsgApi.class))
                .getLastNotifyTime(request)
                .enqueue(new Callback<ServerTimeResponse>() {
                    @Override
                    public void onResponse(Call<ServerTimeResponse> call, Response<ServerTimeResponse> response) {
                        long serverLastTime = 0L;
                        if (response.isSuccessful() && response.body() != null) {
                            ServerTimeResponse timeResponse = response.body();
                            int code = timeResponse.getCode();
                            String message = timeResponse.getMsg();
                            try {

                                if (timeResponse.getData() != null) {
                                    long currentTime = timeResponse.getData().getCurrentTime();
                                    long lastedHighNotifyTime = timeResponse.getData().getLastedHighNotifyTime();

                                    serverLastTime = lastedHighNotifyTime;
                                }
                            }catch (Exception e){
                                e.printStackTrace();
                            }

                            // 处理返回的数据
                            Log.d("ServerTime", "code: " + code + ", time: " + serverLastTime);



                        }else{
                            triggerNotification(serverLastTime, notifyId, pendingIntent, remoteViewsBig,
                                    remoteViewsMid, remoteViewsMini, isSilent,
                                    isIgnoreLastPushTime, noticeType);
                        }
                    }

                    @Override
                    public void onFailure(Call<ServerTimeResponse> call, Throwable t) {
                        // 处理失败情况
                        triggerNotification(0, notifyId, pendingIntent, remoteViewsBig,
                                remoteViewsMid, remoteViewsMini, isSilent,
                                isIgnoreLastPushTime, noticeType);

                    }
                });


    }


    *//**
     * 触发通知显示的通用函数
     *//*
    private static void triggerNotification(long time, int notifyId, PendingIntent pendingIntent,
                                            RemoteViews remoteViewsBig, RemoteViews remoteViewsMid,
                                            RemoteViews remoteViewsMini, boolean isSilent,
                                            boolean isIgnoreLastPushTime,
                                            SmartFileChangeUtils.NoticeType noticeType) {
        FcmNotificationManager.INSTANCE.checkAndTriggerNotification(time, new Function0<Unit>() {
            @Override
            public Unit invoke() {
                SmartFileNtSender.showSceneNtNew(notifyId, pendingIntent, remoteViewsBig,
                        remoteViewsMid, remoteViewsMini, isSilent,
                        isIgnoreLastPushTime, noticeType, true);
                return null;
            }
        }, new Function0<Unit>() {
            @Override
            public Unit invoke() {
                SmartFileNtSender.showSceneNtNew(notifyId, pendingIntent, remoteViewsBig,
                        remoteViewsMid, remoteViewsMini, isSilent,
                        isIgnoreLastPushTime, noticeType, false);
                return null;
            }
        });
    }*/



    public static void setCount() {
        SmartFileNtCountUtil.setCount();
    }

    public final boolean hasCreatingActivity() {
        return creatingActivities.size() > 0;
    }

    private final boolean isCurrActivity(Activity activity) {
        return activity == this.getCurrActivity();
    }

    public static void saveLastPushTime() {
        long lastTime = SmartFileSPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && SmartFileUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = SmartFileSPUtils.getInt("last_show_scene_time_count", 0);
            SmartFileSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SmartFileSPUtils.putInt("last_show_scene_time_count", 1);
        }
        SmartFileSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    public static long getLastShowPushTime() {
        return SmartFileSPUtils.getLong("last_show_scene_time", 0L);
    }

    public final @Nullable Activity getCurrActivity() {
        return currActivity.get() == null ? null : (Activity) currActivity.get();
    }

    public final void killAllActivity() {
        Iterator<Activity> var3 = livingActivities.iterator();
        while (var3.hasNext()) {
            Activity activity = (Activity) var3.next();
            Log.e("xxx", "killAllActivity" + activity.getClass().getName());
            if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    private SmartFileManager() {
    }

    public static boolean isNotificationEnabled() {
        return SmartFileNtUtils.isNotificationEnabled();
    }

    public static boolean isMainProcess(Context context, String mainProcessName) {
        if (VERSION.SDK_INT >= 28) {
            Log.e("xxx", "Application.getProcessName()=" + Application.getProcessName());
        }
        if (VERSION.SDK_INT >= 28) {
            return Application.getProcessName().equals(mainProcessName);
        } else {
            int myPid = Process.myPid();
            ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            List<ActivityManager.RunningAppProcessInfo> infos = am.getRunningAppProcesses();
            if (infos != null && !infos.isEmpty()) {
                Iterator var114 = infos.iterator();
                while (var114.hasNext()) {
                    ActivityManager.RunningAppProcessInfo info = (ActivityManager.RunningAppProcessInfo) var114.next();
                    if (info.pid == myPid && mainProcessName.equals(info.processName)) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void testFcmToken(String token) {
        SmartFileMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            SmartFileSPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            SmartFileSPUtils.putLong("lastActivityOnPause", 0L);
            SmartFileManager.INSTANCE.setCurrentActivity(activity);
            SmartFileManager.creatingActivities.add(activity);
            SmartFileManager.livingActivities.add(activity);
            SmartFileManager.INSTANCE.setPaused(false);
        }

        public void onActivityStarted(@NotNull Activity activity) {
            SmartFileManager.visibleActivities.add(activity);
        }


        public void onActivityResumed(@NotNull Activity activity) {
            SmartFileSPUtils.putLong("lastActivityOnPause", 0L);
            SmartFileManager.INSTANCE.setCurrentActivity(activity);
            SmartFileManager.creatingActivities.remove(activity);
            SmartFileManager.INSTANCE.setPaused(false);
        }

        public void onActivityPaused(@NotNull Activity activity) {
            SmartFileManager.INSTANCE.setPaused(true);
            SmartFileManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            SmartFileManager.creatingActivities.remove(activity);
        }

        public void onActivityStopped(@NotNull Activity activity) {
            SmartFileManager.visibleActivities.remove(activity);
            SmartFileManager.creatingActivities.remove(activity);
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            if (SmartFileManager.INSTANCE.isCurrActivity(activity)) {
                SmartFileManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            SmartFileManager.creatingActivities.remove(activity);
            SmartFileManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }
}
