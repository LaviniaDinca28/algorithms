package com.lseg.Homework7;

public class Car extends Vehicle {

    private boolean changingGears;

    public Car(String steering, int speed, boolean changingGears) {
        super(steering, speed);
        this.changingGears = changingGears;
    }

    public boolean isChangingGears() {
        return changingGears;
    }

    public void setChangingGears(boolean changingGears) {
        this.changingGears = changingGears;
    }
}
