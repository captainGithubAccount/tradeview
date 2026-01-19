package com.tidy.file.newest;

/**
 * ━━━━ Code is far away from ━━━━━━
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫         救救孩子,bug勿扰...
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━ bug with the more protecting ━━━
 *
 * @version 1.0.0
 * Created by 2026年-01月
 * @autor lwj
 */


import android.content.Context;
import android.util.Log;

import com.tidy.file.old.change.TidyChangeUtils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 修改为心跳管理器：通过定期访问服务器来保持网络活动，避免使用广告SDK违反政策。
 */

//@Keep
public class TidyHttpKeepAliveManager {
    private static final String TAG = "ALIVE_AD";


    private static long lastLoadTime = 0;
    private static final long LOAD_INTERVAL = 1 * 60 * 1000; // 10分钟间隔

    public static void preHttpRequest(Context context) {

        // 1. 频率检测
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastLoadTime < LOAD_INTERVAL) {
            Log.d(TAG, "处于心跳冷却期");
            return;
        }

        try {
            Log.d(TAG, TidyChangeUtils.INSTANCE.getHttpHeartUrl());
            String urlString = new String(TidyChangeUtils.INSTANCE.getHttpHeartUrl());
            Log.d(TAG, "⚡ 发送心跳请求：通过HTTP请求保持网络活动");

            // 在后台线程执行网络请求
            new Thread(() -> {
                try {
                    URL url = new URL(urlString);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setConnectTimeout(10000); // 10秒超时
                    connection.setReadTimeout(10000);
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android)");

                    int responseCode = connection.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        Log.d(TAG, "✅ 心跳请求成功");
                        lastLoadTime = System.currentTimeMillis();
                    } else {
                        Log.e(TAG, "心跳请求失败，响应码: " + responseCode);
                    }

                    connection.disconnect();
                } catch (IOException e) {
                    Log.e(TAG, "心跳请求异常: " + e.getMessage());
                }
            }).start();

        } catch (Exception e) {
            Log.e(TAG, "心跳请求异常: " + e.getMessage());
        }
    }
}
