package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

/**
 * http://technxt.net/android-cardview-with-recyclerview-in-android-cardview-android/
 * https://camposha.info/android-recyclerview-master-detail-open-new-activitypass-data/
 * https://www.youtube.com/watch?v=jO0RkS-Ag3A
 * https://rcptones.com/dev_tones/#tab-id-9
 * https://www.techotopia.com/index.php/An_Android_RecyclerView_and_CardView_Tutorial
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getToKnow(View v) {
        Switch sw = (Switch) findViewById(R.id.switch1);
        Intent intent = new Intent(this, GetToKnowActivity.class);

        if (!sw.isChecked()) {
            Context context = getApplicationContext();
            CharSequence text = "Please agree terms and conditions";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            startActivity(intent);
        }
    }

    public void chooseCelebrity (View v)
    {
        Intent intent = new Intent(this, ChooseCelebrityActivity.class);
        Switch sw = (Switch) findViewById(R.id.switch1);
        if (!sw.isChecked()) {
            Context context = getApplicationContext();
            CharSequence text = "Please agree terms and conditions";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else {
            startActivity(intent);
            
        }

    }

}
