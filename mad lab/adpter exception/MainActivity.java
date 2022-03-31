package com.example.empty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {


            //ListView list = findViewById(R.id.l1);
            String[] her = {"targareyen", "lannister", "heisenberg", "geralt of rivia", "yennefer", "ciri", "pinkman", "eleven", "raul", "dicaprio"};
            ArrayAdapter<String> adap = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, her);
            list.setAdapter(adap);
        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }
}