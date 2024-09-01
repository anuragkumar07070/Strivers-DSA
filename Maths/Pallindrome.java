public class Pallindrome {
    public static int revese(int n){
        int rem =0;
        int rev = 0;
     
        while(n>0){
            rem= n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }

    public static boolean pallindrome(int n,int rev){
        if(n!= rev){
            return false;
        }
        return true;
    }
    public static void main(String[] ags) {

        int n = 1001001;
        int rev = revese(n);
        System.out.println(rev);
        
        boolean pallin = pallindrome(n,rev);
        System.out.println(pallin);


    }
}
