package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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
