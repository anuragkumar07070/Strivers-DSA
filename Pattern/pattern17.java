package Pattern;

public class pattern17 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i <n; i++) {
            char ch ='A';
            int mid = (2*i+1)/2;

            for(int j =1; j<n-i;j++){
                System.out.print("_");
            }

            for(int j =1; j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=mid){
                    ch++;
                }
                else{
                    ch--;
                }
                
            }
            for (int j = 1; j <n-i; j++) {
                System.out.print("_");
                
            }
            System.out.println();
            
        }
    }
}
