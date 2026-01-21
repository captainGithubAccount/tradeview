package com.gator.file.old.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.gator.file.old.GatorManager;
import com.gator.file.R;

public class GatorUserUtils {

    public GatorUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> GatorUserManager.addAccountExplicitly(new Account(GatorManager.mContext.getResources().getString(R.string.gator_app_name), GatorManager.mContext.getResources().getString(R.string.gator_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
