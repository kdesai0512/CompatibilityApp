package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class ChooseCelebrityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_celebrity);

        final ImageView image = (ImageView) findViewById(R.id.celebimage);
        final Spinner spinner = (Spinner) findViewById(R.id.celebrity);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
               for (int x = 0; x < Celeb.celeb.length; x++) {
                   if (Celeb.celeb[x].getFullName().equals(spinner.getSelectedItem().toString()))
                       image.setImageResource(Celeb.celeb[x].getImageResourceID());
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });
    }

    public void getToKnowCeleb(View v)
    {
        Intent intent = new Intent(this, GetToKnowCelebActivity.class);
        startActivity(intent);

        Spinner spinner = (Spinner) findViewById(R.id.celebrity);
        String celebrity = spinner.getSelectedItem().toString();
        Bundle bundle = new Bundle();
        bundle.putString("CELEBRITY", celebrity);
        intent.putExtras(bundle);
    }
}
