package com.nitolmotorsltd.admovexample;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this, getString(R.string.admov_app_id));
    }
}
