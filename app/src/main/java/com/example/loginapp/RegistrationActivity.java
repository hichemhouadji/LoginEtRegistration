package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
    EditText username,password;
    Button registre_btn;
    TextView haveaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        username=(EditText)findViewById(R.id.username_id);//casting
        password=(EditText)findViewById(R.id.password_id);
        haveaccount=(TextView) findViewById(R.id.have_id);
        registre_btn=(Button) findViewById(R.id.registre_btn);


        registre_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registre_intent=new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(registre_intent);
            }
        });


        haveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registre_intent=new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(registre_intent);
            }
        });


    }

}
