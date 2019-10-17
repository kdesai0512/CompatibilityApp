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
    public static final String MY_FIRST_NAME = "firstName";
    public static final String MY_LAST_NAME = "lastName";
    public static final String MY_BIRTHDAY = "birthday";
    public static final String MY_HOROSCOPE = "horoscope";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_qualities_slider);

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

        intent.putExtra(TheirFeaturesActivities.YOUR_GAMER, YOUR_GAMER);
        intent.putExtra(TheirFeaturesActivities.YOUR_TRAVELER, YOUR_TRAVELER);
        intent.putExtra(TheirFeaturesActivities.YOUR_MUSICIAN, YOUR_MUSICIAN);
        intent.putExtra(TheirFeaturesActivities.YOUR_COOK, YOUR_COOK);
        intent.putExtra(TheirFeaturesActivities.YOUR_WRITER, YOUR_WRITER);
        intent.putExtra(TheirFeaturesActivities.YOUR_INFLUENCER, YOUR_INFLUENCER);
        intent.putExtra(TheirFeaturesActivities.YOUR_ATHLETE, YOUR_ATHLETE);
        intent.putExtra(TheirFeaturesActivities.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(TheirFeaturesActivities.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(TheirFeaturesActivities.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(TheirFeaturesActivities.MY_HOROSCOPE, MY_HOROSCOPE);

        startActivity(intent);
    }
}
