package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity //implements View.onClickListener{
    {
    TextView result_tv, input_tv;
    MaterialButton buttonc, buttondivide,buttonmultiply,buttonmodulus,buttonminus,buttonadd,buttonac,buttonequal;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttondecimal;


    @SuppressLint("WrongViewCast")
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



    }
    /*
add_button.setOnClickListener(new View.OnClickListener()

        {
            //@Override
            public void onClick(View view){
            MaterialButton button = (MaterialButton) view;
            String buttonText = button.getText().toString();
            input_tv.setText(buttonText);

        }
        })*/
}