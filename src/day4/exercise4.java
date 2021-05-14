package day4;

public class exercise4 {
    public static void main(String[] args) {
        System.out.println(getSumOfDigits(256));
    }

    public static int getSumOfDigits(int number){
        if (number == 0)
            return 0;
        return number % 10 + getSumOfDigits(number / 10);
    }
}
