package day2;

import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int matrixRow = scanner.nextInt();
        int matrixColumn = scanner.nextInt();
        int[] array = new int[arrayLength];
        int[][] matrix = new int[matrixRow][matrixColumn];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(getAverage(array));
        System.out.println(getAverage(matrix));
    }

    public static double getAverage(int[] array){
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
         average = (double) sum / array.length;
        return average;
    }

    public static double getAverage(int[][] matrix){
        int sum = 0;
        double average = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        average = (double) sum / count;
        return average;
    }


}
