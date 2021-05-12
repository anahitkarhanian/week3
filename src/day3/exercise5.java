package day3;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scanner.next();
        System.out.println("The reverse of the " + string + " is " + stringReverse(string));

    }

    public static String stringReverse(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();

    }
}
