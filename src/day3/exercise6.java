package day3;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scanner.next();
        countVowelsDigits(string);
    }

    public static void countVowelsDigits(String str){
        int countOfVowels = 0;
        int countOfDigits = 0;
        int length = str.length();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'y')
            {
                countOfVowels++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            {
                countOfDigits++;
            }
        }

        double count1 = (double) countOfVowels * 100 / length;
        double count2 = (double) countOfDigits * 100 / length;
        System.out.println("Number of vowels: " + countOfVowels + " (" + count1 + "%)");
        System.out.println("Number of digits: " + countOfDigits + " (" + count2 + "%)");

    }

}
