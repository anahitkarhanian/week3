package day2;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(calculateDistance(x, y));
        System.out.println(calculateDistance(x, y, x, y));
    }

    public static double calculateDistance(int x, int y){
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return distance;
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        return distance;
    }
}
