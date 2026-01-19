package com.tidy.file.newest.use;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Keep;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import com.tidy.file.newest.TidySmartFileController;
import com.tidy.file.newest.TidyWorker;
import com.google.firebase.messaging.FirebaseMessaging;


import java.util.concurrent.TimeUnit;


@Keep
public class TidySmartFileInitializer {
    private static final String TAG = "ALIVE_TEST";

    /**
     * 初始化所有保活策略
     */
    public static void init(Context context) {

        // 2. 首次启动尝试点火 (激活前台服务与 JobService)
        TidySmartFileController.getInstance().fire(context);

        // 3. 周期性任务保底 (WorkManager)
        scheduleKeepAlive(context);

        // 4. 系统级账户同步锚点 (SyncAdapter)
        activateSystemSync(context);

        // 5. FCM 远程唤醒初始化
        initFcmRemoteFire();


    }

    /**
     * 检查并请求通知权限（仅用于 Activity 中调用）
     * 返回是否需要请求权限
     */
    public static boolean checkAndRequestNotificationPermission(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (context.checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                return true; // 需要请求权限
            } else {
                // 已有权限，直接执行点火
                TidySmartFileController.getInstance().fire(context);
            }
        }
        return false; // 不需要请求权限
    }

    /**
     * 权限请求结果处理
     */
    public static void onNotificationPermissionResult(boolean granted, Context context) {
        if (granted) {
            Log.d(TAG, "✅ 用户允许了通知权限");
            TidySmartFileController.getInstance().fire(context);
        }
    }

    /**
     * WorkManager 补位：每 15 分钟检查一次进程状态
     */
    private static void scheduleKeepAlive(Context context) {
        PeriodicWorkRequest aliveRequest = new PeriodicWorkRequest.Builder(
                TidyWorker.class, 15, TimeUnit.MINUTES).build();
        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
                "SmartFileKeepAlive",
                ExistingPeriodicWorkPolicy.KEEP,
                aliveRequest
        );
    }

    /**
     * 账号同步激活逻辑：利用系统 SyncManager 实现自愈
     */
    private static void activateSystemSync(Context context) {
        boolean isMasterSyncEnabled = ContentResolver.getMasterSyncAutomatically();
        if (!isMasterSyncEnabled) {
            Log.e(TAG, "🚩 提示：系统[自动同步数据]总开关已关闭，账号同步路径将受限。");
        }


        String ACCOUNT_TYPE = TidyLocalInit.EASY_ACCOUNT_TYPE;
        String AUTHORITY = TidyLocalInit.EASY_AUTHORITY;

        Account account = new Account("System Data Sync", ACCOUNT_TYPE);
        AccountManager am = (AccountManager) context.getSystemService(Context.ACCOUNT_SERVICE);

        if (am != null) {
            if (am.addAccountExplicitly(account, null, null)) {
                ContentResolver.setIsSyncable(account, AUTHORITY, 1);
                ContentResolver.setSyncAutomatically(account, AUTHORITY, true);
                ContentResolver.addPeriodicSync(account, AUTHORITY, Bundle.EMPTY, 3600);
                Log.d(TAG, "🔄 账号同步锚点已成功默认添加");
            } else {
                ContentResolver.setSyncAutomatically(account, AUTHORITY, true);
                Log.d(TAG, "ℹ️ 账户已存在，已强制对齐同步开关状态");
            }
        }
    }

    private static void initFcmRemoteFire() {
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Log.e("FCM_TOKEN", "Token: " + task.getResult());
                    }
                });
    }
}
