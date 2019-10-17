package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinalActivity extends AppCompatActivity {

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
    public static final String THEIR_FEET = "0";
    public static final String THEIR_INCHES = "0";
    public static final String THEIR_MIN = "0";
    public static final String THEIR_MAX = "0";
    public static final String THEIR_GENDER = "male";
    public static final String YOUR_GAMER = "false";
    public static final String YOUR_ATHLETE = "false";
    public static final String YOUR_MUSICIAN = "false";
    public static final String YOUR_INFLUENCER = "false";
    public static final String YOUR_COOK = "false";
    public static final String YOUR_WRITER = "false";
    public static final String YOUR_TRAVELER = "false";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }
    public void profile(View v)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.THEIR_GAMER, THEIR_GAMER);
        intent.putExtra(ProfileActivity.THEIR_TRAVELER, THEIR_TRAVELER);
        intent.putExtra(ProfileActivity.THEIR_MUSICIAN, THEIR_MUSICIAN);
        intent.putExtra(ProfileActivity.THEIR_COOK, THEIR_COOK);
        intent.putExtra(ProfileActivity.THEIR_WRITER, THEIR_WRITER);
        intent.putExtra(ProfileActivity.THEIR_INFLUENCER, THEIR_INFLUENCER);
        intent.putExtra(ProfileActivity.THEIR_ATHLETE, THEIR_ATHLETE);

        intent.putExtra(ProfileActivity.THEIR_FEET, THEIR_FEET);
        intent.putExtra(ProfileActivity.THEIR_INCHES, THEIR_INCHES);
        intent.putExtra(ProfileActivity.THEIR_MIN, THEIR_MIN);
        intent.putExtra(ProfileActivity.THEIR_MAX, THEIR_MAX);
        intent.putExtra(ProfileActivity.THEIR_GENDER, THEIR_GENDER);


        intent.putExtra(ProfileActivity.RICH_VALUE, RICH_VALUE);
        intent.putExtra(ProfileActivity.SOCIAL_VALUE, SOCIAL_VALUE);
        intent.putExtra(ProfileActivity.INTEL_VALUE, INTEL_VALUE);
        intent.putExtra(ProfileActivity.FUN_VALUE, FUN_VALUE);
        intent.putExtra(ProfileActivity.LOOKS_VALUE, LOOKS_VALUE);

        intent.putExtra(ProfileActivity.YOUR_GAMER, YOUR_GAMER);
        intent.putExtra(ProfileActivity.YOUR_TRAVELER, YOUR_TRAVELER);
        intent.putExtra(ProfileActivity.YOUR_MUSICIAN, YOUR_MUSICIAN);
        intent.putExtra(ProfileActivity.YOUR_COOK, YOUR_COOK);
        intent.putExtra(ProfileActivity.YOUR_WRITER, YOUR_WRITER);
        intent.putExtra(ProfileActivity.YOUR_INFLUENCER, YOUR_INFLUENCER);
        intent.putExtra(ProfileActivity.YOUR_ATHLETE, YOUR_ATHLETE);
        intent.putExtra(ProfileActivity.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(ProfileActivity.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(ProfileActivity.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(ProfileActivity.MY_HOROSCOPE, MY_HOROSCOPE);
        startActivity(intent);
    }

}
