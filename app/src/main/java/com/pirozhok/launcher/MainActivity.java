package com.pirozhok.launcher;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#0A1420"));

        TextView title = new TextView(this);
        title.setText("PIROZHOK LAUNCHER");
        title.setTextColor(Color.parseColor("#00FFFF"));
        title.setTextSize(28);
        title.setTypeface(null, Typeface.BOLD);
        layout.addView(title);

        Button playBtn = new Button(this);
        playBtn.setText("ИГРАТЬ");
        playBtn.setTextSize(20);
        playBtn.setBackgroundColor(Color.parseColor("#00FFFF"));
        playBtn.setTextColor(Color.BLACK);
        
        playBtn.setOnClickListener(v -> { /* Пока ничего не делаем */ });

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(600, 150);
        params.setMargins(0, 80, 0, 0);
        layout.addView(playBtn, params);

        setContentView(layout);
    }
}
