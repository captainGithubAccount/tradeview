package com.whitenoti.wasid.opdj;


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
import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.shownotificy.WhiterNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WhiterJober extends Worker {

    public WhiterJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (WhiterManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (WhiterManager.INSTANCE.getContext() != null) {
            WhiterNtTransfer.onFcmEvent();
            WhiterManager.INSTANCE.startNotifyService(false);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(WhiterManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(WhiterManager.workManagerTag);
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
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(WhiterJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(WhiterManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
