package com.location.smartfilemodel.orgyy;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.location.smartfilemodel.SmartFileOrgManager;
import com.location.smartfilemodel.R;

public class SmartFileUserAuthPage extends AccountAuthenticatorActivity {

    public SmartFileUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert SmartFileOrgManager.mContext != null;
        Account[] accounts = SmartFileUserManager.getAccountsByType(SmartFileOrgManager.mContext.getResources().getString(R.string.smartfile_user_type));
        if (accounts.length <= 0) {
            SmartFileUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

