package day1;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a,n));
    }

    public static double power(double a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++){
            power *= a;
        }
        return power;
    }
}
