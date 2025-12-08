package com.tfseptember.clemodel.change;

import com.tfseptember.clemodel.opdj.msg.SimplyMsgInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
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

public interface SimplyMsgApi {

    // todo 修改域名
    @POST("com/open/file/rep")
    Call<ResponseBody> upToken(@Body SimplyMsgInfo var1);
}
