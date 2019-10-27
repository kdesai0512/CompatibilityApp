package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class TheirFeaturesActivities extends AppCompatActivity {
    public static final String YOUR_GAMER = "false";
    public static final String YOUR_ATHLETE = "false";
    public static final String YOUR_MUSICIAN = "false";
    public static final String YOUR_INFLUENCER = "false";
    public static final String YOUR_COOK = "false";
    public static final String YOUR_WRITER = "false";
    public static final String YOUR_TRAVELER = "false";
    public static final String YOUR_ARTIST = "false";
    public static final String MY_FIRST_NAME = "firstName";
    public static final String MY_LAST_NAME = "lastName";
    public static final String MY_BIRTHDAY = "birthday";
    public static final String MY_HOROSCOPE = "horoscope";
    public static final String RICH_VALUE = "0";
    public static final String SOCIAL_VALUE = "0";
    public static final String INTEL_VALUE = "0";
    public static final String FUN_VALUE = "0";
    public static final String LOOKS_VALUE = "0";

    String first_name_str, last_name_str,b_day,horoscope;
    String gamer, athlete, musician, influencer, cook, writer, traveler, artist;
    int rich, social, intel, fun, looks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_features_activities);

        Intent intent = getIntent();
        first_name_str = intent.getStringExtra(MY_FIRST_NAME);
        last_name_str = intent.getStringExtra(MY_LAST_NAME);
        b_day = intent.getStringExtra(MY_BIRTHDAY);
        horoscope = intent.getStringExtra(MY_HOROSCOPE);
        gamer = intent.getStringExtra(YOUR_GAMER);
        athlete = intent.getStringExtra(YOUR_ATHLETE);
        musician = intent.getStringExtra(YOUR_MUSICIAN);
        influencer = intent.getStringExtra(YOUR_INFLUENCER);
        cook = intent.getStringExtra(YOUR_COOK);
        writer = intent.getStringExtra(YOUR_WRITER);
        traveler = intent.getStringExtra(YOUR_TRAVELER);
        artist = intent.getStringExtra(YOUR_ARTIST);
        //rich = intent.getStringExtra(RICH_VALUE);
        //social = intent.getStringExtra(SOCIAL_VALUE);
        //intel = intent.getStringExtra(INTEL_VALUE);
        ///fun = intent.getStringExtra(FUN_VALUE);
        //looks = intent.getStringExtra(LOOKS_VALUE);

        Bundle bundle = intent.getExtras();
        if (bundle != null)
        {
            rich = bundle.getInt("RICH_VALUE");
            social = bundle.getInt("SOCIAL_VALUE");
            intel = bundle.getInt("INTEL_VALUE");
            fun = bundle.getInt("FUN_VALUE");
            looks = bundle.getInt("LOOKS_VALUE");
            first_name_str = bundle.getString("FIRST_NAME");
            last_name_str = bundle.getString("LAST_NAME");
            b_day = bundle.getString("BIRTHDAY");
            horoscope = bundle.getString("HOROSCOPE");

        }
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
        /**intent.putExtra(TheirQualitiesActivity.THEIR_FEET, theirFeet);
        intent.putExtra(TheirQualitiesActivity.THEIR_INCHES, theirInches);
        intent.putExtra(TheirQualitiesActivity.THEIR_MIN, theirMin);
        intent.putExtra(TheirQualitiesActivity.THEIR_MAX, theirMax);
        intent.putExtra(TheirQualitiesActivity.THEIR_GENDER, theirGender);
**/
        Bundle bundle = new Bundle();
        bundle.putString("FEET", theirFeet);
        bundle.putString("INCHES", theirInches);
        bundle.putString("MIN", theirMin);
        bundle.putString("MAX", theirMax);
        bundle.putString("GENDER", theirGender);

        bundle.putInt("RICH_VALUE", rich);
        bundle.putInt("SOCIAL_VALUE", social);
        bundle.putInt("INTEL_VALUE", intel);
        bundle.putInt("FUN_VALUE", fun);
        bundle.putInt("LOOKS_VALUE", looks);

        bundle.putString("FIRST_NAME",first_name_str);
        bundle.putString("LAST_NAME",last_name_str);
        bundle.putString("HOROSCOPE",horoscope);
        bundle.putString("BIRTHDAY",b_day);
        intent.putExtras(bundle);

/**
        intent.putExtra(TheirQualitiesActivity.RICH_VALUE, rich);
        intent.putExtra(TheirQualitiesActivity.SOCIAL_VALUE, social);
        intent.putExtra(TheirQualitiesActivity.INTEL_VALUE, intel);
        intent.putExtra(TheirQualitiesActivity.FUN_VALUE, fun);
        intent.putExtra(TheirQualitiesActivity.LOOKS_VALUE, looks);
**/
        intent.putExtra(TheirQualitiesActivity.YOUR_GAMER, gamer);
        intent.putExtra(TheirQualitiesActivity.YOUR_TRAVELER, traveler);
        intent.putExtra(TheirQualitiesActivity.YOUR_MUSICIAN, musician);
        intent.putExtra(TheirQualitiesActivity.YOUR_COOK, cook);
        intent.putExtra(TheirQualitiesActivity.YOUR_WRITER, writer);
        intent.putExtra(TheirQualitiesActivity.YOUR_INFLUENCER, influencer);
        intent.putExtra(TheirQualitiesActivity.YOUR_ATHLETE, athlete);
        intent.putExtra(TheirQualitiesActivity.YOUR_ARTIST, artist);
        intent.putExtra(TheirQualitiesActivity.MY_FIRST_NAME, first_name_str);
        intent.putExtra(TheirQualitiesActivity.MY_LAST_NAME, last_name_str);
        intent.putExtra(TheirQualitiesActivity.MY_BIRTHDAY, b_day);
        intent.putExtra(TheirQualitiesActivity.MY_HOROSCOPE, horoscope);
        startActivity(intent);
    }
}
