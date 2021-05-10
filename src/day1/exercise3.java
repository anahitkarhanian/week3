package day1;

public class exercise3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(xor(a,b));
    }

    public static boolean xor(boolean a, boolean b) {
//        if ((a && !b ) && (a || b == true) ) {
//            return true;
//        } else {
//            return false;
//        }
        return a^b;
    }
}
