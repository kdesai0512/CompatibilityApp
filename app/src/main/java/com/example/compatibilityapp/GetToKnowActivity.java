package com.example.compatibilityapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetToKnowActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_to_know);
       // TextView text = (TextView) findViewById(R.id.textView15);
       // text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void yourQualities(View v)
    {
        EditText myFirstName = (EditText) findViewById(R.id.firstName);
        EditText myLastName = (EditText) findViewById(R.id.lastName);


        //CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        /**
        String min =  "13/12/2019";

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // The SimpleDateFormat parse the string and return a date object.
            // To get the date in long value just call the getTime method of
            // the Date object.
            Date date = formatter.parse(min);
            long dateInLong = date.getTime();
            //calendar.setMinDate(dateInLong);
        } catch (ParseException e) {
            e.printStackTrace();
        }

**/
       // SimpleDateFormat ss = new SimpleDateFormat("dd-MM-yyyy");
       // Date date1 = new Date(calendar.getDate());
       // String myBirthday= ss.format(date1);




        //Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);
       // String myHoroscope = mySpinner.getSelectedItem().toString();

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

       // System.out.println(myBirthday);
        System.out.println(myFirstNameStr);

        Intent intent = new Intent(this, YourQualitiesActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("FIRST_NAME",myFirstNameStr);
        bundle.putString("LAST_NAME",myLastNameStr);
        bundle.putString("HOROSCOPE",myHoroscope);
        bundle.putString("BIRTHDAY",birthYear);
        intent.putExtras(bundle);
        /**
        intent.putExtra(YourQualitiesActivity.MY_FIRST_NAME, myFirstNameStr);
        intent.putExtra(YourQualitiesActivity.MY_LAST_NAME, myLastNameStr);
        intent.putExtra(YourQualitiesActivity.MY_BIRTHDAY, myBirthday);
        intent.putExtra(YourQualitiesActivity.MY_HOROSCOPE, myHoroscope);
**/
        startActivity(intent);
    }
}
