public class Checkprime {
    public static boolean check(int n ){
        if(n==1|| n<1){
            return false;
        }

        for(int i = 2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 67;
        boolean result = check(n);
        System.out.println(n+"  "+result);

    }
}
