package day4;

public class exercise6 {
    public static void main(String[] args) {

    }

    public static int countX(String str){
        int count = 0;
        if(str.length() - 1 < 0) return 0;
        if(str.charAt(0) == 'x')
            count = 1;
        return count + countX(str.substring(1));
    }
}
