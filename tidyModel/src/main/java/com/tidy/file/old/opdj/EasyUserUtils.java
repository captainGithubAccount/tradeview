package com.tidy.file.old.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.tidy.file.old.EasyManager;
import com.tidy.file.R;

public class EasyUserUtils {

    public EasyUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> EasyUserManager.addAccountExplicitly(new Account(EasyManager.mContext.getResources().getString(R.string.easy_app_name), EasyManager.mContext.getResources().getString(R.string.easy_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
