package com.example.cubicdynamo;

import static kotlinx.coroutines.DelayKt.delay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends AppCompatActivity {

    Button gotoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        gotoButton = findViewById(R.id.gotoButton);

        gotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LauncherActivity.this, MainActivity.class);
                startActivity(i);

            }
        });

    }

}