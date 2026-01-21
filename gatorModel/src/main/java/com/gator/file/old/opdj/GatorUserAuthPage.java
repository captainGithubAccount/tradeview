package com.gator.file.old.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.gator.file.old.GatorManager;
import com.gator.file.R;

public class GatorUserAuthPage extends AccountAuthenticatorActivity {

    public GatorUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert GatorManager.mContext != null;
        Account[] accounts = GatorUserManager.getAccountsByType(GatorManager.mContext.getResources().getString(R.string.gator_user_type));
        if (accounts.length <= 0) {
            GatorUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

