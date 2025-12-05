package com.pinkpur.sadklive.opdj.msg;


import com.pinkpur.sadklive.change.PinkpurChangeUtils;

import java.util.Hashtable;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public abstract class PinkpurRetrofitUtils {
    private static volatile Retrofit INSTANCE;
    private static final Hashtable<Object, Object> hashtable;

    public PinkpurRetrofitUtils() {
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
        INSTANCE = (new Retrofit.Builder()).baseUrl(PinkpurChangeUtils.INSTANCE.getFCM_URL()).client(PinkpurOkHttpUtils.getInstance()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        hashtable = new Hashtable();
    }
}

