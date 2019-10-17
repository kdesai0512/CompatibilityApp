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

    Person johnny = new Person("Johnny", "Johnny", 21, 5, 6, true, "Pisces", 60, 80, 35, 95, 60, true, false, false, false, true, false, false, false);
    Person reeeeeeehanna = new Person("Reeeeeeehanna", "Le", 32,5,2, false, "Sagittarius", 12,30,55, 52,47,false,false,false,false, false, true, true, false);
    Person kiki = new Person("Kiki", "Ded", 69,5,5,false,"Taurus", 5,60,60,75,45,true,true,false,false,false,false,false,false);
    Person smith = new Person("Smith","Alejandro",28,5,3,true,"Leo",30,55,10,30,77,false,false,false,false,false,false,true,true);
    Person kerit = new Person("Kerit", "Patel",86,5,2,false,"Gemini",87,2,92,5,23,false,true,false,true,false,true,false,false);
    Person adevry = new Person ("Adevry", "Detoolk",18,4,11,false,"Gemini",2,42,67,96,74,false,false,true, false,false,false,true,false);
    Person flowrida = new Person ("Flowrida", "Mann", 42,6,1,true,"Scorpio",27,37,27,28,29,false,false,true,false,false,false,false,false);
    Person ally = new Person("Ally", "Yen", 24 , 7,5,false,"Capricorn", 99,1,65,87,2,false,true,false,false,false,false,false,true);
    Person pedro = new Person("Pedro", "Caser",53,5,6,true,"Cancer",55,78,13,36,99,true,false,false,false,false,false,true,false);
    Person dan = new Person("Dan", "Doofinshmertz",36,6,0,true,"Aries", 40,88,40,45,39,false,true,false,true,false,false,false,false);
    Person e = new Person("E", "Colie", 47,4,2,false,"Virgo",50,50,50,50,50,false,false,false,false,true,false,false,false);
    Person haylee = new Person("Haylee", "Norman", 19,5,8,false,"Pisces",40,68,50,20,10,true,true,false,false,false,false,false,false);
    Person matt = new Person("Matt", "Nintendo", 55,6,9,true,"Aquarius",76,90,33,83,57,false,false,false,true,true,false,false,false);

}
