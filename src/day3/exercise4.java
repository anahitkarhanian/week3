package day3;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(getCountOfVowels(string));
        System.out.println(getCountOfConsonants(string));
    }

    public static int getCountOfVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'y'){
                count++;
            }
        }
        return count;
    }

    public static int getCountOfConsonants(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'y')){
                count++;
            }
        }
        return count;
    }




}
