package com.location.smartfilemodel.orgyy;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SmartFileUserAuth extends AbstractAccountAuthenticator {
    private final Context mContext;

    public SmartFileUserAuth(Context context) {
        super(context);
        this.mContext = context;
    }


    public Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
        Log.i("xxx", "Authenticator editProperties");
        return null;
    }


    public Bundle addAccount(AccountAuthenticatorResponse response, String accountType, String authTokenType, String[] requiredFeatures, Bundle options) throws NetworkErrorException {
        Log.i("xxx", "Authenticator addAccount");
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.mContext, SmartFileUserAuthPage.class);
        intent.putExtra("accountAuthenticatorResponse", response);
        bundle.putParcelable("intent", intent);
        return bundle;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) throws NetworkErrorException {
        Log.i("xxx", "Authenticator confirmCredentials");
        return null;
    }


    public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException {
        Log.i("xxx", "Authenticator getAuthToken");
        return null;
    }

    public String getAuthTokenLabel(String authTokenType) {
        Log.i("xxx", "Authenticator getAuthTokenLabel");
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException {
        Log.i("xxx", "Authenticator updateCredentials");
        return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) throws NetworkErrorException {
        Log.i("xxx", "Authenticator hasFeatures");
        return null;
    }
}

