package com.example.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int result;
    int counter=0;
    TextView t1;
    static int getRandomNumber(int max, int min)
    {
        return (int)((Math.random()
                * (max - min)) + min);
    }

    public void makeToast(String str)
    {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT)
                .show();
    }
    public void clickFunction(View view)
    {
        int userGuessing;
        EditText variable = (EditText)findViewById(R.id.editId);
        userGuessing
                = Integer.parseInt(variable.getText().toString());
        if (userGuessing < result) {

            makeToast("Wrong guess, Think of bit Higher Number, Try Again");
            counter++;
        }
        else if (userGuessing > result) {
            makeToast("Wrong guess, Think of bit Lower Number, Try Again");
            counter++;
        }
        else {
            makeToast("That's great, Congratulations," +" You Guessed the right Number");

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //t1=findViewById(R.id.cntr).toString();
        int min = 1;
        int max = 100;
        result = getRandomNumber(min, max);
    }
}