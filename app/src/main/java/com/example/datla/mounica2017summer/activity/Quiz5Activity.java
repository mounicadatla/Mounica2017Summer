package com.example.datla.mounica2017summer.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

import com.example.datla.mounica2017summer.BaseActivity;
import com.example.datla.mounica2017summer.R;
import com.example.datla.mounica2017summer.fragment.UtilLog;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.animation.ValueAnimator.REVERSE;

public class Quiz5Activity  extends BaseActivity implements  View.OnTouchListener{
    private GestureDetector gestureDetector1;
    private int location=0;
    private int sumX=0;
    private int sumY=0;
    private ValueAnimator repeatAnimator;

    @BindView(R.id.activity_quiz5_gesture_tv)
    TextView tv;

    public void trans(){
        ObjectAnimator animatorx = ObjectAnimator.ofFloat(tv, "translationY", 0, 200, -200,0,100); //translationY
        ObjectAnimator animatory = ObjectAnimator.ofFloat(tv, "translationY", 0, 200, -200,0,100); //translationY

        animatorx.setDuration(2000);
        animatorx.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        ButterKnife.bind(this);
        gestureDetector1 = new GestureDetector(this, new Quiz5Activity.simpleGestureListener());
//        gestureDetector= new GestureDetector(this, new GestureActivity.simpl)
        tv.setOnTouchListener(this);
        tv.setFocusable(true);
        tv.setClickable(true);
        tv.setLongClickable(true);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shortToast("Click");
            }
        });

    }

    private ValueAnimator doAnimatorListener(){
//        ValueAnimator animatorx = ValueAnimator.ofInt(0,400);
        ValueAnimator animatorx = ValueAnimator.ofInt(0,400);
//        ValueAnimator animatorx1=  ValueAnimator.ofFloat(tv, "translationY", 0, 200, -200,0,100); //translationY

        animatorx.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int curValue = (int)animation.getAnimatedValue();
//                tv.layout(tv.getLeft(),curValue,tv.getRight(),curValue+tv.getHeight());
                tv.layout(tv.getLeft(),curValue,tv.getRight(),curValue+tv.getHeight());

            }
        });
        animatorx.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                com.example.datla.mounica2017summer.util.UtilLog.logD("mdatlaanim","animation start");
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                com.example.datla.mounica2017summer.util.UtilLog.logD("mdatlaanim","animation end");
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                com.example.datla.mounica2017summer.util.UtilLog.logD("mdatlaanim","animation cancel");
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                com.example.datla.mounica2017summer.util.UtilLog.logD("mdatlaanim","animation repeat");

            }
        });
        animatorx.setRepeatMode(REVERSE);
        animatorx.setRepeatCount(2);
        animatorx.setInterpolator(new BounceInterpolator());
        animatorx.setDuration(2000);
        return animatorx;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        return gestureDetector1.onTouchEvent(event);
//        return false;
    }
    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapUp");
            return false;
//            return super.onSingleTapUp(e);//
        }

        @Override
        public void onLongPress(MotionEvent e) {
            UtilLog.d("Gesture","onLongPress");

            super.onLongPress(e);
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            UtilLog.d("Gesture","onScroll");

//            UtilLog.d("Gesture","distanceX"+distanceX);
//            UtilLog.d("Gesture","distanceY"+distanceY);
            sumX+=distanceX;
            sumY+=distanceY;

            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            UtilLog.d("Gesture","onFling");
            if (sumX<0){
                if(Math.abs(sumX)>200){
                    shortToast("You scrolled from left to right");
                    tv.setText("Bingo");
                    tv.setBackgroundColor(Color.parseColor("#87ceeb"));
                }
            }
            if (sumX>200){
                shortToast("You scrolled from right to left");
                com.example.datla.mounica2017summer.util.UtilLog.logD("mdatlaanim","right to left");

//                ObjectAnimator animator = ObjectAnimator.ofFloat(tv,"rotationY",0,180,0);//rotationX   rotationY
  //              animator.setDuration(2000);
    //            animator.setInterpolator(new AccelerateInterpolator());
                repeatAnimator = doAnimatorListener();
//        repeatAnimator.setStartDelay(3000);
                repeatAnimator.start();

//                tv.setText("");
                tv.setBackgroundColor(Color.parseColor("#3F51B5"));//Change color to gray color or default color

            }

            if (sumY<0){
                if(Math.abs(sumY)>200){
                    shortToast("You scrolled from Top to bottom");

                }
            }
            if (sumY>200){
                shortToast("You scrolled from bottom to top");
            }

            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onShowPress(MotionEvent e) {
            UtilLog.d("Gesture","onShowPress");

            super.onShowPress(e);
        }

        @Override
        public boolean onDown(MotionEvent e) {
            UtilLog.d("Gesture","onDown");

            return super.onDown(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            UtilLog.d("Gesture","onDoubleTap");

            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            UtilLog.d("Gesture","onDoubleTapEvent");

            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            UtilLog.d("Gesture","onSingleTapConfirmed");

            return super.onSingleTapConfirmed(e);
        }

    }

}
