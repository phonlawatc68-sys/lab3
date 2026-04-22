package com.example.myapplication;

public class Note {
    //Attribute
    String title;
    String content;
    String createdDete;

    //Method
    void getSummary(){
        System.out.println(this.title);
        System.out.println(this.content+" "+this.createdDete);
    }


}
