package day5;

import java.util.Scanner;

public class binarySearchGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int length = scanner.nextInt();
        int[] array = new int [length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();
        System.out.println(binarySearch(array, number));*/

       /* int[] array = {1,4,9,10,30,4,5};
        int number = 10;
        System.out.println(binarySearch(array, number));*/

        int a = 0;
        int b = 100;
        System.out.println(binarySearch(a, b));
    }

    public static int binarySearch(int a, int b){
        Scanner scanner = new Scanner(System.in);
        int left = a;
        int right = b;
        int middle = left + (right - left) / 2;
        System.out.println("pls..??? number to range of 0->100");
        while (left <= right){
            System.out.println("is the number equal " + middle);
            String text = scanner.next();
            if (text.equals("yes")) {
                return middle;
            }
            System.out.println("is the number large then " + middle);
            text = scanner.next();
            if (text.equals("no")){
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }
        return -1;
    }
}