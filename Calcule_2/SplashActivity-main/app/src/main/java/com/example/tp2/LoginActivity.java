package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;
    Button loginButton;

    String test = "admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UN = username.getText().toString();
                String PASS = password.getText().toString();

                Toast.makeText(LoginActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
                Intent mainIntent = new Intent(LoginActivity.this,MainActivity.class);
                mainIntent.putExtra("username",UN);
                mainIntent.putExtra("password",PASS);
                startActivity(mainIntent);



                /*if (username.getText().toString().equals(test) && password.getText().toString().equals(test)) {
                    Toast.makeText(LoginActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }else {
                    Toast.makeText(LoginActivity.this, "Check the username or password", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }
}