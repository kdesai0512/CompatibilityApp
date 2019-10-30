package com.example.compatibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class Profile2Activity extends AppCompatActivity {

    Button button2;
    TextView name, age, points;
    ImageView image;
    double percent;
    int min, index2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        name = (TextView) findViewById(R.id.leastpersonname);
        age = (TextView) findViewById(R.id.leastpersonage);
        points = (TextView) findViewById(R.id.leastpersoncompatibility);
        image = (ImageView) findViewById(R.id.leastpersonpic);

         min = Person.people[0].getPoints();
         index2 = 0;
        for (int i = 1; i < Person.people.length; i++) {
            if (Person.people[i].getPoints() > 0 && Person.people[i].getPoints() < min) {
                min = Person.people[i].getPoints();
                index2 = i;
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        name.setText(Person.people[index2].description2());
         percent = ((Person.people[index2].getPoints())/500);
        Double.toString(percent);
        points.setText(df.format(percent) + "% Compatibility");
        image.setImageResource(Person.people[index2].getImageResourceID());

    }
    public void shareInfo (View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String strToDisplay = "I am " + percent + "% compatible with " + Person.people[index2].getFirstName() + " " + Person.people[index2].getLastName();
        intent.putExtra(Intent.EXTRA_TEXT, strToDisplay);
        String chooserTitle = "Choose an app to send your message";
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }


}
