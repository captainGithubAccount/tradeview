package com.tfseptember.clemodel.orgyy;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;

public class SimplyOfficeqvqhUserUtils {

    public SimplyOfficeqvqhUserUtils() {
    }

    public static void addTmpAccountAndEnableAutoSync(@NonNull Context context) {
        Thread thread = new Thread(() -> SimplyOfficeqvUserManager.addAccountExplicitly(new Account(SimplyHouseworkrOrgManager.mContext.getResources().getString(R.string.simply_app_name), SimplyHouseworkrOrgManager.mContext.getResources().getString(R.string.simply_user_type)), (String) null, (Bundle) null));
        thread.start();
    }
}
