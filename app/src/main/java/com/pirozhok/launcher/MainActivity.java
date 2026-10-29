package com.pirozhok.launcher;

import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView title = new TextView(this);
        title.setText("PIROZHOK LAUNCHER\n(Скоро тут будет дизайн)");
        title.setTextColor(Color.parseColor("#00FFFF"));
        title.setTextSize(24);
        title.setGravity(Gravity.CENTER);
        title.setBackgroundColor(Color.parseColor("#0A1420"));
        
        setContentView(title);
    }
}
