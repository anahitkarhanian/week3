package day3;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int index = scanner.nextInt();
        System.out.println(getChar(string, index));
    }

    public static char getChar(String str, int index){
        char symbol = str.charAt(index);
        return symbol;
    }
}
