package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class FrameAnimationActivity extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView imageView = findViewById(R.id.frame_animation_image);

        AnimationDrawable animationDrawable = new AnimationDrawable();

        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim_1), 1000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim2), 1000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim3), 1000);

        animationDrawable.setOneShot(false);
        imageView.setBackground(animationDrawable);
        animationDrawable.start();
    }
}
