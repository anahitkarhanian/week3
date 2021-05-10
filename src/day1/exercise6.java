package day1;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int x = 0;
        int y = 1;
        int z = 0;
        if(n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return z;
        }
    }
}
