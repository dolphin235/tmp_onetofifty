package com.example.onetofifty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
        Button button_start = (Button) findViewById(R.id.button_start);
        Button button_stop = (Button) findViewById(R.id.button_stop);
        TextView text_target = (TextView) findViewById(R.id.textView);

        Button button_1 = (Button) findViewById(R.id.button1);
        Button button_2 = (Button) findViewById(R.id.button2);
        Button button_3 = (Button) findViewById(R.id.button3);
        Button button_4 = (Button) findViewById(R.id.button4);
        Button button_5 = (Button) findViewById(R.id.button5);
        Button button_6 = (Button) findViewById(R.id.button6);
        Button button_7 = (Button) findViewById(R.id.button7);
        Button button_8 = (Button) findViewById(R.id.button8);
        Button button_9 = (Button) findViewById(R.id.button9);
        Button button_10 = (Button) findViewById(R.id.button10);

        Button button_11 = (Button) findViewById(R.id.button11);
        Button button_12 = (Button) findViewById(R.id.button12);
        Button button_13 = (Button) findViewById(R.id.button13);
        Button button_14 = (Button) findViewById(R.id.button14);
        Button button_15 = (Button) findViewById(R.id.button15);
        Button button_16 = (Button) findViewById(R.id.button16);
        Button button_17 = (Button) findViewById(R.id.button17);
        Button button_18 = (Button) findViewById(R.id.button18);
        Button button_19 = (Button) findViewById(R.id.button19);
        Button button_20 = (Button) findViewById(R.id.button20);

        Button button_21 = (Button) findViewById(R.id.button21);
        Button button_22 = (Button) findViewById(R.id.button22);
        Button button_23 = (Button) findViewById(R.id.button23);
        Button button_24 = (Button) findViewById(R.id.button24);
        Button button_0 = (Button) findViewById(R.id.button0);

        button_start.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                chronometer.start();
                Integer[] array = {1,2,3,4,5,6,7,8,9,10,
                        11,12,13,14,15,16,17,18,19,20,
                        21,22,23,24,25};
                List<Integer> list = Arrays.asList(array);
                Collections.shuffle(list);
                list.toArray(array);

                button_0.setText(array[0].toString());
                button_1.setText(array[1].toString());
                button_2.setText(array[2].toString());
                button_3.setText(array[3].toString());
                button_4.setText(array[4].toString());
                button_5.setText(array[5].toString());
                button_6.setText(array[6].toString());
                button_7.setText(array[7].toString());
                button_8.setText(array[8].toString());
                button_9.setText(array[9].toString());

                button_10.setText(array[10].toString());
                button_11.setText(array[11].toString());
                button_12.setText(array[12].toString());
                button_13.setText(array[13].toString());
                button_14.setText(array[14].toString());
                button_15.setText(array[15].toString());
                button_16.setText(array[16].toString());
                button_17.setText(array[17].toString());
                button_18.setText(array[18].toString());
                button_19.setText(array[19].toString());

                button_20.setText(array[20].toString());
                button_21.setText(array[21].toString());
                button_22.setText(array[22].toString());
                button_23.setText(array[23].toString());
                button_24.setText(array[24].toString());

            }
        });

        button_stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                chronometer.setBase(SystemClock.elapsedRealtime());

                button_1.setText("");
                button_2.setText("");
                button_3.setText("");
                button_4.setText("");
                button_5.setText("");
                button_6.setText("");
                button_7.setText("");
                button_8.setText("");
                button_9.setText("");
                button_10.setText("");

                button_11.setText("");
                button_12.setText("");
                button_13.setText("");
                button_14.setText("");
                button_15.setText("");
                button_16.setText("");
                button_17.setText("");
                button_18.setText("");
                button_19.setText("");
                button_20.setText("");

                button_21.setText("");
                button_22.setText("");
                button_23.setText("");
                button_24.setText("");
                button_0.setText("");
            }
        });
    }
}