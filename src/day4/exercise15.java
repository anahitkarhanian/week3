package day4;

public class exercise15 {
    public static void main(String[] args) {
        System.out.println(F("abdda"));
    }

    public static String F(String str){
        if(str.length() - 1 < 0)
            return "";
        if(str.length() - 1 == 0)
            return "" + str.charAt(0);
        if(str.length() - 1 == 1)
            return "" + str.charAt(0) + str.charAt(1);
        return  str.charAt(0) + "(" + F(str.substring(1,str.length() - 1)) + ")" + str.charAt(str.length() - 1);
    }
}
