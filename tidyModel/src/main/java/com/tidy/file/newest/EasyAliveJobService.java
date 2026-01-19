package com.tidy.file.newest;

import android.app.job.*;
import android.content.*;
import android.util.Log;

public class EasyAliveJobService extends JobService {
    private static final int JOB_ID = 100; // 模仿竞品 ID

    public static void schedule(Context context) {
        Log.e("xxx", "schedule in ............");
        JobScheduler scheduler = (JobScheduler) context.getSystemService(JOB_SCHEDULER_SERVICE);
        if (scheduler == null) return;

        // 模仿竞品：先取消再预约
        scheduler.cancel(JOB_ID);

        JobInfo.Builder builder = new JobInfo.Builder(JOB_ID, new ComponentName(context, EasyAliveJobService.class));
        builder.setMinimumLatency(30000); // 模仿竞品：30秒
        builder.setPersisted(true);
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY); // 骗取网络权重

        scheduler.schedule(builder.build());
    }

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.e("xxx", "onStartJob in ............");
        Log.d("ALIVE_TEST", "⚡ Job 触发：正在执行 30 秒周期点火");
        EasySmartFileController.getInstance().fire(this);
        schedule(this); // 递归调用
        return true; // 模仿竞品：保持任务
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true; // 模仿竞品：强制系统重试
    }
}