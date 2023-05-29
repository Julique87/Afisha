package ru.netology.domain;

public class AfishaItem {
    private int id;
    private int movieId;
    private String name;
    private String imageURL;
    private String genre;
    private boolean premiereTomorrow;

    public AfishaItem(int id, int movieId, String name, String imageURL, String genre, boolean premiereTomorrow){
        this.id = id;
        this.movieId = movieId;
        this.name = name;
        this.imageURL = imageURL;
        this.genre = genre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId(){
        return id;
    }

}

