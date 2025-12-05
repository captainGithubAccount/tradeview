package com.pinkpur.sadklive.utils;


import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;

import java.util.Locale;

public class PinkpurLanguageUtils {
    private String mCountry;
    private static volatile PinkpurLanguageUtils instance;

    private PinkpurLanguageUtils() {
    }

    public static PinkpurLanguageUtils getInstance() {
        if (instance == null) {
            instance = new PinkpurLanguageUtils();
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
