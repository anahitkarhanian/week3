package day5;

public class binarySearchRecursion {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearchRecursion(array, 5, 0, 6));
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
