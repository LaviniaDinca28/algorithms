package com.lseg.homework13;

public class Student extends Person{

    private int grade;

    public Student (int grade, String name){
        this.grade = grade;
        this.setName(name);
    }
}
