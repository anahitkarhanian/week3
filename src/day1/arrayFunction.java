package day1;

import java.util.Random;
import java.util.Scanner;

public class arrayFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = arrayInitilise(size);
        printArray(array);
        printArray(oppositeArray(array));
    }
    public static int[] arrayInitilise(int n){
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = random.nextInt();
        }
        return array;

    }

    public static int[] oppositeArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            array[i] = -array[i];
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}


