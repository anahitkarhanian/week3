package day3;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String string = scanner.next();
        checkBinStr(string);
    }

    public static void checkBinStr(String str){
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (!((str.charAt(i) >= '0' && str.charAt(i) <= '9') || (str.charAt(i) >= 'a' && str.charAt(i)<= 'f')
                    || (str.charAt(i) >= 'A' && str.charAt(i)<= 'F'))) {
                check = false;
                break;
            }
        }

        if(check){
            System.out.println(str + " is a hex string");
        } else {
            System.out.println(str + " is NOT a hex string");
        }
    }


}
