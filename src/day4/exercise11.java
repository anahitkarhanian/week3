package day4;

public class exercise11 {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }

    static int k = 2;
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        if (number == k){
            return true;
        }
        if (number % k != 0){
            k++;
            return isPrime(number);
        } else return false;
    }
}
