package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user_name,emailid,pswd,c_pswd;
    Button b1,b2;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name=findViewById(R.id.username);
        emailid=findViewById(R.id.email);
        pswd=findViewById(R.id.pass);
        c_pswd=findViewById(R.id.c_pass);
        b1=findViewById(R.id.signup);
        b2=findViewById(R.id.login);
        DB=new DBHelper(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String user=user_name.getText().toString();
            String email=emailid.getText().toString();
            String pass=pswd.getText().toString();
            String c_pass=c_pswd.getText().toString();

            if((user.equals("")|| email.equals("")|| pass.equals("")||c_pass.equals("")))
                Toast.makeText(MainActivity.this,"Enter all fields",Toast.LENGTH_SHORT).show();
            else {
                if(pass.equals(c_pass)){
                    Boolean checkUser=DB.checkUser(user);
                    if(checkUser==false)
                    { Boolean insert=DB.insertData(user,email,pass);
                        if(insert==true){
                       // Toast.makeText(MainActivity.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(), login.class);
                            startActivity(intent);
                    }
                        else
                            Toast.makeText(MainActivity.this,"Registration failed",Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(MainActivity.this,"Username already exist",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"Password not matching, re-enter your password",Toast.LENGTH_SHORT).show();
            }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), login.class);
                startActivity(intent);


                }

        });

    }
}