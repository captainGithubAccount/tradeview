package com.easy.model.old.change;

import com.easy.model.old.opdj.msg.EasyMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface EasyMsgApi {
    // todo 修改域名
//    @POST("com/gofile/manager/rep")
    @POST
    Call<ResponseBody> upToken(@Url String url, @Body EasyMsgInfo var1);
}

