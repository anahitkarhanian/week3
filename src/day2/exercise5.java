package day2;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(search(array));
        System.out.println(search(array, 2));
        System.out.println(search(array, 2, 2));
    }

    public static int search(int[] array){
        int length = array.length;
        return length;
    }

    public static int search(int[] array,int a){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array,int argument,int index){
        if(array[index] == argument) {
            return true;
        } else return false;
    }



}
