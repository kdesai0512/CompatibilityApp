package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PeopleActivity extends AppCompatActivity {

    RecyclerView rv;

    Integer[] drawableArray = {R.drawable.adevry_detoolk, R.drawable.alex_third, R.drawable.ally_yen,
            R.drawable.ana_hernandez, R.drawable.angela_corin,R.drawable.boris_eckbert, R.drawable.dan_doofenshmirtz, R.drawable.e_colie,
            R.drawable.estefania_vargas, R.drawable.flowrida_mann,  R.drawable.haylee_norman,  R.drawable.johnny_johnny,  R.drawable.kerit_patel,
            R.drawable.kiki_ded, R.drawable.kviiilyn_steele,  R.drawable.lena_vitale,  R.drawable.linda_george, R.drawable.marty_gongey,
            R.drawable.matt_nintendo,  R.drawable.mick_bro,  R.drawable.nick_hicks,  R.drawable.pablo_trent, R.drawable.pedro_caser,
            R.drawable.pew_reserch,  R.drawable.philip_dilip,  R.drawable.reeeeeeehanna_le,  R.drawable.rhys_byrne,  R.drawable.smith_alejandro,
            R.drawable.taha_praveen};
    String[] titleArray = {Person.people[0].getFirstName(), Person.people[1].getFirstName(), Person.people[2].getFirstName(),
            Person.people[3].getFirstName(), Person.people[4].getFirstName(), Person.people[5].getFirstName(), Person.people[6].getFirstName(),
            Person.people[7].getFirstName(), Person.people[8].getFirstName(), Person.people[9].getFirstName(), Person.people[10].getFirstName(),
            Person.people[11].getFirstName(), Person.people[12].getFirstName(), Person.people[13].getFirstName(), Person.people[14].getFirstName(),
            Person.people[15].getFirstName(), Person.people[16].getFirstName(), Person.people[17].getFirstName(), Person.people[18].getFirstName(),
            Person.people[19].getFirstName(), Person.people[20].getFirstName(), Person.people[21].getFirstName(), Person.people[22].getFirstName(),
            Person.people[23].getFirstName(), Person.people[24].getFirstName(), Person.people[25].getFirstName(), Person.people[26].getFirstName(),
            Person.people[27].getFirstName()};

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
