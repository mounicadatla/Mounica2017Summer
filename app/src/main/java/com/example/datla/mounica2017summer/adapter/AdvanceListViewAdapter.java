package com.example.datla.mounica2017summer.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.util.UtilDensity;

import java.util.ArrayList;

/**
 * Created by mounicadatla on 6/14/17.
 */

    public  class AdvanceListViewAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<String> list;
    private final LayoutInflater inflater;
    private ViewHolder ViewHolder_viewHolder;

    public AdvanceListViewAdapter(Context context, ArrayList<String> list) {
        
        this.context = context;
        this.list=list;
        inflater =(LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }



    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        Log.d("ViewHolder", "getView");

        ViewHolder viewHolder ;

//        int viewHolder;
        if (convertview == null) {
            Log.d("ViewHolder", "getViewById");

            convertview = inflater.inflate(R.layout.activity_advance_list_item, parent, false);

             viewHolder = new ViewHolder();
            viewHolder.rl_odd = (RelativeLayout) convertview.findViewById(R.id.odd);
            viewHolder.rl_even = (RelativeLayout) convertview.findViewById(R.id.even);

            viewHolder.tv=(TextView) convertview.findViewById(R.id.activity_advance_list_view);
            convertview.setTag(viewHolder);


        } else {
             viewHolder = (ViewHolder) convertview.getTag();
        }

        viewHolder.tv.setText(list.get(position));
        viewHolder.lp = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        if (position % 2 == 0){
            //message from u
            viewHolder.rl_odd.setVisibility(View.INVISIBLE);
            viewHolder.rl_even.setVisibility(View.VISIBLE);
            viewHolder.tv.setBackgroundResource(R.drawable.bt_bg);//md check this again
            viewHolder.lp.setMargins(0,0,UtilDensity.dip2px(context,70),0);
            viewHolder.lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            viewHolder.tv.setLayoutParams(viewHolder.lp);

        } else{
            //msg from your friends
            viewHolder.rl_odd.setVisibility(View.VISIBLE);
            viewHolder.rl_even.setVisibility(View.INVISIBLE);
            viewHolder.tv.setBackgroundResource(R.drawable.bt_bg);//md check this again
            viewHolder.lp.setMargins(0,0,UtilDensity.dip2px(context,70),0);
            viewHolder.lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            viewHolder.tv.setLayoutParams(viewHolder.lp);

        }


        return convertview;
    }

    private    class ViewHolder {
        RelativeLayout rl_odd;
        RelativeLayout rl_even;
        TextView tv;
        RelativeLayout.LayoutParams lp;
        //LinearLayout.LayoutParams lp;
    }

    }

