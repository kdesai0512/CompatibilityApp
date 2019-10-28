package com.example.compatibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile2Activity extends AppCompatActivity {

    Button button2;
    TextView name, age, points;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        name = (TextView) findViewById(R.id.leastpersonname);
        age = (TextView) findViewById(R.id.leastpersonage);
        points = (TextView) findViewById(R.id.leastpersoncompatibility);
        image = (ImageView) findViewById(R.id.leastpersonpic);

        int min = Person.people[0].getPoints();
        int index2 = 0;
        for (int i = 1; i < Person.people.length; i++) {
            if (Person.people[i].getPoints() > 0 && Person.people[i].getPoints() < min) {
                min = Person.people[i].getPoints();
                index2 = i;
            }
        }

        name.setText("Name: " + Person.people[index2].getFirstName() + " " + Person.people[index2].getLastName());
        age.setText("Age: " + Person.people[index2].getAge());
        points.setText("Points: " + Person.people[index2].getPoints());
        image.setImageResource(Person.people[index2].getImageResourceID());

    }


}
