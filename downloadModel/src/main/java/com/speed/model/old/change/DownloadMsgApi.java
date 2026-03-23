package com.download.model.old.change;

import com.download.model.old.opdj.msg.DownloadMsgInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface DownloadMsgApi {
    // todo 修改域名
//    @POST("com/gofile/manager/rep")
    @POST
    Call<ResponseBody> upToken(@Url String url, @Body DownloadMsgInfo var1);
}

