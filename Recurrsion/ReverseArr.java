package Recurrsion;

public class ReverseArr {

    public static void reverse(int arr[], int a, int i) {
        
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[a];
        arr[a] = temp;
        reverse(arr, a - 1, i + 1);
    }


    public static void reverse2(int array[], int j) {
        if (j < array.length / 2) {
            int temp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = temp;
            reverse2(array, j + 1);
        }   
    }

    public static void main(String[] args) {

        // *** Method1
        int arr[] = {1,2,3,4,5};
        int i = 0;
        int a = arr.length-1;
        reverse(arr, a, i);
        
        // traverse
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }


        // ***Method 2
        int array[] = { 1, 2, 3, 4, 5, 7 };
        int j = 0;
        reverse2(array, j); // Funtion

        // Travarsee
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }

    }
}
