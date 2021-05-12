package day2;

import java.util.Scanner;

public class recursive2iNastijan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(recursia(a, n));

    }

    public static int recursia(int a,int n){
        if (n == 0){
            return 1;
        } else return a * recursia(a,n -1);
    }
}
