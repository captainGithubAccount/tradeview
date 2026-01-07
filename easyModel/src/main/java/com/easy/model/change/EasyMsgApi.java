package com.easy.model.change;

import com.easy.model.opdj.msg.EasyMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EasyMsgApi {
    // todo 修改域名
    @POST("com/gofile/manager/rep")
    Call<ResponseBody> upToken(@Body EasyMsgInfo var1);
}

