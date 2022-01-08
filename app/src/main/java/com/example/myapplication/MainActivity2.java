package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.list);

        Intent i = getIntent();
        ArrayList<String> question = i.getStringArrayListExtra("aa");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_view, question);
        listView.setAdapter(arrayAdapter);

    }
}