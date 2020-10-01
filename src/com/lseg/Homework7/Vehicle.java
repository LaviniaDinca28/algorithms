package com.lseg.Homework7;

public class Vehicle {

    private String steering;
    private int speed;

    public Vehicle(String steering, int speed) {
        super();
        this.steering = steering;
        this.speed = speed;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
