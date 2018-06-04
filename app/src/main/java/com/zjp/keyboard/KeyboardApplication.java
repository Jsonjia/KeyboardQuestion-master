package com.zjp.keyboard;

import android.support.multidex.MultiDexApplication;

/**
 * Created by zjp on 2018/6/4 14:32.
 */

public class KeyboardApplication  extends MultiDexApplication {

    private static KeyboardApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static KeyboardApplication getApplication() {
        return instance;
    }
}
