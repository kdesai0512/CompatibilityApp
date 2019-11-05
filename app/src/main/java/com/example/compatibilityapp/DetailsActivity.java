package com.example.compatibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    ImageView image;
    TextView title;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();


        final int image2=intent.getExtras().getInt("img");
        final String title2=intent.getExtras().getString("title");

        image= (ImageView) findViewById(R.id.imgDetail);
        title= (TextView) findViewById(R.id.titleDetail);

        image.setImageResource(image2);
        title.setText(title2);

    }


}
