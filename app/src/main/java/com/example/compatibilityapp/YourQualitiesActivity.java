package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class YourQualitiesActivity extends AppCompatActivity {

    public static final String MY_FIRST_NAME = "firstName";
    public static final String MY_LAST_NAME = "lastName";
    public static final String MY_BIRTHDAY = "birthday";
    public static final String MY_HOROSCOPE = "horoscope";
    private boolean gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1, artist1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_qualities);

        gamer1 = false;
        athlete1 = false;
        cook1 = false;
        influencer1 = false;
        musician1 = false;
        traveler1 = false;
        writer1 = false;
        artist1 = false;
    }
    public void yourQualitiesSlider(View v)
    {
        CheckBox gamer = (CheckBox) findViewById(R.id.yourGamer);
        CheckBox athlete = (CheckBox) findViewById(R.id.yourAthlete);
        CheckBox cook = (CheckBox) findViewById(R.id.yourCook);
        CheckBox influencer = (CheckBox) findViewById(R.id.yourInfluencer);
        CheckBox musician = (CheckBox) findViewById(R.id.yourMusician);
        final CheckBox traveler = (CheckBox) findViewById(R.id.yourTraveler);
        CheckBox writer = (CheckBox) findViewById(R.id.yourWriter);
        CheckBox artist = (CheckBox) findViewById(R.id.yourArtist);

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
        artist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v)
            {
                artist1 = true;
            }
        });

        Intent intent = new Intent(this, YourQualitiesSliderActivity.class);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_GAMER, gamer1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_TRAVELER, traveler1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_MUSICIAN, musician1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_COOK, cook1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_WRITER, writer1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_INFLUENCER, influencer1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_ATHLETE, athlete1);
        intent.putExtra(YourQualitiesSliderActivity.YOUR_ARTIST, artist1);
        intent.putExtra(YourQualitiesSliderActivity.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(YourQualitiesSliderActivity.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(YourQualitiesSliderActivity.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(YourQualitiesSliderActivity.MY_HOROSCOPE, MY_HOROSCOPE);

        startActivity(intent);
    }
}
