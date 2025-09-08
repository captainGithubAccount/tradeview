package com.tfseptember.clemodel.orgyy;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tfseptember.clemodel.BlueTenOrgManager;
import com.tfseptember.clemodel.R;

@Keep
public class BlueTenUserProvider extends ContentProvider {

    public BlueTenUserProvider() {
    }

    public static String getAuthority() {
        return BlueTenOrgManager.getResString(R.string.blueten_provider_auth);
    }

    public boolean onCreate() {
        return true;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }


    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }


    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}

