package com.sky.eyepetizer.http;

import com.sky.eyepetizer.utils.Debugger;

import rx.Subscriber;

/**
 * Created by tonycheng on 2016/11/3.
 */

public abstract class HttpResultSubscriber<T> extends
        Subscriber<HttpResult<T>> {

    @Override
    public void onError(Throwable e) {
        onFail(e);
    }

    @Override
    public void onNext(HttpResult<T> tHttpResult) {
        if (tHttpResult != null) {
            onSuccess(tHttpResult);
            Debugger.d(tHttpResult.getItemList().toString());
        } else {
            onFail(new Throwable());
        }
    }

    public abstract void onSuccess(HttpResult<T> result);

    public abstract void onFail(Throwable e);
}
