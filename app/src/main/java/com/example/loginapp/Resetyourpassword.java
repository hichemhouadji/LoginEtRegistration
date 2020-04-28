package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Resetyourpassword extends AppCompatActivity {
EditText password,confirm_pwd;
Button change_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetyourpassword);

        password=(EditText)findViewById(R.id.password_id);//casting
        confirm_pwd=(EditText)findViewById(R.id.confirm_password_id);
        change_btn=(Button) findViewById(R.id.change_id);

        change_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registre_intent=new Intent(Resetyourpassword.this,MainActivity.class);
                startActivity(registre_intent);
            }
        });

    }
}
