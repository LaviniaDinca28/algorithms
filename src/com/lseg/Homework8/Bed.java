package com.lseg.Homework8;

public class Bed {

    private double length;
    private double width;
    private String bedSheetsColor;
    private String type;
    private boolean pillows;

    public Bed(double length, double width, String fabric, String type, boolean pillows) {
        this.length = length;
        this.width = width;
        this.bedSheetsColor = fabric;
        this.type = type;
        this.pillows = pillows;
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

    public String getBedSheetsColor() {
        return bedSheetsColor;
    }

    public void setBedSheetsColor(String bedSheetsColor) {
        this.bedSheetsColor = bedSheetsColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPillows() {
        return pillows;
    }

    public void setPillows(boolean pillows) {
        this.pillows = pillows;
    }
}
