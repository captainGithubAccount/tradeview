package com.smartfile.model.old.change;

import com.smartfile.model.old.opdj.msg.SmartfileMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface SmartfileMsgApi {
    // todo 修改域名
//    @POST("com/gofile/manager/rep")
    @POST
    Call<ResponseBody> upToken(@Url String url, @Body SmartfileMsgInfo var1);
}

