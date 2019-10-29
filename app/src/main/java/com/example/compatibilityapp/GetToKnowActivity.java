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
        TextView text = (TextView) findViewById(R.id.textView15);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void yourQualities(View v)
    {
        EditText myFirstName = (EditText) findViewById(R.id.firstName);
        EditText myLastName = (EditText) findViewById(R.id.lastName);


        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView);
        String min =  "13/12/2019";

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // The SimpleDateFormat parse the string and return a date object.
            // To get the date in long value just call the getTime method of
            // the Date object.
            Date date = formatter.parse(min);
            long dateInLong = date.getTime();
            calendar.setMinDate(dateInLong);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        SimpleDateFormat ss = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = new Date(calendar.getDate());
        String myBirthday= ss.format(date1);




        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);
        String myHoroscope = mySpinner.getSelectedItem().toString();

        String myFirstNameStr = myFirstName.getText().toString();
        String myLastNameStr = myLastName.getText().toString();

        System.out.println(myBirthday);
        System.out.println(myFirstNameStr);

        Intent intent = new Intent(this, YourQualitiesActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("FIRST_NAME",myFirstNameStr);
        bundle.putString("LAST_NAME",myLastNameStr);
        bundle.putString("HOROSCOPE",myHoroscope);
        bundle.putString("BIRTHDAY",myBirthday);
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
