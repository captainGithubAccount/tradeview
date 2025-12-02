package com.smartfile.model.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.smartfile.model.SmartFileManager;
import com.smartfile.model.R;

public class SmartFileUserAuthPage extends AccountAuthenticatorActivity {

    public SmartFileUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert SmartFileManager.mContext != null;
        Account[] accounts = SmartFileUserManager.getAccountsByType(SmartFileManager.mContext.getResources().getString(R.string.speed_user_type));
        if (accounts.length <= 0) {
            SmartFileUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

