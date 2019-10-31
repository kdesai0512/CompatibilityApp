package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class GetToKnowCelebActivity extends AppCompatActivity {

    String celeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_to_know_celeb);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            celeb = bundle.getString("CELEBRITY");
        }
    }

    public void yourQualitiesCeleb (View v)
    {
            EditText myFirstName = (EditText) findViewById(R.id.firstName);
            EditText myLastName = (EditText) findViewById(R.id.lastName);

            Spinner myBirthYear = (Spinner) findViewById(R.id.year);
            String birthYear = myBirthYear.getSelectedItem().toString();

            Spinner myBirthMonth = (Spinner) findViewById(R.id.month);
            String birthMonth = myBirthMonth.getSelectedItem().toString();

            Spinner myBirthDay = (Spinner) findViewById(R.id.day);
            String birthDay = myBirthDay.getSelectedItem().toString();
            int birthday = Integer.parseInt(birthDay);

            String myFirstNameStr = myFirstName.getText().toString();
            String myLastNameStr = myLastName.getText().toString();

            String myHoroscope = "";

            if (birthMonth.equalsIgnoreCase("December") && birthday > 22)
            {
                myHoroscope = "Capricorn";
            }
            else if (birthMonth.equalsIgnoreCase("January") && birthday <= 20)
            {
                myHoroscope = "Capricorn";
            }
            else if (birthMonth.equalsIgnoreCase("January") && birthday > 20)
            {
                myHoroscope = "Aquarius";
            }
            else if (birthMonth.equalsIgnoreCase("February") && birthday <= 18)
            {
                myHoroscope = "Aquarius";
            }
            else if (birthMonth.equalsIgnoreCase("February") && birthday > 18)
            {
                myHoroscope = "Pisces";
            }
            else if (birthMonth.equalsIgnoreCase("March") && birthday <=20)
            {
                myHoroscope = "Pisces";
            }
            else if (birthMonth.equalsIgnoreCase("March") && birthday > 20)
            {
                myHoroscope = "Aries";
            }
            else if (birthMonth.equalsIgnoreCase("April") && birthday <=20)
            {
                myHoroscope = "Aries";
            }
            else if (birthMonth.equalsIgnoreCase("April") && birthday > 20)
            {
                myHoroscope = "Taurus";
            }
            else if (birthMonth.equalsIgnoreCase("May") && birthday <= 21)
            {
                myHoroscope = "Taurus";
            }
            else if (birthMonth.equalsIgnoreCase("May") && birthday > 21)
            {
                myHoroscope = "Gemini";
            }
            else if (birthMonth.equalsIgnoreCase("June") && birthday <=21)
            {
                myHoroscope = "Gemini";
            }
            else if (birthMonth.equalsIgnoreCase("June") && birthday >21)
            {
                myHoroscope = "Cancer";
            }
            else if (birthMonth.equalsIgnoreCase("July") && birthday <= 23)
            {
                myHoroscope = "Cancer";
            }
            else if (birthMonth.equalsIgnoreCase("July") && birthday > 23)
            {
                myHoroscope = "Leo";
            }
            else if (birthMonth.equalsIgnoreCase("August") && birthday <=23)
            {
                myHoroscope = "Leo";
            }
            else if (birthMonth.equalsIgnoreCase("August") && birthday > 23)
            {
                myHoroscope = "Virgo";
            }
            else if (birthMonth.equalsIgnoreCase("September") && birthday <=23)
            {
                myHoroscope = "Virgo";
            }
            else if (birthMonth.equalsIgnoreCase("September") && birthday > 23)
            {
                myHoroscope = "Libra";
            }
            else if (birthMonth.equalsIgnoreCase("October") && birthday <=23)
            {
                myHoroscope = "Libra";
            }
            else if (birthMonth.equalsIgnoreCase("October") && birthday > 23)
            {
                myHoroscope = "Scorpio";
            }
            else if (birthMonth.equalsIgnoreCase("November") && birthday <=22)
            {
                myHoroscope = "Scorpio";
            }
            else if (birthMonth.equalsIgnoreCase("November") && birthday > 22)
            {
                myHoroscope = "Sagittarius";
            }
            else if (birthMonth.equalsIgnoreCase("December") && birthday <=22)
            {
                myHoroscope = "Sagittarius";
            }
            System.out.println(myFirstNameStr);

            Intent intent = new Intent(this, YourQualitiesCelebActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("FIRST_NAME",myFirstNameStr);
            bundle.putString("LAST_NAME",myLastNameStr);
            bundle.putString("HOROSCOPE",myHoroscope);
            bundle.putString("BIRTHDAY",birthYear);
            bundle.putString("CELEBRITY", celeb);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

