package Array.Easy;

public class checksorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,12,293};
        boolean a = check(arr);
        System.out.println(a);
    }
    

public static boolean check(int arr[]){

    for (int i = 0; i < arr.length-1; i++) {
        if(arr[i]>arr[i+1]){
            return false;
        }
    }
    return true;
}


}