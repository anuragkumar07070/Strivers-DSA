package Recurrsion;

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; 
        int i = 0;
        int a = arr.length-1;

        reverse(arr, a, i);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }


    public static void reverse(int arr[],int a,int i ){
        if(i>= arr.length/2){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[a];
        arr[a] = temp;

        reverse(arr, a-1, i+1);
    }
}
