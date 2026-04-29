package com.example.myapplication;

import java.util.List;

public class CheckListNote extends Note {
    private List<String> items;


    public CheckListNote(String title, String contentDate, String createdDate, List<String> items) {
        super(title, contentDate, createdDate);
        this.items = items;
    }

    @Override
    public void getSummary() {

        System.out.println("[Checklist] " + getTitle() + " has " + items.size() + " items.");
    }
}