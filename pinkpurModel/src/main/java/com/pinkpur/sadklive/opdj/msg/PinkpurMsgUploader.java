package com.pinkpur.sadklive.opdj.msg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.pinkpur.sadklive.change.PinkpurMsgApi;
import com.pinkpur.sadklive.utils.PinkpurLanguageUtils;
import com.pinkpur.sadklive.utils.PinkpurSPUtils;
import com.pinkpur.sadklive.utils.PinkpurUUIDUtils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PinkpurMsgUploader {
    private static volatile PinkpurMsgUploader INSTANCE;
    private boolean isBindingDevice;
    private boolean isNeedBind;

    public PinkpurMsgUploader() {
    }

    public static PinkpurMsgUploader getInstance() {
        if (INSTANCE == null) {
            Class var28 = PinkpurMsgUploader.class;
            synchronized (PinkpurMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PinkpurMsgUploader();
                }
            }
        }

        return INSTANCE;
    }

    public void reloadToken() {
        if (PinkpurUUIDUtils.getInstance().getDeviceId() == null) {
            this.isNeedBind = true;
        } else {
            Log.e("xxxFirebaseMessaging", "upDataToken()");
            Log.e("xxxFirebaseMessaging", "bind token");

            FirebaseMessaging.getInstance().getToken().addOnFailureListener(e -> e.printStackTrace()).addOnCompleteListener(task -> {
                String newToken = null;
                try {
                    if (task.getResult() != null) {
                        newToken = (String) task.getResult();
                        Log.e("xxxFirebaseMessaging", "bind token complete:" + (newToken != null ? newToken : "null"));
                    }
                } catch (Exception var4) {
                    Exception e = var4;
                    Log.e("xxxFirebaseMessaging", "token Exception:" + e.getMessage());
                }
                reportToken(newToken);
            });
        }
    }

    public void reportToken(String srcToken) {
        String country = PinkpurLanguageUtils.getInstance().getCountry();
        PinkpurMsgInfo pinkpurMsgInfoWxm = PinkpurMsgCreate.buildTokenParams(srcToken);
        Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(pinkpurMsgInfoWxm));
        if (!this.isBindingDevice) {
            this.isBindingDevice = true;
            ((PinkpurMsgApi) PinkpurRetrofitUtils.create(PinkpurMsgApi.class)).upToken(pinkpurMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
        }
    }

    public void tryUpdateToken(Context context) {
        FirebaseMessaging.getInstance().getToken().addOnFailureListener(e -> e.printStackTrace()).addOnCompleteListener(task -> {
            String newToken = null;
            try {
                if (task.getResult() != null) {
                    newToken = (String) task.getResult();
                    Log.e("xxxFirebaseMessaging", "tryUpdateToken token complete:" + (newToken != null ? newToken : "null"));
                }
            } catch (Exception var5) {
                Exception e = var5;
                Log.e("xxxFirebaseMessaging", "tryUpdateToken token Exception:" + e.getMessage());
            }

            if (!TextUtils.isEmpty(newToken) && !getLastReportToken().equals(newToken)) {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken need, currToken:" + newToken + " lastToken:" + getLastReportToken());
                reportToken(newToken);
            } else {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken no need, currToken:" + newToken + " lastToken:" + getLastReportToken());
            }

            String currCountry = PinkpurLanguageUtils.getInstance().getCountry();
            if (!currCountry.equals(getLastReportCountry())) {
                Log.e("xxxFirebaseMessaging", "tryUpdateToken need, currCountry:" + currCountry + " LastCountry:" + getLastReportCountry());
                String token1 = newToken;
                if (TextUtils.isEmpty(token1)) {
                    token1 = getLastReportToken();
                }
                reportToken(token1);
            }
        });
    }


    public String getLastReportToken() {
        return PinkpurSPUtils.getString("fcm_token_xxx", "");
    }

    private String getLastReportCountry() {
        return PinkpurSPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {
        boolean device;
        String token;
        String country;

        public BindCallback(PinkpurMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            Bundle bundle = new Bundle();
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            if (response.isSuccessful()) {
                PinkpurSPUtils.putString("fcm_token_xxx", this.token);
                PinkpurSPUtils.putString("fcm_country_xxx", this.country);
            }
            isBindingDevice = false;
        }


        public void onFailure(Call<ResponseBody> call, Throwable t) {
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            isBindingDevice = false;
        }
    }

}
