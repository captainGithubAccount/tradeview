package com.tfseptember.clemodel.orgyy.msg;


import com.tfseptember.clemodel.change.BlueTenChangeUtils;

import java.util.Hashtable;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public abstract class BlueTenRetrofitUtils {
    private static volatile Retrofit INSTANCE;
    private static final Hashtable<Object, Object> hashtable;

    public BlueTenRetrofitUtils() {
    }

    public static <T> T create(Class<T> t) {
        T value = null;

        try {
            value = (T) hashtable.get(t);
        } catch (Exception var3) {
            Exception e = var3;
            e.printStackTrace();
        }

        if (value == null) {
            value = INSTANCE.create(t);
            hashtable.put(t, value);
        }

        return value;
    }

    static {
        INSTANCE = (new Retrofit.Builder()).baseUrl(BlueTenChangeUtils.INSTANCE.getFCM_URL()).client(BlueTenOkHttpUtils.getInstance()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        hashtable = new Hashtable();
    }
}

