package com.tidy.file.old;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
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

import com.tidy.file.old.use.EasyNotiTimesHelper;
import com.tidy.file.old.use.UsageDaysTracker;
import com.google.firebase.FirebaseApp;
import com.tidy.file.old.change.EasyChangeUtils;
import com.tidy.file.old.opdj.EasyClockManager;
import com.tidy.file.old.opdj.EasyJober;
import com.tidy.file.old.opdj.Easy1Service;
import com.tidy.file.old.opdj.EasyUserUtils;
import com.tidy.file.old.opdj.msg.EasyMsgUploader;
import com.tidy.file.old.opdj.nt.EasyNtCountUtil;
import com.tidy.file.old.opdj.nt.EasyNtFgService;
import com.tidy.file.old.shownotificy.EasyNtSender;
import com.tidy.file.old.opdj.nt.EasyNtUtils;
import com.tidy.file.old.utils.EasySPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.tidy.file.old.opdj.EasyReceiveRegister;

@Keep
public class EasyManager {
    private static final List<Activity> visibleActivities = new LinkedList<>();
    private static final List<Activity> creatingActivities = new LinkedList<>();
    private static final List<Activity> livingActivities = new LinkedList<>();
    private static WeakReference currActivity = new WeakReference((Object) null);
    public static @Nullable Context mContext;
    public static final @NotNull Handler handler = new Handler(Looper.getMainLooper());
    private static long pausedTime;
    private static boolean isPaused;
    public static final EasyManager INSTANCE = new EasyManager();
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

    public final void startNotifyService(boolean isFromActivity, String from) {//闹钟服务中启动的前台服务
        if (isDebug) {
            Log.e("xxx", "AAManager startNotifyService");
        }
        if (EasyNtUtils.isNotificationEnabled()) {
            EasyNtFgService.startNotifyService(isFromActivity, from);
        }
    }

    public final void startTwoService() {
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        Easy1Service.tryStartLaunchMainService();
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

    public final void initCore(Application application, String packageName, Boolean debug) {
        // 1. 【核心修复】必须先初始化 Firebase，才能拉起保活矩阵中的云控逻辑
        try {
            FirebaseApp.initializeApp(application);
        } catch (Exception e) {
            // 防止多进程重复初始化抛出异常
        }

        Log.i("xxx", "AAManager initCore");
        mContext = application;
        mainProcessName = packageName;
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }

            FirebaseUtils.INSTANCE.initFirebase(application);


            FirebaseManager.initCloud();
            initEasyNotiTimesHelper(application, debug);
            UsageDaysTracker.init(application);
            EasyUserTimer.firstIn();
            EasyReceiveRegister.startMonitor();
            EasyUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            EasyJober.buildWorkerRequest(mContext);
            EasyClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }

    }

    public static void initEasyNotiTimesHelper(Application context, boolean isDebug){
        // 1. 初始化（只需一次）
        EasyNotiTimesHelper.init(context);

        // 2. 设置调试模式
        EasyNotiTimesHelper.setDebugMode(isDebug);

        // 3. 打印当前统计信息
        EasyNotiTimesHelper.printStats();
    }


    public static void tryUpdateToken() {
        EasyMsgUploader.getInstance().tryUpdateToken(mContext);
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


    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, EasyChangeUtils.NoticeType noticeType, EasyNotiTimesHelper.Event event) {
        EasyNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, event);
    }

    public static void setCount() {
        EasyNtCountUtil.setCount();
    }

    public final boolean hasCreatingActivity() {
        return creatingActivities.size() > 0;
    }

    private final boolean isCurrActivity(Activity activity) {
        return activity == this.getCurrActivity();
    }

    public static void saveLastPushTime() {
        long lastTime = EasySPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && EasyUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = EasySPUtils.getInt("last_show_scene_time_count", 0);
            EasySPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            EasySPUtils.putInt("last_show_scene_time_count", 1);
        }
        EasySPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    public static long getLastShowPushTime() {
        return EasySPUtils.getLong("last_show_scene_time", 0L);
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

    private EasyManager() {
    }

    public static boolean isNotificationEnabled() {
        return EasyNtUtils.isNotificationEnabled();
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
        EasyMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            EasySPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            EasySPUtils.putLong("lastActivityOnPause", 0L);
            EasyManager.INSTANCE.setCurrentActivity(activity);
            EasyManager.creatingActivities.add(activity);
            EasyManager.livingActivities.add(activity);
            EasyManager.INSTANCE.setPaused(false);
        }

        public void onActivityStarted(@NotNull Activity activity) {
            EasyManager.visibleActivities.add(activity);
        }


        public void onActivityResumed(@NotNull Activity activity) {
            EasySPUtils.putLong("lastActivityOnPause", 0L);
            EasyManager.INSTANCE.setCurrentActivity(activity);
            EasyManager.creatingActivities.remove(activity);
            EasyManager.INSTANCE.setPaused(false);
        }

        public void onActivityPaused(@NotNull Activity activity) {
            EasyManager.INSTANCE.setPaused(true);
            EasyManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            EasyManager.creatingActivities.remove(activity);
        }

        public void onActivityStopped(@NotNull Activity activity) {
            EasyManager.visibleActivities.remove(activity);
            EasyManager.creatingActivities.remove(activity);
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            if (EasyManager.INSTANCE.isCurrActivity(activity)) {
                EasyManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            EasyManager.creatingActivities.remove(activity);
            EasyManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }
}
