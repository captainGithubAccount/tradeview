package com.download.model.old.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.download.model.old.DownloadManager;
import com.download.model.R;

public class DownloadUserUtils {

    public DownloadUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> DownloadUserManager.addAccountExplicitly(new Account(DownloadManager.mContext.getResources().getString(R.string.download_app_name), DownloadManager.mContext.getResources().getString(R.string.download_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
