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
    public static final String THEIR_FEET = "0";
    public static final String THEIR_INCHES = "0";
    public static final String THEIR_MIN = "0";
    public static final String THEIR_MAX = "0";
    public static final String THEIR_GENDER = "male";

    static String gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1, artist1;
    String first_name_str, last_name_str,b_day,horoscope;
    String gamer2, athlete2, musician2, influencer2, cook2, writer2, traveler2, artist2;
    int rich, social, intel, fun, looks;
    String feet, inch, min, max,gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_qualities);

        Intent intent = getIntent();
        first_name_str = intent.getStringExtra(MY_FIRST_NAME);
        last_name_str = intent.getStringExtra(MY_LAST_NAME);
        b_day = intent.getStringExtra(MY_BIRTHDAY);
        horoscope = intent.getStringExtra(MY_HOROSCOPE);

        gamer2 = intent.getStringExtra(YOUR_GAMER);
        athlete2 = intent.getStringExtra(YOUR_ATHLETE);
        musician2 = intent.getStringExtra(YOUR_MUSICIAN);
        influencer2 = intent.getStringExtra(YOUR_INFLUENCER);
        cook2 = intent.getStringExtra(YOUR_COOK);
        writer2 = intent.getStringExtra(YOUR_WRITER);
        traveler2 = intent.getStringExtra(YOUR_TRAVELER);
        artist2 = intent.getStringExtra(YOUR_ARTIST);

        Bundle bundle = intent.getExtras();
        if (bundle != null)
        {
            rich = bundle.getInt("RICH_VALUE");
            social = bundle.getInt("SOCIAL_VALUE");
            intel = bundle.getInt("INTEL_VALUE");
            fun = bundle.getInt("FUN_VALUE");
            looks = bundle.getInt("LOOKS_VALUE");
            feet = bundle.getString("FEET");
            inch = bundle.getString("INCHES");
            max = bundle.getString("MAX");
            min = bundle.getString("MIN");
            gender = bundle.getString("GENDER");
            first_name_str = bundle.getString("FIRST_NAME");
            last_name_str = bundle.getString("LAST_NAME");
            b_day = bundle.getString("BIRTHDAY");
            horoscope = bundle.getString("HOROSCOPE");

        }
/**
        rich = intent.getStringExtra(RICH_VALUE);
        social = intent.getStringExtra(SOCIAL_VALUE);
        intel = intent.getStringExtra(INTEL_VALUE);
        fun = intent.getStringExtra(FUN_VALUE);
        looks = intent.getStringExtra(LOOKS_VALUE);
        feet = intent.getStringExtra(THEIR_FEET);
        inch = intent.getStringExtra(THEIR_INCHES);
        min = intent.getStringExtra(THEIR_MIN);
        max = intent.getStringExtra(THEIR_MAX);
        gender = intent.getStringExtra(THEIR_GENDER);
**/
        gamer1 = "false";
        athlete1 = "false";
        cook1 = "false";
        influencer1 = "false";
        musician1 = "false";
        traveler1 = "false";
        writer1 = "false";
        artist1 = "false";

        checkbox2();
    }

    public void checkbox2() {
        CheckBox gamer = (CheckBox) findViewById(R.id.theirGamer);
        CheckBox athlete = (CheckBox) findViewById(R.id.theirAthlete);
        CheckBox cook = (CheckBox) findViewById(R.id.theirCook);
        CheckBox influencer = (CheckBox) findViewById(R.id.theirInfluencer);
        CheckBox musician = (CheckBox) findViewById(R.id.theirMusician);
        CheckBox traveler = (CheckBox) findViewById(R.id.theirTraveler);
        CheckBox writer = (CheckBox) findViewById(R.id.theirWriter);
        CheckBox artist = (CheckBox) findViewById(R.id.theirArtist);

        gamer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                gamer1 = "true";
            }
        });
        athlete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                athlete1 = "true";
            }
        });
        cook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                cook1 = "true";
            }
        });
        influencer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                influencer1 = "true";
            }
        });
        musician.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                musician1 = "true";
            }
        });
        traveler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                traveler1 = "true";
            }
        });
        writer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                writer1 = "true";
            }
        });
        artist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                artist1 = "true";
            }
        });
    }
    public void finalActivity(View v)
    {




        Intent intent = new Intent(this, FinalActivity.class);

        intent.putExtra(FinalActivity.THEIR_GAMER, gamer1);
        intent.putExtra(FinalActivity.THEIR_TRAVELER, traveler1);
        intent.putExtra(FinalActivity.THEIR_MUSICIAN, musician1);
        intent.putExtra(FinalActivity.THEIR_COOK, cook1);
        intent.putExtra(FinalActivity.THEIR_WRITER, writer1);
        intent.putExtra(FinalActivity.THEIR_INFLUENCER, influencer1);
        intent.putExtra(FinalActivity.THEIR_ATHLETE, athlete1);
        intent.putExtra(FinalActivity.THEIR_ARTIST, artist1);

        intent.putExtra(FinalActivity.THEIR_FEET, feet);
        intent.putExtra(FinalActivity.THEIR_INCHES, inch);
        intent.putExtra(FinalActivity.THEIR_MIN, min);
        intent.putExtra(FinalActivity.THEIR_MAX, max);
        intent.putExtra(FinalActivity.THEIR_GENDER, gender);

        Bundle bundle = new Bundle();
        bundle.putInt("RICH_VALUE", rich);
        bundle.putInt("SOCIAL_VALUE", social);
        bundle.putInt("INTEL_VALUE", intel);
        bundle.putInt("FUN_VALUE", fun);
        bundle.putInt("LOOKS_VALUE", looks);
        bundle.putString("FEET", feet);
        bundle.putString("INCHES", inch);
        bundle.putString("MIN", min);
        bundle.putString("MAX", max);
        bundle.putString("GENDER", gender);

        bundle.putString("FIRST_NAME",first_name_str);
        bundle.putString("LAST_NAME",last_name_str);
        bundle.putString("HOROSCOPE",horoscope);
        bundle.putString("BIRTHDAY",b_day);
        intent.putExtras(bundle);

/**
        intent.putExtra(FinalActivity.RICH_VALUE, rich);
        intent.putExtra(FinalActivity.SOCIAL_VALUE, social);
        intent.putExtra(FinalActivity.INTEL_VALUE, intel);
        intent.putExtra(FinalActivity.FUN_VALUE, fun);
        intent.putExtra(FinalActivity.LOOKS_VALUE, looks);
**/
        intent.putExtra(FinalActivity.YOUR_GAMER, gamer2);
        intent.putExtra(FinalActivity.YOUR_TRAVELER, traveler2);
        intent.putExtra(FinalActivity.YOUR_MUSICIAN, musician2);
        intent.putExtra(FinalActivity.YOUR_COOK, cook2);
        intent.putExtra(FinalActivity.YOUR_WRITER, writer2);
        intent.putExtra(FinalActivity.YOUR_INFLUENCER, influencer2);
        intent.putExtra(FinalActivity.YOUR_ATHLETE, athlete2);
        intent.putExtra(FinalActivity.YOUR_ARTIST, artist2);
        intent.putExtra(FinalActivity.MY_FIRST_NAME, first_name_str);
        intent.putExtra(FinalActivity.MY_LAST_NAME, last_name_str);
        intent.putExtra(FinalActivity.MY_BIRTHDAY, b_day);
        intent.putExtra(FinalActivity.MY_HOROSCOPE, horoscope);
        startActivity(intent);
    }
}
