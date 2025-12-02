package com.smartfile.model.utils;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.Keep;

import com.smartfile.model.SpeedManager;

@Keep
public class SpeedSPUtils {
    private static final String PREF_NAME = "ORANGESP";

    public SpeedSPUtils() {
    }


    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("ORANGESP", 0);
    }


    public static void putString(String key, String value) {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.putString(key, value);
        editor.apply();
    }


    public static String getString(String key, String defaultValue) {
        return getSharedPreferences(SpeedManager.mContext).getString(key, defaultValue);
    }


    public static void putInt(String key, int value) {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getInt(String key, int defaultValue) {
        return getSharedPreferences(SpeedManager.mContext).getInt(key, defaultValue);
    }

    public static void putBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.putBoolean(key, value);
        editor.apply();
    }


    public static boolean getBoolean(String key, boolean defaultValue) {
        return getSharedPreferences(SpeedManager.mContext).getBoolean(key, defaultValue);
    }


    public static void putLong(String key, long value) {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.putLong(key, value);
        editor.apply();
    }


    public static long getLong(String key, long defaultValue) {
        return getSharedPreferences(SpeedManager.mContext).getLong(key, defaultValue);
    }


    public static void putFloat(String key, float value) {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.putFloat(key, value);
        editor.apply();
    }


    public static float getFloat(String key, float defaultValue) {
        return getSharedPreferences(SpeedManager.mContext).getFloat(key, defaultValue);
    }


    public static void remove(String key) {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.remove(key);
        editor.apply();
    }

    public static void clear() {
        SharedPreferences.Editor editor = getSharedPreferences(SpeedManager.mContext).edit();
        editor.clear();
        editor.apply();
    }
}
