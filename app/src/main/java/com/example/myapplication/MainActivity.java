package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView and set your name
        TextView textView = findViewById(R.id.textView);
        textView.setText("Fadi Bayan");
        TextView textView2 = findViewById(R.id.textView3);
        textView2.setText("Georgio Bou Sleiman");
    }
}
