package day2;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float fahren = scanner.nextInt();
        int celsius = scanner.nextInt();

        System.out.println(fahrenheitCelsius(fahren));
        System.out.println(fahrenheitCelsius(celsius));

    }

    public static float fahrenheitCelsius(float fahren){
         float celsius = 9 / 5 * fahren + 32;
         return celsius;
    }

    public static float fahrenheitCelsius(int celsius){
        float fahren = (float) (celsius - 32) * 5 / 9;
        return celsius;
    }
}
