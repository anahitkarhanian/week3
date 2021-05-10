package day1;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        System.out.println(MagicSum());
    }

    public static int MagicSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a positive integer (or -1 to end):");
            int number = scanner.nextInt();
            if(number != -1){
                if(exercise10.hasEight(number)){
                    sum += number;
                }
            } else break;
        }
        return sum;
    }
}
