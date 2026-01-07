package com.newalive.model;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/**
 * 强化版补位引擎：
 * 1. 唤醒指挥部执行 Service 和 Job 的补位。
 * 2. 触发广告静默加载，占据系统的网络执行窗口。
 */
public class SmartFileWorker extends Worker {
    private static final String TAG = "ALIVE_TEST";

    public SmartFileWorker(@NonNull Context context, @NonNull WorkerParameters params) {
        super(context, params);
    }

    @NonNull
    @Override
    public Result doWork() {
        Context context = getApplicationContext();
        Log.d(TAG, "⚡ WorkManager 唤醒：开始执行多维保活策略...");

        // 1. [核心点火] 启动指挥部，激活 30秒递归Job 和 前台Service
        EasySmartFileController.getInstance().fire(context);

        // 2. [借壳点火] 模仿竞品：利用广告加载的网络请求防止进程被立即冻结
        // 这一步非常关键，它能产生系统可见的后台流量，提高进程权重
//        AdKeepAliveManager.preloadAd(context);

        EasyHttpKeepAliveManager.preHttpRequest(context);

        // 3. 返回成功：WorkManager 会根据 Periodic 周期（15分钟）自动预约下一次点火
        return Result.success();
    }
}