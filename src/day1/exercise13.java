package day1;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int [arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(search(array, key));
    }

    public static int search(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return i;
            }
        } return -1;
    }
}
