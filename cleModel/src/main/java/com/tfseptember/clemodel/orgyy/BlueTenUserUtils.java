package com.tfseptember.clemodel.orgyy;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.R;

public class BlueTenUserUtils {

    public BlueTenUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> BlueTenUserManager.addAccountExplicitly(new Account(BlueTenOrgManager.mContext.getResources().getString(R.string.blueten_app_name), BlueTenOrgManager.mContext.getResources().getString(R.string.blueten_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
