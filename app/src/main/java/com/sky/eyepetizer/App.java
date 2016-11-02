package com.sky.eyepetizer;

import android.app.Application;
import android.content.Context;

/**
 * Created by tonycheng on 2016/11/2.
 */

public class App extends Application {

    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
