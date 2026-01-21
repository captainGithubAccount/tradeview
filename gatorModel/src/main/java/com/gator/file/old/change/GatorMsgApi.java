package com.gator.file.old.change;

import com.gator.file.old.opdj.msg.GatorMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface GatorMsgApi {
    // todo 修改域名
//    @POST("com/gofile/manager/rep")
    @POST
    Call<ResponseBody> upToken(@Url String url, @Body GatorMsgInfo var1);
}

