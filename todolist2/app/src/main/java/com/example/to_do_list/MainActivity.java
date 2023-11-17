package com.example.to_do_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
//import android.widget.TaskAdapter;
public class MainActivity extends AppCompatActivity {
    EditText editTextTask;
    Button buttonAdd;
    List<String> taskList;
    TaskAdapter taskAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextTask = findViewById(R.id.editTextTask);
        buttonAdd = findViewById(R.id.buttonAdd);


        taskList = new ArrayList<>();
        taskAdapter = new TaskAdapter(taskList);


    }
    private void addTask() {
        String task = editTextTask.getText().toString().trim();
        if (!task.isEmpty()) {
            taskList.add(task);
            taskAdapter.notifyDataSetChanged();
            editTextTask.setText("");
        }
    }
}