package com.lseg.homework14;


public class Persoane implements Comparable<Persoane> {
    private int age;
    private String name;

    public Persoane(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Persoane pers) {
        int compareByName = this.name.compareTo(pers.name);
        if (compareByName == 0) {
            return Integer.valueOf(this.age).compareTo(pers.age) * (-1);
        }
        return compareByName;
    }

    public String toString(){
        return "Name:  " + name + ", age: " +age;
    }
}
