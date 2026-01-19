package com.tidy.file.old.change;

import com.tidy.file.old.opdj.msg.TidyMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface TidyMsgApi {
    // todo 修改域名
//    @POST("com/gofile/manager/rep")
    @POST
    Call<ResponseBody> upToken(@Url String url, @Body TidyMsgInfo var1);
}

