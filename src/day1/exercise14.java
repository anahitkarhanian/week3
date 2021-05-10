package day1;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int [arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < copyOf(array).length; i++) {
            System.out.print(copyOf(array)[i] + " ");
        }
    }

    public static int[] copyOf(int[] array){
        int length = array.length;
        int[] copyArray = new int [length];
        for (int i = 0; i < length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }
}
