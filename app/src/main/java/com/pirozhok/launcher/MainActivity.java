package com.pirozhok.launcher;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем каркас
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#0A1420"));
        layout.setPadding(50, 50, 50, 50);

        // Заголовок
        TextView title = new TextView(this);
        title.setText("PIROZHOK LAUNCHER");
        title.setTextColor(Color.parseColor("#00FFFF"));
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        // Кнопка "Играть"
        Button playBtn = new Button(this);
        playBtn.setText("ИГРАТЬ");
        playBtn.setTextSize(22);
        playBtn.setBackgroundColor(Color.parseColor("#00FFFF"));
        playBtn.setTextColor(Color.BLACK);
        
        // === ТУТ МЫ ЗАПУСКАЕМ ИГРУ НАПРЯМУЮ ===
        playBtn.setOnClickListener(v -> {
            try {
                // Пытаемся найти MJLauncher
                Intent intent = getPackageManager().getLaunchIntentForPackage("git.artdeell.mjlaunch");
                if (intent != null) {
                    // Если нашли — отправляем команду на быстрый запуск
                    intent.putExtra("launch_version", "1.21.4");
                    intent.putExtra("launch_username", "LuntikRW_228");
                    startActivity(intent);
                } else {
                    // Если не нашли — пробуем PojavLauncher
                    intent = getPackageManager().getLaunchIntentForPackage("net.kdt.pojavlaunch");
                    if (intent != null) {
                        startActivity(intent);
                    } else {
                        title.setText("Лаунчер не найден!");
                    }
                }
            } catch (Exception e) {
                title.setText("Ошибка: " + e.getMessage());
            }
        });

        layout.addView(playBtn, new LinearLayout.LayoutParams(700, 200));

        setContentView(layout);
    }
}
