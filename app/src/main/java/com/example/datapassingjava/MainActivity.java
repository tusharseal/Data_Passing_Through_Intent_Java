package com.example.datapassingjava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText data1,data2,data3;
    Button passdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data1 = findViewById(R.id.data1);
        data2 = findViewById(R.id.data2);
        data3 = findViewById(R.id.data3);
        passdata = findViewById(R.id.passData);

        passdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Data1 = data1.getText().toString();
                String Data2 = data2.getText().toString();
                String Data3 = data3.getText().toString();

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("Data1",Data1);
                i.putExtra("Data2",Data2);
                i.putExtra("Data3",Data3);
                startActivity(i);
                finish();

            }
        });
    }
}