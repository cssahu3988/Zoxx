package com.example.rityan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;

public class DataBindingAdapter {
    @BindingAdapter("animation")
    public static void animation(View view,boolean b){
        if (b){
            view.setAlpha(0.2f);
            view.setScaleX(0.2f);
            view.setScaleY(0.2f);
            view.setVisibility(View.VISIBLE);
            view.animate()
                    .alpha(1f)
                    .scaleX(1f)
                    .scaleY(1f)
                    .setInterpolator(new AccelerateDecelerateInterpolator())
                    .setDuration(100)
                    .setListener(null);
        }
        else{
            view.animate()
                    .alpha(0.1f)
                    .scaleX(0.2f)
                    .scaleY(0.2f)
                    .setDuration(100)
                    .setInterpolator(new AccelerateDecelerateInterpolator())
                    .setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    view.setVisibility(View.INVISIBLE);
                }
            });
        }
    }

    @BindingAdapter("animation1")
    public static void animation1(View view, int i){
        switch (i){
            case 1:
                Animation animation = AnimationUtils.loadAnimation(view.getContext(),R.anim.anim);
                ((ImageView)view).startAnimation(animation);
                break;
            case 2:

                break;
        }

    }
}
