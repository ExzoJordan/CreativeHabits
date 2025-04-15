package com.creativehabit.creativehabits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@SpringBootApplication
public class CreativeHabitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreativeHabitsApplication.class, args);


        SortingAlgorithms sort = new SortingAlgorithms();
        int[] randNumArry = new int[10];
        String[] randNameArry = {"Rose","Nathaniel","Exzo","Kat","Nakira","Ben","Ella","Cooper","Emery","Jeff"};

        randNumArry = sort.createNums(randNumArry);//Create Numbers

        System.out.println("Bubble Sort: ");
        System.out.println("The Unsorted numbers are: ");
        sort.printArray(randNumArry);

        sort.bubbleSort(randNumArry);

        System.out.println("\n\nThese are the numbers sorted: ");
        sort.printArray(randNumArry);


        System.out.println("\n\nUnsorted names: ");
        printNamesArry(randNameArry);

        sort.selectionSort(randNameArry);

        System.out.println("\n\nSorted names: ");
        printNamesArry(randNameArry);

        //Setting up insertion sort

        ArrayList<Student> students = new ArrayList <Student>();
        students.add(new Student("Exzo", 2.5));
        students.add(new Student("Nathaniel", 3.4));
        students.add(new Student("Rose", 4.0));
        students.add(new Student("Nakira", 3.7));
        students.add(new Student("Ben", 2.7));

        System.out.println(" ");
        for (Student student : students){
           System.out.println(student.toString());
        }

        sort.insertionSort(students);

        System.out.println("\nInsertion sort: ");

        for(Student student : students){
           System.out.println(student.toString());
        }




    }

    public static void printArry(int[] arry){

    }

    public static void printNamesArry(String[] names){
        for (int i = 0; i < names.length ; i++){
            System.out.print(names[i] + " ");
        }
    }
}
