package com.example.datla.mounica2017summer;

import android.app.Application;

import com.example.datla.mounica2017summer.fragment.UtilLog;

/**
 * Created by mounicadatla on 6/19/17.
 */

public class MounicaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }



}
