package com.tfseptember.clemodel;

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

import com.tfseptember.clemodel.change.SimplyChangeUtils;
import com.tfseptember.clemodel.opdj.SimplyClockManager;
import com.tfseptember.clemodel.opdj.SimplyJober;
import com.tfseptember.clemodel.opdj.Simply1Service;
import com.tfseptember.clemodel.opdj.SimplyUserUtils;
import com.tfseptember.clemodel.opdj.msg.SimplyMsgUploader;
import com.tfseptember.clemodel.opdj.nt.SimplyNtCountUtil;
import com.tfseptember.clemodel.opdj.nt.SimplyNtFgService;
import com.tfseptember.clemodel.shownotificy.SimplyNtSender;
import com.tfseptember.clemodel.opdj.nt.SimplyNtUtils;
import com.tfseptember.clemodel.utils.SimplySPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.tfseptember.clemodel.opdj.SimplyReceiveRegister;

@Keep
public class SimplyManager {
    private static final List<Activity> visibleActivities = new LinkedList<>();
    private static final List<Activity> creatingActivities = new LinkedList<>();
    private static final List<Activity> livingActivities = new LinkedList<>();
    private static WeakReference currActivity = new WeakReference((Object) null);
    public static @Nullable Context mContext;
    public static final @NotNull Handler handler = new Handler(Looper.getMainLooper());
    private static long pausedTime;
    private static boolean isPaused;
    public static final SimplyManager INSTANCE = new SimplyManager();
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
        if (SimplyNtUtils.isNotificationEnabled()) {
            SimplyNtFgService.startNotifyService(isFromActivity);
        }
    }

    public final void startTwoService() {
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        Simply1Service.tryStartLaunchMainService();
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
        Log.i("xxx", "AAManager initCore");
        mContext = application;
        mainProcessName = packageName;
        isDebug = debug;
        boolean isMainProcess = isMainProcess(application, packageName);
        if (isMainProcess) {
            if (isDebug) {
                Log.e("xxx", "AAManager initCore");
            }
            FirebaseCatchjzgUtils.INSTANCE.initFirebase(application);
            FirebaseOfficeManager.initCloud();
            SimplyUserTimer.firstIn();
            SimplyReceiveRegister.startMonitor();
            SimplyUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SimplyJober.buildWorkerRequest(mContext);
            SimplyClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }

    }


    public static void tryUpdateToken() {
        SimplyMsgUploader.getInstance().tryUpdateToken(mContext);
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


    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime, SimplyChangeUtils.NoticeType noticeType) {
        SimplyNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime, noticeType);
    }

    public static void setCount() {
        SimplyNtCountUtil.setCount();
    }

    public final boolean hasCreatingActivity() {
        return creatingActivities.size() > 0;
    }

    private final boolean isCurrActivity(Activity activity) {
        return activity == this.getCurrActivity();
    }

    public static void saveLastPushTime() {
        long lastTime = SimplySPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && SimplyUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = SimplySPUtils.getInt("last_show_scene_time_count", 0);
            SimplySPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SimplySPUtils.putInt("last_show_scene_time_count", 1);
        }
        SimplySPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    public static long getLastShowPushTime() {
        return SimplySPUtils.getLong("last_show_scene_time", 0L);
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

    private SimplyManager() {
    }

    public static boolean isNotificationEnabled() {
        return SimplyNtUtils.isNotificationEnabled();
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
        SimplyMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            SimplySPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            SimplySPUtils.putLong("lastActivityOnPause", 0L);
            SimplyManager.INSTANCE.setCurrentActivity(activity);
            SimplyManager.creatingActivities.add(activity);
            SimplyManager.livingActivities.add(activity);
            SimplyManager.INSTANCE.setPaused(false);
        }

        public void onActivityStarted(@NotNull Activity activity) {
            SimplyManager.visibleActivities.add(activity);
        }


        public void onActivityResumed(@NotNull Activity activity) {
            SimplySPUtils.putLong("lastActivityOnPause", 0L);
            SimplyManager.INSTANCE.setCurrentActivity(activity);
            SimplyManager.creatingActivities.remove(activity);
            SimplyManager.INSTANCE.setPaused(false);
        }

        public void onActivityPaused(@NotNull Activity activity) {
            SimplyManager.INSTANCE.setPaused(true);
            SimplyManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            SimplyManager.creatingActivities.remove(activity);
        }

        public void onActivityStopped(@NotNull Activity activity) {
            SimplyManager.visibleActivities.remove(activity);
            SimplyManager.creatingActivities.remove(activity);
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            if (SimplyManager.INSTANCE.isCurrActivity(activity)) {
                SimplyManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            SimplyManager.creatingActivities.remove(activity);
            SimplyManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }
}
