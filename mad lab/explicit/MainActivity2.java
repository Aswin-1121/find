package com.example.empty5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        Intent intent=getIntent();
        String str = intent.getStringExtra("Value1");
        String str1 = intent.getStringExtra("Value2");
        // display the string into textView
        tv1.setText(str);
        tv2.setText(str1);

    }
}