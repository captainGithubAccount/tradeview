package com.recover.redate.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.recover.redate.RecoverManager;
import com.recover.redate.R;

public class RecoverUserUtils {

    public RecoverUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> RecoverUserManager.addAccountExplicitly(new Account(RecoverManager.mContext.getResources().getString(R.string.recover_app_name), RecoverManager.mContext.getResources().getString(R.string.recover_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
