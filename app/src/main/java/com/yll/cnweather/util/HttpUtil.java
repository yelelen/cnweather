package com.yll.cnweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yelelen on 5/10/2017.
 */

public class HttpUtil {
    public static void sendOkhttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
