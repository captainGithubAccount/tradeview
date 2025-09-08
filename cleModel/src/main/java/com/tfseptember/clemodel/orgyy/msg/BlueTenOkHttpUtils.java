package com.tfseptember.clemodel.orgyy.msg;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class BlueTenOkHttpUtils {
    private static volatile OkHttpClient httpClient;

    public BlueTenOkHttpUtils() {
    }

    public static OkHttpClient getInstance() {
        if (httpClient == null) {
            httpClient = (new OkHttpClient.Builder()).followRedirects(true).connectTimeout(20L, TimeUnit.SECONDS).readTimeout(20L, TimeUnit.SECONDS).writeTimeout(20L, TimeUnit.SECONDS).build();
        }
        return httpClient;
    }
}
