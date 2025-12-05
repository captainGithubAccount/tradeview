package com.pinkpur.sadklive.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.pinkpur.sadklive.PinkpurManager;
import com.pinkpur.sadklive.R;

public class PinkpurUserAuthPage extends AccountAuthenticatorActivity {

    public PinkpurUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert PinkpurManager.mContext != null;
        Account[] accounts = PinkpurUserManager.getAccountsByType(PinkpurManager.mContext.getResources().getString(R.string.pinkpur_user_type));
        if (accounts.length <= 0) {
            PinkpurUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

