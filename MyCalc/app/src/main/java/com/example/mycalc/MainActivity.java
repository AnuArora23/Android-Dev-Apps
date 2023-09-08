package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity{
    TextView result_tv, input_tv;
    MaterialButton buttonc, buttondivide,buttonmultiply,buttonmodulus,buttonminus,buttonadd,buttonac,buttonequal;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_tv = findViewById(R.id.result_textview);
        input_tv=findViewById(R.id.input_textview);

        button0=findViewById(R.id.button_0);
        button1=findViewById(R.id.button_1);
        button2=findViewById(R.id.button_2);
        button3=findViewById(R.id.button_3);
        button4=findViewById(R.id.button_4);
        button5=findViewById(R.id.button_5);
        button6=findViewById(R.id.button_6);
        button7=findViewById(R.id.button_7);
        button8=findViewById(R.id.button_8);
        button9=findViewById(R.id.button_9);
        buttonc=findViewById(R.id.button_c);
        buttonac=findViewById(R.id.button_ac);
        buttonadd=findViewById(R.id.button_add);
        buttonmultiply=findViewById(R.id.button_multiply);
        buttondivide=findViewById(R.id.button_divide);
        buttonminus=findViewById(R.id.button_minus);
        buttondecimal=findViewById(R.id.button_decimal);
        buttonequal=findViewById(R.id.button_equal);
        buttonmodulus=findViewById(R.id.button_modulus);

       button0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               result_tv.setText("0");
           }
       });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result_tv.setText("9");
            }
        });


    }



}