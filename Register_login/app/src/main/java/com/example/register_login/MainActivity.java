package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText user_name,emailid,pswd,c_pswd;
    MaterialButton signup,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findID();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usr=user_name.getText().toString();
                Toast.makeText(MainActivity.this,"username is"+usr,Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void findID()
    {
        user_name=findViewById(R.id.username);
        emailid=findViewById(R.id.email);
        pswd=findViewById(R.id.pass);
        c_pswd=findViewById(R.id.c_pass);
        signup=findViewById(R.id.signupBtn);
        login=findViewById(R.id.loginBtn);
    }
}