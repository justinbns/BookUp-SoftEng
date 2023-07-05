package com.example.bookup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;

public class Splashart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashart);

        Timer timer = new Timer();
        TimerTask count = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashart.this,register.class);
                startActivity(intent);
                finish();

            }

        };
        timer.schedule(count, 2000);

    }
}

