package com.creativehabit.creativehabits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Random;

@SpringBootApplication
public class CreativeHabitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreativeHabitsApplication.class, args);

        SortingAlgorithms sort = new SortingAlgorithms();
        int[] randNumArry = new int[10];
        String[] randNameArry = {"Rose","Nathaniel","Exzo","Kat","Nakira","Ben","Ella","Cooper","Emery","Jeff"};

        randNumArry = sort.createNums(randNumArry);//Create Numbers

        System.out.println("The random numbers are: ");
        sort.printArray(randNumArry);

        sort.bubbleSort(randNumArry);

        System.out.println("\nThese are the numbers sorted: ");
        sort.printArray(randNumArry);

        for (int i = 0 ; i < randNameArry.length ; i++){
            System.out.print(randNameArry[i] + " ");
        }

        sort.selectionSort(randNameArry);

        System.out.println("\nSorted names: ");
        for (int i = 0; i < randNameArry.length ; i++){
            System.out.print(randNameArry[i] + " ");
        }

        //Setting up insertion sort

        ArrayList<Student> students = new ArrayList <Student>();
        students.add(new Student("Exzo", 2.5));
        students.add(new Student("Nathaniel", 3.4));
        students.add(new Student("Rose", 4.0));
        students.add(new Student("Nakira", 3.7));
        students.add(new Student("Ben", 2.7));

       for (Student student : students){
           System.out.println(student.toString());
       }

        sort.insertionSort(students);

       System.out.println("\nInsertion sort: ");

       for(Student student : students){
           System.out.println(student.toString());
       }


    }
}
