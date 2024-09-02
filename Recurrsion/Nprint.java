package Recurrsion;

public class Nprint {
    public static void nprint(int n){
        System.out.println(n+" Anurag");
        if(n<=1){
            return;
        }
        nprint(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        nprint(n);

    }
}
