package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheirFeaturesActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_features_activities);
    }
    public void theirQualities(View v)
    {
        Intent intent = new Intent(this, TheirQualitiesActivity.class);
        startActivity(intent);
    }
}
