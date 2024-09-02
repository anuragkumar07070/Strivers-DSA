package Array.Easy;

public class Largest {
    public static void main(String[] args) {
        int arr[]={3,23,32,12,10};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Largest element of array is "+max);
    }
}
