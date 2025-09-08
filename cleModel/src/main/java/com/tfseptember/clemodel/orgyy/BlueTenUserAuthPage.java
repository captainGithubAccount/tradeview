package com.tfseptember.clemodel.orgyy;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.R;

public class BlueTenUserAuthPage extends AccountAuthenticatorActivity {

    public BlueTenUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert BlueTenOrgManager.mContext != null;
        Account[] accounts = BlueTenUserManager.getAccountsByType(BlueTenOrgManager.mContext.getResources().getString(R.string.blueten_user_type));
        if (accounts.length <= 0) {
            BlueTenUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

