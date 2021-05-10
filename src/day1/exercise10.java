package day1;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(hasEight(number));
    }

    public static boolean hasEight(int number){
        int count = 0;
        for (int i = number; i > 0 ; i /= 10) {
            if(i % 10 == 8){
                count++;
            }
        }
        if (count > 0){
            return true;
        } else {
            return false;
        }
    }
}
