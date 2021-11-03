package com.example.grigorievinostranec;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

    }

    public void logoutButton(View view) {
        intent = new Intent(SettingActivity.this, AuthorizationActivity.class);
        startActivity(intent);
    }

    public void editPasswordButton(View view) {
        intent = new Intent(SettingActivity.this, TranslateActivity.class);
        startActivity(intent);
    }

    public void backSettingButton(View view) {
        intent = new Intent(SettingActivity.this, TranslateActivity.class);
        startActivity(intent);
    }
}
