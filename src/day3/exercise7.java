package day3;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int n = scanner.nextInt();
        System.out.println(caesarCode(string, n));
    }

    public static String caesarCode(String str, int n){
        StringBuilder stringBuilder = new StringBuilder(str.toUpperCase());

       for (int i = 0; i < str.length(); i++) {
           int offset = stringBuilder.toString().charAt(i) + n;
           if(offset > 90){
                char newChar = (char) (offset % 90 + 65);
                String newStr = Character.toString(newChar);
                stringBuilder.replace(i,i+1,newStr);
            } else {
               char newChar = (char) offset;
                String newStr = Character.toString(newChar);
                stringBuilder.replace(i, i + 1, newStr);
            }
        }

        return stringBuilder.toString();
    }
}
