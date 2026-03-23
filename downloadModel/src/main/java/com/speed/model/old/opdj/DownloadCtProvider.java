package com.download.model.old.opdj;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.download.model.old.DownloadManager;

@Keep
public class DownloadCtProvider extends ContentProvider {

    public DownloadCtProvider() {
    }

    public boolean onCreate() {
        if (DownloadManager.isDebug) {
            Log.e("xxx", "OrgCtProvider onCreate");
        }
        return true;
    }


    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        if (DownloadManager.isDebug) {
            Log.d("xxx", "OrgCtProvider query");
        }

        return null;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        if (DownloadManager.isDebug) {
            Log.d("xxx", "OrgCtProvider getType");
        }

        return null;
    }


    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        if (DownloadManager.isDebug) {
            Log.d("xxx", "OrgCtProvider insert");
        }
        return null;
    }

    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        if (DownloadManager.isDebug) {
            Log.d("xxx", "OrgCtProvider delete");
        }
        return 0;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        if (DownloadManager.isDebug) {
            Log.d("xxx", "OrgCtProvider update");
        }
        return 0;
    }
}

