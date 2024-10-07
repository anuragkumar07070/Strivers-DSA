package Recurrsion;

public class Nsum {
    public static void nsum(int total ,int n) {
        if (n > 0) {
            total = total + n;
            nsum(total,n - 1);
        }
        else{
            System.out.println(total);
        }

    }

    public static int ss(int sum){
        if(sum==0){
            return 0;

        }

        return sum+ss(sum-1);
    }


    public static void main(String[] args) {
        int total = 0;
        int n = 10;
        nsum(total,n);// using two variable 

        int sum = 10;
        System.out.println(ss(sum)); // using one variable

      
    }

}
