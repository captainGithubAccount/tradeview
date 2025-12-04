package com.recover.redate.opdj;


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

import com.google.common.util.concurrent.ListenableFuture;
import com.recover.redate.RecoverManager;
import com.recover.redate.shownotificy.RecoverNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RecoverJober extends Worker {

    public RecoverJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (RecoverManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (RecoverManager.INSTANCE.getContext() != null) {
            RecoverNtTransfer.onFcmEvent();
            RecoverManager.INSTANCE.startNotifyService(false);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(RecoverManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(RecoverManager.workManagerTag);
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
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(RecoverJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(RecoverManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
