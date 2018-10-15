package com.example.administrator.flexplayer;

import android.util.Log;

public class Car {
    private String name;
    private int price;
    private String color;

    public Car(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void printCar(){
        Log.e("Car", this.name+" - " + this.color+ " - " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
