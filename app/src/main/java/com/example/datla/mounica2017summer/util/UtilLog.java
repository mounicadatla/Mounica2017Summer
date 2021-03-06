package com.example.datla.mounica2017summer.util;

import android.util.Log;

/**
 * Created by mounicadatla on 6/20/17.
 */
    public class UtilLog {


    private static boolean isLog=false;

     public static void setIsLog(boolean b) {
         isLog = b;
     }

    public static void d(String tag, String msg) {
        if (isLog) {
            Log.d(tag, msg);
        }
    }
    public static void v (String tag, String msg) {
        if (isLog) {
            Log.d(tag, msg);
        }
    }

    public static void logD(String key, String value){
        if(isLog){
            Log.d(key, value);
        }
    }
    }
