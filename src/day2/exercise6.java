package day2;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle ");
        int radius = scanner.nextInt();
        System.out.println(square(radius));

        System.out.print("Enter koxm of square ");
        float a = scanner.nextInt();
        System.out.println(square(a));

        System.out.print("Enter koxmer of rectangle ");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(square(b,c));


    }

    public static double square(int radius){
        double pi = Math.PI;
        double square = pi * Math.pow(radius,2);
        return square;
    }

    public static double square(float a){
        double square = Math.pow(a,2);
        return square;
    }

    public static double square(int a, int b){
        double square = a * b;
        return square;
    }
}
