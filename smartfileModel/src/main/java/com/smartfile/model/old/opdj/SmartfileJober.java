package com.smartfile.model.old.opdj;


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

import com.smartfile.model.old.use.SmartfileActionConstant;
import com.smartfile.model.old.use.SmartfileNotiTimesHelper;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.old.shownotificy.SmartfileNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartfileJober extends Worker {

    public SmartfileJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (SmartfileManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (SmartfileManager.INSTANCE.getContext() != null) {
            SmartfileNtTransfer.onFcmEvent(SmartfileNotiTimesHelper.Event.JOB_POLLING);
            SmartfileManager.INSTANCE.startNotifyService(false, SmartfileActionConstant.job);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(SmartfileManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(SmartfileManager.workManagerTag);
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
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(SmartfileJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(SmartfileManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
