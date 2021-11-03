package com.example.grigorievinostranec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TranslateActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
    }

    public void toSettingButton(View view) {
        intent = new Intent(TranslateActivity.this, SettingActivity.class);
        startActivity(intent);
    }
}
