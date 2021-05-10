package day1;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(contains(array, key));
    }

    public static boolean contains(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return true;
            }
        } return false;
    }
}
