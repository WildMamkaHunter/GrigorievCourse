package com.example.grigorievinostranec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView10);
        img3 = findViewById(R.id.imageView11);
        img4 = findViewById(R.id.imageView12);
        img5 = findViewById(R.id.imageView13);
        img6 = findViewById(R.id.imageView14);
        img7 = findViewById(R.id.imageView15);
        img8 = findViewById(R.id.imageView16);
        img9 = findViewById(R.id.imageView17);


        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim);
        img1.startAnimation(animation);
        img2.startAnimation(animation);
        img3.startAnimation(animation);
        img4.startAnimation(animation);
        img5.startAnimation(animation);
        img6.startAnimation(animation);
        img7.startAnimation(animation);
        img8.startAnimation(animation);
        img9.startAnimation(animation);

        Thread thread = new Thread(){

            public void run() {
                try {

                    TimeUnit.SECONDS.sleep(2);
                    Intent intent = new Intent(MainActivity.this, AuthorizationActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }
}