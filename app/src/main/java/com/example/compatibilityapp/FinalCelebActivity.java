package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FinalCelebActivity extends AppCompatActivity {

    String gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1, artist1;
    String first_name_str, last_name_str,b_day,horoscope,celeb;
    String gamer2, athlete2, musician2, influencer2, cook2, writer2, traveler2, artist2;
    int  rich, social, intel, fun, looks;
    String feet, inch, min, max, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_celeb);

        Intent intent = getIntent();

        // Intent intent3 = getIntent();
        gamer2 = YourQualitiesCelebActivity.gamer1;
        athlete2 = YourQualitiesCelebActivity.athlete1;
        musician2 = YourQualitiesCelebActivity.musician1;
        influencer2 = YourQualitiesCelebActivity.influencer1;
        cook2 = YourQualitiesCelebActivity.cook1;
        writer2 = YourQualitiesCelebActivity.writer1;
        traveler2 = YourQualitiesCelebActivity.traveler1;
        artist2 = YourQualitiesCelebActivity.artist1;

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
            celeb = bundle.getString("CELEBRITY");
        }
        boolean your_gamer2 = false;
        boolean your_traveler2 = false;
        boolean your_artist2 = false;
        boolean your_musician2 = false;
        boolean your_cook2 = false;
        boolean your_influencer = false;
        boolean your_writer2 = false;
        boolean your_athlete2 = false;
        boolean their_gender2 = false;

        if(gamer2.equalsIgnoreCase("true"))
            your_gamer2 = true;
        else
            your_gamer2 = false;

        if(traveler2.equalsIgnoreCase("true"))
            your_traveler2 = true;
        else
            your_traveler2 = false;

        if(artist2.equalsIgnoreCase("true"))
            your_artist2 = true;
        else
            your_artist2 = false;

        if(musician2.equalsIgnoreCase("true"))
            your_musician2 = true;
        else
            your_musician2 = false;

        if(cook2.equalsIgnoreCase("true"))
            your_cook2 = true;
        else
            your_cook2 = false;

        if(influencer2.equalsIgnoreCase("true"))
            your_influencer = true;
        else
            your_influencer = false;

        if(writer2.equalsIgnoreCase("true"))
            your_writer2 = true;
        else
            your_writer2 = false;

        if(athlete2.equalsIgnoreCase("true"))
            your_athlete2 = true;
        else
            your_athlete2 = false;



        new Celeb(first_name_str, last_name_str,0,0, 0, false, horoscope, rich, social, intel, fun, looks, your_gamer2,your_traveler2,your_artist2,your_musician2,
                your_cook2,your_writer2,your_influencer,your_athlete2, 0, R.drawable.adevry_detoolk, "");
        for (int i = 0; i < Celeb.celeb.length; i++) {
            if (Celeb.celeb[i].getFullName().equals(celeb)) {
                {
                    {
                        {
                            if (Celeb.celeb[i].getHoroscope().equalsIgnoreCase(horoscope)) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isGamer() == your_gamer2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isTraveler() == your_traveler2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isArtist() == your_artist2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isMusician() == your_musician2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isHomeCook() == your_cook2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isWriter() == your_writer2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isSocialInfluencer() == your_influencer) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }
                            if (Celeb.celeb[i].isAthlete() == your_athlete2) {
                                Celeb.celeb[i].setPoints(Celeb.celeb[i].getPoints() + 100);
                            }

                            Celeb.celeb[i].setPoints((Celeb.celeb[i].getPoints() + Math.abs(Celeb.celeb[i].getRich() - rich)));
                            Celeb.celeb[i].setPoints((Celeb.celeb[i].getPoints() + Math.abs(Celeb.celeb[i].getSocial() - social)));
                            Celeb.celeb[i].setPoints((Celeb.celeb[i].getPoints() + Math.abs(Celeb.celeb[i].getIntelligence() - intel)));
                            Celeb.celeb[i].setPoints((Celeb.celeb[i].getPoints() + Math.abs(Celeb.celeb[i].getFun() - fun)));
                            Celeb.celeb[i].setPoints((Celeb.celeb[i].getPoints() + Math.abs(Celeb.celeb[i].getLooks() - looks)));
                        }
                    }
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < Celeb.celeb.length; i++) {
            if (Celeb.celeb[i].getPoints() > 0) {
                double percent = ((((double)Celeb.celeb[i].getPoints())/1400)*100);
                Double.toString(percent);
                TextView percentText = (TextView) findViewById(R.id.percent);
                percentText.setText("You are " + df.format(percent) + "% compatible with " + Celeb.celeb[i].getFullName() + "!");
            }
        }


    }

    //https://stackoverflow.com/questions/22213357/making-a-restart-button-for-an-android-app-game
    public void restart2(View v) {
        Intent i = new Intent(this, MainActivity.class); //change it to your main class
        //the following 2 tags are for clearing the backStack and start fresh
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
        startActivity(i);
    }

}
