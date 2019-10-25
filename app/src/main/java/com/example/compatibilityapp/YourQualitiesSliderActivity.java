package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class YourQualitiesSliderActivity extends AppCompatActivity {

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

    String first_name_str, last_name_str,b_day,horoscope;
    String gamer, athlete, musician, influencer, cook, writer, traveler, artist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_qualities_slider);

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

        System.out.println(first_name_str);
        System.out.println(last_name_str);
        System.out.println(b_day);
        System.out.println(horoscope);

        System.out.println(gamer);
        System.out.println(athlete);
        System.out.println(musician);
        System.out.println(influencer);
        System.out.println(cook);
        System.out.println(writer);
        System.out.println(traveler);
        System.out.println(artist);



    }

    public void onProgressChanged (SeekBar rich, int progresValue, boolean fromUser) {}
    public void onStartTrackingTouch(SeekBar rich) {}
    public void onStopTrackingTouch(SeekBar rich) {}

    public void onProgressChanged2 (SeekBar social, int progresValue, boolean fromUser) {}
    public void onStartTrackingTouch2(SeekBar social) {}
    public void onStopTrackingTouch2(SeekBar social) {}

    public void onProgressChanged3 (SeekBar intel, int progresValue, boolean fromUser) {}
    public void onStartTrackingTouch3(SeekBar intel) {}
    public void onStopTrackingTouch3(SeekBar intel) {}

    public void onProgressChanged4 (SeekBar fun, int progresValue, boolean fromUser) {}
    public void onStartTrackingTouch4(SeekBar fun) {}
    public void onStopTrackingTouch4(SeekBar fun) {}

    public void onProgressChanged5 (SeekBar looks, int progresValue, boolean fromUser) {}
    public void onStartTrackingTouch5(SeekBar looks) {}
    public void onStopTrackingTouch5(SeekBar looks) {}


    public void theirFeatures(View v)
    {
        SeekBar rich = (SeekBar)  findViewById(R.id.richBar);
        SeekBar social = (SeekBar)  findViewById(R.id.socialBar);
        SeekBar intel = (SeekBar)  findViewById(R.id.intelligenceBar);
        SeekBar fun = (SeekBar)  findViewById(R.id.funBar);
        SeekBar looks = (SeekBar)  findViewById(R.id.looksBar);

        int richValue= rich.getProgress();
        int socialValue= social.getProgress();
        int intelValue= intel.getProgress();
        int funValue= fun.getProgress();
        int looksValue= looks.getProgress();

        Intent intent = new Intent(this, TheirFeaturesActivities.class);
        intent.putExtra(TheirFeaturesActivities.RICH_VALUE, richValue);
        intent.putExtra(TheirFeaturesActivities.SOCIAL_VALUE, socialValue);
        intent.putExtra(TheirFeaturesActivities.INTEL_VALUE, intelValue);
        intent.putExtra(TheirFeaturesActivities.FUN_VALUE, funValue);
        intent.putExtra(TheirFeaturesActivities.LOOKS_VALUE, looksValue);

        intent.putExtra(TheirFeaturesActivities.YOUR_GAMER, gamer);
        intent.putExtra(TheirFeaturesActivities.YOUR_TRAVELER, traveler);
        intent.putExtra(TheirFeaturesActivities.YOUR_MUSICIAN, musician);
        intent.putExtra(TheirFeaturesActivities.YOUR_COOK, cook);
        intent.putExtra(TheirFeaturesActivities.YOUR_WRITER, writer);
        intent.putExtra(TheirFeaturesActivities.YOUR_INFLUENCER, influencer);
        intent.putExtra(TheirFeaturesActivities.YOUR_ATHLETE, athlete);
        intent.putExtra(TheirFeaturesActivities.YOUR_ARTIST, artist);

        intent.putExtra(TheirFeaturesActivities.MY_FIRST_NAME, first_name_str);
        intent.putExtra(TheirFeaturesActivities.MY_LAST_NAME, last_name_str);
        intent.putExtra(TheirFeaturesActivities.MY_BIRTHDAY, b_day);
        intent.putExtra(TheirFeaturesActivities.MY_HOROSCOPE, horoscope);

        startActivity(intent);
    }
}
