package com.example.empty4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_option,menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id=item.getItemId();
        if (id==R.id.settings){
            Intent SI=new Intent(MainActivity.this,settings.class);
            startActivity(SI);
        }
        if (id==R.id.contact){
            Intent CI=new Intent(MainActivity.this,contact.class);
            startActivity(CI);
        }
        if (id==R.id.home){
            Intent HI=new Intent(MainActivity.this,home.class);
            startActivity(HI);
        }
        return super.onOptionsItemSelected(item);
    }
}