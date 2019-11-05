package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.text.DecimalFormat;

public class PeopleActivity extends AppCompatActivity {

    RecyclerView rv;

    Integer[] drawableArray = {R.drawable.johnny_johnny, R.drawable.reeeeeeehanna_le, R.drawable.kiki_ded,
            R.drawable.smith_alejandro, R.drawable.kerit_patel,R.drawable.adevry_detoolk, R.drawable.flowrida_mann, R.drawable.ally_yen,
            R.drawable.pedro_caser, R.drawable.dan_doofenshmirtz,  R.drawable.e_colie,  R.drawable.haylee_norman,  R.drawable.matt_nintendo,
            R.drawable.pew_reserch, R.drawable.nick_hicks,  R.drawable.rhys_byrne,  R.drawable.kviiilyn_steele, R.drawable.philip_dilip,
            R.drawable.boris_eckbert,  R.drawable.lena_vitale,  R.drawable.taha_praveen,  R.drawable.ana_hernandez, R.drawable.mick_bro,
            R.drawable.pablo_trent,  R.drawable.alex_third,  R.drawable.marty_gongey,  R.drawable.linda_george,  R.drawable.angela_corin};
    String[] titleArray = {Person.people[0].getFirstName(), Person.people[1].getFirstName(), Person.people[2].getFirstName(),
            Person.people[3].getFirstName(), Person.people[4].getFirstName(), Person.people[5].getFirstName(), Person.people[6].getFirstName(),
            Person.people[7].getFirstName(), Person.people[8].getFirstName(), Person.people[9].getFirstName(), Person.people[10].getFirstName(),
            Person.people[11].getFirstName(), Person.people[12].getFirstName(), Person.people[13].getFirstName(), Person.people[14].getFirstName(),
            Person.people[15].getFirstName(), Person.people[16].getFirstName(), Person.people[17].getFirstName(), Person.people[18].getFirstName(),
            Person.people[19].getFirstName(), Person.people[20].getFirstName(), Person.people[21].getFirstName(), Person.people[22].getFirstName(),
            Person.people[23].getFirstName(), Person.people[24].getFirstName(), Person.people[25].getFirstName(), Person.people[26].getFirstName(),
            Person.people[27].getFirstName()};
    String[] title2Array = {Person.people[0].getLastName(), Person.people[1].getLastName(), Person.people[2].getLastName(),
            Person.people[3].getLastName(), Person.people[4].getLastName(), Person.people[5].getLastName(), Person.people[6].getLastName(),
            Person.people[7].getLastName(), Person.people[8].getLastName(), Person.people[9].getLastName(), Person.people[10].getLastName(),
            Person.people[11].getLastName(), Person.people[12].getLastName(), Person.people[13].getLastName(), Person.people[14].getLastName(),
            Person.people[15].getLastName(), Person.people[16].getLastName(), Person.people[17].getLastName(), Person.people[18].getLastName(),
            Person.people[19].getLastName(), Person.people[20].getLastName(), Person.people[21].getLastName(), Person.people[22].getLastName(),
            Person.people[23].getLastName(), Person.people[24].getLastName(), Person.people[25].getLastName(), Person.people[26].getLastName(),
            Person.people[27].getLastName()};

    double[] percents = {Person.people[0].percentCompat(0), Person.people[1].percentCompat(1), Person.people[2].percentCompat(2),
            Person.people[3].percentCompat(3), Person.people[4].percentCompat(4), Person.people[5].percentCompat(5), Person.people[6].percentCompat(6),
            Person.people[7].percentCompat(7), Person.people[8].percentCompat(8), Person.people[9].percentCompat(9), Person.people[10].percentCompat(10),
            Person.people[11].percentCompat(11), Person.people[12].percentCompat(12), Person.people[13].percentCompat(13), Person.people[14].percentCompat(14),
            Person.people[15].percentCompat(15), Person.people[16].percentCompat(16), Person.people[17].percentCompat(17), Person.people[18].percentCompat(18),
            Person.people[19].percentCompat(19), Person.people[20].percentCompat(20), Person.people[21].percentCompat(21), Person.people[22].percentCompat(22),
            Person.people[23].percentCompat(23), Person.people[24].percentCompat(24), Person.people[25].percentCompat(25), Person.people[26].percentCompat(26),
            Person.people[27].percentCompat(27)};

    CustomAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        rv = (RecyclerView)findViewById(R.id.rv);
        ad = new CustomAdapter(PeopleActivity.this,drawableArray,titleArray);
        rv.setAdapter(ad);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);





    }





}
