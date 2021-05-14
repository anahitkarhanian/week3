package day4;

public class exercise9 {
    public static void main(String[] args) {
        System.out.println(movedXtoTheEnd("axxabcx"));
    }

    public static String movedXtoTheEnd(String str){
        if (str.length() - 1 < 0) return "";
        if (str.charAt(0) == 'x'){
            return "" + movedXtoTheEnd(str.substring(1)) + str.charAt(0);
        } else return  "" + str.charAt(0) + movedXtoTheEnd(str.substring(1));
    }
}
