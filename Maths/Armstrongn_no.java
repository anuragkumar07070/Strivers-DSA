// Example 1:
// Input:N = 153
// Output:True
// Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
// Example 2:
// Input:N = 371
// Output: True
// Explanation: 3^3+5^3+1^3 = 27 + 343 + 1 = 371

public class Armstrongn_no {

    public static boolean armstrong(int n ){
        int ref = n;
        int ref2 = n;
        int countno = 0;
        int r = 0;
        int arm = 0;
        
        while(ref>0) {
            ref = ref/10;    
            countno++;  
        }
     
        while (ref2>0) {
            r = ref2%10;
            arm = arm+(int)Math.pow(r, countno);
            ref2 = ref2/10; 
        }
        if(n == arm ){
            return true;
        }
        return false;  
    }

    public static void main(String[] args) {
        int n = 153;
        boolean result = armstrong(n);
        System.out.println(result);
    }
}
