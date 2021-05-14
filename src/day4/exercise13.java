package day4;

public class exercise13 {
    public static void main(String[] args) {
        System.out.println(countOfDigits("a111"));
    }

    public static int countOfDigits(String str) {
        int count = 0;
        if (str.length() - 1 < 0)
            return 0;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            count = 1;
        }
        return count + countOfDigits(str.substring(1));
    }
}
