package com.download.model.old.opdj;


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

import com.download.model.old.use.DownloadActionConstant;
import com.download.model.old.use.DownloadNotiTimesHelper;
import com.google.common.util.concurrent.ListenableFuture;
import com.download.model.old.DownloadManager;
import com.download.model.old.shownotificy.DownloadNtTransfer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DownloadJober extends Worker {

    public DownloadJober(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    public ListenableWorker.Result doWork() {
        if (DownloadManager.isDebug) {
            Log.i("xxx", "BaseWorkerManager-->doWork");
        }
        if (DownloadManager.INSTANCE.getContext() != null) {
            DownloadNtTransfer.onFcmEvent(DownloadNotiTimesHelper.Event.JOB_POLLING);
            DownloadManager.INSTANCE.startNotifyService(false, DownloadActionConstant.job);
        }
        return Result.success();
    }

    public static void buildWorkerRequest(Context context) {
        boolean has = false;
        try {
            WorkManager.getInstance(context).getWorkInfosByTag(DownloadManager.workManagerTag);
            ListenableFuture<List<WorkInfo>> list = WorkManager.getInstance(context).getWorkInfosByTag(DownloadManager.workManagerTag);
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
            PeriodicWorkRequest marsWorkRequest = (PeriodicWorkRequest) ((PeriodicWorkRequest.Builder) ((PeriodicWorkRequest.Builder) (new PeriodicWorkRequest.Builder(DownloadJober.class, 15L, TimeUnit.MINUTES)).setConstraints(constraints)).addTag(DownloadManager.workManagerTag)).build();
            WorkManager.getInstance(context).enqueue(marsWorkRequest);
        }
    }
}
