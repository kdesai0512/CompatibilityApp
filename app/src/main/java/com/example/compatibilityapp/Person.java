package com.example.compatibilityapp;

import android.view.View;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Person
{
    private String firstName, lastName, horoscope, gamer1, traveler1, artist1, musician1, homeCook1, writer1, socialInfluencer1, athlete1, rich1, social1, intelligence1, fun1, looks1;
    private int age, feet, inches, rich, social, intelligence, fun, looks, points;
    private boolean gender, gamer, traveler, artist, musician,homeCook, writer, socialInfluencer, athlete;
    private int imageResourceID;

    public Person(String firstName, String lastName, int age, int feet, int inches, boolean gender, String horoscope, int rich, int social, int intelligence,
                    int fun, int looks, boolean gamer, boolean traveler, boolean artist, boolean musician, boolean homeCook, boolean writer, boolean socialInfluencer,
                    boolean athlete, int points, int imageResourceID)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.feet = feet;
        this.inches = inches;
        this.gender = gender;
        this.horoscope = horoscope;
        this.rich = rich;
        this.social = social;
        this.intelligence = intelligence;
        this.fun = fun;
        this.looks = looks;
        this.gamer = gamer;
        this.traveler = traveler;
        this.artist = artist;
        this.musician = musician;
        this.homeCook = homeCook;
        this.writer = writer;
        this.socialInfluencer = socialInfluencer;
        this.athlete = athlete;
        this.points = points;
        this.imageResourceID = imageResourceID;
        gamer1 = "";
        athlete1 = "";
        traveler1 = "";
        artist1 = "";
        musician1 = "";
        homeCook1 = "";
        writer1 = "";
        socialInfluencer1 = "";
        rich1 = "";
        social1 = "";
        intelligence1 = "";
        fun1 = "";
        looks1 = "";
    }

    public static final Person[] people = {
            new Person("Johnny", "Johnny", 21, 5, 6, true, "Pisces", 60, 80, 35, 95, 60, true, false, false, false, true, false, false, false,0, R.drawable.johnny_johnny),
            new Person("Reeeeeeehanna", "Le", 32, 5, 2, false, "Sagittarius", 12, 30, 55, 52, 47, false, false, false, false, false, true, true, false,0, R.drawable.reeeeeeehanna_le),
            new Person("Kiki", "Ded", 69, 5, 5, false, "Taurus", 5, 60, 60, 75, 45, true, true, false, false, false, false, false, false,0, R.drawable.kiki_ded),
            new Person("Smith", "Alejandro", 28, 5, 3, true, "Leo", 30, 55, 10, 30, 77, false, false, false, false, false, false, true, true,0, R.drawable.smith_alejandro),
            new Person("Kerit", "Patel", 86, 5, 2, false, "Gemini", 87, 2, 92, 5, 23, false, true, false, true, false, true, false, false,0, R.drawable.kerit_patel),
            new Person("Adevry", "Detoolk", 18, 4, 11, false, "Gemini", 2, 42, 67, 96, 74, false, false, true, false, false, false, true, false,0, R.drawable.adevry_detoolk),
            new Person("Flowrida", "Mann", 42, 6, 1, true, "Scorpio", 27, 37, 27, 28, 29, false, false, true, false, false, false, false, false,0, R.drawable.flowrida_mann),
            new Person("Ally", "Yen", 24, 7, 5, false, "Capricorn", 99, 1, 65, 87, 2, false, true, false, false, false, false, false, true,0, R.drawable.ally_yen),
            new Person("Pedro", "Caser", 53, 5, 6, true, "Cancer", 55, 78, 13, 36, 99, true, false, false, false, false, false, true, false,0, R.drawable.pedro_caser),
            new Person("Dan", "Doofinshmertz", 36, 6, 0, true, "Aries", 40, 88, 40, 45, 39, false, true, false, true, false, false, false, false,0, R.drawable.dan_doofenshmirtz),
            new Person("E", "Colie", 47, 4, 2, false, "Virgo", 50, 50, 50, 50, 50, false, false, false, false, true, false, false, false,0, R.drawable.e_colie),
            new Person("Haylee", "Norman", 19, 5, 8, false, "Pisces", 40, 68, 50, 20, 10, true, true, false, false, false, false, false, false,0, R.drawable.haylee_norman),
            new Person("Matt", "Nintendo", 55, 6, 9, true, "Aquarius", 76, 90, 33, 83, 57, false, false, false, true, true, false, false, false,0, R.drawable.matt_nintendo),
            new Person("Pew", "Reserch", 34, 5, 10, true, "Libra", 22, 28, 74, 66, 14, false, false, false, false, false, true, false, false,0, R.drawable.pew_reserch),
            new Person("Nick", "Hicks", 26, 5, 11, true, "Capricorn", 31, 73, 43, 85, 24, false, false, false, false, false, true, false, false,0, R.drawable.nick_hicks),
            new Person("Rhys", "Byrne", 45, 6, 4, true, "Libra", 28, 63, 70, 73, 36, false, false, true, false, false, false, false, false,0, R.drawable.rhys_byrne),
            new Person("KVIIIlyn", "Steele", 29, 5, 3, false, "Leo", 59, 30, 53, 43, 54, false, false, false, false, false, false, false, false,0, R.drawable.kviiilyn_steele),
            new Person("Philip", "Dilip", 18, 5, 8, true, "Sagittarius", 10, 30, 13, 95, 34, false, false, false, false, false, false, false, false,0, R.drawable.philip_dilip),
            new Person("Boris", "Eckbert", 61, 6, 2, true, "Taurus", 46, 39, 94, 46, 67, true, false, false, false, false, false, false, false,0, R.drawable.boris_eckbert),
            new Person("Lena", "Vitale", 28, 4, 11, false, "Scorpio", 25, 46, 57, 72, 62, false, false, false, true, false, false, false, true,0, R.drawable.lena_vitale),
            new Person("Taha", "Praveen", 19, 5, 1, false, "Cancer", 63, 71, 1, 84, 58, false, false, false, false, false, false, false, true,0, R.drawable.taha_praveen),
            new Person("Ana", "Hernandez", 18, 5, 9, false, "Cancer", 50, 67, 80, 97, 96, true, true, false, false, false, false, false, false,0, R.drawable.ana_hernandez),
            new Person("Mick", "Bro", 74, 5, 11, true, "Scorpio", 40, 53, 78, 86, 98, false, false, false, true, false, false, true, true,0, R.drawable.mick_bro),
            new Person("Pablo", "Trent", 27, 5, 6, true, "Taurus", 57, 65, 52, 82, 78, true, true, false, false, false, false, false, false,0, R.drawable.pablo_trent),
            new Person("Alex", "Third", 25, 5, 9, true, "Libra", 32, 87, 44, 79, 75, false, false, true, false, false, true, false, false,0, R.drawable.alex_third),
            new Person("Marty", "Gongey", 36, 5, 10, true, "Virgo", 83, 58, 23, 90, 85, true, true, false, false, false, false, false, false,0, R.drawable.marty_gongey),
            new Person("Linda", "George", 57, 5, 7, false, "Pisces", 76, 25, 89, 94, 86, true, false, false, false, false, false, true, true,0, R.drawable.linda_george),
            new Person("Angela", "Corin", 64, 4, 7, false, "Scorpio", 7, 13, 13, 8, 24, false, true, false, true, false, false, false, true,0, R.drawable.angela_corin)
    };

    public static final Person[] females = {new Person("Linda", "George", 57, 5, 7, false, "Pisces", 76, 25, 89, 94, 86, true, false, false, false, false, false, true, true,0, R.drawable.linda_george),
            new Person("Angela", "Corin", 64, 4, 7, false, "Scorpio", 7, 13, 13, 8, 24, false, true, false, true, false, false, false, true,0, R.drawable.angela_corin),
            new Person("Lena", "Vitale", 28, 4, 11, false, "Scorpio", 25, 46, 57, 72, 62, false, false, false, true, false, false, false, true,0, R.drawable.lena_vitale),
            new Person("Taha", "Praveen", 19, 5, 1, false, "Cancer", 63, 71, 1, 84, 58, false, false, false, false, false, false, false, true,0, R.drawable.taha_praveen),
            new Person("Ana", "Hernandez", 18, 5, 9, false, "Cancer", 50, 67, 80, 97, 96, true, true, false, false, false, false, false, false,0, R.drawable.ana_hernandez),
            new Person("KVIIIlyn", "Steele", 29, 5, 3, false, "Leo", 59, 30, 53, 43, 54, false, false, false, false, false, false, false, false,0, R.drawable.kviiilyn_steele),
            new Person("E", "Colie", 47, 4, 2, false, "Virgo", 50, 50, 50, 50, 50, false, false, false, false, true, false, false, false,0, R.drawable.e_colie),
            new Person("Haylee", "Norman", 19, 5, 8, false, "Pisces", 40, 68, 50, 20, 10, true, true, false, false, false, false, false, false,0, R.drawable.haylee_norman),
            new Person("Ally", "Yen", 24, 7, 5, false, "Capricorn", 99, 1, 65, 87, 2, false, true, false, false, false, false, false, true,0, R.drawable.ally_yen),
            new Person("Kerit", "Patel", 86, 5, 2, false, "Gemini", 87, 2, 92, 5, 23, false, true, false, true, false, true, false, false,0, R.drawable.kerit_patel),
            new Person("Adevry", "Detoolk", 18, 4, 11, false, "Gemini", 2, 42, 67, 96, 74, false, false, true, false, false, false, true, false,0, R.drawable.adevry_detoolk),
            new Person("Reeeeeeehanna", "Le", 32, 5, 2, false, "Sagittarius", 12, 30, 55, 52, 47, false, false, false, false, false, true, true, false,0, R.drawable.reeeeeeehanna_le),
            new Person("Kiki", "Ded", 69, 5, 5, false, "Taurus", 5, 60, 60, 75, 45, true, true, false, false, false, false, false, false,0, R.drawable.kiki_ded)};

    public static final Person[] males = {
            new Person("Johnny", "Johnny", 21, 5, 6, true, "Pisces", 60, 80, 35, 95, 60, true, false, false, false, true, false, false, false,0, R.drawable.johnny_johnny),
            new Person("Smith", "Alejandro", 28, 5, 3, true, "Leo", 30, 55, 10, 30, 77, false, false, false, false, false, false, true, true,0, R.drawable.smith_alejandro),
            new Person("Flowrida", "Mann", 42, 6, 1, true, "Scorpio", 27, 37, 27, 28, 29, false, false, true, false, false, false, false, false,0, R.drawable.flowrida_mann),
            new Person("Pedro", "Caser", 53, 5, 6, true, "Cancer", 55, 78, 13, 36, 99, true, false, false, false, false, false, true, false,0, R.drawable.pedro_caser),
            new Person("Dan", "Doofinshmertz", 36, 6, 0, true, "Aries", 40, 88, 40, 45, 39, false, true, false, true, false, false, false, false,0, R.drawable.dan_doofenshmirtz),
            new Person("Matt", "Nintendo", 55, 6, 9, true, "Aquarius", 76, 90, 33, 83, 57, false, false, false, true, true, false, false, false,0, R.drawable.matt_nintendo),
            new Person("Pew", "Reserch", 34, 5, 10, true, "Libra", 22, 28, 74, 66, 14, false, false, false, false, false, true, false, false,0, R.drawable.pew_reserch),
            new Person("Nick", "Hicks", 26, 5, 11, true, "Capricorn", 31, 73, 43, 85, 24, false, false, false, false, false, true, false, false,0, R.drawable.nick_hicks),
            new Person("Rhys", "Byrne", 45, 6, 4, true, "Libra", 28, 63, 70, 73, 36, false, false, true, false, false, false, false, false,0, R.drawable.rhys_byrne),
            new Person("Philip", "Dilip", 18, 5, 8, true, "Sagittarius", 10, 30, 13, 95, 34, false, false, false, false, false, false, false, false,0, R.drawable.philip_dilip),
            new Person("Boris", "Eckbert", 61, 6, 2, true, "Taurus", 46, 39, 94, 46, 67, true, false, false, false, false, false, false, false,0, R.drawable.boris_eckbert),
            new Person("Mick", "Bro", 74, 5, 11, true, "Scorpio", 40, 53, 78, 86, 98, false, false, false, true, false, false, true, true,0, R.drawable.mick_bro),
            new Person("Pablo", "Trent", 27, 5, 6, true, "Taurus", 57, 65, 52, 82, 78, true, true, false, false, false, false, false, false,0, R.drawable.pablo_trent),
            new Person("Alex", "Third", 25, 5, 9, true, "Libra", 32, 87, 44, 79, 75, false, false, true, false, false, true, false, false,0, R.drawable.alex_third),
            new Person("Marty", "Gongey", 36, 5, 10, true, "Virgo", 83, 58, 23, 90, 85, true, true, false, false, false, false, false, false,0, R.drawable.marty_gongey),

    };


    public String percentCompat(int i)
    {
        DecimalFormat df = new DecimalFormat("#.##");

        String str = df.format((((double)Person.people[i].getPoints()/1400)*100));


        return str;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getRich() {
        return rich;
    }

    public void setRich(int rich) {
        this.rich = rich;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getFun() {
        return fun;
    }

    public void setFun(int fun) {
        this.fun = fun;
    }

    public int getLooks() {
        return looks;
    }

    public void setLooks(int looks) {
        this.looks = looks;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGamer() {
        return gamer;
    }

    public void setGamer(boolean gamer) {
        this.gamer = gamer;
    }

    public boolean isTraveler() {
        return traveler;
    }

    public void setTraveler(boolean traveler) {
        this.traveler = traveler;
    }

    public boolean isArtist() {
        return artist;
    }

    public void setArtist(boolean artist) {
        this.artist = artist;
    }

    public boolean isMusician() {
        return musician;
    }

    public void setMusician(boolean musician) {
        this.musician = musician;
    }

    public boolean isHomeCook() {
        return homeCook;
    }

    public void setHomeCook(boolean homeCook) {
        this.homeCook = homeCook;
    }

    public boolean isWriter() {
        return writer;
    }

    public void setWriter(boolean writer) {
        this.writer = writer;
    }

    public boolean isSocialInfluencer() {
        return socialInfluencer;
    }

    public void setSocialInfluencer(boolean socialInfluencer) {
        this.socialInfluencer = socialInfluencer;
    }

    public boolean isAthlete() {
        return athlete;
    }

    public void setAthlete(boolean athlete) {
        this.athlete = athlete;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String description() {
        if (isAthlete()) {
            athlete1 = " Sports is my life and I'm super competitive.";
        }
        if (isArtist()) {
            artist1 = " I love to draw. It calms me down and helps me express my thoughts.";
        }
        if (isGamer()) {
            gamer1 = " I'm probably the best gamer out there and video games take up hours of my weekend.";
        }
        if (isHomeCook()) {
            homeCook1 = " I don't go out to restaurants as much because I prefer cooking my own thing at home!";
        }
        if (isMusician()) {
            musician1 = " Music is a huge aspect of my personality. I love to both play and listen to music everyday.";
        }
        if (isSocialInfluencer()) {
            socialInfluencer1 = " I'm very active on all social media and I am pretty outgoing. Please follow me on insta!";
        }
        if (isTraveler()) {
            traveler1 = " I love to explore the world and go to other countries to learn about their culture.";
        }
        if (isWriter()) {
            writer1 = " I have a really big imagination and I enjoy writing stories with my ideas";
        }
        if (getRich() > 0 && getRich() <= 15)
            rich1 = "not very ";
        else if (getRich() <= 30)
            rich1 = "a little ";
        else if (getRich() <= 60)
            rich1 = "pretty ";
        else if (getRich() > 80)
            rich1 = "very ";
        if (getSocial() > 0 && getSocial() <= 15)
            social1 = "not very ";
        else if (getSocial() <= 30)
            social1 = "a little ";
        else if (getSocial() <= 60)
            social1 = "pretty ";
        else if (getSocial() > 80)
            social1 = "very ";
        if (getFun() > 0 && getFun() <= 15)
            fun1 = "not very ";
        else if (getFun() <= 30)
            fun1 = "a little ";
        else if (getFun() <= 60)
            fun1 = "pretty ";
        else if (getFun() > 80)
            fun1 = "very ";
        if (getIntelligence() > 0 && getIntelligence() <= 15)
            intelligence1 = "not very ";
        else if (getIntelligence() <= 30)
            intelligence1 = "a little ";
        else if (getIntelligence() <= 60)
            intelligence1 = "pretty ";
        else if (getIntelligence() > 80)
            intelligence1 = "very ";
        if (getLooks() > 0 && getLooks() <= 15)
            looks1 = "not very ";
        else if (getLooks() <= 30)
            looks1 = "a little ";
        else if (getLooks() <= 60)
            looks1 = "pretty ";
        else if (getLooks() > 80)
            looks1 = "very ";


        String description = "Hi! I'm " + getFirstName() + " " + getLastName() + ". It turns out we are super compatible so you should get to know me! Here are the basics:"
                + " I am " + getAge() + " years old and I am a " + getHoroscope() + "." + athlete1 + artist1 + gamer1 + homeCook1 + musician1 + socialInfluencer1 + traveler1 + writer1 + " Also, not to brag, but I'm " + rich1 + "rich, " +
                social1 + "social, " + intelligence1 + "intelligent, " + fun1 + "fun, and " + looks1 + "good looking.";

        return description;
    }

    public String description2() {
        if (isAthlete()) {
            athlete1 = " Sports is my life and I'm super competitive.";
        }
        if (isArtist()) {
            artist1 = " I love to draw. It calms me down and helps me express my thoughts.";
        }
        if (isGamer()) {
            gamer1 = " I'm probably the best gamer out there and video games take up hours of my weekend.";
        }
        if (isHomeCook()) {
            homeCook1 = " I don't go out to restaurants as much because I prefer cooking my own thing at home!";
        }
        if (isMusician()) {
            musician1 = " Music is a huge aspect of my personality. I love to both play and listen to music everyday.";
        }
        if (isSocialInfluencer()) {
            socialInfluencer1 = " I'm very active on all social media and I am pretty outgoing. Please follow me on insta!";
        }
        if (isTraveler()) {
            traveler1 = " I love to explore the world and go to other countries to learn about their culture.";
        }
        if (isWriter()) {
            writer1 = " I have a really big imagination and I enjoy writing stories with my ideas";
        }
        if (getRich() > 0 && getRich() <= 15)
            rich1 = "not very ";
        else if (getRich() <= 30)
            rich1 = "a little ";
        else if (getRich() <= 60)
            rich1 = "pretty ";
        else if (getRich() > 80)
            rich1 = "very ";
        if (getSocial() > 0 && getSocial() <= 15)
            social1 = "not very ";
        else if (getSocial() <= 30)
            social1 = "a little ";
        else if (getSocial() <= 60)
            social1 = "pretty ";
        else if (getSocial() > 80)
            social1 = "very ";
        if (getFun() > 0 && getFun() <= 15)
            fun1 = "not very ";
        else if (getFun() <= 30)
            fun1 = "a little ";
        else if (getFun() <= 60)
            fun1 = "pretty ";
        else if (getFun() > 80)
            fun1 = "very ";
        if (getIntelligence() > 0 && getIntelligence() <= 15)
            intelligence1 = "not very ";
        else if (getIntelligence() <= 30)
            intelligence1 = "a little ";
        else if (getIntelligence() <= 60)
            intelligence1 = "pretty ";
        else if (getIntelligence() > 80)
            intelligence1 = "very ";
        if (getLooks() > 0 && getLooks() <= 15)
            looks1 = "not very ";
        else if (getLooks() <= 30)
            looks1 = "a little ";
        else if (getLooks() <= 60)
            looks1 = "pretty ";
        else if (getLooks() > 80)
            looks1 = "very ";


        String description = "Hi! I'm " + getFirstName() + " " + getLastName() + ". It turns out we are not very compatible so here's why! Here are the basics:"
                + " I am " + getAge() + " years old and I am a " + getHoroscope() + "." + athlete1 + artist1 + gamer1 + homeCook1 + musician1 + socialInfluencer1 + traveler1 + writer1 + " Also, not to brag, but I'm " + rich1 + "rich, " +
                social1 + "social, " + intelligence1 + "intelligent, " + fun1 + "fun, and " + looks1 + "good looking.";

        return description;
    }

    public String descriptionRecycler() {
        if (isAthlete()) {
            athlete1 = " Sports is my life and I'm super competitive.";
        }
        if (isArtist()) {
            artist1 = " I love to draw. It calms me down and helps me express my thoughts.";
        }
        if (isGamer()) {
            gamer1 = " I'm probably the best gamer out there and video games take up hours of my weekend.";
        }
        if (isHomeCook()) {
            homeCook1 = " I don't go out to restaurants as much because I prefer cooking my own thing at home!";
        }
        if (isMusician()) {
            musician1 = " Music is a huge aspect of my personality. I love to both play and listen to music everyday.";
        }
        if (isSocialInfluencer()) {
            socialInfluencer1 = " I'm very active on all social media and I am pretty outgoing. Please follow me on insta!";
        }
        if (isTraveler()) {
            traveler1 = " I love to explore the world and go to other countries to learn about their culture.";
        }
        if (isWriter()) {
            writer1 = " I have a really big imagination and I enjoy writing stories with my ideas";
        }
        if (getRich() > 0 && getRich() <= 15)
            rich1 = "not very ";
        else if (getRich() <= 30)
            rich1 = "a little ";
        else if (getRich() <= 60)
            rich1 = "pretty ";
        else if (getRich() > 80)
            rich1 = "very ";
        if (getSocial() > 0 && getSocial() <= 15)
            social1 = "not very ";
        else if (getSocial() <= 30)
            social1 = "a little ";
        else if (getSocial() <= 60)
            social1 = "pretty ";
        else if (getSocial() > 80)
            social1 = "very ";
        if (getFun() > 0 && getFun() <= 15)
            fun1 = "not very ";
        else if (getFun() <= 30)
            fun1 = "a little ";
        else if (getFun() <= 60)
            fun1 = "pretty ";
        else if (getFun() > 80)
            fun1 = "very ";
        if (getIntelligence() > 0 && getIntelligence() <= 15)
            intelligence1 = "not very ";
        else if (getIntelligence() <= 30)
            intelligence1 = "a little ";
        else if (getIntelligence() <= 60)
            intelligence1 = "pretty ";
        else if (getIntelligence() > 80)
            intelligence1 = "very ";
        if (getLooks() > 0 && getLooks() <= 15)
            looks1 = "not very ";
        else if (getLooks() <= 30)
            looks1 = "a little ";
        else if (getLooks() <= 60)
            looks1 = "pretty ";
        else if (getLooks() > 80)
            looks1 = "very ";


        String description = "Hi! I'm " + getFirstName() + ". I am " + getAge() + " years old and I am a " + getHoroscope() + "." + athlete1 + artist1 + gamer1 + homeCook1 + musician1 + socialInfluencer1 + traveler1 + writer1 + " Also, not to brag, but I'm " + rich1 + "rich, " +
                social1 + "social, " + intelligence1 + "intelligent, " + fun1 + "fun, and " + looks1 + "good looking.";

        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }


}