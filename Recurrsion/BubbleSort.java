public class BubbleSort {

    public static void sort(int[] arr, int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            sort(arr, row, col+1);
        }
        else{
            sort(arr, row-1, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,44,2,32,52,341,5,0};
        int row = arr.length-1;
        int col = 0;
        sort(arr, row , col);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
