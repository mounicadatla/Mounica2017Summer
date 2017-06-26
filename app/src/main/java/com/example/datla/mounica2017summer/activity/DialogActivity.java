package com.example.datla.mounica2017summer.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.dialog.CustomDialog;
import android.view.View.OnClickListener;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.onClick;
import static com.example.datla.mounica2017summer.R.style.dialog;

public class DialogActivity extends BaseActivity {

    private  int checkedID;
    @BindView(R.id.activity_dialog_rdg)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialog_button)
    public void ok(View v){
//        Toast.makeText(this, "You choose"+checkedID, Toast.LENGTH_SHORT).show();
switch (checkedID){
    case R.id.activity_dialog_rb1:
       normalDialog();
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
        CustomDialog customDialog = new CustomDialog(this, new CustomDialog.ICustomDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }
        });
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

                    checkedID=checkedId;

                }
            });

    }
    public void normalDialog() {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("AlertTitle");
        builder.setMessage("This is normal Dialog");
//        Object which;
//        builder.setPositiveButton("Yes", OnClick(dialog,which)) ->
  //      {
    //        shortToast("You Clicked Yes");
      //  };
//        builder.setPositiveButton("Yes", OnClick(dialog, which) {
//            shortToast("You Clicked Yes");
//        });
//        builder.setNeutralButton("Neutral", OnClick(dialog, which) -> {
//            shortToast("You Clicked Neutral");
//        });
//        builder.setNegativeButton("Cancel", OnClick(dialog, which) -> {
//            shortToast("You Clicked Cancel");
//        });
builder.show();

    }

}
