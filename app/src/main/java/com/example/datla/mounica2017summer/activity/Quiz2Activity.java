package com.example.datla.mounica2017summer.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.dialog.WorkCustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz2Activity extends BaseActivity {
    private int checkedID;
    private final int DIALOG = 12345;

    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what){
                case DIALOG:
                    Bundle bundle = msg.getData();
                    String s = bundle.getString("msg");
                    shortToast("Dialog Message: " + s);
                    break;

                default:
            }
            super.handleMessage(msg);


        }
    };

    @BindView(R.id.activity_quiz2_radio_group)
    RadioGroup radioGroup;
    @OnClick(R.id.activity_quiz2_ok_button)
    public void okClick() {
        switch (checkedID){

            case R.id.activity_work_quiz2_yes_bt :
                yesDialog();
                break;
            case R.id.activity_work_quiz2_no_bt :
                noDialog();
                break;
            case R.id.activity_work_quiz2_exit_bt :
                WorkCustomDialog workcustomDialog = new WorkCustomDialog(this, new WorkCustomDialog.ICustomDialogListener() {
                    @Override
                    public void onOKClicked(String msg) {
                        shortToast(msg);
                    }
                });
                workcustomDialog.setCanceledOnTouchOutside(false);
                workcustomDialog.show();
                break;
            default:

    }}


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_quiz2);
       //     setContentView(R.layout.work_quiz2_dialog_custom);

//            Workquiz2customDialog workquiz2customDialog = new Workquiz2customDialog(this, new Workquiz2customDialog.ICustomDialogListener() {
//                @Override
//                public void onOKClicked(String msg) {
//                    shortToast(msg);
//                }
//            });
//            workquiz2customDialog.setCanceledOnTouchOutside(false);
//            workquiz2customDialog.show();
//
            ButterKnife.bind(this);

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    shortToast("You checked the RadioButton " + checkedId);
                    checkedID = checkedId;

                }
            });

    }

    private void yesDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
//        builder.setTitle("AlertTitle");
        builder.setMessage("Yes");
        builder.show();
    }

    private void noDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
//        builder.setTitle("AlertTitle");
        builder.setMessage("No");
        builder.show();
    }

}
