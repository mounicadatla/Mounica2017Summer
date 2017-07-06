package com.example.datla.mounica2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.datla.mounica2017summer.AnimatorActivity;
import com.example.datla.mounica2017summer.activity.DialogActivity;
import com.example.datla.mounica2017summer.activity.Quiz4Activity;
import com.example.datla.mounica2017summer.activity.WorkQuiz2Activity;

import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.activity.WorkcustomdialogActivity;
import com.example.datla.mounica2017summer.dialog.CustomDialog;


import java.util.ArrayList;


public class WorkFragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match

            // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
//    private final WorkFragment.ICustomDialogListener listener;

    public interface ICustomDialogListener{
        public void onOKClicked(String msg);
        //  public void onCancelClicked(String msg);

    }

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listView;
   private final Context context;
   private final ArrayList<String> contentList;

    public WorkFragment() {
        context = getContext();
        contentList = new ArrayList<String>();

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WorkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WorkFragment newInstance(String param1, String param2) {
        WorkFragment fragment = new WorkFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.work_quiz1_button:
                Log.d("Summer", "Quiz1====");
                System.out.println("----------------------Quiz1-----------------");
                Intent intent14= new Intent(getActivity(), AnimatorActivity.class);
                startActivity (intent14);

                break;
            case R.id.work_quiz2_button:
                Log.d("Summer", "Quiz2====");
                System.out.println("----------------------Quiz2-----------------");
//                WorkQuiz2Activity();
               Intent intent10= new Intent(getActivity(), WorkQuiz2Activity.class);
//                Intent intent10= new Intent(getActivity(), WorkcustomdialogActivity.class);

                startActivity (intent10);

                break;
            case R.id.work_quiz3_button:
                Log.d("Summer", "Quiz3====");
                System.out.println("----------------------Quiz3-----------------");
             break;
            case R.id.work_quiz4_button:
                Log.d("Summer", "Quiz3====");
                System.out.println("----------------------Quiz3-----------------");
                Intent intent4= new Intent(getActivity(), Quiz4Activity.class);
                startActivity (intent4);


                break;
            default:
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_gesture);

        View view = inflater.inflate(R.layout.fragment_work, container, false);
        Button  b1 = (Button) view.findViewById(R.id.work_quiz1_button);
        b1.setOnClickListener(this);

        Button  b2 = (Button) view.findViewById(R.id.work_quiz2_button);
        b2.setOnClickListener(this);


        Button  b3 = (Button) view.findViewById(R.id.work_quiz3_button);
        b3.setOnClickListener(this);

        Button  b4 = (Button) view.findViewById(R.id.work_quiz4_button);
        b4.setOnClickListener(this);
        return view;
    }

}