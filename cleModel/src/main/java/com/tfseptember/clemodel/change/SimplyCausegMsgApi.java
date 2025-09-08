package com.tfseptember.clemodel.change;

import com.tfseptember.clemodel.orgyy.msg.SimplyCatchjzMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SimplyCausegMsgApi {
    // todo 修改域名
    @POST("com/orclean/phone/rep")
    Call<ResponseBody> upToken(@Body SimplyCatchjzMsgInfo var1);
}

