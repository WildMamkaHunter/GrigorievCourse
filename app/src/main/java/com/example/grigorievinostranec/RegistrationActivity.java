package com.example.grigorievinostranec;

import android.content.ContentUris;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationActivity extends AppCompatActivity {
    Intent intent;
    private EditText edLogin, edPassword;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();
    }
    private void init()
    {
        edLogin = findViewById(R.id.editTextTextPersonName2);
        edPassword = findViewById(R.id.editTextTextPassword2);
        mAuth = FirebaseAuth.getInstance();
    }
    public void regToTranslateButton(View view) {
        if(!TextUtils.isEmpty(edLogin.getText().toString()) && !TextUtils.isEmpty(edPassword.getText().toString())) {
            mAuth.createUserWithEmailAndPassword( edLogin.getText().toString(), edPassword.getText().toString()).
                    addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                Toast.makeText(getApplicationContext(), "User SignUp Successful", Toast.LENGTH_SHORT).show();
                                intent = new Intent(RegistrationActivity.this, TranslateActivity.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(), "User SignUp Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
        else {
            Toast.makeText(getApplicationContext(), "Please enter Email and Password", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser cUser = mAuth.getCurrentUser();
        if(cUser!= null)
        {
            Toast.makeText(this,"User not null",Toast.LENGTH_LONG);
        }
        else
        {
            Toast.makeText(this,"User null",Toast.LENGTH_LONG);
        }
    }


    public void backRegButton(View view) {
        intent = new Intent(RegistrationActivity.this, AuthorizationActivity.class);
        startActivity(intent);
    }



}
