package com.smartfile.model.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.R;

public class SmartFileUserUtils {

    public SmartFileUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> SmartFileUserManager.addAccountExplicitly(new Account(SmartFileManager.mContext.getResources().getString(R.string.speed_app_name), SmartFileManager.mContext.getResources().getString(R.string.speed_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
