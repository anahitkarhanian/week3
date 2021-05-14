package day4;

public class exercise12 {
    public static void main(String[] args) {
        System.out.println(getLargestDigit("432789"));
    }

    public static char getLargestDigit(String str) {
        if (str.length() < 1)
            return ' ';
        if (str.length() == 1)
            return str.charAt(0);
        if(str.charAt(0) > getLargestDigit(str.substring(1))){
            return str.charAt(0);
        } else return getLargestDigit(str.substring(1));
    }
}
