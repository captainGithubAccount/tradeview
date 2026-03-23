package com.download.model.old.opdj;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorActivity;
import android.os.Bundle;

import com.download.model.old.DownloadManager;
import com.download.model.R;

public class DownloadUserAuthPage extends AccountAuthenticatorActivity {

    public DownloadUserAuthPage() {
    }

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        assert DownloadManager.mContext != null;
        Account[] accounts = DownloadUserManager.getAccountsByType(DownloadManager.mContext.getResources().getString(R.string.download_user_type));
        if (accounts.length <= 0) {
            DownloadUserUtils.addTmpAccountAndEnableAutoSync(this);
        }
        this.finish();
    }
}

