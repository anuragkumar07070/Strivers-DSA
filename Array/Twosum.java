package Array;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        int n = 0;
        for(int i = 1; i<nums.length-1;i++){
            n = i+1;
            if(nums[i] + nums[n] == target){
                return new int[]{i,n};
            }
        }
        return new int[]{};  
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,4,2,4};
        int target = 6;
        int arr[] = twoSum(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }  
    }

    
}
