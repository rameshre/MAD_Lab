package com.example.pgm5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void welcome(View v)
    {
        setContentView(R.layout.activity_welcome);
    }
    public void registration(View v)
    {
        setContentView(R.layout.activity_registration);
    }
}