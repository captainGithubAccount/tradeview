package com.smartfile.model.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.smartfile.model.SpeedManager;
import com.smartfile.model.R;

public class SpeedUserUtils {

    public SpeedUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> SpeedUserManager.addAccountExplicitly(new Account(SpeedManager.mContext.getResources().getString(R.string.speed_app_name), SpeedManager.mContext.getResources().getString(R.string.speed_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
