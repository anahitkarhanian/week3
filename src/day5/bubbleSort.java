package day5;

public class bubbleSort {
    public static void main(String[] args) {
        int n = 10000;
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n--;
        }
        long start = System.currentTimeMillis();
        int[] sorted = bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println("computation time -> " + (end - start));
        printArray(sorted);
    }

    public static int[] bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    check = true;
                    int swap = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = swap;
                }
            }
            if (check == false){
                break;
            }
        }
        return array;
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
