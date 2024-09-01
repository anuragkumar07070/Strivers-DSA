package Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 3;
        int count = n-1;

        for (int i = 1; i<2*n; i++) {

            if(i<=n){
                for (int j = 0; j <i; j++) {
                    System.out.print("*");   
                }
            }

            else if(i>n){
                for (int k = i; k> i-count  ; k--) {
                    System.out.print("*");   
                }
                count--;     
            }

            System.out.println();
            
        }
    }
}
