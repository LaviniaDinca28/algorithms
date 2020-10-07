package com.lseg.Homework8;

public class Wardrobe {

    private double length;
    private double width;
    private String color;
    private String material;
    private int doors;

    public Wardrobe(double length, double width, String color, String material, int doors) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.material = material;
        this.doors = doors;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
