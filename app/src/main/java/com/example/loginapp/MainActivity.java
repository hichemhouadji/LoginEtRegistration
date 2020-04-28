package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;//declaration instance
    TextView forget_txt;
    Button login_btn;
    TextView registre_txt;

    String usernamecorrect="inptic";
            String paswordcorrect="csi";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.username_id);//casting
        password=(EditText)findViewById(R.id.password_id);
        forget_txt=(TextView) findViewById(R.id.forget_id);
        login_btn=(Button) findViewById(R.id.login_id);
        registre_txt=(TextView) findViewById(R.id.regitre_id);


        registre_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registre_intent=new Intent(MainActivity.this,RegistrationActivity.class);
                startActivity(registre_intent);

            }
        });


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            String username_entred=username.getText().toString();
            String password_entred=password.getText().toString();


            if (username_entred.equalsIgnoreCase(usernamecorrect) && password_entred.equalsIgnoreCase(paswordcorrect)){

                Intent login_intent=new Intent(MainActivity.this,loginSuccesfull.class);
                startActivity(login_intent);

                Toast.makeText(MainActivity.this,"login with succesfull",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(MainActivity.this,"error! write the correct username or password",Toast.LENGTH_SHORT).show();
            }





            }
        });











        forget_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forget_intent=new Intent(MainActivity.this,Resetyourpassword.class);
                startActivity(forget_intent);
            }
        });

    }



}
