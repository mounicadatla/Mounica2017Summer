package com.example.datla.mounica2017summer.fragment;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.datla.mounica2017summer.AnimatorActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.activity.Quiz4Activity;
import com.example.datla.mounica2017summer.activity.Quiz5Activity;
import com.example.datla.mounica2017summer.activity.WorkQuiz2Activity;

import java.util.ArrayList;


public class WorkFragment extends DialogFragment
        implements View.OnClickListener{
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

                FragmentManager manager = getFragmentManager();
                Fragment frag = manager.findFragmentByTag("fragment_edit_name");

//                CustomDialog customDialog = new CustomDialog(this,
//                        new CustomDialog.ICustomDialogListener() {
//                    @Override
//                    public void onOKClicked(String msg) {
////                        shortToast(msg);
//                    }
//                });
//                customDialog.setCanceledOnTouchOutside(false);
  //              customDialog.show();
             break;
            case R.id.work_quiz4_button:
                Log.d("Summer", "Quiz4====");
                System.out.println("----------------------Quiz4-----------------");
                Intent intent4= new Intent(getActivity(), Quiz4Activity.class);
                startActivity (intent4);


                break;
            case R.id.work_quiz5_button:
                Log.d("Summer", "Quiz5====");
                System.out.println("----------------------Quiz5-----------------");
                Intent intent5= new Intent(getActivity(), Quiz5Activity.class);
                startActivity (intent5);


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
  //      b3.setOnClickListener(this);
b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.custom_dialog_quiz3);
                dialog.setTitle("Quiz");

                dialog.show();

                Button button_cancel = (Button) dialog.findViewById(R.id.button_cancel);
                button_cancel.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        dialog.dismiss();
                    }
                });

                final RadioButton rbutton_yes = (RadioButton)dialog.findViewById(R.id.button_yes);
                final RadioButton rbutton_no = (RadioButton)dialog.findViewById(R.id.button_no);
                final RadioButton rbutton_exit = (RadioButton)dialog.findViewById(R.id.button_exit);

                final RadioGroup radioGroup = (RadioGroup)dialog.findViewById(R.id.rgroup);

                Button button_ok = (Button)dialog.findViewById(R.id.button_ok);
                button_ok.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (radioGroup.getCheckedRadioButtonId()==-1){

                        }else{
                            if (rbutton_yes.isChecked()) {
                                Toast.makeText(getActivity(),"Yes",Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            } else if (rbutton_no.isChecked()){
                                Toast.makeText(getActivity(),"No",Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            } else if (rbutton_exit.isChecked()) {
                                Toast.makeText(getActivity(),"Exit",Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                                getActivity().finish();
                            }
                        }
                    }
                });
            }
        });

        Button  b4 = (Button) view.findViewById(R.id.work_quiz4_button);
        b4.setOnClickListener(this);

        Button  b5 = (Button) view.findViewById(R.id.work_quiz5_button);
        b5.setOnClickListener(this);


        return view;
    }

}