package com.example.github_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String s= String.valueOf(a());
        Log.e("TAG",s);
         x();
        sum();
        //example
    }


    public int x()
    {
        int x=3;
    Log.e("TAG","new");
    return x;
    }


    public int a()
    {
        int c=3+7;
        c=c-6;
        return c;
    }

    public void sum()
    {
        int e=a()+15;

    }


}
