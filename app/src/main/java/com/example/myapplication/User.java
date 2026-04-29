package com.example.myapplication;

public class User {
    private String Name;
    private String gender;
    private String gmail;

    // --- เพิ่มโค้ดส่วนนี้ ---
    public User(String Name, String gender, String gmail) {
        this.Name = Name;
        this.gender = gender;
        this.gmail = gmail;
    }
    // -----------------------

    public String getName() { return Name; }
    public String getgmail() { return gmail; }
}