package com.example.datla.mounica2017summer.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.datla.mounica2017summer.BaseActivity;

import com.example.datla.mounica2017summer.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends BaseActivity {

    private Animation alphaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation transAnimation;
    private Animation setAnimation;


    @BindView(R.id.activity_animation_tv)
    TextView tv;

    @OnClick(R.id.activity_animation_alpha)
    public void alpha(){
        tv.startAnimation(alphaAnimation);

    }

    @OnClick(R.id.activity_animation_scale)
    public void scale(){
        tv.startAnimation(scaleAnimation);

    }

    @OnClick(R.id.activity_animation_rotate)
    public void rotate(){
        tv.startAnimation(rotateAnimation);

    }

    @OnClick(R.id.activity_animation_trans)
    public void trans(){
        tv.startAnimation(transAnimation);

    }

    @OnClick(R.id.activity_animation_set)
    public void set(){
        tv.startAnimation(setAnimation);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initialAnimation();
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shortToast("You clicked TextView");
            }
        });
    }

    private void initialAnimation(){
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        transAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
    }
}