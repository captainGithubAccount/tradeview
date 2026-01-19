package com.tidy.file.old.opdj;


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

import com.tidy.file.old.use.TidyActionConstant;
import com.tidy.file.old.use.TidyNotiTimesHelper;
import com.google.common.util.concurrent.ListenableFuture;
import com.tidy.file.old.TidyManager;
import com.tidy.file.old.shownotificy.TidyNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TidyJober extends Worker {

    public TidyJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (TidyManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (TidyManager.INSTANCE.getContext() != null) {
            TidyNtTransfer.onFcmEvent(TidyNotiTimesHelper.Event.JOB_POLLING);
            TidyManager.INSTANCE.startNotifyService(false, TidyActionConstant.job);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(TidyManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(TidyManager.workManagerTag);
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
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(TidyJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(TidyManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
