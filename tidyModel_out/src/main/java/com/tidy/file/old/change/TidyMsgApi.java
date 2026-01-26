package com.tidy.file.old.change;

import com.tidy.file.old.opdj.msg.TidyMsgInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;
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

public interface TidyMsgApi {

    // todo 修改域名
    //    @POST("com/gofile/manager/rep")
    @POST
    Call<ResponseBody> upToken(@Url String url, @Body TidyMsgInfo var1);
}
