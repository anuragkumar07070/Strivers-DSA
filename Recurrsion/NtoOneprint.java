package Recurrsion;

public class NtoOneprint {

    public static void nprint(int i ,int n){
        if(n>i){
            System.out.println(n+" Anurag");
            nprint(i, n-1);
        }
        else{
            return;
        }
    }
    
    public static void main(String[] args) {
        int i = 1;
        int n = 10;
        nprint(i, n);

    }
    
}
