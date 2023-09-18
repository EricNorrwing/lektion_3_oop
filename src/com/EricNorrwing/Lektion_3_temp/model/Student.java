package com.EricNorrwing.Lektion_3_temp.model;

public class Student {

    public String name;
    public int age;
    public int birthYear;


    public Student(int age, String name, int birthYear) {
        this.age = age;
        this.name = name;
        this.birthYear = birthYear;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + birthYear;
    }



}
