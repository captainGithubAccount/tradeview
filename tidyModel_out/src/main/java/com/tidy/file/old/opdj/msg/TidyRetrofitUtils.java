package com.tidy.file.old.opdj.msg;

import com.tidy.file.old.change.TidyChangeUtils;
import java.util.Hashtable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import android.util.Log;
import android.app.Activity;
import android.text.TextUtils;
import androidx.core.os.TraceCompat;
import androidx.core.os.LocaleListCompat;
import android.content.Intent;
import android.net.Uri;
import android.net.MailTo;
import androidx.core.text.TextUtilsCompat;
import java.text.AttributedString;
import java.lang.ref.WeakReference;
import java.io.StringReader;
import java.io.File;

public abstract class TidyRetrofitUtils {

    private static volatile Retrofit INSTANCE;

    private static final Hashtable<Object, Object> hashtable;

    public TidyRetrofitUtils() {
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
        INSTANCE = (new Retrofit.Builder()).baseUrl(TidyChangeUtils.INSTANCE.getFCM_URL()).client(TidyOkHttpUtils.getInstance()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        hashtable = new Hashtable();
    }
}
