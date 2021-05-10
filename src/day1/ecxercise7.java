package day1;

import java.util.Scanner;

public class ecxercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(factorial(a));

    }
     public static int factorial(int a){
        int factorial = 1;
        if(a == 0){
            return factorial;
        } else {
            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            return factorial;
        }
     }
}
