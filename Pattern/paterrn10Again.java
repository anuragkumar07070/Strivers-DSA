package Pattern;


public class paterrn10Again {

    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i < 2*n; i++) {
            int a = i;


            if(i>n){
                a= 2*n-i;
            }


            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }

            System.out.println();
               
        }
    }
}
