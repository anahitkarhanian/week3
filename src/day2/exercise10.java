package day2;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int balance = scanner.nextInt();
        System.out.println(reminder(number));
        System.out.println(reminder(number,balance));

    }

    public static int reminder(int number){
        int sum = 0;
        for (int i = number; i > 0 ; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    public static int reminder(int number, int balance){
        int sum = 0;
        for (int i = number; i > 0 ; i /= 10) {
            sum += i % 10;
        }
        return sum % balance;
    }

}
