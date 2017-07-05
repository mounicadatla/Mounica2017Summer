package com.example.datla.mounica2017summer.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.dialog.WorkCustomDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Workquiz2customDialog extends Dialog implements View.OnClickListener{
    private final Workquiz2customDialog.ICustomDialogListener listener;

    @Override
    public void onClick(View view) {

    }

    public interface ICustomDialogListener{
        public void onOKClicked(String msg);
        // public void onCancelClicked(String msg);

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
    public Workquiz2customDialog(@NonNull Context context, Workquiz2customDialog.ICustomDialogListener listener) {
//        super(context);
        super(context,R.style.workdialog);
//        setContentView(R.layout.work_dialog_custom);
//        setContentView(R.layout.activity_workquiz2custom_dialog);
        setContentView(R.layout.activity_quiz2);


        ButterKnife.bind(this);
        this.listener=listener;

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_gesture);

        View view = inflater.inflate(R.layout.activity_quiz2, container, false);
        Button b1 = (Button) view.findViewById(R.id.activity_work_quiz2_yes_bt);
        b1.setOnClickListener(this);

        Button  b2 = (Button) view.findViewById(R.id.activity_work_quiz2_no_bt);
        b2.setOnClickListener(this);


        Button  b3 = (Button) view.findViewById(R.id.activity_work_quiz2_exit_bt);
        b3.setOnClickListener(this);

        return view;
    }


}
