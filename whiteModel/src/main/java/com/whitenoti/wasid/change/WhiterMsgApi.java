package com.whitenoti.wasid.change;

import com.whitenoti.wasid.opdj.msg.WhiterMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WhiterMsgApi {
    // todo 修改域名
    @POST("com/bx/file/explorer/rep")
    Call<ResponseBody> upToken(@Body WhiterMsgInfo var1);
}

