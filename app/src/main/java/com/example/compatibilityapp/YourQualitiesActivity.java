package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class YourQualitiesActivity extends AppCompatActivity {

    public static final String MY_FIRST_NAME = "firstName";
    public static final String MY_LAST_NAME = "lastName";
    public static final String MY_BIRTHDAY = "birthday";
    public static final String MY_HOROSCOPE = "horoscope";

    static String gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1, artist1;
    String first_name_str, last_name_str,b_day,horoscope;

    Intent intent, intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_qualities);

        final MediaPlayer popDrip = MediaPlayer.create(this, R.raw.pop_drip);
        Button next = (Button) this.findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                popDrip.start();
            }
        });


        intent = getIntent();
        first_name_str = intent.getStringExtra(MY_FIRST_NAME);
        last_name_str = intent.getStringExtra(MY_LAST_NAME);
        b_day = intent.getStringExtra(MY_BIRTHDAY);
        horoscope = intent.getStringExtra(MY_HOROSCOPE);

        Bundle bundle = intent.getExtras();
        if (bundle != null)
        {
            first_name_str = bundle.getString("FIRST_NAME");
            last_name_str = bundle.getString("LAST_NAME");
            b_day = bundle.getString("BIRTHDAY");
            horoscope = bundle.getString("HOROSCOPE");
        }

        gamer1 = "false";
        athlete1 = "false";
        cook1 = "false";
        influencer1 = "false";
        musician1 = "false";
        traveler1 = "false";
        writer1 = "false";
        artist1 = "false";

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
    public void yourQualitiesSlider(View v)
    {
        intent = new Intent(this, YourQualitiesSliderActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("FIRST_NAME",first_name_str);
        bundle.putString("LAST_NAME",last_name_str);
        bundle.putString("HOROSCOPE",horoscope);
        bundle.putString("BIRTHDAY",b_day);
        intent.putExtras(bundle);

        intent.putExtra(YourQualitiesSliderActivity.MY_FIRST_NAME, first_name_str);
        intent.putExtra(YourQualitiesSliderActivity.MY_LAST_NAME, last_name_str);
        intent.putExtra(YourQualitiesSliderActivity.MY_BIRTHDAY, b_day);
        intent.putExtra(YourQualitiesSliderActivity.MY_HOROSCOPE, horoscope);
        startActivity(intent);
    }
}
