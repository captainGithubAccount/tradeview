package com.recover.redate.utils;


import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;

import java.util.Locale;

public class RecoverLanguageUtils {
    private String mCountry;
    private static volatile RecoverLanguageUtils instance;

    private RecoverLanguageUtils() {
    }

    public static RecoverLanguageUtils getInstance() {
        if (instance == null) {
            instance = new RecoverLanguageUtils();
        }
        return instance;
    }

    public String getCountry() {
        if (!TextUtils.isEmpty(this.mCountry)) {
            return this.mCountry;
        } else {
            this.mCountry = this.getSystemLanguage();
            return this.mCountry;
        }
    }

    public String getSystemLanguage() {
        Locale locale;
        if (VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        return locale.getLanguage();
    }
}
