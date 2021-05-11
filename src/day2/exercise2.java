package day2;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double z = scanner.nextDouble();
        System.out.println(Multiple(x, y));
        System.out.println(Multiple(x, z));
        //Multiple(3,5);
    }

    public static float Multiple(int x, int y){
        float multiple = (float) x * y;
        return multiple;
    }

//    public static void Multiple(int ... x){
//
//    }

    public static int Multiple(int x,double y){
        int z = (int) y;
        int multiple = x * z;
        return multiple;
    }
}
