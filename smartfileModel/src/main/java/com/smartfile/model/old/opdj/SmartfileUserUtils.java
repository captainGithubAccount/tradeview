package com.smartfile.model.old.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.R;

public class SmartfileUserUtils {

    public SmartfileUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> SmartfileUserManager.addAccountExplicitly(new Account(SmartfileManager.mContext.getResources().getString(R.string.smartfile_app_name), SmartfileManager.mContext.getResources().getString(R.string.smartfile_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
