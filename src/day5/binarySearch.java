package day5;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 5));
    }

    public static int binarySearch(int array[], int number) {
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            if (array[middle] == number) {
                return middle;
            }
            if (array[middle] > number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return -1;
    }

    public static int binarySearchRecursion(int array[], int number, int left, int right) {
        int middle = left + (right - left) / 2;
        if (left > right) return -1;
        if (number == array[middle])
            return middle;
        else if (number > array[middle]) {
            return binarySearchRecursion(array, number, middle + 1, right);
        }
        return binarySearchRecursion(array, number, left, middle - 1);
    }
}
