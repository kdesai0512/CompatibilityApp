package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class TheirFeaturesActivities extends AppCompatActivity {
    public static final String THEIR_GAMER = "false";
    public static final String THEIR_ATHLETE = "false";
    public static final String THEIR_MUSICIAN = "false";
    public static final String THEIR_INFLUENCER = "false";
    public static final String THEIR_COOK = "false";
    public static final String THEIR_WRITER = "false";
    public static final String THEIR_TRAVELER = "false";
    public static final String MY_FIRST_NAME = "firstName";
    public static final String MY_LAST_NAME = "lastName";
    public static final String MY_BIRTHDAY = "birthday";
    public static final String MY_HOROSCOPE = "horoscope";
    public static final String RICH_VALUE = "0";
    public static final String SOCIAL_VALUE = "0";
    public static final String INTEL_VALUE = "0";
    public static final String FUN_VALUE = "0";
    public static final String LOOKS_VALUE = "0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_features_activities);
    }
    public void theirQualities(View v)
    {
        EditText feet = (EditText) findViewById(R.id.editText);
        EditText inches = (EditText) findViewById(R.id.editText2);
        EditText min = (EditText) findViewById(R.id.editText3);
        EditText max = (EditText) findViewById(R.id.editText4);
        Spinner gender = (Spinner) findViewById(R.id.spinner);

        String theirFeet = feet.getText().toString();
        String theirInches = inches.getText().toString();
        String theirMin = min.getText().toString();
        String theirMax = max.getText().toString();
        String theirGender = gender.getSelectedItem().toString();

        Intent intent = new Intent(this, TheirQualitiesActivity.class);
        intent.putExtra(TheirQualitiesActivity.THEIR_FEET, theirFeet);
        intent.putExtra(TheirQualitiesActivity.THEIR_INCHES, theirInches);
        intent.putExtra(TheirQualitiesActivity.THEIR_MIN, theirMin);
        intent.putExtra(TheirQualitiesActivity.THEIR_MAX, theirMax);
        intent.putExtra(TheirQualitiesActivity.THEIR_GENDER, theirGender);


        intent.putExtra(TheirQualitiesActivity.RICH_VALUE, RICH_VALUE);
        intent.putExtra(TheirQualitiesActivity.SOCIAL_VALUE, SOCIAL_VALUE);
        intent.putExtra(TheirQualitiesActivity.INTEL_VALUE, INTEL_VALUE);
        intent.putExtra(TheirQualitiesActivity.FUN_VALUE, FUN_VALUE);
        intent.putExtra(TheirQualitiesActivity.LOOKS_VALUE, LOOKS_VALUE);

        intent.putExtra(TheirQualitiesActivity.THEIR_GAMER, THEIR_GAMER);
        intent.putExtra(TheirQualitiesActivity.THEIR_TRAVELER, THEIR_TRAVELER);
        intent.putExtra(TheirQualitiesActivity.THEIR_MUSICIAN, THEIR_MUSICIAN);
        intent.putExtra(TheirQualitiesActivity.THEIR_COOK, THEIR_COOK);
        intent.putExtra(TheirQualitiesActivity.THEIR_WRITER, THEIR_WRITER);
        intent.putExtra(TheirQualitiesActivity.THEIR_INFLUENCER, THEIR_INFLUENCER);
        intent.putExtra(TheirQualitiesActivity.THEIR_ATHLETE, THEIR_ATHLETE);
        intent.putExtra(TheirQualitiesActivity.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(TheirQualitiesActivity.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(TheirQualitiesActivity.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(TheirQualitiesActivity.MY_HOROSCOPE, MY_HOROSCOPE);
        startActivity(intent);
    }
}
