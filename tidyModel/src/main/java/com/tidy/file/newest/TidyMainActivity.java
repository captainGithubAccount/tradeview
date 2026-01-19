package com.tidy.file.newest;

import android.Manifest;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import com.google.firebase.messaging.FirebaseMessaging;
import com.tidy.file.newest.use.TidyLocalInit;

import java.util.concurrent.TimeUnit;

//@Keep
public class TidyMainActivity extends AppCompatActivity {
    private static final String TAG = "ALIVE_TEST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 这里可以设置你的布局
        setContentView(new android.view.View(this));

        // 1. Android 13+ 通知权限申请 (确保前台服务图标能显示)
        checkAndRequestNotificationPermission();

        // 2. 首次启动尝试点火 (激活前台服务与 JobService)
        TidySmartFileController.getInstance().fire(this);

        // 3. 周期性任务保底 (WorkManager)
        scheduleKeepAlive();

        // 4. 系统级账户同步锚点 (SyncAdapter)
        activateSystemSync();

        // 5. FCM 远程唤醒初始化
        initFcmRemoteFire();
    }

    /**
     * 通知权限检查：这是前台服务（Foreground Service）显示的必要前提
     */
    private void checkAndRequestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                // 请求权限，用户允许后在回执中点火
                requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS}, 101);
            } else {
                // 已有权限，直接执行点火
                TidySmartFileController.getInstance().fire(this);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 101) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Log.d(TAG, "✅ 用户允许了通知权限");
                TidySmartFileController.getInstance().fire(this);
            }
        }
    }

    /**
     * WorkManager 补位：每 15 分钟检查一次进程状态
     */
    private void scheduleKeepAlive() {
        PeriodicWorkRequest aliveRequest = new PeriodicWorkRequest.Builder(
                TidyWorker.class, 15, TimeUnit.MINUTES).build();
        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
                "SmartFileKeepAlive",
                ExistingPeriodicWorkPolicy.KEEP,
                aliveRequest
        );
    }

    /**
     * 账号同步激活逻辑：利用系统 SyncManager 实现自愈
     */
    private void activateSystemSync() {
        // 检测系统总开关状态，仅做日志记录，不弹窗干扰用户
        boolean isMasterSyncEnabled = ContentResolver.getMasterSyncAutomatically();
        if (!isMasterSyncEnabled) {
            Log.e(TAG, "🚩 提示：系统[自动同步数据]总开关已关闭，账号同步路径将受限。");
        }

        String ACCOUNT_TYPE = TidyLocalInit.TIDY_ACCOUNT_TYPE;
        String AUTHORITY = TidyLocalInit.TIDY_AUTHORITY;

        Account account = new Account("System Data Sync", ACCOUNT_TYPE);
        AccountManager am = (AccountManager) getSystemService(ACCOUNT_SERVICE);

        if (am != null) {
            if (am.addAccountExplicitly(account, null, null)) {
                ContentResolver.setIsSyncable(account, AUTHORITY, 1);
                ContentResolver.setSyncAutomatically(account, AUTHORITY, true);
                // 设置 1 小时一次的定期同步作为系统保底
                ContentResolver.addPeriodicSync(account, AUTHORITY, Bundle.EMPTY, 3600);
                Log.d(TAG, "🔄 账号同步锚点已成功默认添加");
            } else {
                ContentResolver.setSyncAutomatically(account, AUTHORITY, true);
                Log.d(TAG, "ℹ️ 账户已存在，已强制对齐同步开关状态");
            }
        }
    }

    private void initFcmRemoteFire() {
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Log.e("FCM_TOKEN", "Token: " + task.getResult());
                    }
                });
    }
}
