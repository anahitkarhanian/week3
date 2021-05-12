package day3;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char symbol = 'a';
        System.out.println(checkChar(string, symbol));
    }

    public static boolean checkChar(String str, char ch){
        String string = Character.toString(ch);
        return str.contains(string);
    }
}
