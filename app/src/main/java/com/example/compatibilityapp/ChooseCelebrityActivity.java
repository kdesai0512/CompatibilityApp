package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseCelebrityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_celebrity);
    }

    public void getToKnowCeleb(View v)
    {
        Intent intent = new Intent(this, GetToKnowCelebActivity.class);
        startActivity(intent);
    }
}
