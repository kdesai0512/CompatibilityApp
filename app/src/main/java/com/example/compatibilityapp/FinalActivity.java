package com.example.compatibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FinalActivity extends AppCompatActivity {

    public static final String THEIR_GAMER = "false";
    public static final String THEIR_ATHLETE = "false";
    public static final String THEIR_MUSICIAN = "false";
    public static final String THEIR_INFLUENCER = "false";
    public static final String THEIR_ARTIST = "false";
    public static final String THEIR_COOK = "false";
    public static final String THEIR_WRITER = "false";
    public static final String THEIR_TRAVELER = "false";
    public static final String MY_FIRST_NAME = "firstName";
    public static final String MY_LAST_NAME = "lastName";
    public static final String MY_BIRTHDAY = "birthday";
    public static final String MY_HOROSCOPE = "horoscope";
    public static final String RICH_VALUE = "0";
    public static final String SOCIAL_VALUE = "0";
    public static final String INTEL_VALUE = "0";
    public static final String FUN_VALUE = "0";
    public static final String LOOKS_VALUE = "0";
    public static final String THEIR_FEET = "0";
    public static final String THEIR_INCHES = "0";
    public static final String THEIR_MIN = "0";
    public static final String THEIR_MAX = "0";
    public static final String THEIR_GENDER = "male";
    public static final String YOUR_GAMER = "false";
    public static final String YOUR_ATHLETE = "false";
    public static final String YOUR_MUSICIAN = "false";
    public static final String YOUR_INFLUENCER = "false";
    public static final String YOUR_COOK = "false";
    public static final String YOUR_WRITER = "false";
    public static final String YOUR_TRAVELER = "false";
    public static final String YOUR_ARTIST = "false";

    String gamer1, athlete1, cook1, influencer1, musician1, traveler1, writer1, artist1;
    String first_name_str, last_name_str,b_day,horoscope;
    String gamer2, athlete2, musician2, influencer2, cook2, writer2, traveler2, artist2;
    int  rich, social, intel, fun, looks;
    String feet, inch, min, max, gender;
    Button button, button2;
    TextView text, text2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        System.out.println("hello");

        Intent intent = getIntent();
        first_name_str = intent.getStringExtra(MY_FIRST_NAME);
        last_name_str = MY_LAST_NAME;
        b_day = MY_BIRTHDAY;
        horoscope = MY_HOROSCOPE;

       // Intent intent3 = getIntent();
        gamer2 = YourQualitiesActivity.gamer1;
        athlete2 = YourQualitiesActivity.athlete1;
        musician2 = YourQualitiesActivity.musician1;
        influencer2 = YourQualitiesActivity.influencer1;
        cook2 = YourQualitiesActivity.cook1;
        writer2 = YourQualitiesActivity.writer1;
        traveler2 = YourQualitiesActivity.traveler1;
        artist2 = YourQualitiesActivity.artist1;

        Bundle bundle = intent.getExtras();
        if (bundle != null)
        {
            rich = bundle.getInt("RICH_VALUE");
            social = bundle.getInt("SOCIAL_VALUE");
            intel = bundle.getInt("INTEL_VALUE");
            fun = bundle.getInt("FUN_VALUE");
            looks = bundle.getInt("LOOKS_VALUE");
            feet = bundle.getString("FEET");
            inch = bundle.getString("INCHES");
            max = bundle.getString("MAX");
            min = bundle.getString("MIN");
            gender = bundle.getString("GENDER");

            first_name_str = bundle.getString("FIRST_NAME");
            last_name_str = bundle.getString("LAST_NAME");
            b_day = bundle.getString("BIRTHDAY");
            horoscope = bundle.getString("HOROSCOPE");

        }

        /**

        rich = intent.getStringExtra(RICH_VALUE);
        social = intent.getStringExtra(SOCIAL_VALUE);
        intel = intent.getStringExtra(INTEL_VALUE);
        fun = intent.getStringExtra(FUN_VALUE);
        looks = intent.getStringExtra(LOOKS_VALUE);


        feet = THEIR_FEET;
        inch = THEIR_INCHES;
        min = THEIR_MIN;
        max = THEIR_MAX;
        gender = THEIR_GENDER;
**/
        gamer1 = TheirQualitiesActivity.gamer1;
        athlete1 = TheirQualitiesActivity.athlete1;
        musician1 = TheirQualitiesActivity.musician1;
        influencer1 = TheirQualitiesActivity.influencer1;
        cook1 = TheirQualitiesActivity.cook1;
        writer1 = TheirQualitiesActivity.writer1;
        traveler1 = TheirQualitiesActivity.traveler1;
        artist1 = TheirQualitiesActivity.artist1;

        button = (Button)findViewById(R.id.button4);
        text=(TextView)findViewById(R.id.textView6);
        button2 = (Button)findViewById(R.id.button5);
        text2 = (TextView) findViewById(R.id.textView7);

    }
    public void profile(View v) //ignore this for now?? idk the purpose of that last activity
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(ProfileActivity.THEIR_GAMER, THEIR_GAMER);
        intent.putExtra(ProfileActivity.THEIR_TRAVELER, THEIR_TRAVELER);
        intent.putExtra(ProfileActivity.THEIR_MUSICIAN, THEIR_MUSICIAN);
        intent.putExtra(ProfileActivity.THEIR_COOK, THEIR_COOK);
        intent.putExtra(ProfileActivity.THEIR_WRITER, THEIR_WRITER);
        intent.putExtra(ProfileActivity.THEIR_INFLUENCER, THEIR_INFLUENCER);
        intent.putExtra(ProfileActivity.THEIR_ATHLETE, THEIR_ATHLETE);
        intent.putExtra(ProfileActivity.THEIR_ARTIST, THEIR_ARTIST);

        intent.putExtra(ProfileActivity.THEIR_FEET, THEIR_FEET);
        intent.putExtra(ProfileActivity.THEIR_INCHES, THEIR_INCHES);
        intent.putExtra(ProfileActivity.THEIR_MIN, THEIR_MIN);
        intent.putExtra(ProfileActivity.THEIR_MAX, THEIR_MAX);
        intent.putExtra(ProfileActivity.THEIR_GENDER, THEIR_GENDER);


        intent.putExtra(ProfileActivity.RICH_VALUE, RICH_VALUE);
        intent.putExtra(ProfileActivity.SOCIAL_VALUE, SOCIAL_VALUE);
        intent.putExtra(ProfileActivity.INTEL_VALUE, INTEL_VALUE);
        intent.putExtra(ProfileActivity.FUN_VALUE, FUN_VALUE);
        intent.putExtra(ProfileActivity.LOOKS_VALUE, LOOKS_VALUE);

        intent.putExtra(ProfileActivity.YOUR_GAMER, YOUR_GAMER);
        intent.putExtra(ProfileActivity.YOUR_TRAVELER, YOUR_TRAVELER);
        intent.putExtra(ProfileActivity.YOUR_MUSICIAN, YOUR_MUSICIAN);
        intent.putExtra(ProfileActivity.YOUR_COOK, YOUR_COOK);
        intent.putExtra(ProfileActivity.YOUR_WRITER, YOUR_WRITER);
        intent.putExtra(ProfileActivity.YOUR_INFLUENCER, YOUR_INFLUENCER);
        intent.putExtra(ProfileActivity.YOUR_ATHLETE, YOUR_ATHLETE);
        intent.putExtra(ProfileActivity.YOUR_ARTIST, YOUR_ARTIST);
        intent.putExtra(ProfileActivity.MY_FIRST_NAME, MY_FIRST_NAME);
        intent.putExtra(ProfileActivity.MY_LAST_NAME, MY_LAST_NAME);
        intent.putExtra(ProfileActivity.MY_BIRTHDAY, MY_BIRTHDAY);
        intent.putExtra(ProfileActivity.MY_HOROSCOPE, MY_HOROSCOPE);
    }

    public static final Person[] people = {

            new Person("Johnny", "Johnny", 21, 5, 6, true, "Pisces", 60, 80, 35, 95, 60, true, false, false, false, true, false, false, false,0),
            new Person("Reeeeeeehanna", "Le", 32, 5, 2, false, "Sagittarius", 12, 30, 55, 52, 47, false, false, false, false, false, true, true, false,0),
            new Person("Kiki", "Ded", 69, 5, 5, false, "Taurus", 5, 60, 60, 75, 45, true, true, false, false, false, false, false, false,0),
            new Person("Smith", "Alejandro", 28, 5, 3, true, "Leo", 30, 55, 10, 30, 77, false, false, false, false, false, false, true, true,0),
            new Person("Kerit", "Patel", 86, 5, 2, false, "Gemini", 87, 2, 92, 5, 23, false, true, false, true, false, true, false, false,0),
            new Person("Adevry", "Detoolk", 18, 4, 11, false, "Gemini", 2, 42, 67, 96, 74, false, false, true, false, false, false, true, false,0),
            new Person("Flowrida", "Mann", 42, 6, 1, true, "Scorpio", 27, 37, 27, 28, 29, false, false, true, false, false, false, false, false,0),
            new Person("Ally", "Yen", 24, 7, 5, false, "Capricorn", 99, 1, 65, 87, 2, false, true, false, false, false, false, false, true,0),
            new Person("Pedro", "Caser", 53, 5, 6, true, "Cancer", 55, 78, 13, 36, 99, true, false, false, false, false, false, true, false,0),
            new Person("Dan", "Doofinshmertz", 36, 6, 0, true, "Aries", 40, 88, 40, 45, 39, false, true, false, true, false, false, false, false,0),
            new Person("E", "Colie", 47, 4, 2, false, "Virgo", 50, 50, 50, 50, 50, false, false, false, false, true, false, false, false,0),
            new Person("Haylee", "Norman", 19, 5, 8, false, "Pisces", 40, 68, 50, 20, 10, true, true, false, false, false, false, false, false,0),
            new Person("Matt", "Nintendo", 55, 6, 9, true, "Aquarius", 76, 90, 33, 83, 57, false, false, false, true, true, false, false, false,0),
            new Person("Pew", "Reserch", 34, 5, 10, true, "Libra", 22, 28, 74, 66, 14, false, false, false, false, false, true, false, false,0),
            new Person("Nick", "Hicks", 26, 5, 11, true, "Capricorn", 31, 73, 43, 85, 24, false, false, false, false, false, true, false, false,0),
            new Person("Rhys", "Byrne", 45, 6, 4, true, "Libra", 28, 63, 70, 73, 36, false, false, true, false, false, false, false, false,0),
            new Person("KVIIIlyn", "Steele", 29, 5, 3, false, "Leo", 59, 30, 53, 43, 54, false, false, false, false, false, false, false, false,0),
            new Person("Philip", "Dilip", 18, 5, 8, true, "Sagittarius", 10, 30, 13, 95, 34, false, false, false, false, false, false, false, false,0),
            new Person("Boris", "Eckbert", 61, 6, 2, true, "Taurus", 46, 39, 94, 46, 67, true, false, false, false, false, false, false, false,0),
            new Person("Lena", "Vitale", 28, 4, 11, false, "Scorpio", 25, 46, 57, 72, 62, false, false, false, true, false, false, false, true,0),
            new Person("Tena", "Praveen", 19, 5, 1, false, "Cancer", 63, 71, 1, 84, 58, false, false, false, false, false, false, false, true,0),
            new Person("Ana", "Hernandez", 18, 5, 9, false, "Cancer", 50, 67, 80, 97, 96, true, true, false, false, false, false, false, false,0),
            new Person("Mick", "Bro", 74, 5, 11, true, "Scorpio", 40, 53, 78, 86, 98, false, false, false, true, false, false, true, true,0),
            new Person("Pablo", "Trent", 27, 5, 6, true, "Taurus", 57, 65, 52, 82, 78, true, true, false, false, false, false, false, false,0),
            new Person("Alex", "Third", 25, 5, 9, true, "Libra", 32, 87, 44, 79, 75, false, false, true, false, false, true, false, false,0),
            new Person("Marty", "Gongey", 36, 5, 10, true, "Virgo", 83, 58, 23, 90, 85, true, true, false, false, false, false, false, false,0),
            new Person("Linda", "George", 57, 5, 7, false, "Pisces", 76, 25, 89, 94, 86, true, false, false, false, false, false, true, true,0),
            new Person("Angela", "Corin", 64, 4, 7, false, "Scorpio", 7, 13, 13, 8, 24, false, true, false, true, false, false, false, true,0)

    };

    public void calculations(View v)
    {
        //String age = MY_BIRTHDAY.substring(6);
        //int age2 = Integer.parseInt(age);
        /**String rich = RICH_VALUE;
        int rich2 = Integer.parseInt(rich);
        String social = SOCIAL_VALUE;
        int social2 = Integer.parseInt(social);
        String intel = INTEL_VALUE;
        int intel2 = Integer.parseInt(intel);
        String fun = FUN_VALUE;
        int fun2 = Integer.parseInt(fun);
        String looks = LOOKS_VALUE;
        int looks2 = Integer.parseInt(looks);
         **/
        String feet = THEIR_FEET;
        int feet2 =  Integer.parseInt(feet);
        String inches = THEIR_FEET;
        int inches2 =  Integer.parseInt(inches);

        boolean your_gamer2 = false;
        boolean your_traveler2 = false;
        boolean your_artist2 = false;
        boolean your_musician2 = false;
        boolean your_cook2 = false;
        boolean your_influencer = false;
        boolean your_writer2 = false;
        boolean your_athlete2 = false;
        boolean their_gender2 = false;

        if(gamer2.equalsIgnoreCase("true"))
            your_gamer2 = true;
        else
            your_gamer2 = false;

        if(traveler2.equalsIgnoreCase("true"))
            your_traveler2 = true;
        else
            your_traveler2 = false;

        if(artist2.equalsIgnoreCase("true"))
            your_artist2 = true;
        else
            your_artist2 = false;

        if(musician2.equalsIgnoreCase("true"))
            your_musician2 = true;
        else
            your_musician2 = false;

        if(cook2.equalsIgnoreCase("true"))
            your_cook2 = true;
        else
            your_cook2 = false;

        if(influencer2.equalsIgnoreCase("true"))
            your_influencer = true;
        else
            your_influencer = false;

        if(writer2.equalsIgnoreCase("true"))
            your_writer2 = true;
        else
            your_writer2 = false;

        if(athlete2.equalsIgnoreCase("true"))
            your_athlete2 = true;
        else
            your_athlete2 = false;

        if(gender.equals("male"))
            their_gender2 = true;
        else
            their_gender2 = false;




        new Person(first_name_str, last_name_str,0,feet2, inches2, their_gender2, horoscope, rich, social, intel, fun, looks, your_gamer2,your_traveler2,your_artist2,your_musician2,
                your_cook2,your_writer2,your_influencer,your_athlete2, 0);

       for (int i = 0; i < people.length; i++)
       {
          // if(Math.abs(people[i].getAge() - age2) <=15)
           {
               if (people[i].getFeet() >= feet2 && people[i].getInches() >= inches2)
               {
                   //if(people[i].isGender() == their_gender2)
                   {
                       if(people[i].getHoroscope().equalsIgnoreCase(horoscope))
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isGamer() == your_gamer2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isTraveler() == your_traveler2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isArtist() == your_artist2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isMusician() == your_musician2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isHomeCook() == your_cook2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isWriter() == your_writer2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isSocialInfluencer() == your_influencer)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }
                       if(people[i].isAthlete() == your_athlete2)
                       {
                           people[i].setPoints(people[i].getPoints() + 1);
                       }

                       people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getRich() - rich)));
                       people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getSocial() - social)));
                       people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getIntelligence() - intel)));
                       people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getFun() - fun)));
                       people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getLooks() - looks)));
                   }




               }


           }
       }
        int max = 0;
        int index = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getPoints() > max) {
                max = people[i].getPoints();
                index = i;
            }
        }


        text.setText(people[index].toString());


    }

    public void calculations2(View v)
    {
        String feet = THEIR_FEET;
        int feet2 =  Integer.parseInt(feet);
        String inches = THEIR_FEET;
        int inches2 =  Integer.parseInt(inches);

        boolean your_gamer2 = false;
        boolean your_traveler2 = false;
        boolean your_artist2 = false;
        boolean your_musician2 = false;
        boolean your_cook2 = false;
        boolean your_influencer = false;
        boolean your_writer2 = false;
        boolean your_athlete2 = false;
        boolean their_gender2 = false;

        if(gamer2.equalsIgnoreCase("true"))
            your_gamer2 = true;
        else
            your_gamer2 = false;

        if(traveler2.equalsIgnoreCase("true"))
            your_traveler2 = true;
        else
            your_traveler2 = false;

        if(artist2.equalsIgnoreCase("true"))
            your_artist2 = true;
        else
            your_artist2 = false;

        if(musician2.equalsIgnoreCase("true"))
            your_musician2 = true;
        else
            your_musician2 = false;

        if(cook2.equalsIgnoreCase("true"))
            your_cook2 = true;
        else
            your_cook2 = false;

        if(influencer2.equalsIgnoreCase("true"))
            your_influencer = true;
        else
            your_influencer = false;

        if(writer2.equalsIgnoreCase("true"))
            your_writer2 = true;
        else
            your_writer2 = false;

        if(athlete2.equalsIgnoreCase("true"))
            your_athlete2 = true;
        else
            your_athlete2 = false;

        if(gender.equals("male"))
            their_gender2 = true;
        else
            their_gender2 = false;




        new Person(first_name_str, last_name_str,0,feet2, inches2, their_gender2, horoscope, rich, social, intel, fun, looks, your_gamer2,your_traveler2,your_artist2,your_musician2,
                your_cook2,your_writer2,your_influencer,your_athlete2, 0);

        for (int i = 0; i < people.length; i++)
        {
            // if(Math.abs(people[i].getAge() - age2) <=15)
            {
                if (people[i].getFeet() >= feet2 && people[i].getInches() >= inches2)
                {
                    //if(people[i].isGender() == their_gender2)
                    {
                        if(people[i].getHoroscope().equalsIgnoreCase(horoscope))
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isGamer() == your_gamer2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isTraveler() == your_traveler2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isArtist() == your_artist2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isMusician() == your_musician2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isHomeCook() == your_cook2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isWriter() == your_writer2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isSocialInfluencer() == your_influencer)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }
                        if(people[i].isAthlete() == your_athlete2)
                        {
                            people[i].setPoints(people[i].getPoints() + 1);
                        }

                        people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getRich() - rich)));
                        people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getSocial() - social)));
                        people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getIntelligence() - intel)));
                        people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getFun() - fun)));
                        people[i].setPoints((people[i].getPoints() + Math.abs(people[i].getLooks() - looks)));
                    }




                }


            }
        }

        int min = people[0].getPoints();
        int index2 = 0;
        for (int i = 1; i < people.length; i++) {
            if (people[i].getPoints() > 0 && people[i].getPoints() < min) {
                min = people[i].getPoints();
                index2 = i;
            }
        }


        text2.setText(people[index2].toString());


    }

}
