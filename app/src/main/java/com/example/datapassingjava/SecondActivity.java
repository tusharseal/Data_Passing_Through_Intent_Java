package com.example.datapassingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView data1, data2, data3;
    Button activity1btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Refer to textview
        data1 = findViewById(R.id.data1txtview);
        data2 = findViewById(R.id.data2txtview);
        data3 = findViewById(R.id.data3txtview);
        activity1btn = findViewById(R.id.activity1btn);

        //Get data from Activity 1
        String Data1 = "Data1: " + getIntent().getExtras().getString("Data1");
        String Data2 = "Data2: " + getIntent().getExtras().getString("Data2");
        String Data3 = "Data3: " + getIntent().getExtras().getString("Data3");

        //Set Data to Text View
        data1.setText(Data1);
        data2.setText(Data2);
        data3.setText(Data3);

        activity1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}