package com.example.datla.mounica2017summer.activity;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.dialog.WorkCustomDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Workquiz2customDialog extends Dialog {
    private final Workquiz2customDialog.ICustomDialogListener listener;

    public interface ICustomDialogListener{
        public void onOKClicked(String msg);
        //  public void onCancelClicked(String msg);

    }
    @OnClick(R.id.dialog_work_custom_ok)
    public void ok(View view){
        listener.onOKClicked("You clicked OK");
        cancel();

    }
    public Workquiz2customDialog(@NonNull Context context, Workquiz2customDialog.ICustomDialogListener listener) {
//        super(context);
        super(context,R.style.workdialog);
//        setContentView(R.layout.work_dialog_custom);
        setContentView(R.layout.activity_workquiz2custom_dialog);

        ButterKnife.bind(this);
        this.listener=listener;

    }

}
