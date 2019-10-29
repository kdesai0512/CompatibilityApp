package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

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
    double percent;
    int index = 0, max = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = (TextView) findViewById(R.id.mostpersonname);
        age = (TextView) findViewById(R.id.mostpersonage);
        points = (TextView) findViewById(R.id.mostpersoncompatibility);
        image = (ImageView) findViewById(R.id.mostpersonpic);

         max = 0;
         index = 0;
        for (int i = 0; i < Person.people.length; i++) {
            if (Person.people[i].getPoints() > max) {
                max = Person.people[i].getPoints();
                index = i;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00");
        name.setText(Person.people[index].description());
        percent = ((Person.people[index].getPoints())/100);
        Double.toString(percent);
        points.setText(df.format(percent) + "% Compatibility");
        image.setImageResource(Person.people[index].getImageResourceID());
    }

    public void shareInfo (View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
         String strToDisplay = "I am " + percent + "% compatible with " + Person.people[index].getFirstName() + " " + Person.people[index].getLastName();
         intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);
        String chooserTitle = "Choose an app to send your message";
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }


}
