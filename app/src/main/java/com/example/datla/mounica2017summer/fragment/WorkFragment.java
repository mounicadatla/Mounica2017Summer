package com.example.datla.mounica2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;


import com.example.datla.mounica2017summer.AdvanceListViewActivity;
import com.example.datla.mounica2017summer.NotificationActivity;
import com.example.datla.mounica2017summer.PatchActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.ScaleTypeActivity;
import com.example.datla.mounica2017summer.adapter.ListNormalAdapter;
import com.example.datla.mounica2017summer.viewPagerActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private final Context context;
    private final ArrayList<String> contentList;
    private ListView listView;
    private RelativeLayout relativeView;



    public WorkFragment() {
        // Required empty public constructor
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("the fragment is used for");
        contentList.add("three buttons");
        contentList.add("Submit");

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_work, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_work_lv);

//        RelativeView relview = inflater.inflate(R.layout.fragment_work, container, false);
  //      listView = (ListView) view.findViewById(R.id.fragment_work_lv);

        //      ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(),contentList);
//        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), viewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(),PatchActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(),NotificationActivity.class);

                        startActivity(intent3);
                        break;
                }
            }
        });

        return view;
//        return inflater.inflate(R.layout.fragment_work, container, false);
    }

}
