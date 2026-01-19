package com.tidy.file.old.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.tidy.file.old.TidyManager;
import com.tidy.file.R;

public class TidyUserUtils {

    public TidyUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> TidyUserManager.addAccountExplicitly(new Account(TidyManager.mContext.getResources().getString(R.string.easy_app_name), TidyManager.mContext.getResources().getString(R.string.easy_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
