package com.example.bookup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class register extends AppCompatActivity {
    TextView textlog;
    EditText editName, createpass, confirmpass, email, phone;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        textlog = findViewById(R.id.gtlgn);
        textlog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this, login.class);
                startActivity(intent);
                finish();
            }
        });
        signup = (Button) findViewById(R.id.regbtn);
        editName = findViewById(R.id.nama);
        createpass = findViewById(R.id.pass);
        confirmpass = findViewById(R.id.confirm);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.nomor);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String pass = createpass.getText().toString();
                String confirm = confirmpass.getText().toString();
                String makeemail = email.getText().toString();
                String numb = phone.getText().toString();
                boolean bool = false;
                if (bool == false) {
                    if (editName.getText().length() < 5 || editName.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Name must be more than 5 letter", Toast.LENGTH_SHORT).show();
                    }
                    if (createpass.getText().length() < 7 || createpass.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Password must be more than 7 characters", Toast.LENGTH_SHORT).show();
                    }
                    if (!confirmpass.equals(createpass)) {
                        Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_SHORT).show();
                    }
                    if (makeemail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(makeemail).matches()) {
                        Toast.makeText(getApplicationContext(), "Email is invalid", Toast.LENGTH_SHORT).show();
                    }
                    if (numb.isEmpty() || !Patterns.PHONE.matcher(numb).matches()) {
                        Toast.makeText(getApplicationContext(), "Phone number is invalid", Toast.LENGTH_SHORT).show();
                    }
                    bool = true;
                }
                else {
                    Toast.makeText(getApplicationContext(), "Successfully created account", Toast.LENGTH_SHORT).show();
                }
                openlogin();
            }

        });

        }
        public void openlogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
        }
    }
