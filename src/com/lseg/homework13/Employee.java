package com.lseg.homework13;

public class Employee extends Person {

    private int salary;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.setName(name);
    }

    public int getSalary() {
        return this.salary;
    }

    public void addBonus(int bonus) {
        this.salary = this.salary + bonus;
    }

}
