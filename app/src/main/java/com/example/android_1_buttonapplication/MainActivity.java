package com.example.android_1_buttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //loing處裡
        final Button loginout = (Button) findViewById(R.id.button_loginout);
        loginout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                loginout.setText("logout");
                Toast.makeText(getBaseContext(), "logout", Toast.LENGTH_SHORT).show();
            }
        });
    }
}