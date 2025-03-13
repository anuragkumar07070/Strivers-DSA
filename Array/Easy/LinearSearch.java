package Array.Easy;

public class LinearSearch {
    public static int linear(int arr[], int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                return i;
            }
            
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int arr[] = {12,21,42,52,33,3,20,100};
        int x = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int out = linear(arr , x);
        System.out.println("Element is found at index of "+ out);
    }
    
}
