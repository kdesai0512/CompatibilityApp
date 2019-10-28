package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FinalActivity extends AppCompatActivity {

    public static final String THEIR_GAMER = "false";
    public static final String THEIR_ATHLETE = "false";
    public static final String THEIR_MUSICIAN = "false";
    public static final String THEIR_INFLUENCER = "false";
    public static final String THEIR_ARTIST = "false";
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
    public static final String YOUR_ARTIST = "false";

    String gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1, artist1;
    String first_name_str, last_name_str,b_day,horoscope;
    String gamer2, athlete2, musician2, influencer2, cook2, writer2, traveler2, artist2;
    int  rich, social, intel, fun, looks;
    String feet, inch, min, max, gender;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent = getIntent();
        first_name_str = intent.getStringExtra(MY_FIRST_NAME);
        last_name_str = MY_LAST_NAME;
        b_day = MY_BIRTHDAY;
        horoscope = MY_HOROSCOPE;

       // Intent intent3 = getIntent();
        gamer2 = YourQualitiesActivity.gamer1;
        athlete2 = YourQualitiesActivity.athlete1;
        musician2 = YourQualitiesActivity.musician1;
        influencer2 = YourQualitiesActivity.influencer1;
        cook2 = YourQualitiesActivity.cook1;
        writer2 = YourQualitiesActivity.writer1;
        traveler2 = YourQualitiesActivity.traveler1;
        artist2 = YourQualitiesActivity.artist1;

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


        feet = THEIR_FEET;
        inch = THEIR_INCHES;
        min = THEIR_MIN;
        max = THEIR_MAX;
        gender = THEIR_GENDER;
**/
        gamer1 = TheirQualitiesActivity.gamer1;
        athlete1 = TheirQualitiesActivity.athlete1;
        musician1 = TheirQualitiesActivity.musician1;
        influencer1 = TheirQualitiesActivity.influencer1;
        cook1 = TheirQualitiesActivity.cook1;
        writer1 = TheirQualitiesActivity.writer1;
        traveler1 = TheirQualitiesActivity.traveler1;
        artist1 = TheirQualitiesActivity.artist1;

        //String age = MY_BIRTHDAY.substring(6);
        //int age2 = Integer.parseInt(age);
        /**String rich = RICH_VALUE;
         int rich2 = Integer.parseInt(rich);
         String social = SOCIAL_VALUE;
         int social2 = Integer.parseInt(social);
         String intel = INTEL_VALUE;
         int intel2 = Integer.parseInt(intel);
         String fun = FUN_VALUE;
         int fun2 = Integer.parseInt(fun);
         String looks = LOOKS_VALUE;
         int looks2 = Integer.parseInt(looks);
         **/
        String feet = THEIR_FEET;
        int feet2 =  Integer.parseInt(feet);
        String inches = THEIR_FEET;
        int inches2 =  Integer.parseInt(inches);

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

        if(gender.equals("male"))
            their_gender2 = true;
        else
            their_gender2 = false;




        new Person(first_name_str, last_name_str,0,feet2, inches2, their_gender2, horoscope, rich, social, intel, fun, looks, your_gamer2,your_traveler2,your_artist2,your_musician2,
                your_cook2,your_writer2,your_influencer,your_athlete2, 0, R.drawable.adevry_detoolk);

        for (int i = 0; i < Person.people.length; i++)
        {
            // if(Math.abs(people[i].getAge() - age2) <=15)
            {
                if (Person.people[i].getFeet() >= feet2 && Person.people[i].getInches() >= inches2)
                {
                    //if(Person.people[i].isGender() == their_gender2)
                    {
                        if(Person.people[i].getHoroscope().equalsIgnoreCase(horoscope))
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isGamer() == your_gamer2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isTraveler() == your_traveler2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isArtist() == your_artist2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isMusician() == your_musician2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isHomeCook() == your_cook2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isWriter() == your_writer2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isSocialInfluencer() == your_influencer)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }
                        if(Person.people[i].isAthlete() == your_athlete2)
                        {
                            Person.people[i].setPoints(Person.people[i].getPoints() + 1);
                        }

                        Person.people[i].setPoints((Person.people[i].getPoints() + Math.abs(Person.people[i].getRich() - rich)));
                        Person.people[i].setPoints((Person.people[i].getPoints() + Math.abs(Person.people[i].getSocial() - social)));
                        Person.people[i].setPoints((Person.people[i].getPoints() + Math.abs(Person.people[i].getIntelligence() - intel)));
                        Person.people[i].setPoints((Person.people[i].getPoints() + Math.abs(Person.people[i].getFun() - fun)));
                        Person.people[i].setPoints((Person.people[i].getPoints() + Math.abs(Person.people[i].getLooks() - looks)));
                    }




                }


            }
        }



    }
    public void profile(View v) //ignore this for now?? idk the purpose of that last activity
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        Intent intent2 = new Intent(this, Profile2Activity.class);
        intent.putExtra(ProfileActivity.THEIR_GAMER, THEIR_GAMER);
        intent.putExtra(ProfileActivity.THEIR_TRAVELER, THEIR_TRAVELER);
        intent.putExtra(ProfileActivity.THEIR_MUSICIAN, THEIR_MUSICIAN);
        intent.putExtra(ProfileActivity.THEIR_COOK, THEIR_COOK);
        intent.putExtra(ProfileActivity.THEIR_WRITER, THEIR_WRITER);
        intent.putExtra(ProfileActivity.THEIR_INFLUENCER, THEIR_INFLUENCER);
        intent.putExtra(ProfileActivity.THEIR_ATHLETE, THEIR_ATHLETE);
        intent.putExtra(ProfileActivity.THEIR_ARTIST, THEIR_ARTIST);

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
        intent.putExtra(ProfileActivity.YOUR_ARTIST, YOUR_ARTIST);
        intent.putExtra(ProfileActivity.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(ProfileActivity.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(ProfileActivity.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(ProfileActivity.MY_HOROSCOPE, MY_HOROSCOPE);
    }

    public void startProfile(View v) {
        Intent intent = new Intent(FinalActivity.this,
                ProfileActivity.class);
        startActivity(intent);
    }

    public void startProfile2(View v) {
        Intent intent = new Intent(FinalActivity.this,
                Profile2Activity.class);
        startActivity(intent);
    }






    //https://stackoverflow.com/questions/22213357/making-a-restart-button-for-an-android-app-game
    public void restart(View v) {
        Intent i = new Intent(this, MainActivity.class); //change it to your main class
        //the following 2 tags are for clearing the backStack and start fresh
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
        startActivity(i);
    }

}
