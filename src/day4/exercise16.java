package day4;

public class exercise16 {
    public static void main(String[] args) {
        System.out.println(f1("a(b(c(a"));
    }

    public static String  f1(String str){
        if(str.length() - 1 < 0)
            return "";
       if (str.length() - 1 == 0)
            return "" + str.charAt(0) + str.charAt(0);
        return "" + str.charAt(0) + str.charAt(1) + f1(str.substring(2)) + ")" + str.charAt(0);
    }
}
