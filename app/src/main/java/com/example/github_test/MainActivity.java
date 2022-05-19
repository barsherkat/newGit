package com.example.github_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a();
        Log.e("TAG",String.valueOf( a()));

    }

    public int a()
    {
        int c=3+7;
        c=c-6;
        return c;
    }



}
