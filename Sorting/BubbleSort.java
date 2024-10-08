package Sorting;

public class BubbleSort {

    public static void fn(int arr[]){
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("helleo");

        int arr[] = {21,13,53,45,12};

        fn(arr);
        
    }
    
}
