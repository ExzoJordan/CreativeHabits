package com.creativehabit.creativehabits;
import java.util.ArrayList;
import java.util.Random;

public class SortingAlgorithms {

    Random rand = new Random();

    /**
     * @param arry
     * @return Returns the array with random numbers.
     */
    public int[] createNums(int[] arry){

        for (int i = 0; i < arry.length; i++){
            arry[i] = rand.nextInt(100);
        }
        return arry;
    }

    /**
     * Prints the array.
     * @param arry
     */
    public void printArray(int[] arry){

        for (int i = 0; i < arry.length; i++){
            System.out.print(arry[i] + " ");
        }
    }

    /**
     * Swaps 2 numbers in an array.
     * @param arry
     * @param i
     * @param j
     */
    public void swap(int[] arry, int i , int j){
        int temp;

        temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;

    }

    /**
     * Bubble Sort Algorithm O(n^2)
     * @param arry
     * @return
     */
    public int[] bubbleSort(int[] arry){
        for (int i = 0; i < arry.length - 1; i++){
            for (int j = 0; j < arry.length - i - 1; j++){

                if (arry[j] > arry[j + 1]){
                    swap(arry, j, j + 1);

                }
            }
        }
        return arry;
    }

    /**
     * Selection Sort Algorithm O(n^2)
     * @param arry
     * @return
     */
    public String[] selectionSort(String[] arry){
        for (int i = 0; i < arry.length - 1; i++){
            int  minIndex = i;

           for (int j = i + 1; j < arry.length; j++){
               if (arry[j].compareTo(arry[minIndex]) < 0){
                   minIndex = j;
               }
           }

           String temp = arry[i];
           arry[i] = arry[minIndex];
           arry[minIndex] = temp;
        }
        return arry;
    }

    public void insertionSort(ArrayList<Student> student){
        for (int i = 1; i < student.size(); i++){
            Student key = student.get(i);
            int j = i - 1;

            while(j >=0 && student.get(j).getGpa() > key.getGpa()){
                student.set(j + 1, student.get(j));
                j--;
            }
            student.set(j + 1, key);
        }
    }

}
