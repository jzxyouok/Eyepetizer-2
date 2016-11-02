package com.sky.eyepetizer.http;

import com.sky.eyepetizer.constant.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tonycheng on 2016/11/2.
 */

public class RetrofitClient {


    private static final int DEFAULT_CONNECT_TIMEOUT = 5;
    private static final int DEFAULT_READ_TIMEOUT = 5;

    private static volatile RetrofitClient instance = null;

    private Retrofit mRetrofit;

    private ApiService mApiService;

    //私有化构造函数
    private RetrofitClient() {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)
                .cache(HttpCache.getCache())
                .build();

        mRetrofit = new Retrofit.Builder()
                .client(httpClient)
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mApiService = mRetrofit.create(ApiService.class);

    }

    public static RetrofitClient getInstance() {
        if (instance == null) {
            synchronized (RetrofitClient.class) {
                if (instance == null) {
                    instance = new RetrofitClient();
                }
            }
        }
        return instance;
    }

    public ApiService getApiService() {
        return mApiService;
    }
}
