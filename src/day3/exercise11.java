package day3;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String string = scanner.next();
        bin2D(string);
    }

    public static void bin2D(String str){
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '0' || str.charAt(i) == '1')) {
                check = false;
                break;
            }
        }

        int dec = 0;
        int digit = 0;

        if(check){
            for (int i = str.length() - 1; i >= 0 ; i--) {
                digit = Integer.parseInt(String.valueOf(str.charAt(i)));
                dec += digit * Math.pow(2, str.length() - i - 1);
            }
            System.out.println("The equivalent decimal number for binary " + str + " is: " + dec);
        } else {
            System.out.println("error: invalid binary string " + str);
        }
    }
}
