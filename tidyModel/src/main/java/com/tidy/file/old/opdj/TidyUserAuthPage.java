package com.tidy.file.old.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.tidy.file.old.TidyManager;
import com.tidy.file.R;

public class TidyUserAuthPage extends AccountAuthenticatorActivity {

    public TidyUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert TidyManager.mContext != null;
        Account[] accounts = TidyUserManager.getAccountsByType(TidyManager.mContext.getResources().getString(R.string.easy_user_type));
        if (accounts.length <= 0) {
            TidyUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

