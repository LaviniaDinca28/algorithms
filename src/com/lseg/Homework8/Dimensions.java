package com.lseg.Homework8;

public class Dimensions {

    private int metersSquare;
    private int doors;
    private String color;

    public Dimensions(int metersSquare, int doors, String color) {
        this.metersSquare = metersSquare;
        this.doors = doors;
        this.color = color;
    }

    public int getMetersSquare() {
        return metersSquare;
    }

    public void setMetersSquare(int metersSquare) {
        this.metersSquare = metersSquare;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
