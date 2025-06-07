public class SelectionSort {

    public static void selection(int[] arr, int row , int col , int max){
        if(row== 0){
            return ;
        }

        if(col<=row){
            if(arr[col]>=arr[max]){
                max = col;
            }
            selection(arr, row, col+1, max);
        }

        else{
            int temp = arr[row];
            arr[row] = arr[max];
            arr[max] = temp;
            selection(arr, row-1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,1};
        int row = arr.length-1;
        int col = 0;
        int max =0;
        selection(arr, row , col, max); 
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
