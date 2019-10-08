package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheirQualitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_qualities);
    }
    public void finalActivity(View v)
    {
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }
}
