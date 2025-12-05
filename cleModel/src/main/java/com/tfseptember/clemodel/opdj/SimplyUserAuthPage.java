package com.tfseptember.clemodel.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;

public class SimplyUserAuthPage extends AccountAuthenticatorActivity {

    public SimplyUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert SimplyHouseworkrOrgManager.mContext != null;
        Account[] accounts = SimplyUserManager.getAccountsByType(SimplyHouseworkrOrgManager.mContext.getResources().getString(R.string.simply_user_type));
        if (accounts.length <= 0) {
            SimplyUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

