package com.example.empty5;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b1);

    public void submit(View view){
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
            String str = "Name     :         "+ t1.getText().toString();
            i.putExtra("Value1", str);
            String str1 ="password :         "+ t2.getText().toString();
            i.putExtra("Value2", str1);

            startActivity(i);
        }
    }}