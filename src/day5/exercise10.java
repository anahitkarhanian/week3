package day5;

import java.io.IOException;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char symb = scanner.next().charAt(0);
        char array[] = text.toCharArray();
        selectionSort(array);
        String string = new String(array);
        System.out.println(string);
        System.out.println(searchBinary(string, symb));
    }

    public static int searchBinary(String array,char ch){
        int left = 0;
        int right = array.length()-1;
        int middle = left + (right-left)/2;
        while(left<=right){
            if(array.charAt(middle)==ch){
                return middle;
            }
            else if(array.charAt(middle) < ch){
                left = middle+1;
            }
            else{
                right = middle-1;
            }
            middle = left+(right-left)/2;
        }
        return -1;
    }

    public static void selectionSort(char array[]){
        for (int i = 0; i < array.length-1; i++) {
            int min=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min])
                    min = j;
            }
            char swap = array[i];
            array[i] = array[min];
            array[min] = swap;
        }
    }
}
