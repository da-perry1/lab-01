package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat = new Cat("Loki");
        Dog dog = new Dog("Scooby");
        Scorpion scorpion = new Scorpion("Scorpal");

        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Petable> petablePets = new ArrayList<>();
        petablePets.add(cat);
        petablePets.add(dog);
        //petablePets.add(scorpion);

    }

}