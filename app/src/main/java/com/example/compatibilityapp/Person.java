package com.example.compatibilityapp;

public class Person
{
    private String firstName, lastName, horoscope;
    private int age, feet, inches, rich, social, intelligence, fun, looks;
    private boolean gender, gamer, traveler, artist, musician,homeCook, writer, socialInfluencer, athlete;

    public Person(String firstName, String lastName, int age, int feet, int inches, boolean gender, String horoscope, int rich, int social, int intelligence,
                    int fun, int looks, boolean gamer, boolean traveler, boolean artist, boolean musician, boolean homeCook, boolean writer, boolean socialInfluencer,
                    boolean athlete)
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
}