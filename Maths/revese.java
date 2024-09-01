public class revese {
    public static void main(String[] ags) {
        int n = 1203992100;
        int rem =0;
        int rev = 0;
     
        while(n>0){
            rem= n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
