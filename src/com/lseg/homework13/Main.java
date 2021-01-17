package com.lseg.homework13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Employee employee1 = new Employee(3000, "Stevie Bubble");
        Employee employee2 = new Employee(20, "Jose");
        Employee employee3 = new Employee(565, "Luana");
        Employee employee4 = new Employee(8896, "ABCD");
        Employee employee5 = new Employee(100000, "EI");
        Student student1 = new Student(10, "Bastien");
        Student student2 = new Student(9, "Lavi");
        Student student3 = new Student(8, "Juan");
        Student student4 = new Student(7, "Andreea");
        Student student5 = new Student(2, "ABCDE");

        persons.add(employee1);
        persons.add(employee2);
        persons.add(employee3);
        persons.add(employee4);
        persons.add(employee5);
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);
        persons.add(student5);

        printName(persons);

        isThereStevie(persons);

        addBonus(persons);
    }

    static void printName(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }

    static void isThereStevie(List<Person> personList) {
        boolean isStevie = false;
        for (Person person : personList) {
            if (person.getName().equals("Stevie Bubble")) {
                isStevie = true;
            }
        }
        if (isStevie == true) {
            System.out.println("Stevie is there");
        } else {
            System.out.println("Stevie is not there");
        }
    }

    static void addBonus(List<Person> personList) {
        for (Person person : personList) {
            if (person instanceof Employee) {
                ((Employee) person).addBonus(200);
                System.out.println(((Employee) person).getSalary());
            }
        }
    }

}
