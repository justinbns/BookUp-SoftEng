package com.example.bookup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageButton;

import android.os.Bundle;

import org.w3c.dom.Text;
public class login extends AppCompatActivity {
    TextView textlog;
    ImageButton imgbutton;

    Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textlog = findViewById(R.id.gtrgst);
        textlog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
                finish();
            }
        });
        imgbutton = findViewById(R.id.gotoreg);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
                finish();
            }
        });
        loginbutton = findViewById(R.id.logbtn);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, homepage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

