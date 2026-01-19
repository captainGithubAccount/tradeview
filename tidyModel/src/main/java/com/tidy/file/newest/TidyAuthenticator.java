package com.tidy.file.newest;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;

// 账户验证器，用于在系统设置中挂载账户 [cite: 74]
//@Keep
public class TidyAuthenticator extends AbstractAccountAuthenticator {
    public TidyAuthenticator(Context context) { super(context); }
    @Override public Bundle editProperties(AccountAuthenticatorResponse r, String s) { return null; }
    @Override public Bundle addAccount(AccountAuthenticatorResponse r, String s, String s1, String[] strings, Bundle b) { return null; }
    @Override public Bundle confirmCredentials(AccountAuthenticatorResponse r, Account a, Bundle b) { return null; }
    @Override public Bundle getAuthToken(AccountAuthenticatorResponse r, Account a, String s, Bundle b) { return null; }
    @Override public String getAuthTokenLabel(String s) { return null; }
    @Override public Bundle updateCredentials(AccountAuthenticatorResponse r, Account a, String s, Bundle b) { return null; }
    @Override public Bundle hasFeatures(AccountAuthenticatorResponse r, Account a, String[] s) { return null; }
}
