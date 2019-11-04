package com.example.compatibilityapp;

public class Celeb {

    private String firstName, lastName, horoscope, gamer1, traveler1, artist1, musician1, homeCook1, writer1, socialInfluencer1, athlete1, rich1, social1, intelligence1, fun1, looks1, description;
    private int age, feet, inches, rich, social, intelligence, fun, looks, points;
    private boolean gender, gamer, traveler, artist, musician,homeCook, writer, socialInfluencer, athlete;
    private int imageResourceID;

    public Celeb (String firstName, String lastName, int age, int feet, int inches, boolean gender, String horoscope, int rich, int social, int intelligence,
                  int fun, int looks, boolean gamer, boolean traveler, boolean artist, boolean musician, boolean homeCook, boolean writer, boolean socialInfluencer,
                  boolean athlete, int points, int imageResourceID, String description) {
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
        this.description = description;

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

    public static final Celeb[] celeb = {
            new Celeb("Alex", "Trebek", 79, 5, 8, true, "Cancer", 99, 70, 99, 80, 60, false, true, false, true, false, false, false, true,0, R.drawable.alex_trebek, ""),
            new Celeb("Beyonce", "Knowles-Carter", 38, 5, 7, false, "Virgo", 100, 100, 100, 100, 100, false, true, false, true, true, false, true, false, 0, R.drawable.beyonce, ""),
            new Celeb("Elon", "Musk", 48, 6, 2, true, "Cancer", 100, 80, 100, 80, 75, true, true, false, false, false, false, true, false,0, R.drawable.elon_musk, ""),
            new Celeb("Barack", "Obama", 58, 6, 1, true, "Leo", 100, 95, 100, 85, 80, false, true, false, false, true, false, false, false, 0 , R.drawable.barack_obama, ""),
            new Celeb("Kim", "Kardashian", 39, 5, 3, false, "Libra", 100, 100, 57, 100, 100, false, false, false, false, false, false, true, false, 0, R.drawable.kim_kardashian, ""),
            new Celeb("Bob", "Ross", 53, 6, 2, true, "Scorpio", 65, 45, 98, 100, 55, false, true, true, false, false, false, false, false, 0, R.drawable.bob_ross, ""),
            new Celeb("Jennifer", "Lopez", 50, 5, 5, false, "Leo", 100, 100, 85, 100, 98, false, true, false, true, true, false, true, false, 0, R.drawable.jennifer_lopez, ""),
            new Celeb("Harry", "Styles", 25, 6, 0, true, "Aquarius", 100, 87, 79, 94, 99, false, true, false, true, false, false, true, false, 0, R.drawable.harry_styles, ""),
            new Celeb("Emma", "Watson", 29, 5, 5, false, "Aries", 100, 96, 100, 93, 100, false, true, false, false, true, true, true, false, 0, R.drawable.emma_watson, ""),
            new Celeb("Cardi","B", 27, 5, 3, false, "Libra", 100, 100, 53, 100, 84, false, true, false, true, true, false, true, false, 0, R.drawable.cardi_b, "")

    };

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

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public String getGamer1() {
        return gamer1;
    }

    public void setGamer1(String gamer1) {
        this.gamer1 = gamer1;
    }

    public String getTraveler1() {
        return traveler1;
    }

    public void setTraveler1(String traveler1) {
        this.traveler1 = traveler1;
    }

    public String getArtist1() {
        return artist1;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void setArtist1(String artist1) {
        this.artist1 = artist1;
    }

    public String getMusician1() {
        return musician1;
    }

    public void setMusician1(String musician1) {
        this.musician1 = musician1;
    }

    public String getHomeCook1() {
        return homeCook1;
    }

    public void setHomeCook1(String homeCook1) {
        this.homeCook1 = homeCook1;
    }

    public String getWriter1() {
        return writer1;
    }

    public void setWriter1(String writer1) {
        this.writer1 = writer1;
    }

    public String getSocialInfluencer1() {
        return socialInfluencer1;
    }

    public void setSocialInfluencer1(String socialInfluencer1) {
        this.socialInfluencer1 = socialInfluencer1;
    }

    public String getAthlete1() {
        return athlete1;
    }

    public void setAthlete1(String athlete1) {
        this.athlete1 = athlete1;
    }

    public String getRich1() {
        return rich1;
    }

    public void setRich1(String rich1) {
        this.rich1 = rich1;
    }

    public String getSocial1() {
        return social1;
    }

    public void setSocial1(String social1) {
        this.social1 = social1;
    }

    public String getIntelligence1() {
        return intelligence1;
    }

    public void setIntelligence1(String intelligence1) {
        this.intelligence1 = intelligence1;
    }

    public String getFun1() {
        return fun1;
    }

    public void setFun1(String fun1) {
        this.fun1 = fun1;
    }

    public String getLooks1() {
        return looks1;
    }

    public void setLooks1(String looks1) {
        this.looks1 = looks1;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
