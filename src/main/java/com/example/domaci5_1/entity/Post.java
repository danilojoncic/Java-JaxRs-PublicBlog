package com.example.domaci5_1.entity;

import java.util.Date;
import java.util.List;

public class Post {
    private String author;
    private String text;
    private String title;
    private int id;
    //idealno bi bilo da je long ali bolje i ovako neko Date
    private String date;

    public Post() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
