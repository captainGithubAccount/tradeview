package com.smartfile.model.change;

import com.smartfile.model.opdj.msg.SmartFileMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SmartFileMsgApi {
    // todo 修改域名
    @POST("com/rapid/filemanger/rep")
    Call<ResponseBody> upToken(@Body SmartFileMsgInfo var1);
}

