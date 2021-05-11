package day2;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        getArray(array);

    }

    public static void getArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    public static void getArray(float[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    public static void getArray(double[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.print(array[array.length - 1] + "]");
    }

}
