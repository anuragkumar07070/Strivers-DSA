package Array.Easy;

public class BinarySearch {

    public static int binary(int arr[], int x){
        int start = 0;
        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int middle = (start+end)/2;
            System.out.println(middle);
            
            if(x == arr[middle]){
                return middle;
            }
            else if(x>=arr[middle]){
                start = middle+1;
            }
            else{
                end = middle-1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int x = 4;
        int out = binary(arr, x);
        System.out.println("Element is found at index of "+ out);
    }
    
}
