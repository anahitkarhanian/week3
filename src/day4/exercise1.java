package day4;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(getSumOfArray(array, array.length));
        System.out.println(getFactorial(5));
    }

    public static int getSumOfArray(int[] array, int n){
        if (n == 0)
            return 0;
        return getSumOfArray(array,n - 1) + array[n - 1];
    }

    public static int getFactorial (int n){
        if (n == 0){
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
