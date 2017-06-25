package com.example.datla.mounica2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import com.example.datla.mounica2017summer.R;

/**
 * Created by kkishorekr on 6/25/17.
 */

public class CustomDialog extends Dialog {
    public CustomDialog(@NonNull Context context) {
//        super(context);
        super(context,R.style.dialog);
        setContentView(R.layout.dialog_custom);

    }

    public CustomDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    protected CustomDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
