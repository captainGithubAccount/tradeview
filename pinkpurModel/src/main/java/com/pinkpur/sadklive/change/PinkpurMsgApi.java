package com.pinkpur.sadklive.change;

import com.pinkpur.sadklive.opdj.msg.PinkpurMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PinkpurMsgApi {
    // todo 修改域名
    @POST("com/gator/manager/rep")
    Call<ResponseBody> upToken(@Body PinkpurMsgInfo var1);
}

