package com.smartfile.model.newest;

import android.app.job.*;
import android.content.*;
import android.util.Log;

import com.smartfile.model.newest.use.SmartfileLocalInit;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public class SmartfileAliveJobService extends JobService {
    private static final int JOB_ID = 100; // 模仿竞品 ID
    public static  int JOB_Time = 5 * 60 * 1000;

    public static void schedule(Context context) {
        int jobCoolTime =  (int)FirebaseRemoteConfig.getInstance().getLong(SmartfileLocalInit.jobCoolTime);
        if(jobCoolTime != 0 && jobCoolTime > 1){
            Log.d("ALIVE_TEST", "处于job冷却期, job间隔时间是：" + jobCoolTime );
            JOB_Time = jobCoolTime * 60 * 1000;
        }


        Log.e("xxx", "schedule in ............");
        JobScheduler scheduler = (JobScheduler) context.getSystemService(JOB_SCHEDULER_SERVICE);
        if (scheduler == null) return;

        // 模仿竞品：先取消再预约
        scheduler.cancel(JOB_ID);

        JobInfo.Builder builder = new JobInfo.Builder(JOB_ID, new ComponentName(context, SmartfileAliveJobService.class));
        builder.setMinimumLatency(JOB_Time); // 模仿竞品：30秒
        builder.setPersisted(true);
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY); // 骗取网络权重

        scheduler.schedule(builder.build());
    }

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.e("xxx", "onStartJob in ............");
        Log.d("ALIVE_TEST", "⚡ Job 触发：正在执行 30 秒周期点火");
        SmartfileSmartFileController.getInstance().fire(this);
        schedule(this); // 递归调用
        return true; // 模仿竞品：保持任务
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true; // 模仿竞品：强制系统重试
    }
}
