package com.gator.file.old.opdj;


import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Constraints;
import androidx.work.ListenableWorker;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.gator.file.old.use.GatorActionConstant;
import com.gator.file.old.use.GatorNotiTimesHelper;
import com.google.common.util.concurrent.ListenableFuture;
import com.gator.file.old.GatorManager;
import com.gator.file.old.shownotificy.GatorNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GatorJober extends Worker {

    public GatorJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (GatorManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (GatorManager.INSTANCE.getContext() != null) {
            GatorNtTransfer.onFcmEvent(GatorNotiTimesHelper.Event.JOB_POLLING);
            GatorManager.INSTANCE.startNotifyService(false, GatorActionConstant.job);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(GatorManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(GatorManager.workManagerTag);
            if (list != null && list.get() != null && !((List) list.get()).isEmpty()) {
                has = true;
            }
        } catch (Exception var112) {
            Exception e = var112;
            e.printStackTrace();
        }

        if (!has) {
            Constraints.Builder builder = new Constraints.Builder();
            Constraints constraints = builder.build();
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(GatorJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(GatorManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
