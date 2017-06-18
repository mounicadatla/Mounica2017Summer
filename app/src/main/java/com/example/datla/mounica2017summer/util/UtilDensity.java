package com.example.datla.mounica2017summer.util;

/**
 * Created by mounicadatla on 6/17/17.
 */
import android.content.Context;

public class UtilDensity {

public static int dip2px(Context context,float dpValue){
    final float scale= context.getResources().getDisplayMetrics().density;
return (int)(dpValue * scale + 0.5f);

}

    public static int pix2dp(Context context,float pxValue){
        final float scale= context.getResources().getDisplayMetrics().density;
        return (int)(pxValue/scale+0.5f);

    }
}
