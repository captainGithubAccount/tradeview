package com.tfseptember.clemodel.change;

import com.tfseptember.clemodel.opdj.msg.SimplyMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SimplyMsgApi {
    // todo 修改域名
    @POST("com/open/file/rep")
    Call<ResponseBody> upToken(@Body SimplyMsgInfo var1);
}

