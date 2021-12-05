package com.example.taxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_sign_in);
        TextView textView_createAcc = findViewById(R.id.textCreateNewAccount);
        textView_createAcc.setOnClickListener(this);
        Button button_signIN =findViewById(R.id.button_sigIn);
        button_signIN.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_sigIn:
                openMaps();
                break;
            case R.id.textCreateNewAccount:
                openSignup();
                break;
        }
    }

    private void openMaps() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    private void openSignup() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}