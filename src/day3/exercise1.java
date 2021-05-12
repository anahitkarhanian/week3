package day3;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(lengthOfString(string));
    }

    public static int lengthOfString(String string){
        return string.length();
    }
}
