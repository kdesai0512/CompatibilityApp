package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class TheirQualitiesActivity extends AppCompatActivity {
    public static final String YOUR_GAMER = "false";
    public static final String YOUR_ATHLETE = "false";
    public static final String YOUR_MUSICIAN = "false";
    public static final String YOUR_INFLUENCER = "false";
    public static final String YOUR_COOK = "false";
    public static final String YOUR_WRITER = "false";
    public static final String YOUR_TRAVELER = "false";
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

    private boolean gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_qualities);
    }
    public void finalActivity(View v)
    {
        CheckBox gamer = (CheckBox) findViewById(R.id.theirGamer);
        CheckBox athlete = (CheckBox) findViewById(R.id.theirAthlete);
        CheckBox cook = (CheckBox) findViewById(R.id.theirCook);
        CheckBox influencer = (CheckBox) findViewById(R.id.theirInfluencer);
        CheckBox musician = (CheckBox) findViewById(R.id.theirMusician);
        CheckBox traveler = (CheckBox) findViewById(R.id.theirTraveler);
        CheckBox writer = (CheckBox) findViewById(R.id.theirWriter);

        gamer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                gamer1 = true;
            }
        });
        athlete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                athlete1 = true;
            }
        });
        cook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                cook1 = true;
            }
        });
        influencer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                influencer1 = true;
            }
        });
        musician.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                musician1 = true;
            }
        });
        traveler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                traveler1 = true;
            }
        });
        writer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                writer1 = true;
            }
        });



        Intent intent = new Intent(this, FinalActivity.class);

        intent.putExtra(FinalActivity.THEIR_GAMER, gamer1);
        intent.putExtra(FinalActivity.THEIR_TRAVELER, traveler1);
        intent.putExtra(FinalActivity.THEIR_MUSICIAN, musician1);
        intent.putExtra(FinalActivity.THEIR_COOK, cook1);
        intent.putExtra(FinalActivity.THEIR_WRITER, writer1);
        intent.putExtra(FinalActivity.THEIR_INFLUENCER, influencer1);
        intent.putExtra(FinalActivity.THEIR_ATHLETE, athlete1);

        intent.putExtra(FinalActivity.THEIR_FEET, THEIR_FEET);
        intent.putExtra(FinalActivity.THEIR_INCHES, THEIR_INCHES);
        intent.putExtra(FinalActivity.THEIR_MIN, THEIR_MIN);
        intent.putExtra(FinalActivity.THEIR_MAX, THEIR_MAX);
        intent.putExtra(FinalActivity.THEIR_GENDER, THEIR_GENDER);


        intent.putExtra(FinalActivity.RICH_VALUE, RICH_VALUE);
        intent.putExtra(FinalActivity.SOCIAL_VALUE, SOCIAL_VALUE);
        intent.putExtra(FinalActivity.INTEL_VALUE, INTEL_VALUE);
        intent.putExtra(FinalActivity.FUN_VALUE, FUN_VALUE);
        intent.putExtra(FinalActivity.LOOKS_VALUE, LOOKS_VALUE);

        intent.putExtra(FinalActivity.YOUR_GAMER, YOUR_GAMER);
        intent.putExtra(FinalActivity.YOUR_TRAVELER, YOUR_TRAVELER);
        intent.putExtra(FinalActivity.YOUR_MUSICIAN, YOUR_MUSICIAN);
        intent.putExtra(FinalActivity.YOUR_COOK, YOUR_COOK);
        intent.putExtra(FinalActivity.YOUR_WRITER, YOUR_WRITER);
        intent.putExtra(FinalActivity.YOUR_INFLUENCER, YOUR_INFLUENCER);
        intent.putExtra(FinalActivity.YOUR_ATHLETE, YOUR_ATHLETE);
        intent.putExtra(FinalActivity.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(FinalActivity.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(FinalActivity.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(FinalActivity.MY_HOROSCOPE, MY_HOROSCOPE);
        startActivity(intent);
    }
}
