package com.lseg.homework6;

public class Point {
    private int x;
    private int y;

    //constructor1
    public Point(){
    }

    //constructor2
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){ return x;}

    public void setY(int y){
        this.y = y;
    }

    public int getY(){ return y;}

    public double distance(){
        int d1 = this.x;
        int d2 = this.y;

        return Math.sqrt(d1 * d1 + d2 * d2);
    }

    public double distance(Point another){
        int d1 = this.x - another.x;
        int d2 = this.y - another.y;

        return Math.sqrt(d1 * d1 + d2 * d2);
    }



}
