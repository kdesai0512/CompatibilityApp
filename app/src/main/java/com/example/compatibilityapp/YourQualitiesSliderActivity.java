package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class YourQualitiesSliderActivity extends AppCompatActivity {

    public static final boolean THEIR_GAMER = false;
    public static final boolean THEIR_ATHLETE = false;
    public static final boolean THEIR_MUSICIAN = false;
    public static final boolean THEIR_INFLUENCER = false;
    public static final boolean THEIR_COOK = false;
    public static final boolean THEIR_WRITER = false;
    public static final boolean THEIR_TRAVELER = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_qualities_slider);
    }

    public void theirFeatures(View v)
    {
        Intent intent = new Intent(this, TheirFeaturesActivities.class);
        startActivity(intent);
    }
}
