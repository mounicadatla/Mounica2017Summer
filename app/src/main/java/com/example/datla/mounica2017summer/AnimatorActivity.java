package com.example.datla.mounica2017summer;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class AnimatorActivity extends BaseActivity{
    private ValueAnimator repeatAnimator;

    @onClick(R.id.animator)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
    }
    @BindView(R.id.activity_animation_tv)
    TextView tv;
    @ Override
    public void onAnimationUpdate(ValueAnimator){


    }



    public void scale(){

    }

    public void alpha(){
        ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"alpha", 1,0,1);
        animator.setDuration(2000);
        animator.start();
    }
    @OnClick(R.id.animator_rotation)
    public void rotation(){
        ObjectAnimator animator
    }
}


