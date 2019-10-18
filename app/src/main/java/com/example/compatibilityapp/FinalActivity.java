package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

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
    public static final Person[] people = {

            new Person("Johnny", "Johnny", 21, 5, 6, true, "Pisces", 60, 80, 35, 95, 60, true, false, false, false, true, false, false, false),
            new Person("Reeeeeeehanna", "Le", 32, 5, 2, false, "Sagittarius", 12, 30, 55, 52, 47, false, false, false, false, false, true, true, false),
            new Person("Kiki", "Ded", 69, 5, 5, false, "Taurus", 5, 60, 60, 75, 45, true, true, false, false, false, false, false, false),
            new Person("Smith", "Alejandro", 28, 5, 3, true, "Leo", 30, 55, 10, 30, 77, false, false, false, false, false, false, true, true),
            new Person("Kerit", "Patel", 86, 5, 2, false, "Gemini", 87, 2, 92, 5, 23, false, true, false, true, false, true, false, false),
            new Person("Adevry", "Detoolk", 18, 4, 11, false, "Gemini", 2, 42, 67, 96, 74, false, false, true, false, false, false, true, false),
            new Person("Flowrida", "Mann", 42, 6, 1, true, "Scorpio", 27, 37, 27, 28, 29, false, false, true, false, false, false, false, false),
            new Person("Ally", "Yen", 24, 7, 5, false, "Capricorn", 99, 1, 65, 87, 2, false, true, false, false, false, false, false, true),
            new Person("Pedro", "Caser", 53, 5, 6, true, "Cancer", 55, 78, 13, 36, 99, true, false, false, false, false, false, true, false),
            new Person("Dan", "Doofinshmertz", 36, 6, 0, true, "Aries", 40, 88, 40, 45, 39, false, true, false, true, false, false, false, false),
            new Person("E", "Colie", 47, 4, 2, false, "Virgo", 50, 50, 50, 50, 50, false, false, false, false, true, false, false, false),
            new Person("Haylee", "Norman", 19, 5, 8, false, "Pisces", 40, 68, 50, 20, 10, true, true, false, false, false, false, false, false),
            new Person("Matt", "Nintendo", 55, 6, 9, true, "Aquarius", 76, 90, 33, 83, 57, false, false, false, true, true, false, false, false),
            new Person("Pew", "Reserch", 34, 5, 10, true, "Libra", 22, 28, 74, 66, 14, false, false, false, false, false, true, false, false),
            new Person("Nick", "Hicks", 26, 5, 11, true, "Capricorn", 31, 73, 43, 85, 24, false, false, false, false, false, true, false, false),
            new Person("Rhys", "Byrne", 45, 6, 4, true, "Libra", 28, 63, 70, 73, 36, false, false, true, false, false, false, false, false),
            new Person("KVIIIlyn", "Steele", 29, 5, 3, false, "Leo", 59, 30, 53, 43, 54, false, false, false, false, false, false, false, false),
            new Person("Estefania", "Vargas", 84, 6, 0, false, "Pisces", 84, 40, 20, 67, 98, false, true, false, false, false, true, false, false),
            new Person("Philip", "Dilip", 18, 5, 8, true, "Sagittarius", 10, 30, 13, 95, 34, false, false, false, false, false, false, false, false),
            new Person("Boris", "Eckbert", 61, 6, 2, true, "Taurus", 46, 39, 94, 46, 67, true, false, false, false, false, false, false, false),
            new Person("Lena", "Vitale", 28, 4, 11, false, "Scorpio", 25, 46, 57, 72, 62, false, false, false, true, false, false, false, true),
            new Person("Tena", "Praveen", 19, 5, 1, false, "Cancer", 63, 71, 1, 84, 58, false, false, false, false, false, false, false, true),
            new Person("Ana", "Hernandez", 18, 5, 9, false, "Cancer", 50, 67, 80, 97, 96, true, true, false, false, false, false, false, false),
            new Person("Mick", "Bro", 74, 5, 11, true, "Scorpio", 40, 53, 78, 86, 98, false, false, false, true, false, false, true, true),
            new Person("Pablo", "Trent", 27, 5, 6, true, "Taurus", 57, 65, 52, 82, 78, true, true, false, false, false, false, false, false),
            new Person("Alex", "Third", 25, 5, 9, true, "Libra", 32, 87, 44, 79, 75, false, false, true, false, false, true, false, false),
            new Person("Marty", "Gongey", 36, 5, 10, true, "Virgo", 83, 58, 23, 90, 85, true, true, false, false, false, false, false, false),
            new Person("Linda", "George", 57, 5, 7, false, "Pisces", 76, 25, 89, 94, 86, true, false, false, false, false, false, true, true),
            new Person("Angela", "Corin", 64, 4, 7, false, "Scorpio", 7, 13, 13, 8, 24, false, true, false, true, false, false, false, true)

    };

}
