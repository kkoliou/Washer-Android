package com.android.washer;

import androidx.annotation.Nullable;

public class WashSingleton {

    private static volatile WashSingleton sharedInstance = new WashSingleton();

    private WashSingleton() {
        // do nothing
    }

    public static WashSingleton getInstance() {
        return sharedInstance;
    }

    void reset() {
        sharedInstance = new WashSingleton();
    }

    @Nullable
    WasherModel washerModel;

    String Program;
    String Temperature;
    String Rpm;
    int Duration;
}
