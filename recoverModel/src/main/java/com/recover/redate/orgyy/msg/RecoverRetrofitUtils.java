package com.recover.redate.orgyy.msg;

import com.recover.redate.change.RecoverChangeUtils;
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

public abstract class RecoverRetrofitUtils {

    private static volatile Retrofit INSTANCE;

    private static final Hashtable<Object, Object> hashtable;

    public RecoverRetrofitUtils() {
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
        INSTANCE = (new Retrofit.Builder()).baseUrl(RecoverChangeUtils.INSTANCE.getFCM_URL()).client(RecoverOkHttpUtils.getInstance()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        hashtable = new Hashtable();
    }
}
