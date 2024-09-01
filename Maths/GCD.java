// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

// Example 1:
// Input:N1 = 9, N2 = 12                
// Output:3
// Explanation:Factors of 9: 1, 3 and 9
// Factors of 12: 1, 2, 3, 4, 6, 12
// Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

// Example 2:
// Input:N1 = 20, N2 = 15         
// Output: 5
// Explanation:Factors of 20: 1, 2, 4, 5
// Factors of 15: 1, 3, 5
// Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.
public class GCD {
    public static void main(String[] args) {
        int N1= 20;
        int N2 = 40;
        int temp = 0;
        int max = 0;

        if(N1>N2){
            temp = N1;
            N1 = N2;
            N2 = temp;  
        }

        for(int i = 1 ; i<N1 ; i++){
            int j = i;
            
            if(N1%i==0 && N2%j==0){
                
                if(max<i){
                    max=i;
                    System.out.println(max);
                }

            }
            
        }
        System.out.println("GCD = "+ max);
    }
    
}
