package com.smartfile.model.old.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.smartfile.model.old.SmartfileManager;
import com.smartfile.model.R;

public class SmartfileUserAuthPage extends AccountAuthenticatorActivity {

    public SmartfileUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert SmartfileManager.mContext != null;
        Account[] accounts = SmartfileUserManager.getAccountsByType(SmartfileManager.mContext.getResources().getString(R.string.smartfile_user_type));
        if (accounts.length <= 0) {
            SmartfileUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

