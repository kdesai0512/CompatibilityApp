package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    public static final String THEIR_GAMER = "false";
    public static final String THEIR_ATHLETE = "false";
    public static final String THEIR_MUSICIAN = "false";
    public static final String THEIR_INFLUENCER = "false";
    public static final String THEIR_COOK = "false";
    public static final String THEIR_WRITER = "false";
    public static final String THEIR_ARTIST = "false";
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
    public static final String YOUR_ARTIST = "false";
    public static final String YOUR_WRITER = "false";
    public static final String YOUR_TRAVELER = "false";

    Button button;
    TextView name, age, points;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = (TextView) findViewById(R.id.mostpersonname);
        age = (TextView) findViewById(R.id.mostpersonage);
        points = (TextView) findViewById(R.id.mostpersoncompatibility);
        image = (ImageView) findViewById(R.id.mostpersonpic);

        int max = 0;
        int index = 0;
        for (int i = 0; i < Person.people.length; i++) {
            if (Person.people[i].getPoints() > max) {
                max = Person.people[i].getPoints();
                index = i;
            }
        }

        name.setText("Name: " + Person.people[index].getFirstName() + " " + Person.people[index].getLastName());
        age.setText("Age: " + Person.people[index].getAge());
        points.setText("Points: " + Person.people[index].getPoints());
        image.setImageResource(Person.people[index].getImageResourceID());



    }


}
