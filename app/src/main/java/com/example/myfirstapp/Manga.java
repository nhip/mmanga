package com.example.myfirstapp;

/**
 * Created by nhi on 2017-10-13.
 */

public class Manga {

    private double rating;
    private String author;
    private String title;
    private String description;
    private int imageResourceId;

    public Manga(String title, String author, String description, double rating) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.rating = rating;
    }

    public Manga(String title, String author, String description, double rating, int imageResource) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.rating = rating;
        this.imageResourceId = imageResource;
    }

    public double getRating() {
        return rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
