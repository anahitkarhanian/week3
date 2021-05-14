package day4;

public class exercise14 {
    public static void main(String[] args) {
        System.out.println(getStringAsterisk("abcd"));
    }

    public static String getStringAsterisk(String str) {
        if(str.length() - 1 < 0)
            return "";
        if(str.length() - 1 == 0)
            return "" + str.charAt(0);
        return  str.charAt(0) + "*" + getStringAsterisk(str.substring(1));
    }
}
