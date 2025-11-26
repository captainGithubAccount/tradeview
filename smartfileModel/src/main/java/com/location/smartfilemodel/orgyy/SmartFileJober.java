package com.location.smartfilemodel.orgyy;


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
import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.shownotificy.SmartFileNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartFileJober extends Worker {

    public SmartFileJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (SmartFileOrgManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (SmartFileOrgManager.INSTANCE.getContext() != null) {
            SmartFileNtTransfer.onFcmEvent();
            SmartFileOrgManager.INSTANCE.startNotifyService(false);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(SmartFileOrgManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(SmartFileOrgManager.workManagerTag);
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
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(SmartFileJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(SmartFileOrgManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
