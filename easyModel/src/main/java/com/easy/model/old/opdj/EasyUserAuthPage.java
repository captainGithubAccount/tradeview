package com.easy.model.old.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.easy.model.old.EasyManager;
import com.easy.model.R;

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

