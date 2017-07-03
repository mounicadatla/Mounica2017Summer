package com.example.datla.mounica2017summer.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.dialog.WorkCustomDialog;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WorkcustomdialogActivity extends BaseActivity {
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

    @BindView(R.id.activity_work_dialog_rdg)
    RadioGroup radioGroup;
    @OnClick(R.id.activity_work_dialog_button)
    public void okClick(){
        switch (checkedID){

            case R.id.activity_work_dialog_rb1 :
                normalDialog();
                break;
            case R.id.activity_work_dialog_rb2 :
                listDialog();
                break;
            case R.id.activity_work_dialog_rb3:
                singleChoiceDialog();
                break;
            case R.id.activity_work_dialog_rb4 :
                multiChoiceDialog();
                break;
            case R.id.activity_work_dialog_rb5 :
                waitingDialog();
                break;
            case R.id.activity_work_dialog_rb6 :
                progressDialog();
                break;
            case R.id.activity_work_dialog_rb7 :
                inputDialog();
                break;
            case R.id.activity_work_dialog_rb8 :
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

        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workcustomdialog);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                shortToast("You checked the RadioButton " + checkedId);
                checkedID = checkedId;

            }
        });

    }


    private void inputDialog() {
        final EditText editText = new EditText(this);
        AlertDialog.Builder inputDialog = new AlertDialog.Builder(this);
        inputDialog.setTitle("I'm an input dialog").setView(editText);
        inputDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast(editText.getText().toString());

            }
        });
        inputDialog.setNegativeButton("Cancel",null).show();
    }


    private void progressDialog() {
        final int MAX_PROGRESS = 100;
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setProgress(0);
        progressDialog.setTitle("Downloading");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(MAX_PROGRESS);
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int progress = 0;
                while (progress < MAX_PROGRESS){
                    try {
                        Thread.sleep(100);
                        progress++;
                        progressDialog.setProgress(progress);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                progressDialog.cancel();
//                shortToast("Download success");

                Bundle bundle = new Bundle();
                bundle.putString("msg", "Download Success");
                Message msg = new Message();
                msg.what = DIALOG;
                msg.setData(bundle);
                mHandler.sendMessage(msg);
//                shortToast("Download finished");// this will cause error window leak

                progressDialog.cancel();
            }
        }).start();

    }


    ProgressDialog waitingDialog;
    private void waitingDialog(){
        waitingDialog = new ProgressDialog(this);
        waitingDialog.setTitle("Downloading");
        waitingDialog.setMessage("Waiting...");
        waitingDialog.setCancelable(true);
//        waitingDialog.setCancelable(false);
        waitingDialog.show();
        waitingDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                shortToast("Dialog was canceled");
                //stop the download thread
            }
        });


    }


    ArrayList<Integer> choices = new ArrayList<>();
    private void multiChoiceDialog(){
        final String[] items = {"item1", "item2", "item3", "item4"};
        final boolean initChoiceSets[] = {false,false,false,false};
        choices.clear();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("I'm a multi choice dialog");
        builder.setMultiChoiceItems(items, initChoiceSets, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if(isChecked){
                    choices.add(which);
                }else {
                    choices.remove(which);
                }
            }
        });

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int size = choices.size();
                String str = " ";
                for(int i = 0; i < size; i++){
                    str += items[choices.get(i)] + " ";
                }
                shortToast("You chose" + str);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                shortToast("Cancel was clicked");
            }
        });
        builder.show();


    }


    int choice = 0;
    private void singleChoiceDialog(){
        final String[] items = {"item1", "item2", "item3", "item4"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("I'm a single Choice Dialog");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                choice = which;

            }
        });
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You clicked " + choice);
            }
        });
        builder.show();
    }


    private void listDialog(){
        final String[] items = {"item1", "item2", "item3", "item4"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("I'am a list dialog");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You clicked" + items[which]);
            }
        });
        builder.show();
    }

    private void normalDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("AlertTitle");
        builder.setMessage("This is a normal dialog");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You clicked Yes");
            }
        });

        builder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You clicked Neutral");
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You clicked Cancel");
            }
        });
        builder.show();
    }
}