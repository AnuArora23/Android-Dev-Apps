package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button add_button;
 TextView t1,t2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_button = findViewById(R.id.button1);
        t1= findViewById(R.id.hello);
        t2 = findViewById(R.id.welcome);
        res= findViewById(R.id.result);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fisrtnum= t1.getText().toString();
                String  secnum= t2.getText().toString();
                String sum= fisrtnum+secnum;
                res.setText(sum);
            }
        });
    }
}