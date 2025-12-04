package com.recover.redate.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.recover.redate.RecoverOrgManager;
import com.recover.model.R;

public class RecoverUserAuthPage extends AccountAuthenticatorActivity {

    public RecoverUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert RecoverOrgManager.mContext != null;
        Account[] accounts = RecoverUserManager.getAccountsByType(RecoverOrgManager.mContext.getResources().getString(R.string.recover_user_type));
        if (accounts.length <= 0) {
            RecoverUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

