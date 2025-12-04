package com.recover.redate.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.recover.redate.RecoverManager;
import com.recover.redate.R;

public class RecoverUserAuthPage extends AccountAuthenticatorActivity {

    public RecoverUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert RecoverManager.mContext != null;
        Account[] accounts = RecoverUserManager.getAccountsByType(RecoverManager.mContext.getResources().getString(R.string.recover_user_type));
        if (accounts.length <= 0) {
            RecoverUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

