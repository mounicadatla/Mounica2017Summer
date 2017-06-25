package com.example.datla.mounica2017summer.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.datla.mounica2017summer.R;

import static java.lang.Boolean.FALSE;

public class Activity extends AppCompatActivity {

    private static  final String TAG="Activity";
    private static  final Boolean DEBUG_LIFECYCLE=FALSE;

    /*Standard acitivy result:operation canceled. */
    public static  final int RESULT_CANCELED=0;

    /*Standard acitivy result:operation succeeded. */
    public static  final int RESULT_OK=-1;

    /*Standard  result:uder defined activity result. */
    public static  final int RESULT_FIRST_USER=-1;

    /*Standard  result:uder defined activity result. */
    public static  final int DONT_FINISH_TASK_WITH_ACTIVITY=-1; //CHECK THE VALUE

    public static  final int FINISH_TASK_WITH_ACTIVITY=1;// CHECK THE VALUE

    public static  final int FINISH_TASK_WITH_ROOT_ACTIVITY=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
    }
}
