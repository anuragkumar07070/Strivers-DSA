package Sorting;

public class SelectionSort {

    public static void fn(int arr[]){

        int min= 0;
        int temp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                } 
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println(arr[i]);
              
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {50,10,18,40,45,12,34};
        fn(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
    } 
}
