package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       /* //while
                int x = 1, sum = 0;
                while (x <= 10)
                { sum = sum + x;
                x++;
                }
        Log.d("three", "one success");*/

 /*       //for-loop
        int sum = 0;
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }*/

     //dowhile loop
        int i = 1;
        do {
            Log.d("two", "one success");
            i++;
        }
        while (i < 6);



    }
}