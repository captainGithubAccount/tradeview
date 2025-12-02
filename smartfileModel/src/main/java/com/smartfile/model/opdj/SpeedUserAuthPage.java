package com.smartfile.model.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.smartfile.model.SpeedManager;
import com.smartfile.model.R;

public class SpeedUserAuthPage extends AccountAuthenticatorActivity {

    public SpeedUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert SpeedManager.mContext != null;
        Account[] accounts = SpeedUserManager.getAccountsByType(SpeedManager.mContext.getResources().getString(R.string.speed_user_type));
        if (accounts.length <= 0) {
            SpeedUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

