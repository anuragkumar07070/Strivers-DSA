package Array.Easy;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[]={3,23,14,32,12,10};
        int max = 0;
        int x= 0;
        int secondmax = 0;


        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
                x = i;
            }
        }
       
    
        for (int i = 0; i < arr.length; i++) {

            if(i == x){
                continue;
            }

            else if(secondmax<arr[i]){
               
                secondmax = arr[i];
            }
        }
        System.out.println("Second Largest element of array is "+ secondmax);
    }
}
