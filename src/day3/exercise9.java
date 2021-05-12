package day3;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String string = scanner.next();
        checkBinStr(string);
    }

    public static void checkBinStr(String str){
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '0' || str.charAt(i) == '1')) {
                check = false;
                break;
            }
        }

        if(check){
            System.out.println(str + " is a binary string");
        } else {
            System.out.println(str + " is NOT a binary string");
        }
    }
}
