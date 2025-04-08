package com.creativehabit.creativehabits;

public class Student {
    String name = " ";
    double gpa = 0;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setName(String name){
        this.name = name;
    }


    public double getGpa(){
        return gpa;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "Name: " + name + " GPA: " + gpa;
    }
}
