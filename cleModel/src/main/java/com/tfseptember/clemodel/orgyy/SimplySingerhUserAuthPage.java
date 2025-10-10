package com.tfseptember.clemodel.orgyy;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.tfseptember.clemodel.SimplyHouseworkrOrgManager;
import com.tfseptember.clemodel.R;

public class SimplySingerhUserAuthPage extends AccountAuthenticatorActivity {

    public SimplySingerhUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert SimplyHouseworkrOrgManager.mContext != null;
        Account[] accounts = SimplyOfficeqvUserManager.getAccountsByType(SimplyHouseworkrOrgManager.mContext.getResources().getString(R.string.simply_user_type));
        if (accounts.length <= 0) {
            SimplyOfficeqvqhUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

