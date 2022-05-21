package com.example.onetofifty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
        Button button_start = (Button) findViewById(R.id.button_start);
        Button button_success = (Button) findViewById(R.id.button_success);

        button_start.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                chronometer.start();
            }
        });

        button_success.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SuccessActivity.class);
                long current = SystemClock.elapsedRealtime() - chronometer.getBase();
                intent.putExtra("time", String.valueOf(current/1000));
                startActivity(intent);
                finish();
            }
        });
    }
}