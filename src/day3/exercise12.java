package day3;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(getCountsDuplicate(string));
    }

    public static int getCountsDuplicate(String str){
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(array[i] == array[j] && i != j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
