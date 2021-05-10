package day1;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(min(a,b,c,d));
    }
    public static int min(int a, int b, int c, int d){
        int min = 0;
        if(a < b && a < c && a < d){
            min = a;
        } else if (b < a && b < c && b < d){
            min = b;
        } else if (c < a && c < b && c < d){
            min = c;
        } else {
            min = d;
        }
        return min;

    }
}
