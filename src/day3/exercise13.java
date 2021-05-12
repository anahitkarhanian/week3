package day3;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.print(getFirstNonRepChar(string));
    }

    public static char getFirstNonRepChar(String str) {
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1)
                return array[i];
            count = 0;
        }

        return '0';
    }
}
