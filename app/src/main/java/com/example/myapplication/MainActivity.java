package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        User user1 = new User("Your Name", "Male", "test@gmail.com");


        TextNote note1 = new TextNote("lab1", "22/04/2023", "22/04/2023", "รายละเอียดโน้ต...");
        note1.getSummary(); // แสดงผลลัพธ์ผ่าน Polymorphism


        CheckListNote note2 = new CheckListNote("Shopping List", "29/04/2026", "29/04/2026", Arrays.asList("Milk", "Egg"));
        note2.getSummary();

    }
}