package day1;

public class exercise5 {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }

    public static boolean isPrime(int n) {
        int count = 0;
        if (n >= 2 && n < 20000000) {
            if (n == 2) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else return false;
    }
}
