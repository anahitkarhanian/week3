package day2;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b  = scanner.nextInt();
        int c  = scanner.nextInt();
        int d  = scanner.nextInt();

        System.out.println(max(a, b));
        System.out.println(max(a, b, c));
        System.out.println(max(a, b, c, d));

    }

    public static int max(int a,int b){
        if (a > b)
            return a;
        else return b;
    }

    public static int max(int a,int b,int c){
        if(a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else return c;
    }

    public static int max(int a,int b,int c,int d){
        if (a > b && a > c && a > d)
            return a;
        else if (b > a && b > c && b > d)
            return b;
        else if (c > a && c > b && c > d)
            return c;
        else return d;

    }
}
