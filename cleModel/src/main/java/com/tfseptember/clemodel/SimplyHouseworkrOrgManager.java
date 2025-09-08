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
import com.tfseptember.clemodel.orgyy.SimplySingerClockManager;
import com.tfseptember.clemodel.orgyy.SimplyDiscoveryeydeyJober;
import com.tfseptember.clemodel.orgyy.SimplyLoudspeakergp1Service;
import com.tfseptember.clemodel.orgyy.SimplyOfficeqvqhUserUtils;
import com.tfseptember.clemodel.orgyy.msg.SimplyAcrossMsgUploader;
import com.tfseptember.clemodel.orgyy.nt.SimplyLoudspeakerNtCountUtil;
import com.tfseptember.clemodel.orgyy.nt.SimplyHouseworkNtFgService;
import com.tfseptember.clemodel.shownotificy.SimplySingerhtfNtSender;
import com.tfseptember.clemodel.orgyy.nt.SimplyCauseNtUtils;
import com.tfseptember.clemodel.utils.SimplyFloorSPUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.tfseptember.clemodel.orgyy.SimplyFlightReceiveRegister;

@Keep
public class SimplyHouseworkrOrgManager {
    private static final List<Activity> visibleActivities = new LinkedList<>();
    private static final List<Activity> creatingActivities = new LinkedList<>();
    private static final List<Activity> livingActivities = new LinkedList<>();
    private static WeakReference currActivity = new WeakReference((Object) null);
    public static @Nullable Context mContext;
    public static final @NotNull Handler handler = new Handler(Looper.getMainLooper());
    private static long pausedTime;
    private static boolean isPaused;
    public static final SimplyHouseworkrOrgManager INSTANCE = new SimplyHouseworkrOrgManager();
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
        if (SimplyCauseNtUtils.isNotificationEnabled()) {
            SimplyHouseworkNtFgService.startNotifyService(isFromActivity);
        }
    }

    public final void startTwoService() {
        if (isDebug) {
            Log.e("xxx", "AAManager startTwoService");
        }
        SimplyLoudspeakergp1Service.tryStartLaunchMainService();
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
            SimplyRatherUserTimer.firstIn();
            SimplyFlightReceiveRegister.startMonitor();
            SimplyOfficeqvqhUserUtils.addTmpAccountAndEnableAutoSync(mContext);
            SimplyDiscoveryeydeyJober.buildWorkerRequest(mContext);
            SimplySingerClockManager.startAlarm(mContext);
            handler.postDelayed(() -> startTwoService(), 3000L);
            application.registerActivityLifecycleCallbacks(new AppLifeCycleCallBack());
        }

    }


    public static void tryUpdateToken() {
        SimplyAcrossMsgUploader.getInstance().tryUpdateToken(mContext);
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


    public static void showSceneNotify(int notifyId, PendingIntent pendingIntent, RemoteViews remoteViewsBig, RemoteViews remoteViewsMid, RemoteViews remoteViewsMini, boolean isSilent, boolean isIgnoreLastPushTime) {
        SimplySingerhtfNtSender.showSceneNtOrg9hz(notifyId, pendingIntent, remoteViewsBig, remoteViewsMid, remoteViewsMini, isSilent, isIgnoreLastPushTime);
    }

    public static void setCount() {
        SimplyLoudspeakerNtCountUtil.setCount();
    }

    public final boolean hasCreatingActivity() {
        return creatingActivities.size() > 0;
    }

    private final boolean isCurrActivity(Activity activity) {
        return activity == this.getCurrActivity();
    }

    public static void saveLastPushTime() {
        long lastTime = SimplyFloorSPUtils.getLong("last_show_scene_time", 0L);
        if (lastTime != 0L && SimplyRatherUserTimer.isSameDay(lastTime, System.currentTimeMillis())) {
            int pushCount = SimplyFloorSPUtils.getInt("last_show_scene_time_count", 0);
            SimplyFloorSPUtils.putInt("last_show_scene_time_count", pushCount + 1);
        } else {
            SimplyFloorSPUtils.putInt("last_show_scene_time_count", 1);
        }
        SimplyFloorSPUtils.putLong("last_show_scene_time", System.currentTimeMillis());
    }

    public static long getLastShowPushTime() {
        return SimplyFloorSPUtils.getLong("last_show_scene_time", 0L);
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

    private SimplyHouseworkrOrgManager() {
    }

    public static boolean isNotificationEnabled() {
        return SimplyCauseNtUtils.isNotificationEnabled();
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
        SimplyAcrossMsgUploader.getInstance().reportToken(token);
    }

    final class AppLifeCycleCallBack implements Application.ActivityLifecycleCallbacks {

        @Override
        public void onActivityPreCreated(@NonNull Activity activity, @androidx.annotation.Nullable Bundle savedInstanceState) {
            SimplyFloorSPUtils.putLong("lastActivityOnPause", 0L);
            Application.ActivityLifecycleCallbacks.super.onActivityPreCreated(activity, savedInstanceState);
        }

        public void onActivityCreated(@NotNull Activity activity, @org.jetbrains.annotations.Nullable Bundle bundle) {
            SimplyFloorSPUtils.putLong("lastActivityOnPause", 0L);
            SimplyHouseworkrOrgManager.INSTANCE.setCurrentActivity(activity);
            SimplyHouseworkrOrgManager.creatingActivities.add(activity);
            SimplyHouseworkrOrgManager.livingActivities.add(activity);
            SimplyHouseworkrOrgManager.INSTANCE.setPaused(false);
        }

        public void onActivityStarted(@NotNull Activity activity) {
            SimplyHouseworkrOrgManager.visibleActivities.add(activity);
        }


        public void onActivityResumed(@NotNull Activity activity) {
            SimplyFloorSPUtils.putLong("lastActivityOnPause", 0L);
            SimplyHouseworkrOrgManager.INSTANCE.setCurrentActivity(activity);
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
            SimplyHouseworkrOrgManager.INSTANCE.setPaused(false);
        }

        public void onActivityPaused(@NotNull Activity activity) {
            SimplyHouseworkrOrgManager.INSTANCE.setPaused(true);
            SimplyHouseworkrOrgManager.INSTANCE.setPausedTime(System.currentTimeMillis());
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
        }

        public void onActivityStopped(@NotNull Activity activity) {
            SimplyHouseworkrOrgManager.visibleActivities.remove(activity);
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
        }

        public void onActivityDestroyed(@NotNull Activity activity) {
            if (SimplyHouseworkrOrgManager.INSTANCE.isCurrActivity(activity)) {
                SimplyHouseworkrOrgManager.INSTANCE.setCurrentActivity((Activity) null);
            }
            SimplyHouseworkrOrgManager.creatingActivities.remove(activity);
            SimplyHouseworkrOrgManager.livingActivities.remove(activity);
        }

        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        public AppLifeCycleCallBack() {
        }
    }
}
