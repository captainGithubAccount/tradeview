package com.smartfile.model.change;

import com.smartfile.model.opdj.msg.SpeedMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SpeedMsgApi {
    // todo 修改域名
    @POST("com/gofile/manager/rep")
    Call<ResponseBody> upToken(@Body SpeedMsgInfo var1);
}

