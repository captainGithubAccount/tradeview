package com.whitenoti.wasid.opdj.msg;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class WhiterOkHttpUtils {
    private static volatile OkHttpClient httpClient;

    public WhiterOkHttpUtils() {
    }

    public static OkHttpClient getInstance() {
        if (httpClient == null) {
            httpClient = (new OkHttpClient.Builder()).followRedirects(true).connectTimeout(20L, TimeUnit.SECONDS).readTimeout(20L, TimeUnit.SECONDS).writeTimeout(20L, TimeUnit.SECONDS).build();
        }
        return httpClient;
    }
}
