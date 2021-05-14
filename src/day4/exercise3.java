package day4;

public class exercise3 {
    public static void main(String[] args){
        System.out.println(triangle(4));
    }

    public static int  triangle(int countOfRow){
           if(countOfRow == 0){
               return 0;
           }
           return countOfRow + triangle(countOfRow - 1);
    }
}
