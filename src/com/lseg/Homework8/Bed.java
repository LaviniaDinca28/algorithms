package com.lseg.Homework8;

public class Bed {

    private double length;
    private double width;
    private String bedSheetsColor;
    private String type;

    public Bed(double length, double width, String bedSheetsColor, String type) {
        this.length = length;
        this.width = width;
        this.bedSheetsColor = bedSheetsColor;
        this.type = type;
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
}
