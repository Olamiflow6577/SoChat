package com.example.sochat;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    Button gotoSignup, btnSignIn, signinGoogle, signinFacebook;
    EditText editEmail, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initViews();

        gotoSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    public void initViews(){
        Log.d(TAG, "initViews = Started");

        gotoSignup = findViewById(R.id.btnGotoSignUp);
        btnSignIn = findViewById(R.id.btnSignIn);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        signinFacebook = findViewById(R.id.signinFacebook);
        signinGoogle = findViewById(R.id.signinGoogle);
    }

}