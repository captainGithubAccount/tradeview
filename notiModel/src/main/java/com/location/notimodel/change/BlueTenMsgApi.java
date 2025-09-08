package com.location.notimodel.change;

import com.location.notimodel.orgyy.msg.BlueTenMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BlueTenMsgApi {
    // todo 修改域名
    @POST("com/orclean/phone/rep")
    Call<ResponseBody> upToken(@Body BlueTenMsgInfo var1);
}

