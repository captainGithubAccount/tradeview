package com.tfseptember.clemodel.utils;


import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;

import java.util.Locale;

public class SimplyCatchLanguageUtils {
    private String mCountry;
    private static volatile SimplyCatchLanguageUtils instance;

    private SimplyCatchLanguageUtils() {
    }

    public static SimplyCatchLanguageUtils getInstance() {
        if (instance == null) {
            instance = new SimplyCatchLanguageUtils();
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
