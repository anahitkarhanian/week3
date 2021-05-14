package day4;

public class exercise7 {
    public static void main(String[] args) {
        System.out.println(getStringWithoutX("xxxxabxbx"));
    }

    public static String getStringWithoutX(String str){
        if (str.length() - 1 < 0)
            return "";
        if (str.charAt(0) != 'x'){
            return "" + str.charAt(0) + getStringWithoutX(str.substring(1));
        } else  return getStringWithoutX(str.substring(1));
    }
}
