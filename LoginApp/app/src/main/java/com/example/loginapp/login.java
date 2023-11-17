package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText user_name,pswd;
    Button b1,b2;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_name=findViewById(R.id.username1);
        pswd=findViewById(R.id.pass1);
        b1=findViewById(R.id.signup1);
        b2=findViewById(R.id.login1);
        DB=new DBHelper(this);




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=user_name.getText().toString();
                String pass=pswd.getText().toString();

                if((user.equals("")||  pass.equals("")))
                    Toast.makeText(login.this,"Enter Username and password",Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkUserpass = DB.checkUser_pass(user,pass);
                    if(checkUserpass==true) {
                        Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                        startActivity(intent);
                    }
                    else
                        Toast.makeText(login.this,"Invalid username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}