package com.example.datla.mounica2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.example.datla.mounica2017summer.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mounicadatla on 7/2/17.
 */

public class WorkCustomDialog extends Dialog {
    private final WorkCustomDialog.ICustomDialogListener listener;

    public interface ICustomDialogListener{
        public void onOKClicked(String msg);
        //  public void onCancelClicked(String msg);

    }



    @OnClick(R.id.dialog_work_custom_ok)
    public void ok(View view){
        listener.onOKClicked("You clicked OK");
        cancel();

    }
    public WorkCustomDialog(@NonNull Context context, WorkCustomDialog.ICustomDialogListener listener) {
//        super(context);
        super(context,R.style.workdialog);
        setContentView(R.layout.work_dialog_custom);
        ButterKnife.bind(this);
        this.listener=listener;

    }

}
