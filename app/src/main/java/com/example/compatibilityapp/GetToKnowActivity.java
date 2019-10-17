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
        SimpleDateFormat ss = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(calendar.getDate());
        String myBirthday= ss.format(date);
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner2);
        String myHoroscope = mySpinner.getSelectedItem().toString();

        String myFirstNameStr = myFirstName.getText().toString();
        String myLastNameStr = myLastName.getText().toString();

        Intent intent = new Intent(this, YourQualitiesActivity.class);
        intent.putExtra(YourQualitiesActivity.MY_FIRST_NAME, myFirstNameStr);
        intent.putExtra(YourQualitiesActivity.MY_LAST_NAME, myLastNameStr);
        intent.putExtra(YourQualitiesActivity.MY_BIRTHDAY, myBirthday);
        intent.putExtra(YourQualitiesActivity.MY_HOROSCOPE, myHoroscope);
        startActivity(intent);
    }
}
