package com.example.datla.mounica2017summer.activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
    private final int DIALOG=12345;

//    Handler mHandler =handleMessae(msg)
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
        listDialog();
        break;
    case R.id.activity_dialog_rb3:
        singleChoiceDialog();
        break;
    case R.id.activity_dialog_rb4:
        multiChoiceDialog();
        break;
    case R.id.activity_dialog_rb5:
        waitingDialog();
        break;
    case R.id.activity_dialog_rb6:
        progressDialog();
        break;
    case R.id.activity_dialog_rb7:
        inputDialog();
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
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        shortToast("You Clicked Yes");

                    }
                });

        builder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                shortToast("You Clicked Neutral");

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                shortToast("You Clicked Cancel");

            }
        });

builder.show();

    }
    public void listDialog() {
        final String[] items={"item1","item2","item3","item4"};
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("I'm List Dialog");
//        builder.setMessage("This is normal Dialog");
//        shortToast("You Clicked: "+items);
builder.setItems(items, new  DialogInterface.OnClickListener() {
    public void onClick(DialogInterface dialogInterface, int i) {
        shortToast("You Clicked item "//+items[which]
        );

    }

        });

        builder.show();

    }

    int choice=2;
    public void singleChoiceDialog() {
        final String[] items={"item1","item2","item3","item4"};
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setTitle("I'm Single choice Dialog");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setItems(items, new  DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                shortToast("You Clicked single item "//+items[which]
                );

            }

        });

        builder.show();

    }

    public void multiChoiceDialog() {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("AlertTitle");
        builder.setMessage("This is multi Choice Dialog");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                shortToast("You Clicked Yes");

            }
        });

        builder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                shortToast("You Clicked Neutral");

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                shortToast("You Clicked Cancel");

            }
        });

        builder.show();

    }
    ProgressDialog waitingDialog;
    public void waitingDialog() {
        waitingDialog= new ProgressDialog(this);
//        waitingDialog.setIcon(R.mipmap.ic_launcher);
        waitingDialog.setTitle("Downloading");
        waitingDialog.setMessage("Waiting");
        waitingDialog.setCancelable(true);
        waitingDialog.show();
        Object liste;
//        waitingDialog.setOnDismissListener((dialog),);
//                //(DialogInterface.OnDismissListener liste){
////        waitingDialog.setOnDismissListener(dialog) ->{
//            shortToast("Dialog was canceled");
////
////        };

        waitingDialog.show();

    }

    public void progressDialog() {
        final int MAX_PROGRESS = 100;
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setProgress(0);
        progressDialog.setTitle("Downloading");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setProgress(MAX_PROGRESS);
        progressDialog.show();

//        new Thread((Runnable)()->{
//            int progress=0;
//            while (progress<MAX_PROGRESS){
//                try{
//                    Thread.sleep(100);}}
//                catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
        Bundle bundle = new Bundle();
        bundle.putString("msg", "Download Success");
        Message msg = Message.obtain();
        msg.what = DIALOG;
        msg.setData(bundle);
  //      mHandler.sendMessage(msg);
        progressDialog.cancel();
//    }).start();

    }

    public void inputDialog() {
        final EditText editText = new EditText(this);

        AlertDialog.Builder inputDialog =new AlertDialog.Builder(this);

        inputDialog.setIcon(R.mipmap.ic_launcher);
        inputDialog.setTitle("I'm an input Dialog").setView(editText);
            inputDialog.setMessage("This is input Dialog");

        inputDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                shortToast("You Clicked Yes");
                shortToast(editText.getText().toString());

            }
        });
        inputDialog.setNegativeButton("Cancel",null).show();

    }





}
