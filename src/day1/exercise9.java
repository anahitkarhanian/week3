package day1;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPolindrome(number));
    }

    public static boolean isPolindrome(int n){
        int reverse = 0;
        for (int i = n; i > 0; i /= 10) {
            reverse = reverse*10 + i%10;
        }
        if(reverse == n){
            return true;
        } else {
            return false;
        }
    }
}
