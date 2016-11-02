package com.sky.eyepetizer.http;

import com.sky.eyepetizer.App;

import okhttp3.Cache;

/**
 * Created by tonycheng on 2016/11/2.
 */

public class HttpCache {

    private static final long MAX_CACHE_SIZE = 1024 * 1024 * 10;//10M

    public static Cache getCache() {
        //Android中推荐使用CacheDir存放缓存
        return new Cache(App.getContext().getCacheDir(), MAX_CACHE_SIZE);
    }
}
