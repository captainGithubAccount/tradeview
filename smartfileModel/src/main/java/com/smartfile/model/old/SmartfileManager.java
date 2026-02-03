package com.smartfile.model.old;

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

import com.smartfile.model.old.change.SmartfileChangeUtils;
import com.smartfile.model.old.opdj.Smartfile1Service;
import com.smartfile.model.old.opdj.SmartfileClockManager;
import com.smartfile.model.old.opdj.SmartfileJober;
import com.smartfile.model.old.opdj.SmartfileReceiveRegister;
import com.smartfile.model.old.opdj.SmartfileUserUtils;
import com.smartfile.model.old.opdj.msg.SmartfileMsgUploader;
import com.smartfile.model.old.opdj.nt.SmartfileNtCountUtil;
import com.smartfile.model.old.opdj.nt.SmartfileNtFgService;
import com.smartfile.model.old.opdj.nt.SmartfileNtUtils;
import com.smartfile.model.old.shownotificy.SmartfileNtSender;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;
import com.smartfile.model.old.use.SmartfileUsageDaysTracker;
import com.smartfile.model.old.utils.SmartfileSPUtils;
import com.google.firebase.FirebaseApp;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Keep
public class SmartfileManager {
    private static final List<Activity> visibleActivities = new LinkedList<>();
    private static final List<Activity> creatingActivities = new LinkedList<>();
    private static final List<Activity> livingActivities = new LinkedList<>();
    private static WeakReference currActivity = new WeakReference((Object) null);
    public static @Nullable Context mContext;
    public static final @NotNull Handler handler = new Handler(Looper.getMainLooper());
    private static long pausedTime;
    private static boolean isPaused;
    public static final SmartfileManager INSTANCE = new SmartfileManager();
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
        if (SmartfileNtUtils.isNotificationEnabled()) {
            SmartfileNtFgService.startNotifyService(isFromActivity, from);
        }
    }

    public final void startTwoService() {
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        Smartfile1Service.tryStartLaunchMainService();
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
            initSmartfileNotiTimesHelper(application, debug);
            SmartfileUsageDaysTracker.init(application);
            SmartfileUserTimer.firstIn();
            SmartfileReceiveRegister.startMonitor();
            SmartfileUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SmartfileJober.buildWorkerRequest(mContext);
            SmartfileClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }

    }

    public static void initSmartfileNotiTimesHelper(Application context, boolean isDebug){
        // 1. 初始化（只需一次）
        SmartfileNotiTimesHelper.init(context);

        // 2. 设置调试模式
        SmartfileNotiTimesHelper.setDebugMode(isDebug);

        // 3. 打印当前统计信息
        SmartfileNotiTimesHelper.printStats();
    }


    public static void tryUpdateToken() {
        SmartfileMsgUploader.getInstance().tryUpdateToken(mContext);
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


    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SmartfileChangeUtils.NoticeType noticeType, SmartfileNotiTimesHelper.Event event) {
        SmartfileNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType, event);
    }

    public static void setCount() {
        SmartfileNtCountUtil.setCount();
    }

    public final boolean hasCreatingActivity() {
        return creatingActivities.size() > 0;
    }

    private final boolean isCurrActivity(Activity activity) {
        return activity == this.getCurrActivity();
    }

    public static void saveLastPushTime() {
        long lastTime = SmartfileSPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && SmartfileUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = SmartfileSPUtils.getInt("last_show_scene_time_count", 0);
            SmartfileSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SmartfileSPUtils.putInt("last_show_scene_time_count", 1);
        }
        SmartfileSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    public static long getLastShowPushTime() {
        return SmartfileSPUtils.getLong("last_show_scene_time", 0L);
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

    private SmartfileManager() {
    }

    public static boolean isNotificationEnabled() {
        return SmartfileNtUtils.isNotificationEnabled();
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
        SmartfileMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            SmartfileSPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            SmartfileSPUtils.putLong("lastActivityOnPause", 0L);
            SmartfileManager.INSTANCE.setCurrentActivity(activity);
            SmartfileManager.creatingActivities.add(activity);
            SmartfileManager.livingActivities.add(activity);
            SmartfileManager.INSTANCE.setPaused(false);
        }

        public void onActivityStarted(@NotNull Activity activity) {
            SmartfileManager.visibleActivities.add(activity);
        }


        public void onActivityResumed(@NotNull Activity activity) {
            SmartfileSPUtils.putLong("lastActivityOnPause", 0L);
            SmartfileManager.INSTANCE.setCurrentActivity(activity);
            SmartfileManager.creatingActivities.remove(activity);
            SmartfileManager.INSTANCE.setPaused(false);
        }

        public void onActivityPaused(@NotNull Activity activity) {
            SmartfileManager.INSTANCE.setPaused(true);
            SmartfileManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            SmartfileManager.creatingActivities.remove(activity);
        }

        public void onActivityStopped(@NotNull Activity activity) {
            SmartfileManager.visibleActivities.remove(activity);
            SmartfileManager.creatingActivities.remove(activity);
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            if (SmartfileManager.INSTANCE.isCurrActivity(activity)) {
                SmartfileManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            SmartfileManager.creatingActivities.remove(activity);
            SmartfileManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }
}
