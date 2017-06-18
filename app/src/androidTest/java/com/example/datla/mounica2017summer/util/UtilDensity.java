package com.example.datla.mounica2017summer.util;
/**
 * Created by mounicadatla on 6/17/17.
 */

import android.content.Context;

/**
 * Created by YoungH on 2/8/17.
 */

      public class UtilDensity {

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

}
