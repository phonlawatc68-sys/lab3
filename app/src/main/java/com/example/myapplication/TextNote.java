package com.example.myapplication;

public class TextNote extends Note {
    private String message;

    public TextNote(String title, String contentDate, String createdDate, String message) {
        super(title, contentDate, createdDate);
        this.message = message;
    }

    @Override
    public void getSummary() {
        System.out.println("[Text Note] " + getTitle() + ": " + message);
    }
}