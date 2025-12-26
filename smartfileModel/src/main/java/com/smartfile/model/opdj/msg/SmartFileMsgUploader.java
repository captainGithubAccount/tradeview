package com.smartfile.model.opdj.msg;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.smartfile.model.CleanTimeManager;
import com.smartfile.model.SmartFileManager;
import com.smartfile.model.change.SmartFileMsgApi;
import com.smartfile.model.utils.SmartFileLanguageUtils;
import com.smartfile.model.utils.SmartFileSPUtils;
import com.smartfile.model.utils.SmartFileUUIDUtils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SmartFileMsgUploader {
    private static volatile SmartFileMsgUploader INSTANCE;
    private boolean isBindingDevice;
    private boolean isNeedBind;

    public SmartFileMsgUploader() {
    }

    public static SmartFileMsgUploader getInstance() {
        if (INSTANCE == null) {
            Class var28 = SmartFileMsgUploader.class;
            synchronized (SmartFileMsgUploader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SmartFileMsgUploader();
                }
            }
        }

        return INSTANCE;
    }

    public void reloadToken() {
        if (SmartFileUUIDUtils.getInstance().getDeviceId() == null) {
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
            if(CleanTimeManager.INSTANCE.getAppinstanceid() == ""){
                FirebaseInstallations.getInstance().getId()
                        .addOnCompleteListener(new OnCompleteListener<String>() {
                            @Override
                            public void onComplete(@NonNull Task<String> task) {
                                if (task.isSuccessful()) {
                                    String installationId = task.getResult();
                                    CleanTimeManager.INSTANCE.setAppinstanceid(installationId);
                                    Log.d("Firebase", "Installation ID: " + installationId);

                                    String country = SmartFileLanguageUtils.getInstance().getCountry();
                                    SmartFileMsgInfo smartfileMsgInfoWxm = SmartFileMsgCreate.buildTokenParams(srcToken);


                                    SharedPreferences prefs = SmartFileManager.mContext.getSharedPreferences("token", Context.MODE_PRIVATE);
                                    SharedPreferences.Editor editor = prefs.edit();
                                    editor.putString("token", srcToken);
                                    editor.apply(); // 异步提交，使用 commit() 为同步提交


                                    Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(smartfileMsgInfoWxm));
                                    if (!SmartFileMsgUploader.this.isBindingDevice) {
                                        SmartFileMsgUploader.this.isBindingDevice = true;
                                        ((SmartFileMsgApi) SmartFileRetrofitUtils.create(SmartFileMsgApi.class)).upToken(smartfileMsgInfoWxm).enqueue(new BindCallback(SmartFileMsgUploader.this, true, srcToken, country));
                                    }
                                } else {
                                    Log.e("Firebase", "Failed to get Installation ID", task.getException());
                                }
                            }
                        });
            }else{
                String country = SmartFileLanguageUtils.getInstance().getCountry();
                SmartFileMsgInfo smartfileMsgInfoWxm = SmartFileMsgCreate.buildTokenParams(srcToken);


                SharedPreferences prefs = SmartFileManager.mContext.getSharedPreferences("token", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("token", srcToken);
                editor.apply(); // 异步提交，使用 commit() 为同步提交


                Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(smartfileMsgInfoWxm));
                if (!this.isBindingDevice) {
                    this.isBindingDevice = true;
                    ((SmartFileMsgApi) SmartFileRetrofitUtils.create(SmartFileMsgApi.class)).upToken(smartfileMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
                }
            }

        }catch (Exception e){
            String country = SmartFileLanguageUtils.getInstance().getCountry();
            SmartFileMsgInfo smartfileMsgInfoWxm = SmartFileMsgCreate.buildTokenParams(srcToken);


            SharedPreferences prefs = SmartFileManager.mContext.getSharedPreferences("token", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("token", srcToken);
            editor.apply(); // 异步提交，使用 commit() 为同步提交


            Log.e("xxxFirebaseMessaging", "》》》》report Token data:" + (new Gson()).toJson(smartfileMsgInfoWxm));
            if (!this.isBindingDevice) {
                this.isBindingDevice = true;
                ((SmartFileMsgApi) SmartFileRetrofitUtils.create(SmartFileMsgApi.class)).upToken(smartfileMsgInfoWxm).enqueue(new BindCallback(this, true, srcToken, country));
            }

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

            String currCountry = SmartFileLanguageUtils.getInstance().getCountry();
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
        return SmartFileSPUtils.getString("fcm_token_xxx", "");
    }

    private String getLastReportCountry() {
        return SmartFileSPUtils.getString("fcm_country_xxx", "");
    }

    class BindCallback implements Callback<ResponseBody> {
        boolean device;
        String token;
        String country;

        public BindCallback(SmartFileMsgUploader var1, boolean device, String token, String country) {
            this.device = device;
            this.token = token;
            this.country = country;
        }

        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            Log.e("xxxFirebaseMessaging", "report Token: onResponse=" + response);
            Bundle bundle = new Bundle();
            bundle.putInt("success", response.isSuccessful() ? 1 : 0);
            if (response.isSuccessful()) {
                SmartFileSPUtils.putString("fcm_token_xxx", this.token);
                SmartFileSPUtils.putString("fcm_country_xxx", this.country);
            }
            isBindingDevice = false;
        }


        public void onFailure(Call<ResponseBody> call, Throwable t) {
            Log.e("xxxFirebaseMessaging", "report Token:onFailure error=" + t.getMessage());
            isBindingDevice = false;
        }
    }

}
