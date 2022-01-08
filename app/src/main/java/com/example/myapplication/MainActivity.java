package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> output = new ArrayList<String>();
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edittext);
        TextView x = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button1);
        Button button1 = findViewById(R.id.button2);

        x.setText(String.valueOf(count));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter Question", Toast.LENGTH_SHORT).show();
                } else {

                    String question = editText.getText().toString();
                    output.add(question);
                    count++;
                    x.setText(String.valueOf(count));
                    editText.getText().clear();
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putStringArrayListExtra("aa",output);
                startActivity(i);
            }
        });


    }
}