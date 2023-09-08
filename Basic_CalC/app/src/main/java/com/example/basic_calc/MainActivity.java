package com.example.basic_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView t1;
    Double s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.first_num);
        e2=findViewById(R.id.second_num);
        t1=findViewById(R.id.result);
        b1=findViewById(R.id.add_button);
        b2=findViewById(R.id.minus_button);
        b3=findViewById(R.id.multiply_button);
        b4=findViewById(R.id.div_button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=Double.parseDouble(e1.getText().toString());
                s2=Double.parseDouble(e2.getText().toString());
                s3=s1+s2;
                t1.setText(s3.toString());

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(e1.getText().toString());
                s2=Double.parseDouble(e2.getText().toString());
                s3=s1-s2;
                t1.setText(s3.toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(e1.getText().toString());
                s2=Double.parseDouble(e2.getText().toString());
                s3=s1*s2;
                t1.setText(s3.toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=Double.parseDouble(e1.getText().toString());
                s2=Double.parseDouble(e2.getText().toString());
                s3=s1/s2;
                t1.setText(s3.toString());
            }
        });
    }
}