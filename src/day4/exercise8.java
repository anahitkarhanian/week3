package day4;

public class exercise8 {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str){
        String reverseStr = "";
        if (str.length() - 1 < 0) return "";
        return reverseStr + str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
