package day1;

public class exercise4 {
    public static void main(String[] args) {
        System.out.println(election(false, true, true));
    }
    public static boolean election(boolean x, boolean y, boolean z){
        if(x||y || x&&z){
           return true;
        } return false;

    }
}
