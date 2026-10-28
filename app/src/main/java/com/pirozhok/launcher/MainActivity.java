package com.pirozhok.launcher;

import android.os.Bundle;
import android.content.Intent;
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
        
        // Создаем программно интерфейс
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#0A1420")); // Темно-синий фон

        // Заголовок
        TextView title = new TextView(this);
        title.setText("PIROZHOK LAUNCHER");
        title.setTextColor(Color.parseColor("#00FFFF")); // Бирюзовый цвет
        title.setTextSize(28);
        title.setTypeface(null, Typeface.BOLD);
        layout.addView(title);

        // Кнопка "Играть"
        Button playBtn = new Button(this);
        playBtn.setText("ИГРАТЬ");
        playBtn.setTextSize(20);
        playBtn.setBackgroundColor(Color.parseColor("#00FFFF"));
        playBtn.setTextColor(Color.BLACK);
        
        // При нажатии открывает PojavLauncher
        playBtn.setOnClickListener(v -> {
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("net.kdt.pojavlaunch");
            if (launchIntent != null) {
                startActivity(launchIntent);
            }
        });

        // Отступы и добавление кнопки
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(600, 150);
        params.setMargins(0, 80, 0, 0);
        layout.addView(playBtn, params);

        setContentView(layout);
    }
}
