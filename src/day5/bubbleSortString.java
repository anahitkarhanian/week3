package day5;

import java.util.Scanner;

public class bubbleSortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }
        array = bubbleSortString(array);
        printArray(array);
    }

    public static String[] bubbleSortString(String array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    check = true;
                    String swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
            if(check == false){
                break;
            }
        }
        return array;
    }

    public static void printArray(String array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
