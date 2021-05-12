package day3;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scanner.next();
        isPalindrome(string);
    }

    public static void isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverseStr = stringBuilder.reverse().toString();
        if (str.equals(reverseStr)){
            System.out.println("Print " + str + " is a Palindrome.");
        } else {
            System.out.println("Print " + str + " is not a Palindrome.");
        }
    }
}
