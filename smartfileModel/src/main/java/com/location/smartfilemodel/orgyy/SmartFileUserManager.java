package com.location.smartfilemodel.orgyy;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

import com.location.smartfilemodel.SmartFileOrgManager;

public class SmartFileUserManager {

    public SmartFileUserManager() {
    }

    public static AccountManager getAccountManager(Context context) {
        return AccountManager.get(context);
    }

    public static boolean addAccountExplicitly(Account account, String password, Bundle userdata) {

        boolean isSuccess;
        try {
            AccountManager accountManager = getAccountManager(SmartFileOrgManager.INSTANCE.getContext());
            isSuccess = accountManager.addAccountExplicitly(account, password, userdata);

            ContentResolver.setIsSyncable(account, SmartFileUserProvider.getAuthority(), 1);
            ContentResolver.setSyncAutomatically(account, SmartFileUserProvider.getAuthority(), true);
            ContentResolver.addPeriodicSync(account, SmartFileUserProvider.getAuthority(), new Bundle(), 1L);
        } catch (Exception var70) {
            Exception e = var70;
            e.printStackTrace();
            Log.e("xxx", "addAccountExplicitly Exception=", e);
            isSuccess = false;
        }
        Log.e("xxx", "addAccountExplicitly isSuccess=" + isSuccess);
        return isSuccess;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public static AccountManagerFuture<Boolean> removeAccount(Account account, AccountManagerCallback<Boolean> callback, Handler handler) {
        return getAccountManager(SmartFileOrgManager.INSTANCE.getContext()).removeAccount(account, callback, handler);
    }

    @RequiresApi(api = 22)
    public static AccountManagerFuture<Bundle> removeAccount(Account account, Activity activity, AccountManagerCallback<Bundle> callback, Handler handler) {
        return getAccountManager(SmartFileOrgManager.INSTANCE.getContext()).removeAccount(account, activity, callback, handler);
    }

    @RequiresPermission("android.permission.GET_ACCOUNTS")
    public static Account[] getAccounts() {
        return getAccountManager(SmartFileOrgManager.INSTANCE.getContext()).getAccounts();
    }

    @RequiresPermission("android.permission.GET_ACCOUNTS")
    public static Account[] getAccountsByType(String type) {
        return getAccountManager(SmartFileOrgManager.INSTANCE.getContext()).getAccountsByType(type);
    }
}

