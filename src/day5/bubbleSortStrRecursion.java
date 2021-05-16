package day5;

import java.util.Scanner;

public class bubbleSortStrRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String array[] = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        bubbleSortStringRecursion(array, array.length);
        printArray(array);
    }

    public static void bubbleSortStringRecursion(String array[], int length) {
        if(length <= 1){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                String swap = array[i];
                array[i] = array[i + 1];
                array[i + 1] = swap;
            }
        }
        bubbleSortStringRecursion(array,length - 1);
    }


    public static void printArray(String array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
