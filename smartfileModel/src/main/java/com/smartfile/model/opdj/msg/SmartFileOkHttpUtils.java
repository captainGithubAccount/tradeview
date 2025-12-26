package com.smartfile.model.opdj.msg;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class SmartFileOkHttpUtils {
    private static volatile OkHttpClient httpClient;

    public SmartFileOkHttpUtils() {
    }

    public static OkHttpClient getInstance() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        if (httpClient == null) {
            httpClient = (new OkHttpClient.Builder())
                    //todo url
//                    .addInterceptor(loggingInterceptor)
                    .hostnameVerifier(new HostnameVerifier() {
                        @Override
                        public boolean verify(String hostname, SSLSession session) {
                            return true;
                        }
                    })
                    .followRedirects(true)
                    .connectTimeout(20L, TimeUnit.SECONDS)
                    .readTimeout(20L, TimeUnit.SECONDS)
                    .writeTimeout(20L, TimeUnit.SECONDS)
                    .build();
        }

        return httpClient;
    }
}
