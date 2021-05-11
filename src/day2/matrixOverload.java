package day2;

import java.util.Scanner;

public class matrixOverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        double[] array = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        array = getArray(array);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        int matrixRow = scanner.nextInt();
        int matrixColumn = scanner.nextInt();
        int[][] matrix = new int[matrixRow][matrixColumn];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
                System.out.print(getArray(matrix)[i] + " ");
        }

    }

    public static double[] getArray(int[][] matrix){
        double[] array = new double[matrix.length];
        for (int i = 0; i < array.length; i++) {
                array[i] = overloading.getAverage(matrix[i]);
        }

        return array;
    }

    public static double[] getArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }

        return array;
    }
}
