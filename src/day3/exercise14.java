package day3;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char ch = scanner.next().charAt(0);
        System.out.print(F(string,ch));
    }

    public static int F(String str, char ch){
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch){
                count++;
            }
        }
        return count;
    }
}
