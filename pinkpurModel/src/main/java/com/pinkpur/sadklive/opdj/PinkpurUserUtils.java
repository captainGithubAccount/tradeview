package com.pinkpur.sadklive.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.R;

public class PinkpurUserUtils {

    public PinkpurUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> PinkpurUserManager.addAccountExplicitly(new Account(PinkpurManager.mContext.getResources().getString(R.string.pinkpur_app_name), PinkpurManager.mContext.getResources().getString(R.string.pinkpur_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
