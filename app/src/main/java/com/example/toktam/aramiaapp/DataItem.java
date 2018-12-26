package com.example.toktam.aramiaapp;

import android.graphics.drawable.Drawable;

public class DataItem {
    private int id;
    private Drawable image;
    private String title;

/****************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/***************************/
    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
/*********************/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

/******************/
}
