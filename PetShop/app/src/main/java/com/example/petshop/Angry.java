package com.example.petshop;

import java.util.Date;

public class Angry extends Mood {

    public Angry(Date date) {
        super(date);
    }


    @Override
    public String emote() {
        return "Angry";
    }
}
