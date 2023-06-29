package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        t1 = (TextView) findViewById(R.id.textView2);
        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= "Empty";
            } else {
                newString= extras.getString("String");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("String");
        }
        t1.setText(newString);
    }
}