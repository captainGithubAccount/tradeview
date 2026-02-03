package com.smartfile.model.old.opdj.msg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.smartfile.model.old.change.SmartfileChangeUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.smartfile.model.old.change.SmartfileMsgApi;
import com.smartfile.model.old.utils.SmartfileLanguageUtils;
import com.smartfile.model.old.utils.SmartfileSPUtils;
import com.smartfile.model.old.utils.SmartfileUUIDUtils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SmartfileMsgUploader {
    private static volatile SmartfileMsgUploader INSTANCE;
    private boolean isBindingDevice;
    private boolean isNeedBind;

    public SmartfileMsgUploader() {
    }

    public static SmartfileMsgUploader getInstance() {
        if (INSTANCE == null) {
            Class var28 = SmartfileMsgUploader.class;
            synchronized (SmartfileMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SmartfileMsgUploader();
                }
            }
        }

        return INSTANCE;
    }

    public void reloadToken() {
        if (SmartfileUUIDUtils.getInstance().getDeviceId() == null) {
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
        try {
            String country = SmartfileLanguageUtils.getInstance().getCountry();
            SmartfileMsgInfo smartfileMsgInfoWxm = SmartfileMsgCreate.buildTokenParams(srcToken);
            Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(smartfileMsgInfoWxm));
            if (!this.isBindingDevice) {
                this.isBindingDevice = true;
                ((SmartfileMsgApi) SmartfileRetrofitUtils.create(SmartfileMsgApi.class)).upToken(SmartfileChangeUtils.INSTANCE.getFCM_INTERFACE_PATH(), smartfileMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
            }
        } catch (Throwable e) {
            e.printStackTrace();
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

            String currCountry = SmartfileLanguageUtils.getInstance().getCountry();
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
        return SmartfileSPUtils.getString("fcm_token_xxx", "");
    }

    private String getLastReportCountry() {
        return SmartfileSPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {
        boolean device;
        String token;
        String country;

        public BindCallback(SmartfileMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            Bundle bundle = new Bundle();
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            if (response.isSuccessful()) {
                SmartfileSPUtils.putString("fcm_token_xxx", this.token);
                SmartfileSPUtils.putString("fcm_country_xxx", this.country);
            }
            isBindingDevice = false;
        }


        public void onFailure(Call<ResponseBody> call, Throwable t) {
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            isBindingDevice = false;
        }
    }

}
