package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class YourQualitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_qualities);
    }
    public void yourQualitiesSlider(View v)
    {
        Intent intent = new Intent(this, YourQualitiesSliderActivity.class);
        startActivity(intent);
    }
}
