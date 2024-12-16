package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frameAnimationButton = findViewById(R.id.frame_animation_button);
        Button tweenAnimationButton = findViewById(R.id.tween_animation_button);

        frameAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation fadein = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
                v.startAnimation(fadein);

                new android.os.Handler().postDelayed(
                        () -> {
                            Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
                            startActivity(intent);
                        }, 1000);
            }
        });

        tweenAnimationButton.setOnClickListener(v -> {
            Animation zoomIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
            v.startAnimation(zoomIn);

            new android.os.Handler().postDelayed(
                    () -> {
                        Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
                        startActivity(intent);
                    }, 1000);
        });
    }
}
