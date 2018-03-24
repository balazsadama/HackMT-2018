package com.example.android.alarmapp;

/**
 * Created by Adam on 3/24/2018.
 */

public class Item {
    private String itemName;
    private int duration;


    public Item(String itemName, int duration) {
        this.itemName = itemName;
        this.duration = duration;
    }

    public String getItemName() {
        return itemName;
    }

    public int getDuration() {
        return duration;
    }
}
