package Recurrsion;

public class Factorial {
    public static int facto(int n){
        if(n<1){
            return 1;
        }
        return n*facto(n-1);
    } 


    public static void main(String[] args) {
        int n = 5;
        int a = facto(n);
        System.out.println(a);

    }   
}
