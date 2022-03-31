package com.example.ex_implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view)
    {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://tkmce.etlab.in/user/login"));
        startActivity(i);
    }
}