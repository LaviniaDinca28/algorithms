package com.lseg.homework7;

public class Dacia extends Car {

    private int price;
    private String color;

    public Dacia(String steering, int speed, boolean changingGears, int price, String color) {
        super(steering, speed, changingGears);
        this.price = price;
        this.color = color;
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
