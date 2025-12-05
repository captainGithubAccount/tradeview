package com.whitenoti.wasid.opdj;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.R;

public class WhiterUserUtils {

    public WhiterUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> WhiterUserManager.addAccountExplicitly(new Account(WhiterManager.mContext.getResources().getString(R.string.whiter_app_name), WhiterManager.mContext.getResources().getString(R.string.whiter_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
