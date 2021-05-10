package day1;

import java.io.IOException;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char symb = (char) System.in.read();
        System.out.println(isVowel(symb));
    }
    public static boolean isVowel(char a){
        switch (a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
