package day4;

public class exercise17 {
    public static void main(String[] args) {
        System.out.println(f2("abcbaaaab"));
    }

    public static String f2(String str){
        if(str.length() - 1 < 0)
            return "";
        if (str.length() - 1 == 0)
            return "" + str.charAt(0);
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return "" + str.charAt(0) + f2(str.substring(1,str.length() - 1)) + str.charAt(str.length() - 1);
        else return str.charAt(0) + f2(str.substring(1,str.length() - 1));
    }
}
