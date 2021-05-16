package day5;

public class bubbleSortRecursion {
    public static void main(String[] args) {
        int n = 10000;
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n--;
        }
        long start = System.currentTimeMillis();
        int[] sorted = bubbleSortRecursion(array,n);
        long end = System.currentTimeMillis();
        System.out.println("computation time -> " + (end - start));
        printArray(sorted);
    }

    public static int[] bubbleSortRecursion(int array[], int length) {
        if (length == 1) return array;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int swap = array[i];
                array[i] = array[i + 1];
                array[i + 1] = swap;
            }
        }
        return bubbleSortRecursion(array, length - 1);
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
