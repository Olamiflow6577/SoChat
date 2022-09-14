package com.example.sochat;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    Button gotoSignIn, btnSignUp, signupFacebook,signupGoogle;
    EditText editUsername, editEmail, editPassword, editConfirmPassword;
    TextView signupTitle, textView;
    ImageView chattingAnimation;

    private boolean isSignUp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initViews();

        gotoSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSignUp){
                    isSignUp = false;
                    btnSignUp.setText("Sign In");
                    signupTitle.setText("Sign In");
                    textView.setText("Don't have an account yet?");
                    editUsername.setVisibility(View.GONE);
                    editConfirmPassword.setVisibility(View.GONE);
                }else {
                    isSignUp = true;
                    btnSignUp.setText("Sign Up");
                    signupTitle.setText("Sign Up");
                    textView.setText(("Already have an account?"));
                    editUsername.setVisibility(View.VISIBLE);
                    editConfirmPassword.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void initViews(){
        Log.d(TAG, "initViews = Started");

        gotoSignIn = findViewById(R.id.btnGotoSign);
        btnSignUp = findViewById(R.id.btnSignUp);
        editUsername = findViewById(R.id.editUsername);
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        editConfirmPassword = findViewById(R.id.editConfirmPassword);
        signupFacebook = findViewById(R.id.signupFacebook);
        signupGoogle = findViewById(R.id.signupGoogle);
        signupTitle = findViewById(R.id.signupTitle);
        textView = findViewById(R.id.textView);
    }

}