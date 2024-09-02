package Recurrsion;
public class OnetoNprint {

    public static void nprint(int i ,int n){
        if(i<=n){
            System.out.println(i+" Anurag");
            nprint(i+1, n);
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
