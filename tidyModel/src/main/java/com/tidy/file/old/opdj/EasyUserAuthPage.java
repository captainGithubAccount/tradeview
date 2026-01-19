package com.tidy.file.old.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.tidy.file.old.EasyManager;
import com.tidy.file.R;

public class EasyUserAuthPage extends AccountAuthenticatorActivity {

    public EasyUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert EasyManager.mContext != null;
        Account[] accounts = EasyUserManager.getAccountsByType(EasyManager.mContext.getResources().getString(R.string.easy_user_type));
        if (accounts.length <= 0) {
            EasyUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

