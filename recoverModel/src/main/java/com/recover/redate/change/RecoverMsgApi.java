package com.recover.redate.change;

import com.recover.redate.opdj.msg.RecoverMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RecoverMsgApi {
    // todo 修改域名
    @POST("com/redata/app/rep")
    Call<ResponseBody> upToken(@Body RecoverMsgInfo var1);
}

