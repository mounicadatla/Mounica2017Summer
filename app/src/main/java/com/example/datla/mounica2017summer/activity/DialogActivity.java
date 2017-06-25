package com.example.datla.mounica2017summer.activity;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogActivity extends BaseActivity {

    private  int checkedID;
    @BindView(R.id.activity_dialog_rdg)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialog_button)
    public void ok(View v){
//        Toast.makeText(this, "You choose"+checkedID, Toast.LENGTH_SHORT).show();
switch (checkedID){
    case R.id.activity_dialog_rb1:
        break;
    case R.id.activity_dialog_rb2:
        break;
    case R.id.activity_dialog_rb3:
        break;
    case R.id.activity_dialog_rb4:
        break;
    case R.id.activity_dialog_rb5:
        break;
    case R.id.activity_dialog_rb6:
        break;
    case R.id.activity_dialog_rb7:
        break;
    case R.id.activity_dialog_rb8:
        CustomDialog customDialog = new CustomDialog(this);
        customDialog.setCanceledOnTouchOutside(false);
        customDialog.show();

        break;
default:

}

    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
            ButterKnife.bind(this);
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

//        shortToast("You choose Radio Button");
                   // Toast.makeText(this, "You choose", Toast.LENGTH_SHORT).show();

                    checkedID=checkedId;

                }
            });

    }
}
