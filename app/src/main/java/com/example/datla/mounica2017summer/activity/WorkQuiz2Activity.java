package com.example.datla.mounica2017summer.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.activity.Workquiz2customDialog;
import com.example.datla.mounica2017summer.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static butterknife.ButterKnife.bind;

public class WorkQuiz2Activity extends Dialog implements View.OnClickListener{

private WorkQuiz2Activity.ICustomDialogListener listener;


    private int rdgID;


    @BindView(R.id.activity_quiz2_xml)
    RadioGroup rdg;

    public interface ICustomDialogListener{
      public void onClickListener();
      public void onOKClicked(String msg);

        //  public void onCancelClicked(String msg);

    }

    @OnClick(R.id.activity_quiz2_ok_button)
    public void ok(View view){
        switch(view.getId()){
            case R.id.activity_work_quiz2_yes_bt:
                Log.d("Summer", "Quiz2==yes==");
                System.out.println("----------------------Quiz2 yes-----------------");
                break;
            case R.id.activity_work_quiz2_no_bt:
                Log.d("Summer", "Quiz2==no==");
                System.out.println("----------------------Quiz2-no----------------");
//                WorkQuiz2Activity();
//                Intent intent10= new Intent(getActivity(), WorkQuiz2Activity.class);
                //               startActivity (intent10);

                break;
            case R.id.activity_work_quiz2_exit_bt:
                Log.d("Summer", "Quiz2===exit=");
                System.out.println("----------------------Quiz2---exit--------------");

                break;
            default:
        }

        listener.onOKClicked("You clicked OK");
        cancel();

    }

    private int checkedID;
    private final int DIALOG = 12345;
    public Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what){
                case DIALOG:
                    Bundle bundle = msg.getData();
                    String s = bundle.getString("msg");
              //      shortToast("Dialog Message: " + s);
//                    Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();

                    break;

                default:
            }
            super.handleMessage(msg);


        }
    };

    @BindView(R.id.activity_quiz2_radio_group) RadioGroup radioGroup;

    public WorkQuiz2Activity(@NonNull Context context) {
        super(context);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_gesture);

        View view = inflater.inflate(R.layout.activity_quiz2, container, false);
        Button  b1 = (Button) view.findViewById(R.id.activity_work_quiz2_yes_bt);
        b1.setOnClickListener(this);

        Button  b2 = (Button) view.findViewById(R.id.activity_work_quiz2_no_bt);
        b2.setOnClickListener(this);


        Button  b3 = (Button) view.findViewById(R.id.activity_work_quiz2_exit_bt);
        b3.setOnClickListener(this);

        return view;
    }

    public WorkQuiz2Activity( Context context, WorkQuiz2Activity.ICustomDialogListener listener) {
//        super(context);
        super(context,R.style.workdialog);
//        setContentView(R.layout.work_dialog_custom);
//        setContentView(R.layout.activity_workquiz2custom_dialog);
        setContentView(R.layout.activity_quiz2);

        bind(this);
        this.listener=listener;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_work_quiz2);
//        setContentView(R.layout.activity_quiz2);
        setContentView(R.layout.activity_quiz2);
        ButterKnife.bind(this);
       // ButterKnife.bind(this);
//        WorkQuiz2Activity dialog = new WorkQuiz2Activity(getActivity());
  //      dialog.setContentView(R.layout.activity_quiz2);
    //    dialog.show();

//        Workquiz2customDialog workcustomDialog = new Workquiz2customDialog(this, new Workquiz2customDialog.ICustomDialogListener() {
//            @Override
//            public void onOKClicked(String msg) {
//                shortToast(msg);
//            }
//        });
//        workcustomDialog.setCanceledOnTouchOutside(false);
//        workcustomDialog.show();


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.activity_work_quiz2_yes_bt :
//                normalDialog();
                break;
            default:

        }

    }
}
