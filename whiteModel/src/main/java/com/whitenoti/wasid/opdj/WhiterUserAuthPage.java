package com.whitenoti.wasid.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.whitenoti.wasid.WhiterManager;
import com.whitenoti.wasid.R;

public class WhiterUserAuthPage extends AccountAuthenticatorActivity {

    public WhiterUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert WhiterManager.mContext != null;
        Account[] accounts = WhiterUserManager.getAccountsByType(WhiterManager.mContext.getResources().getString(R.string.whiter_user_type));
        if (accounts.length <= 0) {
            WhiterUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

