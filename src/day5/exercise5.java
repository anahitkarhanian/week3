package day5;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double array[] = new double [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        double average = bubbleSort(array);
        System.out.println(search(array, average));
        printArray(array);
    }

    public static double bubbleSort(double array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    check = true;
                    double swap = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = swap;
                }
            }
            if(!check){
                break;
            }
        }
        return (array[0]+array[array.length-1]) / 2;
    }

    public static double search(double array[],double number){
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right){
            if(array[middle] == number){
                return middle;
            }
            else if (array[middle] < number){
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return -1;
    }

    public static void printArray(double array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
