package com.creativehabit.creativehabits;

public class Student {

    String name = " ";
    double gpa = 0;

    /**
     * Constructor for creating a student object.
     * @param name Name of the student.
     * @param gpa Students gpa.
     */
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    /**
     * Sets the gpa of the student object.
     * @param gpa Gpa of the student.
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Sets the name of the student object.
     * @param name Name of the student.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Gets gpa of a student object.
     * @return Gpa of the student.
     */
    public double getGpa(){
        return gpa;
    }

    /**
     * Gets the name of a student object.
     * @return Name of the student.
     */
    public String getName(){
        return name;
    }

    /**
     * Overrides toString method to print student objects.
     * @return Students name, and gpa.
     */
    public String toString(){
        return "Name: " + name + " GPA: " + gpa;
    }
}
