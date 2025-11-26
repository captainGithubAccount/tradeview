package com.location.smartfilemodel.orgyy;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.R;

public class SmartFileUserUtils {

    public SmartFileUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> SmartFileUserManager.addAccountExplicitly(new Account(SmartFileOrgManager.mContext.getResources().getString(R.string.smartfile_app_name), SmartFileOrgManager.mContext.getResources().getString(R.string.smartfile_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
