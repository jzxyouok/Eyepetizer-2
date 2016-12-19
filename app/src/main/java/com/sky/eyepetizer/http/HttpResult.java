package com.sky.eyepetizer.http;

/**
 * Created by tonycheng on 2016/11/3.
 */

public class HttpResult<T> {

    private T itemList;

    public T getItemList() {
        return itemList;
    }

    public void setItemList(T itemList) {
        this.itemList = itemList;
    }
}
