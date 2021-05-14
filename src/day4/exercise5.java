package day4;

public class exercise5 {
    public static void main(String[] args) {
        System.out.println(countOf7(237723));
    }

    public static int countOf7(int number){
        if (number >= 0 && number <= 9){
            if (number == 7)
                return 1;
            else return 0;
        }

        return countOf7(number % 10) + countOf7( number / 10);
    }
}
