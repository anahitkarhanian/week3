package day4;

public class exercise10 {
    public static void main(String[] args) {
        System.out.println(cleanedString("yyzzzaaabbbcdfff"));
    }

    public static String cleanedString(String str) {
        if (str.length() - 1 < 0) return "";
        if (str.length() == 1){
            return "" + str.charAt(0);
        }
        if (str.charAt(0) == str.charAt(1)){
            return "" + cleanedString(str.substring(1));
        } else return "" + str.charAt(0) + cleanedString(str.substring(1));

    }
}
