package com.example.myapplication;

public abstract class Note {

    private String title;
    private String contentDate;
    private String createdDate;


    public Note(String title, String contentDate, String createdDate) {
        this.title = title;
        this.contentDate = contentDate;
        this.createdDate = createdDate;
    }


    public String getTitle() {
        return title;
    }


    public abstract void getSummary();
}