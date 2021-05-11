package day2;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double z = scanner.nextDouble();
        add(x,y);
        add(z,x);
        add(x,y,z);
    }

    public static void add(int x,int y){
        int sum = x + y;
        System.out.println("called fisrt method " + sum);
    }

    public static void add(int x,int y,double z){
        double sum = x + y + z;
        System.out.println("called second method " + sum);
    }

    public static void add(double x,int y){
        double sum = x + y;
        System.out.println("called third method " + sum);
    }

}
