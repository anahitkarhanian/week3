package day1;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] studentArray = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int k = i + 1;
            System.out.print("Enter the grade for student " + k + ": ");
            studentArray[i] = scanner.nextInt();
        }

        System.out.println("average is " + Average(studentArray));
        System.out.println("minimum is " + Min(studentArray));
        System.out.println("maximum is " + Max(studentArray));
    }

    public static double Average (int[] array) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum / array.length ;
        return average;
    }

    public static int Min (int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int Max (int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
